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
public class FStatUneAssoc extends FMaster
{

    /**
     * Creates new form FStatUneAssoc
     */
    public FStatUneAssoc()
    {
        initComponents();
    }
    
    public FStatUneAssoc(String Assoc)
    {
        initComponents();
        lblUneAssoc.setText("Association: " + Assoc);
        try 
            {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gymnase", "root", "" );
                PreparedStatement ps = conn.prepareStatement(pilote);
                ResultSet rs = ps.executeQuery("SELECT min(date), heure FROM `reservation` WHERE refAsso ='"+Assoc+"'");
                if (rs.first())
                {
                    lblPremiereReserv.setText(rs.getString("min(date)")+": "+rs.getString("heure"));
                }
                rs.close();
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
                ResultSet rs = ps.executeQuery("SELECT max(date), heure FROM `reservation` WHERE refAsso ='"+Assoc+"'");
                if (rs.first())
                {
                    lblDerniereReserv.setText(rs.getString("max(date)")+": "+rs.getString("heure"));
                }
                rs.close();
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
                ResultSet rs = ps.executeQuery("SELECT refSalle FROM `reservation` WHERE refAsso ='"+Assoc+"' ORDER BY COUNT(refSalle)");
                if (rs.first())
                {
                    lblPrincSalleReserv.setText("Salle "+rs.getString("refSalle"));
                }
                rs.close();
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
                ResultSet rs = ps.executeQuery("SELECT Count(nomSport) FROM pratiquer WHERE refAsso='"+Assoc+"'");
                if (rs.first())
                {
                    lblNbreSportPratiquer.setText(rs.getString("count(nomSport)"));
                }
                rs.close();
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

        lblTitre = new javax.swing.JLabel();
        lblUneAssoc = new javax.swing.JLabel();
        lblTDerniereReserv = new javax.swing.JLabel();
        lblTPrincSalleReserv = new javax.swing.JLabel();
        lblTNbreSportPratiquer = new javax.swing.JLabel();
        lblTPremiereReserv = new javax.swing.JLabel();
        lblPremiereReserv = new javax.swing.JLabel();
        lblDerniereReserv = new javax.swing.JLabel();
        lblPrincSalleReserv = new javax.swing.JLabel();
        lblNbreSportPratiquer = new javax.swing.JLabel();
        btnOk = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitre.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblTitre.setForeground(new java.awt.Color(0, 204, 0));
        lblTitre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitre.setText("Statistique Une Association");

        lblUneAssoc.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblUneAssoc.setForeground(new java.awt.Color(0, 204, 0));
        lblUneAssoc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUneAssoc.setText("Association :");

        lblTDerniereReserv.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblTDerniereReserv.setText("Dernière Réservation : ");

        lblTPrincSalleReserv.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblTPrincSalleReserv.setText("Principale Salle Réservée : ");

        lblTNbreSportPratiquer.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblTNbreSportPratiquer.setText("Nombre de Sport Pratiquer :");

        lblTPremiereReserv.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblTPremiereReserv.setText("Première Réservation :");

        lblPremiereReserv.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblPremiereReserv.setText("jLabel5");

        lblDerniereReserv.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblDerniereReserv.setText("jLabel6");

        lblPrincSalleReserv.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblPrincSalleReserv.setText("jLabel7");

        lblNbreSportPratiquer.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblNbreSportPratiquer.setText("jLabel8");

        btnOk.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnOkActionPerformed(evt);
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
                    .addComponent(lblUneAssoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTPremiereReserv)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPremiereReserv))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTDerniereReserv)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDerniereReserv))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTPrincSalleReserv)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPrincSalleReserv))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTNbreSportPratiquer)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNbreSportPratiquer)))
                        .addGap(0, 88, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOk)
                .addGap(152, 152, 152))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUneAssoc)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTPremiereReserv)
                    .addComponent(lblPremiereReserv))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTDerniereReserv)
                    .addComponent(lblDerniereReserv))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTPrincSalleReserv)
                    .addComponent(lblPrincSalleReserv))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTNbreSportPratiquer)
                    .addComponent(lblNbreSportPratiquer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btnOk)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnOkActionPerformed
    {//GEN-HEADEREND:event_btnOkActionPerformed
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(FStatUneAssoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(FStatUneAssoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(FStatUneAssoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(FStatUneAssoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new FStatUneAssoc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOk;
    private javax.swing.JLabel lblDerniereReserv;
    private javax.swing.JLabel lblNbreSportPratiquer;
    private javax.swing.JLabel lblPremiereReserv;
    private javax.swing.JLabel lblPrincSalleReserv;
    private javax.swing.JLabel lblTDerniereReserv;
    private javax.swing.JLabel lblTNbreSportPratiquer;
    private javax.swing.JLabel lblTPremiereReserv;
    private javax.swing.JLabel lblTPrincSalleReserv;
    private javax.swing.JLabel lblTitre;
    private javax.swing.JLabel lblUneAssoc;
    // End of variables declaration//GEN-END:variables
}
