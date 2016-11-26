/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fenêtre;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Valoo
 */
public class FAjoutSport extends FMaster {
    String pilote = "org.gjt.mm.mysql.Driver";
    Connection conn;
    /**
     * Creates new form FAjoutSport
     */
    public FAjoutSport() {
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
        lblSport = new javax.swing.JLabel();
        tfSport = new javax.swing.JTextField();
        btnOk = new javax.swing.JButton();
        btnAnnuler = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ajouter un Sport");

        lblTitre.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblTitre.setForeground(new java.awt.Color(51, 255, 51));
        lblTitre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitre.setText("Ajouter un Sport");

        lblSport.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblSport.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSport.setText("Nom du Sport :");

        tfSport.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        btnOk.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        btnAnnuler.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnAnnuler.setText("Annuler");
        btnAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnulerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfSport)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnOk)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAnnuler))
                    .addComponent(lblSport, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTitre, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitre)
                .addGap(18, 18, 18)
                .addComponent(lblSport)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSport, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnnuler)
                    .addComponent(btnOk))
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnulerActionPerformed
        FSelectSport f1 = new FSelectSport();
        this.setVisible(false);
        f1.setVisible(true);
    }//GEN-LAST:event_btnAnnulerActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        try {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gymnase", "root", "" );
        PreparedStatement prepareStmt = conn.prepareStatement("insert into sport(nomSport) values(?)");
        prepareStmt.setString(1, tfSport.getText());
        prepareStmt.executeUpdate();
        conn.close();
        JOptionPane.showMessageDialog(null, "Inssertion de "+tfSport.getText()+ " dans les sport réussie !", "Inssertion Réussie", JOptionPane.OK_OPTION);
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
    }//GEN-LAST:event_btnOkActionPerformed

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
            java.util.logging.Logger.getLogger(FAjoutSport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FAjoutSport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FAjoutSport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FAjoutSport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FAjoutSport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnnuler;
    private javax.swing.JButton btnOk;
    private javax.swing.JLabel lblSport;
    private javax.swing.JLabel lblTitre;
    private javax.swing.JTextField tfSport;
    // End of variables declaration//GEN-END:variables
}
