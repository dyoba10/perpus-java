/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Gen Xander
 */
public class PinjamDetailModel {
    String nopinjam, idbuku, jumlah, kode, judul, pengarang, penerbit;
    
    Koneksi db=null;

    public PinjamDetailModel() {
        db=new Koneksi();
    }  

    public String getNopinjam() {
        return nopinjam;
    }

    public void setNopinjam(String nopinjam) {
        this.nopinjam = nopinjam;
    }

    public String getIdbuku() {
        return idbuku;
    }

    public void setIdbuku(String idbuku) {
        this.idbuku = idbuku;
    }

    public String getJumlah() {
        return jumlah;
    }

    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public Koneksi getDb() {
        return db;
    }

    public void setDb(Koneksi db) {
        this.db = db;
    }
    
    public void tambah(){        
        String sql="INSERT INTO pinjamdetail VALUES ('"+nopinjam+"','"+idbuku+"','"+jumlah+"')";
        db.simpanData(sql);
        db.tutupKoneksi(null);
    }
    
    public void hapus(){
        String sql="DELETE FROM pinjamdetail WHERE nopinjam = '"+nopinjam+"'";
        db.simpanData(sql);
        db.tutupKoneksi(null);        
    }    
        
}
