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
public class AnggotaModel {
    String idanggota, namaanggota, prodi;

    public String getIdanggota() {
        return idanggota;
    }

    public void setIdanggota(String idanggota) {
        this.idanggota = idanggota;
    }

    public String getNamaanggota() {
        return namaanggota;
    }

    public void setNamaanggota(String namaanggota) {
        this.namaanggota = namaanggota;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
    
    Koneksi db = null;
    public AnggotaModel(){
        db = new Koneksi();
    }
    
   //Menampilkan data
    public List tampil(){
        List<AnggotaModel> data = new ArrayList<>();
        ResultSet hasil = null;
        try {
            String sql = "select * from anggota";
            hasil = db.ambilData(sql);
            while(hasil.next()){
                AnggotaModel am = new AnggotaModel();
                am.setIdanggota(hasil.getString("idanggota"));
                am.setNamaanggota(hasil.getString("namaanggota"));
                am.setProdi(hasil.getString("prodi"));
                data.add(am);
            }
            db.tutupKoneksi(hasil);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Salah tampil" +e);
        }       
        return data;
        
    }
    
    public void tambah(){
        String sql = "insert into anggota values (null,'"+namaanggota+"','"+prodi+"') ";
        db.simpanData(sql);
        db.tutupKoneksi(null);
    }
    
    public void hapus(){
        String sql = "delete from anggota where idanggota = '"+idanggota+"' ";
        db.simpanData(sql);
        db.tutupKoneksi(null);
    }
        
    public void edit(){
        String sql = "update anggota set namaanggota = '"+namaanggota+"', prodi='"+prodi+"' where idanggota = '"+idanggota+"' ";
        db.simpanData(sql);
        db.tutupKoneksi(null);
    }
   
    //Relasi Ke Tbl Pinjam
     public List cariIdAnggota(String idanggota){
        List<AnggotaModel> dataAnggota = new ArrayList<>();
        ResultSet rs=null;
        try{
            String sql="SELECT * FROM anggota WHERE idanggota = '"+idanggota+"'";
            rs=db.ambilData(sql);
                        
            while(rs.next()){                   
                AnggotaModel agm=new AnggotaModel();
                agm.setIdanggota(rs.getString("idanggota"));
                agm.setNamaanggota(rs.getString("namaanggota"));
                dataAnggota.add(agm);
            }               
            db.tutupKoneksi(rs);
        }catch(Exception x){
            JOptionPane.showMessageDialog(null, "Tampil data gagal, Pesan Error : \n"+x);
        }
        
        return dataAnggota;
    }    
     
}
