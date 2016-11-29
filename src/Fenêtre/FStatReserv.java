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
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Valoo
 */
public class FStatReserv extends FMaster
{
    ResultSet rs, rs1;
    PreparedStatement ps;
    SimpleDateFormat sdfTime = new SimpleDateFormat("hh");
    /**
     * Creates new form FStatReserv
     */
    public FStatReserv()
    {
        initComponents();
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
        lblSalle = new javax.swing.JLabel();
        cbxSalle = new javax.swing.JComboBox<>();
        lblAssociation = new javax.swing.JLabel();
        cbxAssoc = new javax.swing.JComboBox<>();
        btnLister = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TReserv = new javax.swing.JTable();
        lblNbReserv = new javax.swing.JLabel();
        lblReserv = new javax.swing.JLabel();
        btnOK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Statistique des Reservation");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblTitre.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTitre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitre.setText("Statistique Réservation");

        lblSalle.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblSalle.setText("Salle :");

        cbxSalle.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cbxSalle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tout" }));

        lblAssociation.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblAssociation.setText("Association :");

        cbxAssoc.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cbxAssoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tout" }));

        btnLister.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnLister.setText("Lister");
        btnLister.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListerActionPerformed(evt);
            }
        });

        TReserv.setModel(new TableModel.JTableModelReservation());
        jScrollPane1.setViewportView(TReserv);

        lblNbReserv.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblNbReserv.setText("Nombre de Réservation :");

        lblReserv.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        btnOK.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnOK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLister, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTitre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSalle)
                                .addGap(18, 18, 18)
                                .addComponent(cbxSalle, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblAssociation)
                                .addGap(18, 18, 18)
                                .addComponent(cbxAssoc, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNbReserv)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblReserv)))
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
                    .addComponent(lblSalle)
                    .addComponent(cbxSalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAssociation)
                    .addComponent(cbxAssoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btnLister)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNbReserv)
                    .addComponent(lblReserv))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        FStatistique f1 = new FStatistique();
        this.dispose();
        f1.setVisible(true);
    }//GEN-LAST:event_btnOKActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try 
            {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gymnase", "root", "" );
                ps = conn.prepareStatement(pilote);
                rs = ps.executeQuery("Select Distinct refSalle from salle");
                while (rs.next())                  
                    {
                        cbxSalle.addItem(rs.getString("refSalle"));
                    }
                rs.close();
                rs1 = ps.executeQuery("Select Distinct refAsso from association");
                while (rs1.next()) 
                    {                    
                        cbxAssoc.addItem(rs1.getString("refAsso"));
                    }
                rs1.close();
                ps.close();
            } 
        catch ( SQLException e ) 
            {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erreur Sql", JOptionPane.INFORMATION_MESSAGE);
            } 
        finally 
            {
                if ( conn != null )
                    try 
                        {
                            conn.close();
                        } 
                    catch ( SQLException ignore ) 
                        {
                            
                        }
            }
    }//GEN-LAST:event_formWindowOpened

    private void btnListerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListerActionPerformed
        int k = 0;
        if (cbxAssoc.getSelectedItem() == null || cbxAssoc.getSelectedIndex()== 0 ) 
            {
                if (cbxSalle.getSelectedIndex() == 0 || cbxSalle.getSelectedItem() == null) 
                    {
                        try 
                            {
                                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gymnase", "root", "" );
                                ps = conn.prepareStatement(pilote);
                                rs = ps.executeQuery("Select refSalle, refAsso, date, heure from reservation");
                                while (rs.next())                  
                                    {
                                        TReserv.setValueAt(rs.getString(1), k, 0);
                                        TReserv.setValueAt(rs.getString(2), k, 1);
                                        TReserv.setValueAt(rs.getString(3), k, 2);
                                        TReserv.setValueAt(sdfTime.format(rs.getDate(4))+" H", k, 3);
                                        k++;
                                    }
                                rs.close();
                                ps.close();
                            } 
                        catch ( SQLException e ) 
                            {
                                JOptionPane.showMessageDialog(null, e.getMessage(), "Erreur Sql", JOptionPane.INFORMATION_MESSAGE);
                            } 
                        finally 
                            {
                                if ( conn != null )
                                    try 
                                        {
                                            conn.close();
                                        } 
                                    catch ( SQLException ignore ) 
                                        {

                                        }
                            }
                    }
            }
    }//GEN-LAST:event_btnListerActionPerformed

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
            java.util.logging.Logger.getLogger(FStatReserv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(FStatReserv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(FStatReserv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(FStatReserv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FStatReserv().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TReserv;
    private javax.swing.JButton btnLister;
    private javax.swing.JButton btnOK;
    private javax.swing.JComboBox<String> cbxAssoc;
    private javax.swing.JComboBox<String> cbxSalle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAssociation;
    private javax.swing.JLabel lblNbReserv;
    private javax.swing.JLabel lblReserv;
    private javax.swing.JLabel lblSalle;
    private javax.swing.JLabel lblTitre;
    // End of variables declaration//GEN-END:variables
}
