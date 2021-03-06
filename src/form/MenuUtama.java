/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package form;

import model.ReportModel;

/**
 *
 * @author Gen-Xander
 */
public class MenuUtama extends javax.swing.JFrame {

    /**
     * Creates new form MenuUtama
     */
    public MenuUtama() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mulogoff = new javax.swing.JMenuItem();
        muexit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        muanggota = new javax.swing.JMenuItem();
        mukategori = new javax.swing.JMenuItem();
        mubuku = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mupeminjaman = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        lapanggota = new javax.swing.JMenuItem();
        lapbuku = new javax.swing.JMenuItem();
        lappeminjaman = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("APLIKASI PERPUSTAKAAN - MENU UTAMA");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("APLIKASI PERPUSTAKAAN");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("AMIK DIAN CIPTA CENDIKIA");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/amik.png"))); // NOI18N

        jMenu1.setText("File");

        mulogoff.setText("Logoff");
        mulogoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mulogoffActionPerformed(evt);
            }
        });
        jMenu1.add(mulogoff);

        muexit.setText("Exit");
        muexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                muexitActionPerformed(evt);
            }
        });
        jMenu1.add(muexit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Master");

        muanggota.setText("Anggota");
        muanggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                muanggotaActionPerformed(evt);
            }
        });
        jMenu2.add(muanggota);

        mukategori.setText("Kategori");
        mukategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mukategoriActionPerformed(evt);
            }
        });
        jMenu2.add(mukategori);

        mubuku.setText("Buku");
        mubuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mubukuActionPerformed(evt);
            }
        });
        jMenu2.add(mubuku);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Transaksi");

        mupeminjaman.setText("Peminjaman");
        mupeminjaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mupeminjamanActionPerformed(evt);
            }
        });
        jMenu3.add(mupeminjaman);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Laporan");

        lapanggota.setText("Anggota");
        lapanggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lapanggotaActionPerformed(evt);
            }
        });
        jMenu4.add(lapanggota);

        lapbuku.setText("Buku");
        lapbuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lapbukuActionPerformed(evt);
            }
        });
        jMenu4.add(lapbuku);

        lappeminjaman.setText("Peminjaman");
        jMenu4.add(lappeminjaman);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(470, 470, 470)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jLabel1))
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(552, 552, 552)
                        .addComponent(jLabel3)))
                .addContainerGap(544, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(36, 36, 36)
                .addComponent(jLabel3)
                .addContainerGap(408, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1382, 807));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mukategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mukategoriActionPerformed
        // TODO add your handling code here:
        Kategori ktg = new Kategori();
        ktg.setVisible(true); 
    }//GEN-LAST:event_mukategoriActionPerformed

    private void muexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_muexitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_muexitActionPerformed

    private void muanggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_muanggotaActionPerformed
        // TODO add your handling code here:
        Anggota agt = new Anggota();
        agt.setVisible(true); 
    }//GEN-LAST:event_muanggotaActionPerformed

    private void mubukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mubukuActionPerformed
        // TODO add your handling code here:
        Buku bku = new Buku();
        bku.setVisible(true); 
    }//GEN-LAST:event_mubukuActionPerformed

    private void lapanggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lapanggotaActionPerformed
        // TODO add your handling code here:
        ReportModel rm = new ReportModel();
        rm.cetakanggota();
    }//GEN-LAST:event_lapanggotaActionPerformed

    private void mupeminjamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mupeminjamanActionPerformed
        // TODO add your handling code here:
        Peminjaman pm = new Peminjaman();
        pm.setVisible(true);
    }//GEN-LAST:event_mupeminjamanActionPerformed

    private void mulogoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mulogoffActionPerformed
        // TODO add your handling code here:
       dispose();
        Login log = new Login();
        log.setVisible(true);
    }//GEN-LAST:event_mulogoffActionPerformed

    private void lapbukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lapbukuActionPerformed
        // TODO add your handling code here:
        ReportModel rm =  new ReportModel();
        rm.cetakbuku();        
    }//GEN-LAST:event_lapbukuActionPerformed

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
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem lapanggota;
    private javax.swing.JMenuItem lapbuku;
    private javax.swing.JMenuItem lappeminjaman;
    private javax.swing.JMenuItem muanggota;
    private javax.swing.JMenuItem mubuku;
    private javax.swing.JMenuItem muexit;
    private javax.swing.JMenuItem mukategori;
    private javax.swing.JMenuItem mulogoff;
    private javax.swing.JMenuItem mupeminjaman;
    // End of variables declaration//GEN-END:variables
}
