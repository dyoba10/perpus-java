/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Gen Xander
 */
public class PinjamModel {
    String idpinjam,nopinjam,tglpinjam,tglkembali,idanggota,nama;
    
    Koneksi db=null;
    public PinjamModel() {
        db=new Koneksi();
    }  

    public String getIdpinjam() {
        return idpinjam;
    }

    public void setIdpinjam(String idpinjam) {
        this.idpinjam = idpinjam;
    }

    public String getNopinjam() {
        return nopinjam;
    }

    public void setNopinjam(String nopinjam) {
        this.nopinjam = nopinjam;
    }

    public String getTglpinjam() {
        return tglpinjam;
    }

    public void setTglpinjam(String tglpinjam) {
        this.tglpinjam = tglpinjam;
    }

    public String getTglkembali() {
        return tglkembali;
    }

    public void setTglkembali(String tglkembali) {
        this.tglkembali = tglkembali;
    }

    public String getIdanggota() {
        return idanggota;
    }

    public void setIdanggota(String idanggota) {
        this.idanggota = idanggota;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Koneksi getDb() {
        return db;
    }

    public void setDb(Koneksi db) {
        this.db = db;
    }
    
    
        public void tambah(){        
        String sql="INSERT INTO pinjam VALUES (null,'"+nopinjam+"','"+tglpinjam+"','"+tglkembali+"','"+idanggota+"')";
        db.simpanData(sql);
        db.tutupKoneksi(null);
    }
    
        
    public void hapus(){
        String sql="DELETE FROM pinjam WHERE nopinjam='"+nopinjam+"'";
        db.simpanData(sql);
        db.tutupKoneksi(null);        
    } 
    
    
    public String buatNoPinjam(){
        String hasil=null;
        ResultSet rs=null;        
        try{
            DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
            String tgl=df.format(Calendar.getInstance().getTime());
            
            String sql="select * from pinjam order by idpinjam asc";
            rs=db.ambilData(sql);
            if(rs.next()){
                rs.last();
                int nomor=Integer.parseInt(rs.getString("nopinjam").substring(11))+1;
                hasil="P-"+tgl.replace("-", "")+"-"+nomor;                
            }else{
                hasil="P-"+tgl.replace("-", "")+"-1";                
            }
        }catch(Exception x){
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan buat NoPinjam \n"+x);
        }
        return hasil;
    } 
    
    public String ambilIdTerakhir(){
        String hasil=null;
        ResultSet rs=null;
        try{
            String sql="SELECT * FROM pinjam ORDER BY nopinjam ASC";
            rs=db.ambilData(sql);
            rs.last();
            hasil=rs.getString("nopinjam");
        }catch(Exception x){
            JOptionPane.showMessageDialog(null, "Ambil Id gagal, Pesan error \n"+x);
        }
        return hasil;
    }
    
}
