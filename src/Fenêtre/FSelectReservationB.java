/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fenêtre;

import Metier.Reservation;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Valoo
 */
public class FSelectReservationB extends FMaster
{
    java.util.Date D = new java.util.Date();
    SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd");
    ResultSet rs1;
    /**
     * Creates new form FSelectReservationB
     */
    public FSelectReservationB()
    {
        initComponents();
        try
        {
            Class.forName(pilote);
            conn = DriverManager.getConnection("jdbc:mysql://localhost/gymnase", "root", "");
            PreparedStatement ps = conn.prepareStatement(pilote);
            String Date = sdfDate.format(D);
            rs1 = ps.executeQuery("Select DISTINCT refAsso from reservation where date >= "+Date);
            while(rs1.next())
            {
                cbxAssoc.addItem(rs1.getString("refAsso"));
            }
            rs1.close();
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
    private void initComponents() {

        lblTitre = new javax.swing.JLabel();
        lblAssoc = new javax.swing.JLabel();
        cbxAssoc = new javax.swing.JComboBox<>();
        lblSalle = new javax.swing.JLabel();
        cbxSalle = new javax.swing.JComboBox<>();
        lblDate = new javax.swing.JLabel();
        cbxDate = new javax.swing.JComboBox<>();
        lblHeure = new javax.swing.JLabel();
        cbxHeure = new javax.swing.JComboBox<>();
        btnModifier = new javax.swing.JButton();
        btnSupprimer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Selectionnez une reservation dans la Base");

        lblTitre.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblTitre.setForeground(new java.awt.Color(0, 255, 0));
        lblTitre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitre.setText("Selectionnez Une Reservation dans la Base");

        lblAssoc.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblAssoc.setText("Association : ");

        cbxAssoc.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cbxAssoc.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxAssocItemStateChanged(evt);
            }
        });

        lblSalle.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblSalle.setText("Salle : ");

        cbxSalle.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cbxSalle.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxSalleItemStateChanged(evt);
            }
        });

        lblDate.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblDate.setText("Date de la Réservation : ");

        cbxDate.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cbxDate.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxDateItemStateChanged(evt);
            }
        });

        lblHeure.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblHeure.setText("Heure de la Réservation : ");

        cbxHeure.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        btnModifier.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnModifier.setText("Modifier");
        btnModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifierActionPerformed(evt);
            }
        });

        btnSupprimer.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnSupprimer.setText("Supprimer");
        btnSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupprimerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAssoc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxAssoc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSalle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxSalle, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxDate, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblHeure)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxHeure, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnModifier)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSupprimer)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitre)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAssoc)
                    .addComponent(cbxAssoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSalle)
                    .addComponent(cbxSalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDate)
                    .addComponent(cbxDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeure)
                    .addComponent(cbxHeure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModifier)
                    .addComponent(btnSupprimer))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxAssocItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_cbxAssocItemStateChanged
    {//GEN-HEADEREND:event_cbxAssocItemStateChanged
        try
        {
            Class.forName(pilote);
            conn = DriverManager.getConnection("jdbc:mysql://localhost/gymnase", "root", "");
            PreparedStatement ps = conn.prepareStatement(pilote);
            rs1 = ps.executeQuery("Select DISTINCT refSalle from reservation where refAsso ='" + cbxAssoc.getSelectedItem().toString()+"'");
            cbxSalle.removeAllItems();
            while(rs1.next())
            {
                cbxSalle.addItem(rs1.getString("refSalle"));
            }
            rs1.close();
            conn.close();
        } 
        catch (SQLException | ClassNotFoundException sqlE)
        {
            JOptionPane.showMessageDialog(null, sqlE.getMessage(), "Erreur Sql", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cbxAssocItemStateChanged

    private void cbxSalleItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_cbxSalleItemStateChanged
    {//GEN-HEADEREND:event_cbxSalleItemStateChanged
        try
        {
            Class.forName(pilote);
            conn = DriverManager.getConnection("jdbc:mysql://localhost/gymnase", "root", "");
            PreparedStatement ps = conn.prepareStatement(pilote);
            rs1 = ps.executeQuery("Select date from reservation where refAsso ='" + cbxAssoc.getSelectedItem().toString() + "' and refSalle ='"+cbxSalle.getSelectedItem().toString()+"'");
            cbxDate.removeAllItems();
            while(rs1.next())
            {
                cbxDate.addItem(rs1.getString("date"));
            }
            rs1.close();
            conn.close();
        } 
        catch (SQLException | ClassNotFoundException sqlE)
        {
            JOptionPane.showMessageDialog(null, sqlE.getMessage(), "Erreur Sql", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cbxSalleItemStateChanged

    private void cbxDateItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_cbxDateItemStateChanged
    {//GEN-HEADEREND:event_cbxDateItemStateChanged
        try
        {
            Class.forName(pilote);
            conn = DriverManager.getConnection("jdbc:mysql://localhost/gymnase", "root", "");
            PreparedStatement ps = conn.prepareStatement(pilote);
            rs1 = ps.executeQuery("Select heure from reservation where refAsso ='" + cbxAssoc.getSelectedItem().toString() + "' and refSalle ='"+cbxSalle.getSelectedItem().toString()+"' and date ='"+cbxDate.getSelectedItem().toString()+"'");
            cbxHeure.removeAllItems();
            while(rs1.next())
            {
                cbxHeure.addItem(rs1.getString("heure"));
            }
            rs1.close();
            conn.close();
        } 
        catch (SQLException | ClassNotFoundException sqlE)
        {
            JOptionPane.showMessageDialog(null, sqlE.getMessage(), "Erreur Sql", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cbxDateItemStateChanged

    private void btnSupprimerActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSupprimerActionPerformed
    {//GEN-HEADEREND:event_btnSupprimerActionPerformed
        int option = JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment suprimmer la réservation : '"+cbxAssoc.getSelectedItem().toString()+" réserve la salle "+cbxSalle.getSelectedItem().toString() + " le "+cbxDate.getSelectedItem().toString()+" à "+ cbxHeure.getSelectedItem().toString() +" h du tableaux Reservation ?", "Confirmation Supression ?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (option == JOptionPane.YES_OPTION) 
        {
            try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gymnase", "root", "" );
            PreparedStatement prepareStmt = conn.prepareStatement("delete from reservation where refAsso = ? and refSalle = ? and date = ? and heure = ?");
            prepareStmt.setString(1, cbxAssoc.getSelectedItem().toString());
            prepareStmt.setString(2, cbxSalle.getSelectedItem().toString());
            prepareStmt.setString(3, cbxDate.getSelectedItem().toString());
            prepareStmt.setString(4, cbxHeure.getSelectedItem().toString());
            prepareStmt.executeUpdate();
            conn.close();
            JOptionPane.showMessageDialog(null, "Supression de la reservation effectué !", "Suppression Réussie", JOptionPane.OK_OPTION);
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
    }//GEN-LAST:event_btnSupprimerActionPerformed

    private void btnModifierActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnModifierActionPerformed
    {//GEN-HEADEREND:event_btnModifierActionPerformed
        SimpleDateFormat timeformat = new SimpleDateFormat("HH:mm:s");
        Date HeureReserv = null;
        try
        {
            HeureReserv = (Date) timeformat.parse(cbxHeure.getSelectedItem().toString());
        } 
        catch (ParseException ex)
        {
            Logger.getLogger(FSelectReservationB.class.getName()).log(Level.SEVERE, null, ex);
        }
        Reservation Re = new Reservation(cbxSalle.getSelectedItem().toString(), cbxDate.getSelectedItem().toString() , HeureReserv, cbxAssoc.getSelectedItem().toString());
        FModifReservationB f1 = new FModifReservationB(Re);
        this.setVisible(false);
        f1.setVisible(true);
    }//GEN-LAST:event_btnModifierActionPerformed

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
            java.util.logging.Logger.getLogger(FSelectReservationB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(FSelectReservationB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(FSelectReservationB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(FSelectReservationB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() ->
        {
            new FSelectReservationB().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModifier;
    private javax.swing.JButton btnSupprimer;
    private javax.swing.JComboBox<String> cbxAssoc;
    private javax.swing.JComboBox<String> cbxDate;
    private javax.swing.JComboBox<String> cbxHeure;
    private javax.swing.JComboBox<String> cbxSalle;
    private javax.swing.JLabel lblAssoc;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblHeure;
    private javax.swing.JLabel lblSalle;
    private javax.swing.JLabel lblTitre;
    // End of variables declaration//GEN-END:variables
}
