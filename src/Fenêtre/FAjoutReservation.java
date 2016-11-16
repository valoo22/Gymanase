/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fenêtre;

import Metier.Reservation;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;

/**
 *
 * @author Valoo
 */
public class FAjoutReservation extends FMaster
{
    String pilote = "org.gjt.mm.mysql.Driver";
    Connection conn;
    Statement stat;
    DateFormat timeformat = new SimpleDateFormat("HH:mm:ss");
    DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
    /**
     * Creates new form FAjoutReservation
     * @throws java.text.ParseException
     */
    public FAjoutReservation() throws ParseException
    {
        initComponents();
        dpDateReserv.setFormats(dateformat);
        Date avant = timeformat.parse("08:00:00");
        Date apres = timeformat.parse("18:00:00");
        SpinnerDateModel model = new SpinnerDateModel(avant,avant,apres,Calendar.HOUR);
        model.setCalendarField(Calendar.MINUTE);
        sHeureReserv.setModel(model);
        sHeureReserv.setEditor(new JSpinner.DateEditor(sHeureReserv, "HH:mm:ss"));
        ResultSet rs1;
        try
        {
            Class.forName(pilote);
            conn = DriverManager.getConnection("jdbc:mysql://localhost/gymnase", "root", "");
            stat = conn.createStatement();
            rs1 = stat.executeQuery("Select * from association");
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
    private void initComponents()
    {

        lblTitre = new javax.swing.JLabel();
        lblAssoc = new javax.swing.JLabel();
        cbxAssoc = new javax.swing.JComboBox<>();
        lblSalle = new javax.swing.JLabel();
        cbxSalle = new javax.swing.JComboBox<>();
        lblDateReserv = new javax.swing.JLabel();
        dpDateReserv = new org.jdesktop.swingx.JXDatePicker();
        lblHeureReserv = new javax.swing.JLabel();
        sHeureReserv = new javax.swing.JSpinner();
        btnOk = new javax.swing.JButton();
        btnAnnuler = new javax.swing.JButton();
        lblSportPratiquer = new javax.swing.JLabel();
        cbxSportPratiquer = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ajouter une Réservation");

        lblTitre.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblTitre.setForeground(new java.awt.Color(0, 255, 51));
        lblTitre.setText("Ajouter une Réservation dans la journée ");

        lblAssoc.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblAssoc.setText("Référence Association :");

        cbxAssoc.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cbxAssoc.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cbxAssocActionPerformed(evt);
            }
        });

        lblSalle.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblSalle.setText("Référence Salle :");

        cbxSalle.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lblDateReserv.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblDateReserv.setText("Date de Reservation :");

        dpDateReserv.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        java.util.Date date = new Date();
        dpDateReserv.getMonthView().setLowerBound(date);

        lblHeureReserv.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblHeureReserv.setText("Heure de Reservation :");

        sHeureReserv.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

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

        lblSportPratiquer.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblSportPratiquer.setText("Sport Pratiqué par l'association :");

        cbxSportPratiquer.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cbxSportPratiquer.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cbxSportPratiquerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnOk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAnnuler, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAssoc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbxAssoc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSportPratiquer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbxSportPratiquer, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSalle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbxSalle, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDateReserv)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dpDateReserv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitre)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblHeureReserv)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sHeureReserv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                    .addComponent(lblSportPratiquer)
                    .addComponent(cbxSportPratiquer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSalle)
                    .addComponent(cbxSalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDateReserv)
                    .addComponent(dpDateReserv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeureReserv)
                    .addComponent(sHeureReserv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOk)
                    .addComponent(btnAnnuler))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnnulerActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAnnulerActionPerformed
    {//GEN-HEADEREND:event_btnAnnulerActionPerformed
        FMenuPrincipal f1 = new FMenuPrincipal();
        this.setVisible(false);
        f1.setVisible(true);
    }//GEN-LAST:event_btnAnnulerActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnOkActionPerformed
    {//GEN-HEADEREND:event_btnOkActionPerformed
        int option = JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment ajouter la reservation suivante : l'association "+cbxAssoc.getSelectedItem().toString()+" réservent la salle : " + cbxSalle.getSelectedItem().toString() + " le : " + dateformat.format(dpDateReserv.getDate()) + " à " + timeformat.format(sHeureReserv.getValue())+" h .", "Confirmation Reservation ?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        String StringDate = timeformat.format(dpDateReserv.getDate());
        if (option == JOptionPane.YES_OPTION) 
        {
            Reservation Re = null;
            try 
            { 
                Re = new Reservation(cbxSalle.getSelectedItem().toString(), timeformat.parse(StringDate) , (Date)sHeureReserv.getValue(), cbxAssoc.getSelectedItem().toString());
                Reservation.setLesReservation(Re);
                JOptionPane.showMessageDialog(null, "La réservation de "+cbxAssoc.getSelectedItem().toString()+" pour la salle : "+ cbxSalle.getSelectedItem().toString() +" le " + dateformat.format(dpDateReserv.getDate()) + " à " + timeformat.format(sHeureReserv.getValue()) + " a bien été ajoutée a la liste des enrengistrement , n'ouliez pas d'enrengistrer les modification en fin de journée .", "Réservation correctement enrengistrée !", JOptionPane.INFORMATION_MESSAGE);
            } 
            catch (ParseException ex) {
                Logger.getLogger(FAjoutReservation.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
    }//GEN-LAST:event_btnOkActionPerformed

    private void cbxAssocActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cbxAssocActionPerformed
    {//GEN-HEADEREND:event_cbxAssocActionPerformed
        ResultSet rs1;
        try
        {
            Class.forName(pilote);
            conn = DriverManager.getConnection("jdbc:mysql://localhost/gymnase", "root", "");
            stat = conn.createStatement();
            rs1 = stat.executeQuery("Select nomSport from pratiquer where refAsso ='" + cbxAssoc.getSelectedItem()+"'");
            cbxSportPratiquer.removeAllItems();
            while(rs1.next())
            {
                cbxSportPratiquer.addItem(rs1.getString("nomSport"));
            }
            rs1.close();
            stat.close();
            conn.close();
        } 
        catch (SQLException | ClassNotFoundException sqlE)
        {
            JOptionPane.showMessageDialog(null, sqlE.getMessage(), "Erreur Sql", JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_cbxAssocActionPerformed

    private void cbxSportPratiquerActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cbxSportPratiquerActionPerformed
    {//GEN-HEADEREND:event_cbxSportPratiquerActionPerformed
        ResultSet rs1;
        try
        {
            Class.forName(pilote);
            conn = DriverManager.getConnection("jdbc:mysql://localhost/gymnase", "root", "");
            stat = conn.createStatement();
            rs1 = stat.executeQuery("Select refSalle from accueillir where nomSportAutorise ='" + cbxSportPratiquer.getSelectedItem()+"'");
            cbxSalle.removeAllItems();
            while(rs1.next())
            {
                cbxSalle.addItem(rs1.getString("refSalle"));
            }
            rs1.close();
            stat.close();
            conn.close();
        } 
        catch (SQLException | ClassNotFoundException sqlE)
        {
            JOptionPane.showMessageDialog(null, sqlE.getMessage(), "Erreur Sql", JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_cbxSportPratiquerActionPerformed

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
            java.util.logging.Logger.getLogger(FAjoutReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(FAjoutReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(FAjoutReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(FAjoutReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() ->
        {
            try
            {
                new FAjoutReservation().setVisible(true);
            } catch (ParseException ex)
            {
                Logger.getLogger(FAjoutReservation.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnnuler;
    private javax.swing.JButton btnOk;
    private javax.swing.JComboBox<String> cbxAssoc;
    private javax.swing.JComboBox<String> cbxSalle;
    private javax.swing.JComboBox<String> cbxSportPratiquer;
    private org.jdesktop.swingx.JXDatePicker dpDateReserv;
    private javax.swing.JLabel lblAssoc;
    private javax.swing.JLabel lblDateReserv;
    private javax.swing.JLabel lblHeureReserv;
    private javax.swing.JLabel lblSalle;
    private javax.swing.JLabel lblSportPratiquer;
    private javax.swing.JLabel lblTitre;
    private javax.swing.JSpinner sHeureReserv;
    // End of variables declaration//GEN-END:variables
}
