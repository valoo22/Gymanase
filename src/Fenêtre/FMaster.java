/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fenêtre;

import Metier.Reservation;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Valoo
 */
public class FMaster extends javax.swing.JFrame
{
    String pilote = "org.gjt.mm.mysql.Driver";
    Connection conn;
    /**
     * Creates new form MenuPricipal
     */
    public FMaster()
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

        mbMenu = new javax.swing.JMenuBar();
        mAcceuil = new javax.swing.JMenu();
        miParametre = new javax.swing.JMenuItem();
        miEnrengistrer = new javax.swing.JMenuItem();
        sFile = new javax.swing.JPopupMenu.Separator();
        miExit = new javax.swing.JMenuItem();
        mInsertModif = new javax.swing.JMenu();
        miAceuillir = new javax.swing.JMenuItem();
        miSport = new javax.swing.JMenuItem();
        miAssociation = new javax.swing.JMenuItem();
        miPratiquer = new javax.swing.JMenuItem();
        mReservation = new javax.swing.JMenu();
        miAjoutReserv = new javax.swing.JMenuItem();
        miModifReservB = new javax.swing.JMenuItem();
        miModifReservA = new javax.swing.JMenuItem();
        mPlanReserv = new javax.swing.JMenu();
        mStat = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(null);
        setResizable(false);

        mAcceuil.setText("Acceuil");

        miParametre.setText("Paramètre");
        miParametre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miParametreActionPerformed(evt);
            }
        });
        mAcceuil.add(miParametre);

        miEnrengistrer.setText("Enrengistrer");
        miEnrengistrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEnrengistrerActionPerformed(evt);
            }
        });
        mAcceuil.add(miEnrengistrer);
        mAcceuil.add(sFile);

        miExit.setText("Exit");
        miExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miExitActionPerformed(evt);
            }
        });
        mAcceuil.add(miExit);

        mbMenu.add(mAcceuil);

        mInsertModif.setText("Inssertion/Modification");

        miAceuillir.setText("Acceuillir");
        miAceuillir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAceuillirActionPerformed(evt);
            }
        });
        mInsertModif.add(miAceuillir);

        miSport.setText("Sport");
        miSport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSportActionPerformed(evt);
            }
        });
        mInsertModif.add(miSport);

        miAssociation.setText("Association");
        miAssociation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAssociationActionPerformed(evt);
            }
        });
        mInsertModif.add(miAssociation);

        miPratiquer.setText("Pratiquer");
        miPratiquer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miPratiquerActionPerformed(evt);
            }
        });
        mInsertModif.add(miPratiquer);

        mbMenu.add(mInsertModif);

        mReservation.setText("Reservation");

        miAjoutReserv.setText("Ajouter Reservation");
        miAjoutReserv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAjoutReservActionPerformed(evt);
            }
        });
        mReservation.add(miAjoutReserv);

        miModifReservB.setText("Modifier/Supprimer Reservation sur la Base");
        miModifReservB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miModifReservBActionPerformed(evt);
            }
        });
        mReservation.add(miModifReservB);

        miModifReservA.setText("Modifier/Supprimer Reservation sur l'Application");
        miModifReservA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miModifReservAActionPerformed(evt);
            }
        });
        mReservation.add(miModifReservA);

        mbMenu.add(mReservation);

        mPlanReserv.setText("Plan Reservation");
        mPlanReserv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mPlanReservMouseClicked(evt);
            }
        });
        mbMenu.add(mPlanReserv);

        mStat.setText("Statistique");
        mStat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mStatMouseClicked(evt);
            }
        });
        mbMenu.add(mStat);

        setJMenuBar(mbMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miParametreActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_miParametreActionPerformed
    {//GEN-HEADEREND:event_miParametreActionPerformed
        FOptions f1 = new FOptions();
        this.setVisible(false);
        f1.setVisible(true);
    }//GEN-LAST:event_miParametreActionPerformed

    private void miPratiquerActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_miPratiquerActionPerformed
    {//GEN-HEADEREND:event_miPratiquerActionPerformed
        FSelectPratiquer f1 = new FSelectPratiquer();
        this.setVisible(false);
        f1.setVisible(true);
    }//GEN-LAST:event_miPratiquerActionPerformed

    private void miExitActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_miExitActionPerformed
    {//GEN-HEADEREND:event_miExitActionPerformed
        int option = JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment quitter ?, N'oubliez pas de sauvegarder avant de quitter !", "Quitter ?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			
        if(option == JOptionPane.OK_OPTION)
        {
            System.exit(0);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Allez Sauvegarder dans le Menu Acceuil > Enrengistrer", "On a encore eu de la chance", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_miExitActionPerformed

    private void miEnrengistrerActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_miEnrengistrerActionPerformed
    {//GEN-HEADEREND:event_miEnrengistrerActionPerformed
        int option = JOptionPane.showConfirmDialog(null, "Vouslez-vous enrengistrer les réservation ?", "Enrengistrer Reservation ?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);	
        if(option == JOptionPane.OK_OPTION)
        {   
            SimpleDateFormat timeformat = new SimpleDateFormat("HH:mm:ss");
            SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
            int NbreReserv = Reservation.getNbrereservation();
            for (int i = 0; i < NbreReserv; i++)
            {
                Reservation Re = Reservation.getUneReservation(i);
                try 
                {
                    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gymnase", "root", "" );
                    PreparedStatement prepareStmt = conn.prepareStatement("insert into reservation(refSalle, date, heure, refAsso) values(?,?,?,?)");
                    prepareStmt.setString(1, Re.getRefSalle());
                    prepareStmt.setString(2, Re.getDateReserv());
                    prepareStmt.setString(3, timeformat.format(Re.getHeureReserv()));
                    prepareStmt.setString(4, Re.getRefAsso());
                    prepareStmt.executeUpdate();
                    conn.close();
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
            JOptionPane.showMessageDialog(null, "Les réservation ont bien été enrengistrée dans la base de donnée !", "Réservation OK", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_miEnrengistrerActionPerformed

    private void miAceuillirActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_miAceuillirActionPerformed
    {//GEN-HEADEREND:event_miAceuillirActionPerformed
        FSelectAcceuillir f1 = new FSelectAcceuillir();
        this.setVisible(false);
        f1.setVisible(true);
    }//GEN-LAST:event_miAceuillirActionPerformed

    private void miSportActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_miSportActionPerformed
    {//GEN-HEADEREND:event_miSportActionPerformed
        FSelectSport f1 = new FSelectSport();
        this.setVisible(false);
        f1.setVisible(true);
    }//GEN-LAST:event_miSportActionPerformed

    private void miAssociationActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_miAssociationActionPerformed
    {//GEN-HEADEREND:event_miAssociationActionPerformed
        FSelectAssociation f1 = new FSelectAssociation();
        this.setVisible(false);
        f1.setVisible(true);
    }//GEN-LAST:event_miAssociationActionPerformed

    private void miAjoutReservActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_miAjoutReservActionPerformed
    {//GEN-HEADEREND:event_miAjoutReservActionPerformed
        try
        {
            FAjoutReservation f1 = new FAjoutReservation();
            this.setVisible(false);
            f1.setVisible(true);
        } catch (ParseException ex)
        {
            Logger.getLogger(FMaster.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_miAjoutReservActionPerformed

    private void miModifReservBActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_miModifReservBActionPerformed
    {//GEN-HEADEREND:event_miModifReservBActionPerformed
        FSelectReservationB f1 = new FSelectReservationB();
        this.setVisible(false);
        f1.setVisible(true);
    }//GEN-LAST:event_miModifReservBActionPerformed

    private void miModifReservAActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_miModifReservAActionPerformed
    {//GEN-HEADEREND:event_miModifReservAActionPerformed
        FSelectReservationA f1 = new FSelectReservationA();
        this.setVisible(false);
        f1.setVisible(true);
    }//GEN-LAST:event_miModifReservAActionPerformed

    private void mStatMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_mStatMouseClicked
    {//GEN-HEADEREND:event_mStatMouseClicked
        FStatistique f1 = new FStatistique();
        this.setVisible(false);
        f1.setVisible(true);
    }//GEN-LAST:event_mStatMouseClicked

    private void mPlanReservMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_mPlanReservMouseClicked
    {//GEN-HEADEREND:event_mPlanReservMouseClicked
        FPlanReservation f1 = new FPlanReservation();
        this.setVisible(false);
        f1.setVisible(true);
    }//GEN-LAST:event_mPlanReservMouseClicked

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
            java.util.logging.Logger.getLogger(FMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(FMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(FMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(FMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new FMaster().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu mAcceuil;
    private javax.swing.JMenu mInsertModif;
    private javax.swing.JMenu mPlanReserv;
    private javax.swing.JMenu mReservation;
    private javax.swing.JMenu mStat;
    private javax.swing.JMenuBar mbMenu;
    private javax.swing.JMenuItem miAceuillir;
    private javax.swing.JMenuItem miAjoutReserv;
    private javax.swing.JMenuItem miAssociation;
    private javax.swing.JMenuItem miEnrengistrer;
    private javax.swing.JMenuItem miExit;
    private javax.swing.JMenuItem miModifReservA;
    private javax.swing.JMenuItem miModifReservB;
    private javax.swing.JMenuItem miParametre;
    private javax.swing.JMenuItem miPratiquer;
    private javax.swing.JMenuItem miSport;
    private javax.swing.JPopupMenu.Separator sFile;
    // End of variables declaration//GEN-END:variables
}
