/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author Gen-Xander
 */
public class BukuModel {

    private String idbuku,kodebuku,judul,pengarang,stok,idkat,namakat;
    
    Koneksi db = null;
    public BukuModel(){
        db = new Koneksi();
    }

    public String getIdbuku() {
        return idbuku;
    }

    public void setIdbuku(String idbuku) {
        this.idbuku = idbuku;
    }

    public String getKodebuku() {
        return kodebuku;
    }

    public void setKodebuku(String kodebuku) {
        this.kodebuku = kodebuku;
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

    public String getStok() {
        return stok;
    }

    public void setStok(String stok) {
        this.stok = stok;
    }

    public String getIdkat() {
        return idkat;
    }

    public void setIdkat(String idkat) {
        this.idkat = idkat;
    }
    
    public String getNamakat() {
        return namakat;
    }

    public void setNamakat(String namakat) {
        this.namakat = namakat;
    }
    
    public List tampil(){
        List<BukuModel> data=new ArrayList<>();
        ResultSet rs=null;
        try{
            String sql="SELECT * from buku,kategori WHERE buku.idkat = kategori.idkat ORDER BY idbuku DESC";
            rs=db.ambilData(sql);
                        
            while(rs.next()){                   
                BukuModel bm=new BukuModel();
                bm.setIdbuku(rs.getString("idbuku"));
                bm.setKodebuku(rs.getString("kodebuku"));
                bm.setJudul(rs.getString("judul"));
                bm.setPengarang(rs.getString("pengarang"));               
                bm.setStok(rs.getString("stok"));
                bm.setIdkat(rs.getString("idkat"));
                bm.setNamakat(rs.getString("namakat"));
                data.add(bm);
            }               
            db.tutupKoneksi(rs);
        }catch(Exception x){
            JOptionPane.showMessageDialog(null, "Tampil data gagal, Pesan Error : \n"+x);
        }
        
        return data;
    }
    
    public void tambah(){        
        String sql="INSERT INTO buku VALUES (null,'"+kodebuku+"','"+judul+"','"+pengarang+"','"+stok+"','"+idkat+"')";
        db.simpanData(sql);
        db.tutupKoneksi(null);
    }
    
    public void hapus(){
        String sql="DELETE FROM BUKU WHERE kodebuku='"+kodebuku+"'";
        db.simpanData(sql);
        db.tutupKoneksi(null);        
    }
    
    public void edit(){
        String sql="UPDATE BUKU SET KODEBUKU='"+kodebuku+"',JUDUL='"+judul
                   +"',PENGARANG='"+pengarang
                   +"',STOK='"+stok+"',idkat='"+idkat
                   +"' WHERE kodebuku='"+kodebuku+"'";
        db.simpanData(sql);
        db.tutupKoneksi(null);        
    }
    
    public List caridata(String cari){
        List<BukuModel> data=new ArrayList<>();
        ResultSet rs=null;
        try{
            String sql="SELECT * from buku,kategori WHERE buku.idkat = kategori.idkat AND judul like '%"+cari+"%'";
            rs=db.ambilData(sql);
                        
            while(rs.next()){                   
                BukuModel bm=new BukuModel();
                bm.setIdbuku(rs.getString("idbuku"));
                bm.setKodebuku(rs.getString("kodebuku"));
                bm.setJudul(rs.getString("judul"));
                bm.setPengarang(rs.getString("pengarang"));               
                bm.setStok(rs.getString("stok"));
                bm.setIdkat(rs.getString("idkat"));
                bm.setNamakat(rs.getString("namakat"));
                data.add(bm);
            }               
            db.tutupKoneksi(rs);
        }catch(Exception x){
            JOptionPane.showMessageDialog(null, "Cari data gagal, Pesan Error : \n"+x);
        }
        
        return data;
    }
    
    
        //tambahan transaksi
    public List cariBuku(String cari){
        List<BukuModel> data=new ArrayList<>();
        ResultSet rs=null;
        try{
            String sql="SELECT * FROM BUKU WHERE KODE LIKE '%"+cari+"%' OR JUDUL"
                    + " LIKE '%"+cari+"%'";
            rs=db.ambilData(sql);
                        
            while(rs.next()){                   
                BukuModel bm=new BukuModel();
                bm.setIdbuku(rs.getString("idbuku"));
                bm.setKodebuku(rs.getString("kodebuku"));
                bm.setJudul(rs.getString("judul"));
                bm.setPengarang(rs.getString("pengarang"));                
                bm.setStok(rs.getString("stok"));
                data.add(bm);
            }               
            db.tutupKoneksi(rs);
        }catch(Exception x){
            JOptionPane.showMessageDialog(null, "cari data gagal, Pesan Error : \n"+x);
        }
        
        return data;
    }    
    
    public void updateStokBuku(String idbuku,int jmlPinjam){
        try{
            String sql="SELECT * FROM BUKU WHERE idbuku='"+idbuku+"'";
            ResultSet rs=db.ambilData(sql);
            if(rs.next()){
                int stokAkhir=rs.getInt("stok")-jmlPinjam;
                String sql2="UPDATE BUKU SET STOK='"+stokAkhir+"' WHERE idbuku='"
				+idbuku+"'";
                db.simpanData(sql2);
                db.tutupKoneksi(rs);
            }
        }catch(Exception x){
            JOptionPane.showMessageDialog(null, "Terjadi kesalahaan update \n"+x);
        }
    }
    
    public void kembalikanStokBuku(String idbuku,int jmlPinjam){
        try{
            String sql="SELECT * FROM BUKU WHERE idbuku='"+idbuku+"'";
            ResultSet rs=db.ambilData(sql);
            if(rs.next()){
                int stokAkhir=rs.getInt("stok")+jmlPinjam;
                String sql2="UPDATE BUKU SET STOK='"+stokAkhir+"' WHERE idbuku='"
				+idbuku+"'";
                db.simpanData(sql2);
                db.tutupKoneksi(rs);
            }
        }catch(Exception x){
            JOptionPane.showMessageDialog(null, "Terjadi kesalahaan update \n"+x);
        }
    } 
    
}
