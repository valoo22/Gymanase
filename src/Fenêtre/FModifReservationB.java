/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fenêtre;

import Metier.Reservation;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Valoo
 */
public class FModifReservationB extends FMaster
{
    Statement stat;
    /**
     * Creates new form FModifReservation
     */
    public FModifReservationB()
    {
        initComponents();
    }
    public FModifReservationB(Reservation Re)
    {
        initComponents();
        lblSalle.setText(Re.getRefSalle());
        lblDate.setText(Re.getDateReserv());
        lblHeure.setText(Re.getHeureReserv().toString());
        ResultSet rs1;
        try
        {
            Class.forName(pilote);
            conn = DriverManager.getConnection("jdbc:mysql://localhost/gymnase", "root", "");
            stat = conn.createStatement();
            rs1 = stat.executeQuery("Select refAsso from association");
            while(rs1.next())
            {
                cbxAssoc.addItem(rs1.getString("refAsso"));
            }
            cbxAssoc.setSelectedItem(Re.getRefAsso());
            rs1.close();
            stat.close();
            conn.close();
        } 
        catch (SQLException | ClassNotFoundException sqlE)
        {
            JOptionPane.showMessageDialog(null, sqlE.getMessage(), "Erreur Sql", JOptionPane.ERROR_MESSAGE);
        }   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        lblTitre = new javax.swing.JLabel();
        lblAssoc = new javax.swing.JLabel();
        cbxAssoc = new javax.swing.JComboBox<>();
        lblSalleReserv = new javax.swing.JLabel();
        lblDateReserv = new javax.swing.JLabel();
        lblHeureReserv = new javax.swing.JLabel();
        lblHeure = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblSalle = new javax.swing.JLabel();
        btnOk = new javax.swing.JButton();
        btnAnnuler = new javax.swing.JButton();
        lblH = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Modifier une Réservation");

        lblTitre.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblTitre.setForeground(new java.awt.Color(0, 255, 51));
        lblTitre.setText("Modifier une Reservation dans la Base");

        lblAssoc.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblAssoc.setText("Référence Association :");

        cbxAssoc.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lblSalleReserv.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblSalleReserv.setText("Référence Salle :");

        lblDateReserv.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblDateReserv.setText("Date de Reservation :");

        lblHeureReserv.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblHeureReserv.setText("Heure de Reservation :");

        lblHeure.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblHeure.setForeground(new java.awt.Color(0, 255, 51));
        lblHeure.setText("NULL");

        lblDate.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblDate.setForeground(new java.awt.Color(0, 255, 51));
        lblDate.setText("NULL");

        lblSalle.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblSalle.setForeground(new java.awt.Color(0, 255, 51));
        lblSalle.setText("NULL");

        btnOk.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnOkActionPerformed(evt);
            }
        });

        btnAnnuler.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnAnnuler.setText("Annuler");
        btnAnnuler.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAnnulerActionPerformed(evt);
            }
        });

        lblH.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblH.setForeground(new java.awt.Color(0, 255, 51));
        lblH.setText("H");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAssoc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbxAssoc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitre)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDateReserv)
                                .addGap(18, 18, 18)
                                .addComponent(lblDate))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblHeureReserv)
                                .addGap(18, 18, 18)
                                .addComponent(lblHeure)
                                .addGap(18, 18, 18)
                                .addComponent(lblH))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSalleReserv)
                                .addGap(18, 18, 18)
                                .addComponent(lblSalle)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnOk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAnnuler, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitre)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSalleReserv)
                    .addComponent(lblSalle))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDateReserv)
                    .addComponent(lblDate))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeureReserv)
                    .addComponent(lblHeure)
                    .addComponent(lblH))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAssoc)
                    .addComponent(cbxAssoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOk)
                    .addComponent(btnAnnuler))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnOkActionPerformed
    {//GEN-HEADEREND:event_btnOkActionPerformed
        int option = JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment Modifier la réservation : Salle " + lblSalle.getText() + " /Date : "+lblDate.getText() + " à " + lblHeure.getText() + " , Association : "+ cbxAssoc.getSelectedItem().toString() +" du tableaux Reservation ?", "Confirmation Modification ?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (option == JOptionPane.YES_OPTION) 
        {
            try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gymnase", "root", "" );
            PreparedStatement prepareStmt = conn.prepareStatement("Update from reservation where refAsso = ? and refSalle = ? and date = ? and heure = ?");
            prepareStmt.setString(1, cbxAssoc.getSelectedItem().toString());
            prepareStmt.setString(2, lblSalle.getText());
            prepareStmt.setString(3, lblDate.getText());
            prepareStmt.setString(4, lblHeure.getText());
            prepareStmt.executeUpdate();
            conn.close();
            JOptionPane.showMessageDialog(null, "Modication de la reservation effectué !", "Suppression Réussie", JOptionPane.OK_OPTION);
            } 
            catch ( SQLException e ) 
            {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erreur Sql", JOptionPane.OK_OPTION);
            } 
            finally 
            {
                if ( conn != null )
                    try {
                        conn.close();
                        } 
                    catch ( SQLException ignore ) 
                        {
                        }
            }
        }
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnAnnulerActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAnnulerActionPerformed
    {//GEN-HEADEREND:event_btnAnnulerActionPerformed
        FSelectReservationB f1 = new FSelectReservationB();
        this.setVisible(false);
        f1.setVisible(true);
    }//GEN-LAST:event_btnAnnulerActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(FModifReservationB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(FModifReservationB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(FModifReservationB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(FModifReservationB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() ->
        {
            new FModifReservationB().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnnuler;
    private javax.swing.JButton btnOk;
    private javax.swing.JComboBox<String> cbxAssoc;
    private javax.swing.JLabel lblAssoc;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDateReserv;
    private javax.swing.JLabel lblH;
    private javax.swing.JLabel lblHeure;
    private javax.swing.JLabel lblHeureReserv;
    private javax.swing.JLabel lblSalle;
    private javax.swing.JLabel lblSalleReserv;
    private javax.swing.JLabel lblTitre;
    // End of variables declaration//GEN-END:variables
}
