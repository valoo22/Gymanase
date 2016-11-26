/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fenêtre;

import java.sql.Connection;
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
public class FStatSport extends FMaster
{
    /**
     * Creates new form FStatSport
     */
    public FStatSport()
    {
        initComponents();
        try 
            {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gymnase", "root", "" );
                PreparedStatement ps = conn.prepareStatement(pilote);
                ResultSet rs = ps.executeQuery("Select Count(nomSport) from sport");
                if (rs.first())
                {
                    lblNbreSport.setText(rs.getString("count(nomSport)"));
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
        
        try 
            {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gymnase", "root", "" );
                PreparedStatement ps = conn.prepareStatement(pilote);
                ResultSet rs = ps.executeQuery("SELECT COUNT(nomSportAutorise) from accueillir WHERE refSalle = 'A'");
                if (rs.first())
                {
                    lblNbreSportA.setText(rs.getString("count(nomSportAutorise)"));
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
        
        try 
            {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gymnase", "root", "" );
                PreparedStatement ps = conn.prepareStatement(pilote);
                ResultSet rs = ps.executeQuery("SELECT COUNT(nomSportAutorise) from accueillir WHERE refSalle = 'B'");
                if (rs.first())
                {
                    lblNbreSportB.setText(rs.getString("count(nomSportAutorise)"));
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
        
        try 
            {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gymnase", "root", "" );
                PreparedStatement ps = conn.prepareStatement(pilote);
                ResultSet rs = ps.executeQuery("SELECT COUNT(nomSportAutorise) from accueillir WHERE refSalle = 'C'");
                if (rs.first())
                {
                    lblNbreSportC.setText(rs.getString("count(nomSportAutorise)"));
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
        
        try 
            {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gymnase", "root", "" );
                PreparedStatement ps = conn.prepareStatement(pilote);
                ResultSet rs = ps.executeQuery("select nomSport from pratiquer group by nomSport order by count(*) DESC");
                if (rs.first())
                {
                    lblPlusPratiqueAssoc.setText(rs.getString("nomSport"));
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
        
        try 
            {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gymnase", "root", "" );
                PreparedStatement ps = conn.prepareStatement(pilote);
                ResultSet rs = ps.executeQuery("select nomSport from pratiquer group by nomSport order by count(*) ASC");
                if (rs.first())
                {
                    lblMoinsPratiqueAssoc.setText(rs.getString("nomSport"));
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
    private void initComponents() {

        lblTtitre = new javax.swing.JLabel();
        lblTNbreSport = new javax.swing.JLabel();
        lblTNbreSportA = new javax.swing.JLabel();
        lblTNbreSportB = new javax.swing.JLabel();
        lblTNbreSportC = new javax.swing.JLabel();
        lblTPlusPratiqueAssoc = new javax.swing.JLabel();
        lblNbreSport = new javax.swing.JLabel();
        lblNbreSportA = new javax.swing.JLabel();
        lblNbreSportB = new javax.swing.JLabel();
        lblNbreSportC = new javax.swing.JLabel();
        lblPlusPratiqueAssoc = new javax.swing.JLabel();
        lblTMoinsPratiqueAssoc = new javax.swing.JLabel();
        lblMoinsPratiqueAssoc = new javax.swing.JLabel();
        btnOk = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Statistique des Sport");

        lblTtitre.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblTtitre.setForeground(new java.awt.Color(0, 255, 51));
        lblTtitre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTtitre.setText("Statistique Sport");
        lblTtitre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblTNbreSport.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblTNbreSport.setText("Nombre de Sport : ");

        lblTNbreSportA.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblTNbreSportA.setText("Nombre de Sport Salle A :");

        lblTNbreSportB.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblTNbreSportB.setText("Nombre de Sport Salle B :");

        lblTNbreSportC.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblTNbreSportC.setText("Nombre de Sport Salle C :");

        lblTPlusPratiqueAssoc.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblTPlusPratiqueAssoc.setText("Sport le plus pratiquer par les Associations :");

        lblNbreSport.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblNbreSport.setForeground(new java.awt.Color(0, 204, 0));
        lblNbreSport.setText("jLabel1");

        lblNbreSportA.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblNbreSportA.setForeground(new java.awt.Color(0, 204, 0));
        lblNbreSportA.setText("jLabel1");

        lblNbreSportB.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblNbreSportB.setForeground(new java.awt.Color(0, 204, 0));
        lblNbreSportB.setText("jLabel1");

        lblNbreSportC.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblNbreSportC.setForeground(new java.awt.Color(0, 204, 0));
        lblNbreSportC.setText("jLabel1");

        lblPlusPratiqueAssoc.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblPlusPratiqueAssoc.setForeground(new java.awt.Color(0, 204, 0));
        lblPlusPratiqueAssoc.setText("jLabel1");

        lblTMoinsPratiqueAssoc.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblTMoinsPratiqueAssoc.setText("Sport le plus pratiquer par les Associations :");

        lblMoinsPratiqueAssoc.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblMoinsPratiqueAssoc.setForeground(new java.awt.Color(0, 204, 0));
        lblMoinsPratiqueAssoc.setText("jLabel1");

        btnOk.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTMoinsPratiqueAssoc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblMoinsPratiqueAssoc))
                            .addComponent(lblTtitre)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTNbreSportC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNbreSportC))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTPlusPratiqueAssoc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPlusPratiqueAssoc))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTNbreSport)
                                .addGap(6, 6, 6)
                                .addComponent(lblNbreSport))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTNbreSportA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNbreSportA))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTNbreSportB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNbreSportB)))
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnOk)
                        .addGap(202, 202, 202))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTtitre)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTNbreSport)
                    .addComponent(lblNbreSport))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTNbreSportA)
                    .addComponent(lblNbreSportA))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTNbreSportB)
                    .addComponent(lblNbreSportB))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTNbreSportC)
                    .addComponent(lblNbreSportC))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTPlusPratiqueAssoc)
                    .addComponent(lblPlusPratiqueAssoc))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTMoinsPratiqueAssoc)
                    .addComponent(lblMoinsPratiqueAssoc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btnOk)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnOkActionPerformed
    {//GEN-HEADEREND:event_btnOkActionPerformed
        FStatistique f1 = new FStatistique();
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
            java.util.logging.Logger.getLogger(FStatSport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(FStatSport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(FStatSport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(FStatSport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new FStatSport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOk;
    private javax.swing.JLabel lblMoinsPratiqueAssoc;
    private javax.swing.JLabel lblNbreSport;
    private javax.swing.JLabel lblNbreSportA;
    private javax.swing.JLabel lblNbreSportB;
    private javax.swing.JLabel lblNbreSportC;
    private javax.swing.JLabel lblPlusPratiqueAssoc;
    private javax.swing.JLabel lblTMoinsPratiqueAssoc;
    private javax.swing.JLabel lblTNbreSport;
    private javax.swing.JLabel lblTNbreSportA;
    private javax.swing.JLabel lblTNbreSportB;
    private javax.swing.JLabel lblTNbreSportC;
    private javax.swing.JLabel lblTPlusPratiqueAssoc;
    private javax.swing.JLabel lblTtitre;
    // End of variables declaration//GEN-END:variables
}
