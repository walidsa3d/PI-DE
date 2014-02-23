/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Controlleur.ListeReservationControlleur;
import DAO.REservationDAO;
import Entites.Reservation;

/**
 *
 * @author nour
 */
public class ListeDesReservations extends javax.swing.JFrame {

    static int choix;

    public boolean isNumeric(String s) {
        return s.matches("[-+]?\\d*\\.?\\d+");
    }

    //activer tous les champs textes
    public void initText() {
        txtIDRes.setText("");
        txtDateReservation.setText("");
        txtIdClient.setText("");
        txtIdServ.setText("");
    }

    //activer tous les champs textes
    public void enableAll() {
        txtIDRes.setEnabled(true);
        txtDateReservation.setEnabled(true);
        txtIdClient.setEnabled(true);
        txtIdServ.setEnabled(true);
    }

    //desactiver tous les champs textes
    public void disableAll() {
        txtIDRes.setEnabled(false);
        txtDateReservation.setEnabled(false);
        txtIdClient.setEnabled(false);
        txtIdServ.setEnabled(false);
    }

    //activer le champ idres et desactiver les autres
    public void enableIdRes() {
        txtIDRes.setEnabled(true);
        txtDateReservation.setEnabled(false);
        txtIdClient.setEnabled(false);
        txtIdServ.setEnabled(false);
    }

    //activer les champs (idres et date reservatio)  et desactiver les autres
    public void enableIdAnddate() {
        txtIDRes.setEnabled(true);
        txtDateReservation.setEnabled(true);
        txtIdClient.setEnabled(false);
        txtIdServ.setEnabled(false);
    }

    /**
     * Creates new form ListeDesReservations
     */
    public ListeDesReservations() {
        initComponents();
        this.disableAll();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtIDRes = new javax.swing.JTextField();
        txtIdServ = new javax.swing.JTextField();
        txtIdClient = new javax.swing.JTextField();
        txtDateReservation = new javax.swing.JTextField();
        btAjouter = new javax.swing.JLabel();
        btModifier = new javax.swing.JLabel();
        btSupprimer = new javax.swing.JLabel();
        btValider = new javax.swing.JLabel();
        btAnnuler = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new ListeReservationControlleur());
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Reservation");

        jLabel2.setText("Id_Reservation : ");

        jLabel3.setText("Id_Service : ");

        jLabel4.setText("Id_Client");

        jLabel5.setText("Date_De_Reservation :");

        txtIDRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDResActionPerformed(evt);
            }
        });

        txtDateReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateReservationActionPerformed(evt);
            }
        });
        txtDateReservation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDateReservationKeyReleased(evt);
            }
        });

        btAjouter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        btAjouter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btAjouterMouseClicked(evt);
            }
        });

        btModifier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update.png"))); // NOI18N
        btModifier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btModifierMouseClicked(evt);
            }
        });

        btSupprimer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        btSupprimer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSupprimerMouseClicked(evt);
            }
        });

        btValider.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Valid.png"))); // NOI18N
        btValider.setEnabled(false);
        btValider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btValiderMouseClicked(evt);
            }
        });

        btAnnuler.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/retour.png"))); // NOI18N
        btAnnuler.setEnabled(false);
        btAnnuler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btAnnulerMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btAjouter)
                                    .addGap(47, 47, 47)
                                    .addComponent(btModifier)
                                    .addGap(57, 57, 57)
                                    .addComponent(btSupprimer)
                                    .addGap(59, 59, 59)
                                    .addComponent(btValider)
                                    .addGap(48, 48, 48)
                                    .addComponent(btAnnuler, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtDateReservation, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(9, 9, 9)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtIdServ, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                                        .addComponent(txtIdClient))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtIDRes, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIDRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtIdServ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtIdClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDateReservation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btAnnuler, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btModifier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btSupprimer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btValider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAjouterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAjouterMouseClicked

        btAjouter.setEnabled(false);
        btModifier.setEnabled(false);
        btSupprimer.setEnabled(false);

        btValider.setEnabled(true);
        btAnnuler.setEnabled(true);
        this.enableAll();
        choix = 1;

    }//GEN-LAST:event_btAjouterMouseClicked

    private void btModifierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btModifierMouseClicked

        btAjouter.setEnabled(false);
        btModifier.setEnabled(false);
        btSupprimer.setEnabled(false);

        btValider.setEnabled(true);
        btAnnuler.setEnabled(true);
        this.enableIdAnddate();
        choix = 2;
    }//GEN-LAST:event_btModifierMouseClicked

    private void btSupprimerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSupprimerMouseClicked
        btAjouter.setEnabled(false);
        btModifier.setEnabled(false);
        btSupprimer.setEnabled(false);

        btValider.setEnabled(true);
        btAnnuler.setEnabled(true);
        this.enableIdRes();
        choix = 3;


    }//GEN-LAST:event_btSupprimerMouseClicked

    private void btValiderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btValiderMouseClicked
        Reservation reservation = new Reservation();
        REservationDAO reservationDAO = new REservationDAO();
        switch (choix) {
            case 1:
                reservation.setId_Reservation(Integer.parseInt(txtIDRes.getText()));
                reservation.setId_Client(Integer.parseInt(txtIdClient.getText()));
                reservation.setId_Service(Integer.parseInt(txtIdServ.getText()));
                reservation.setDate_De_Reservation(txtDateReservation.getText());
                reservationDAO.ajouter(reservation);
                jTable1.setModel(new ListeReservationControlleur());
                break;
            case 2:
                reservation.setId_Reservation(Integer.parseInt(txtIDRes.getText()));
                reservation.setDate_De_Reservation(txtDateReservation.getText());
                reservationDAO.Modifier(reservation);
                jTable1.setModel(new ListeReservationControlleur());
                break;
            case 3:
                reservation.setId_Reservation(Integer.parseInt(txtIDRes.getText()));
                reservationDAO.Supprimer(reservation);
                jTable1.setModel(new ListeReservationControlleur());
                break;
                
        }

        btAjouter.setEnabled(true);
        btModifier.setEnabled(true);
        btSupprimer.setEnabled(true);

        btValider.setEnabled(false);
        btAnnuler.setEnabled(false);
        this.initText();
        this.disableAll();


    }//GEN-LAST:event_btValiderMouseClicked

    private void btAnnulerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAnnulerMouseClicked
        btAjouter.setEnabled(true);
        btModifier.setEnabled(true);
        btSupprimer.setEnabled(true);

        btValider.setEnabled(false);
        btAnnuler.setEnabled(false);
        this.initText();
        this.disableAll();
    }//GEN-LAST:event_btAnnulerMouseClicked

    private void txtDateReservationKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDateReservationKeyReleased

        if (this.isNumeric(txtDateReservation.getText().substring(txtDateReservation.getText().length() - 1,
                txtDateReservation.getText().length()))) {
            txtDateReservation.setText(txtDateReservation.getText().substring(0, txtDateReservation.getText().length() - 1));
        }
    }//GEN-LAST:event_txtDateReservationKeyReleased

    private void txtIDResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDResActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDResActionPerformed

    private void txtDateReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateReservationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateReservationActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListeDesReservations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListeDesReservations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListeDesReservations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListeDesReservations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListeDesReservations().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btAjouter;
    private javax.swing.JLabel btAnnuler;
    private javax.swing.JLabel btModifier;
    private javax.swing.JLabel btSupprimer;
    private javax.swing.JLabel btValider;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtDateReservation;
    private javax.swing.JTextField txtIDRes;
    private javax.swing.JTextField txtIdClient;
    private javax.swing.JTextField txtIdServ;
    // End of variables declaration//GEN-END:variables
}
