/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Controlleur.ListeAdminControlleur;
import DAO.AdminDAO;
import Entites.Admin;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Zimbala
 */
public class ListeDesAdmin extends javax.swing.JFrame {

    static int choix;

    /**
     * Creates new form ListeDesAdmin
     */
    public ListeDesAdmin() {
        initComponents();
        this.disableAll();
    }

    public void initText() {
        txtNom.setText("");
        txtPrenom.setText("");
        txtMail.setText("");
        txtMdp.setText("");
    }

    public void enableAll() {
        txtNom.setEnabled(true);
        txtPrenom.setEnabled(true);
        txtMail.setEnabled(true);
        txtMdp.setEnabled(true);
    }

    //desactiver tous les champs textes
    public void disableAll() {
        txtNom.setEnabled(false);
        txtPrenom.setEnabled(false);
        txtMail.setEnabled(false);
        txtMdp.setEnabled(false);
    }

    //activer le champ idres et desactiver les autres
    public void enableIdRes() {
        txtNom.setEnabled(true);
        txtPrenom.setEnabled(false);
        txtMail.setEnabled(false);
        txtMdp.setEnabled(false);
    }

    public void enableIdAnddate() {
        txtNom.setEnabled(true);
        txtPrenom.setEnabled(true);
        txtMail.setEnabled(false);
        txtMdp.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtMail = new javax.swing.JTextPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNom = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPrenom = new javax.swing.JTextPane();
        txtMdp = new javax.swing.JPasswordField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        ajouter = new javax.swing.JLabel();
        supprimer = new javax.swing.JLabel();
        valider = new javax.swing.JLabel();
        retour = new javax.swing.JLabel();
        modifier = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Prenom :");

        jLabel1.setText("Nom :");

        jScrollPane3.setViewportView(txtMail);

        jScrollPane1.setViewportView(txtNom);

        jLabel4.setText("Mot De Passe :");

        jLabel3.setText("E-Mail :");

        jScrollPane2.setViewportView(txtPrenom);

        txtMdp.setText("jPasswordField1");
        txtMdp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMdpActionPerformed(evt);
            }
        });

        jTable2.setModel(new ListeAdminControlleur());
        jScrollPane5.setViewportView(jTable2);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Espace privé");

        ajouter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        ajouter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ajouterMouseClicked(evt);
            }
        });

        supprimer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        supprimer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                supprimerMouseClicked(evt);
            }
        });

        valider.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Valid.png"))); // NOI18N
        valider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                validerMouseClicked(evt);
            }
        });

        retour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/retour.png"))); // NOI18N
        retour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                retourMouseClicked(evt);
            }
        });

        modifier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update.png"))); // NOI18N
        modifier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modifierMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMdp, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(jScrollPane3))
                        .addGap(580, 580, 580))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(valider, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(retour, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addComponent(jLabel1))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMdp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(retour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(valider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(43, 43, 43))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ajouter)
                            .addComponent(supprimer, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMdpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMdpActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtMdpActionPerformed

    private void ajouterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajouterMouseClicked

        ajouter.setEnabled(false);
        modifier.setEnabled(false);
        supprimer.setEnabled(false);

        valider.setEnabled(true);
        retour.setEnabled(true);
        this.enableAll();
        choix = 1;
        // TODO add your handling code here:
    }//GEN-LAST:event_ajouterMouseClicked

    private void modifierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifierMouseClicked

        ajouter.setEnabled(false);
        modifier.setEnabled(false);
        supprimer.setEnabled(false);

        valider.setEnabled(true);
        retour.setEnabled(true);
        this.enableIdAnddate();
        choix = 2;
        // TODO add your handling code here:
    }//GEN-LAST:event_modifierMouseClicked

    private void supprimerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supprimerMouseClicked

        ajouter.setEnabled(false);
        modifier.setEnabled(false);
        supprimer.setEnabled(false);

        valider.setEnabled(true);
        retour.setEnabled(true);
        this.enableIdRes();
        choix = 3;


        // TODO add your handling code here:
    }//GEN-LAST:event_supprimerMouseClicked

    private void validerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_validerMouseClicked


        Admin d = new Admin();
        AdminDAO dao = new AdminDAO();
        switch (choix) {
            case 1:
                d.setNom(txtNom.getText());
                d.setPrenom(txtPrenom.getText());
                d.setMail(txtMail.getText());
                txtMdp.selectAll();
                d.setMot_De_Passe(txtMdp.getSelectedText());

                dao.ajouter(d);

                jTable2 = new javax.swing.JTable();

                jTable2.setModel(new ListeAdminControlleur());

                jScrollPane5.setViewportView(jTable2);
                break;
            case 2:
                int id = (Integer) jTable2.getModel().getValueAt(jTable2.getSelectedRow(), 0);
        d.setId_Admin(id);
        d.setNom(txtNom.getText());
        d.setPrenom(txtPrenom.getText());
        d.setMail(txtMail.getText());
        txtMdp.selectAll();
        d.setMot_De_Passe(txtMdp.getSelectedText());
        try {
            dao.Modifier(d);
        } catch (SQLException ex) {
            System.out.println("non effectué" + ex.getMessage());
        }
        jTable2 = new javax.swing.JTable();

        jTable2.setModel(new ListeAdminControlleur());

        jScrollPane5.setViewportView(jTable2);
                break;
            case 3:
                int id2 = (Integer) jTable2.getModel().getValueAt(jTable2.getSelectedRow(), 0);
        dao.DeleteAdmin(id2);

        jTable2 = new javax.swing.JTable();

        jTable2.setModel(new ListeAdminControlleur());

        jScrollPane5.setViewportView(jTable2);
                
                break;
        }

        ajouter.setEnabled(true);
        modifier.setEnabled(true);
        supprimer.setEnabled(true);

        valider.setEnabled(false);
        //retour.setEnabled(false);
        this.initText();
        this.disableAll();






        // TODO add your handling code here:
    }//GEN-LAST:event_validerMouseClicked

    private void retourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_retourMouseClicked
        ajouter.setEnabled(true);
        modifier.setEnabled(true);
        supprimer.setEnabled(true);

        valider.setEnabled(false);
        retour.setEnabled(false);
        this.initText();
        this.disableAll();
        // TODO add your handling code here:
    }//GEN-LAST:event_retourMouseClicked

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
            java.util.logging.Logger.getLogger(ListeDesAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListeDesAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListeDesAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListeDesAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ListeDesAdmin().setVisible(true);
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ajouter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel modifier;
    private javax.swing.JLabel retour;
    private javax.swing.JLabel supprimer;
    private javax.swing.JTextPane txtMail;
    private javax.swing.JPasswordField txtMdp;
    private javax.swing.JTextPane txtNom;
    private javax.swing.JTextPane txtPrenom;
    private javax.swing.JLabel valider;
    // End of variables declaration//GEN-END:variables
}