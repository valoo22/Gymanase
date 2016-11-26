/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fenêtre;
import java.sql.*;
import java.awt.Color;
import javax.swing.JOptionPane;
/*
 *
 * @author Valoo
 */
public class FSelectSport extends FMaster
{
    String pilote = "org.gjt.mm.mysql.Driver";
    Connection conn;
    Statement stat;
    /*
     * Creates new form FSelectSport
    */
    public FSelectSport()
    {
        initComponents();
        ResultSet rs1;
        try
        {
            Class.forName(pilote);
            conn = DriverManager.getConnection("jdbc:mysql://localhost/gymnase", "root", "");
            stat = conn.createStatement();
            rs1 = stat.executeQuery("Select * from sport");
            while(rs1.next())
            {
                cbxSport.addItem(rs1.getString("nomSport"));
            }
        } 
        catch (SQLException | ClassNotFoundException sqlE)
        {
            JOptionPane.showMessageDialog(null, sqlE.getMessage(), "Erreur Sql", JOptionPane.ERROR_MESSAGE);
        }
    }

    /*
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbxSport = new javax.swing.JComboBox<>();
        lblAjoutSport = new javax.swing.JLabel();
        btnAjouter = new javax.swing.JButton();
        btnSupprimer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Selectionnez un Sport");
        setPreferredSize(null);

        cbxSport.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lblAjoutSport.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblAjoutSport.setForeground(new java.awt.Color(0, 255, 0));
        lblAjoutSport.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAjoutSport.setText("Ajouter/Suprimer un Sport");

        btnAjouter.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnAjouter.setText("Ajouter");
        btnAjouter.setPreferredSize(new java.awt.Dimension(72, 25));
        btnAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouterActionPerformed(evt);
            }
        });

        btnSupprimer.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnSupprimer.setText("Supprimer");
        btnSupprimer.setPreferredSize(new java.awt.Dimension(72, 25));
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
                    .addComponent(lblAjoutSport, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                    .addComponent(cbxSport, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAjoutSport)
                .addGap(18, 18, 18)
                .addComponent(cbxSport, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouterActionPerformed
        FAjoutSport f1 = new FAjoutSport();
        this.setVisible(false);
        f1.setVisible(true);
    }//GEN-LAST:event_btnAjouterActionPerformed

    private void btnSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupprimerActionPerformed
        int option = JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment suprimmer '"+cbxSport.getSelectedItem().toString()+"' des Sport ?", "Confirmation Supression ?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (option == JOptionPane.YES_OPTION) 
        {
            try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gymnase", "root", "" );
            PreparedStatement prepareStmt = conn.prepareStatement("delete from sport where nomSport = ? ");
            prepareStmt.setString(1, cbxSport.getSelectedItem().toString());
            prepareStmt.executeUpdate();
            conn.close();
            JOptionPane.showMessageDialog(null, "Supression de "+cbxSport.getSelectedItem().toString()+ " dans les sport réussie !", "Suppression Réussie", JOptionPane.OK_OPTION);
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

    /*
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
            java.util.logging.Logger.getLogger(FSelectSport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(FSelectSport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(FSelectSport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(FSelectSport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new FSelectSport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAjouter;
    private javax.swing.JButton btnSupprimer;
    private javax.swing.JComboBox<String> cbxSport;
    private javax.swing.JLabel lblAjoutSport;
    // End of variables declaration//GEN-END:variables
}
