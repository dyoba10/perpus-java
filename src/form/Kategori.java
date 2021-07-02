/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package form;

//1
import model.KatModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ReportModel;

/**
 *
 * @author Gen-Xander
 */
public class Kategori extends javax.swing.JFrame {

    //2
    KatModel km = new KatModel();
    DefaultTableModel tbl;
    List<KatModel> dataKat = new ArrayList<>();
    
    /**
     * Creates new form Kategori
     */
    public Kategori() {
        initComponents();
        
        
        //4
        bersih();
        kondisi(false);
        aturtombol();
        buatkolom();
        tampilkat();
        txtidkat.setEnabled(false);
        
        txtidkat.setEnabled(false);
    }
    
    
//3
    public void bersih(){
        txtidkat.setText(null);
        txtnamakat.setText(null);
    }
    
    public void kondisi(boolean x){

        txtnamakat.setEnabled(x);
    }
    
    public void aturtombol(){
        btntambah.setEnabled(true);
        btnsimpan.setEnabled(false);
        btnhapus.setEnabled(false);
        btnedit.setEnabled(false);
    }
    
    public void buatkolom(){
        tbl = new DefaultTableModel();
        tbl.addColumn("ID Kategori");
        tbl.addColumn("Nama Kategori");
        tblkategori.setModel(tbl);
        
        tblkategori.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblkategori.getColumnModel().getColumn(0).setPreferredWidth(100);
        tblkategori.getColumnModel().getColumn(1).setPreferredWidth(400);
    }
    
    public void tampilkat(){
        tbl.getDataVector().removeAllElements();
        tbl.fireTableDataChanged();
        dataKat.clear();
        dataKat = km.tampil();
        for(int i = 0; i < dataKat.size(); i++){
            Object[] data = new Object[2];
            data[0] = dataKat.get(i).getIdkat();
            data[1] = dataKat.get(i).getNamakat();
            tbl.addRow(data); 
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

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtidkat = new javax.swing.JTextField();
        txtnamakat = new javax.swing.JTextField();
        btntambah = new javax.swing.JButton();
        btnsimpan = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btnkeluar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblkategori = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtcari = new javax.swing.JTextField();
        btncetak = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("MASTER KATEGORI");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("ID Kategori");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Nama Kategori");

        txtidkat.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtidkat.setText("jTextField1");
        txtidkat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtidkatKeyPressed(evt);
            }
        });

        txtnamakat.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtnamakat.setText("jTextField2");

        btntambah.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btntambah.setText("Tambah");
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });

        btnsimpan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnsimpan.setText("Simpan");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        btnhapus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnhapus.setText("Hapus");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        btnedit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnedit.setText("Edit");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        btnkeluar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnkeluar.setText("Keluar");
        btnkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkeluarActionPerformed(evt);
            }
        });

        tblkategori.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblkategori.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblkategoriMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblkategori);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Pencarian");

        txtcari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcariKeyTyped(evt);
            }
        });

        btncetak.setText("Cetak");
        btncetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncetakActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(btntambah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnsimpan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnhapus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnedit, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btncetak)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnkeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(69, 69, 69)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtnamakat, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtidkat, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1)))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel4)
                        .addGap(44, 44, 44)
                        .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtidkat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnamakat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btntambah)
                    .addComponent(btnsimpan)
                    .addComponent(btnhapus)
                    .addComponent(btnedit)
                    .addComponent(btnkeluar)
                    .addComponent(btncetak))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 15, Short.MAX_VALUE))
        );
        jLayeredPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtidkat, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtnamakat, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(btntambah, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(btnsimpan, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(btnhapus, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(btnedit, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(btnkeluar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtcari, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(btncetak, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(598, 461));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        // TODO add your handling code here:
        if(txtnamakat.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Data belum lengkap");
        }else{
            km.setIdkat(txtidkat.getText());
            km.setNamakat(txtnamakat.getText());
         
            if(btntambah.getText().equalsIgnoreCase("Batal")){
                km.tambah();
            }else if(btnedit.getText().equalsIgnoreCase("Batal")){
                km.edit();
            }
            bersih();
            kondisi(false);
            tampilkat();
            aturtombol();
            btntambah.setText("Tambah");
            btnedit.setText("Edit");
        }
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void btnkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkeluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnkeluarActionPerformed

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
        // TODO add your handling code here:
        if(btntambah.getText().equalsIgnoreCase("Tambah")){
            btntambah.setText("Batal");
            bersih();
            kondisi(true);
        
            btntambah.setEnabled(true);
            btnsimpan.setEnabled(true);
            btnhapus.setEnabled(false);
            btnedit.setEnabled(false);
           txtnamakat.requestFocus();
        }else{
            btntambah.setText("Tambah");
            bersih();
            kondisi(false);
            aturtombol();
        }
    }//GEN-LAST:event_btntambahActionPerformed

    private void tblkategoriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblkategoriMouseClicked
        // TODO add your handling code here:
        int baris = tblkategori.getSelectedRow();
        txtidkat.setText(tblkategori.getModel().getValueAt(baris, 0).toString());
        txtnamakat.setText(tblkategori.getModel().getValueAt(baris, 1).toString());
        
        btntambah.setText("Tambah");
        btnedit.setText("Edit");
        btnsimpan.setEnabled(false);
        btntambah.setEnabled(true);
        btnhapus.setEnabled(true);
        btnedit.setEnabled(true); 
    }//GEN-LAST:event_tblkategoriMouseClicked

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        // TODO add your handling code here:
        int hapus = JOptionPane.showConfirmDialog
        (this, "Cius nih mau dihapus ?","Konfirmasi",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if(hapus == JOptionPane.YES_OPTION){
            int baris = tblkategori.getSelectedRow();
            km.setIdkat(tblkategori.getModel().getValueAt(baris, 0).toString());
            km.hapus();
            bersih();
            kondisi(false);
            aturtombol();
            tampilkat();
        }
    }//GEN-LAST:event_btnhapusActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        // TODO add your handling code here:
        if(btnedit.getText().equalsIgnoreCase("Edit")){
            btnedit.setText("Batal");
            
            kondisi(true);
            btntambah.setEnabled(false);
            btnsimpan.setEnabled(true);
            btnhapus.setEnabled(false);
            btnedit.setEnabled(true);
            txtnamakat.requestFocus();
        }else{
            btnedit.setText("Edit");
            bersih();
            kondisi(false);
            aturtombol();
            tampilkat();
        }        
    }//GEN-LAST:event_btneditActionPerformed

    private void txtcariKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcariKeyTyped
        // TODO add your handling code here:
        tbl.getDataVector().removeAllElements();
        tbl.fireTableDataChanged();
        dataKat.clear();
        dataKat = km.caridata(txtcari.getText());
        for(int i = 0; i < dataKat.size(); i++){
            Object[] data = new Object[2];
            data[0] = dataKat.get(i).getIdkat();
            data[1] = dataKat.get(i).getNamakat();
            tbl.addRow(data); 
        }        
    }//GEN-LAST:event_txtcariKeyTyped

    private void btncetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncetakActionPerformed
        // TODO add your handling code here:
        ReportModel rm = new ReportModel();
        rm.cetakkategori();
    }//GEN-LAST:event_btncetakActionPerformed

    private void txtidkatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidkatKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidkatKeyPressed

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
            java.util.logging.Logger.getLogger(Kategori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kategori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kategori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kategori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kategori().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncetak;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnkeluar;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JButton btntambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblkategori;
    private javax.swing.JTextField txtcari;
    private javax.swing.JTextField txtidkat;
    private javax.swing.JTextField txtnamakat;
    // End of variables declaration//GEN-END:variables
}
