
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMail {

    Session session;
    Message message;
    Properties props;

    public void getMailProperties() {
        this.props = new Properties();
        this.props.put("mail.smtp.starttls.enable", "true");
        this.props.put("mail.smtp.host", "smtp.gmail.com");
        this.props.put("mail.smtp.socketFactory.port", "465");
        this.props.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        this.props.put("mail.smtp.starttls.enable", "true");

        this.props.put("mail.smtp.auth", "true");
        this.props.put("mail.smtp.port", "465");
        this.props.put("mail.smtp.debug",true);

    }

    public void getMailMessage(final Mail mail) {


        this.session = Session.getDefaultInstance(this.props,
                new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(mail.getMailAddressSender(), mail.getPwd());
            }
        });


        try {

            this.message = new MimeMessage(this.session);
            this.message.setFrom(new InternetAddress(mail.getMailAddressSender()));
            this.message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(mail.getMailAddressRecipient()));
            this.message.setSubject(mail.getMailSubject());
            this.message.setText(mail.getMailObject());




            Transport.send(this.message);

            System.out.println("Done");



        } catch (MessagingException e) {
            throw new RuntimeException(e);

            //throw new RuntimeException(e);
        }

    }
    /*public void SendMessage(){
     try {
     Transport.send(message);
     } catch (MessagingException ex) {
     Logger.getLogger(SendMail.class.getName()).log(Level.SEVERE, null, ex);
     }
     }*/

    public static void main(String[] args) {
        /*Properties props = new Properties();
         props.put("mail.smtp.host", "smtp.gmail.com");
         props.put("mail.smtp.socketFactory.port", "465");
         props.put("mail.smtp.socketFactory.class",
         "javax.net.ssl.SSLSocketFactory");
         props.put("mail.smtp.auth", "true");
         props.put("mail.smtp.port", "465");
            
 
         Session session = Session.getDefaultInstance(props,
         new javax.mail.Authenticator() {
         protected PasswordAuthentication getPasswordAuthentication() {
         return new PasswordAuthentication("hajer.bachoual@esprit.tn","B07446282H");
         }
         });
 
         try {
 
         Message message = new MimeMessage(session);
         message.setFrom(new InternetAddress("hajer.bachoual@esprit.tn"));
         message.setRecipients(Message.RecipientType.TO,
         InternetAddress.parse("mohamedamine.triki@esprit.tn"));
         message.setSubject("ahawaaa el mail");
         message.setText("Bonjour," +
         "\n\n  jék wala majekch");
 
         Transport.send(message);
 
         System.out.println("Done");
 
         } catch (MessagingException e) {
         throw new RuntimeException(e);
         }*/
    }
}