/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fenêtre;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Valoo
 */
public class FEmploiJourne extends FMaster
{

    /**
     * Creates new form FEmploiJourne
     */
    public FEmploiJourne()
    {
        initComponents();
    }
    public FEmploiJourne(String Salle, java.sql.Date Journe)
    {
        initComponents();
        lblDate.setText(Journe.toString());
        lblSalle.setText(Salle);
        try 
            {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gymnase", "root", "" );
                PreparedStatement ps = conn.prepareStatement(pilote);
                ResultSet rs = ps.executeQuery("Select refAsso, heure from reservation where refSalle ='"+ Salle +"' and date ='"+ Journe +"' ORDER BY heure DESC");
                while (rs.next())
                {
                    if ("08:00:00".equals(rs.getString("heure")))
                    {
                        tEmploi.setValueAt(rs.getString("refAsso"), 1, 2);
                    }
                    if ("09:00:00".equals(rs.getString("heure")))
                    {
                        tEmploi.setValueAt(rs.getString("refAsso"), 2, 2);
                    }
                    if ("10:00:00".equals(rs.getString("heure")))
                    {
                        tEmploi.setValueAt(rs.getString("refAsso"), 3, 2);
                    }
                    if ("11:00:00".equals(rs.getString("heure")))
                    {
                        tEmploi.setValueAt(rs.getString("refAsso"), 4, 2);
                    }
                    if ("13:00:00".equals(rs.getString("heure")))
                    {
                        tEmploi.setValueAt(rs.getString("refAsso"), 5, 2);
                    }
                    if ("14:00:00".equals(rs.getString("heure")))
                    {
                        tEmploi.setValueAt(rs.getString("refAsso"), 6, 2);
                    }
                    if ("15:00:00".equals(rs.getString("heure")))
                    {
                        tEmploi.setValueAt(rs.getString("refAsso"), 7, 2);
                    }
                    if ("16:00:00".equals(rs.getString("heure")))
                    {
                        tEmploi.setValueAt(rs.getString("refAsso"), 8, 2);
                    }
                    if ("17:00:00".equals(rs.getString("heure")))
                    {
                        tEmploi.setValueAt(rs.getString("refAsso"), 9, 2);
                    }
                }
                conn.close();
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jScrollPane1 = new javax.swing.JScrollPane();
        tEmploi = new javax.swing.JTable();
        lblTDate = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        btnOk = new javax.swing.JButton();
        lblTSalle = new javax.swing.JLabel();
        lblSalle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tEmploi.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        tEmploi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {"8H - 9H", null},
                {"9H - 10H", null},
                {"10H - 11H", null},
                {"11H - 12H", null},
                {"13H - 14H", null},
                {"14H - 15H", null},
                {"15H - 16H", null},
                {"16H - 17H", null},
                {"17H - 18H", null}
            },
            new String []
            {
                "Heure", "Disponibilité"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }
        });
        tEmploi.setRowHeight(30);
        tEmploi.setRowSelectionAllowed(false);
        jScrollPane1.setViewportView(tEmploi);

        lblTDate.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblTDate.setForeground(new java.awt.Color(0, 204, 0));
        lblTDate.setText("Date :");

        lblDate.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblDate.setForeground(new java.awt.Color(0, 204, 0));
        lblDate.setText("jLabel1");

        btnOk.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnOkActionPerformed(evt);
            }
        });

        lblTSalle.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblTSalle.setForeground(new java.awt.Color(0, 204, 0));
        lblTSalle.setText("Salle :");

        lblSalle.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblSalle.setForeground(new java.awt.Color(0, 204, 0));
        lblSalle.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTSalle)
                        .addGap(6, 6, 6)
                        .addComponent(lblSalle)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblTDate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(btnOk)
                .addContainerGap(123, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTDate)
                    .addComponent(lblDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTSalle)
                    .addComponent(lblSalle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnOk)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnOkActionPerformed
    {//GEN-HEADEREND:event_btnOkActionPerformed
        FPlanReservation f1 = new FPlanReservation();
        this.setVisible(false);
        f1.setVisible(true);
    }//GEN-LAST:event_btnOkActionPerformed

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
            java.util.logging.Logger.getLogger(FEmploiJourne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(FEmploiJourne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(FEmploiJourne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(FEmploiJourne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new FEmploiJourne().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOk;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblSalle;
    private javax.swing.JLabel lblTDate;
    private javax.swing.JLabel lblTSalle;
    private javax.swing.JTable tEmploi;
    // End of variables declaration//GEN-END:variables
}
