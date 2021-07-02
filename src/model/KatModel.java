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
public class KatModel {
    //Entitas
    String idkat, namakat;

    //getter and setter
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

    public Koneksi getDb() {
        return db;
    }

    public void setDb(Koneksi db) {
        this.db = db;
    }

 

    

    Koneksi db = null;
    public KatModel(){
        db = new Koneksi();
    }
    
    //Menampilkan data
    public List tampil(){
        List<KatModel> data = new ArrayList<>();
        ResultSet hasil = null;
        try {
            String sql = "select * from kategori";
            hasil = db.ambilData(sql);
            while(hasil.next()){
                KatModel km = new KatModel();
                km.setIdkat(hasil.getString("idkat"));
                km.setNamakat(hasil.getString("namakat"));
                data.add(km);
            }
            db.tutupKoneksi(hasil);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Salah tampil" +e);
        }       
        return data;
    }
    
    //Tambah atau simpan data
    public void tambah(){
        String sql = "insert into kategori values (null,'"+namakat+"') ";
        db.simpanData(sql);
        db.tutupKoneksi(null);
    }
    
    //Hapus data
    public void hapus(){
        String sql = "delete from kategori where idkat = '"+idkat+"' ";
        db.simpanData(sql);
        db.tutupKoneksi(null);
    }
    
    //Edit data
    public void edit(){
        String sql = "update kategori set namakat = '"+namakat+"' where idkat = '"+idkat+"' ";
        db.simpanData(sql);
        db.tutupKoneksi(null);
    }
    
    //Untuk relasi combo
    public List cariidkat(String idkat){
        List<KatModel> data = new ArrayList<>();
        ResultSet hasil = null;
        try {
            String sql = "select * from kategori where idkat = '"+idkat+"'";
            hasil = db.ambilData(sql);
            while(hasil.next()){
                KatModel km = new KatModel();
                km.setIdkat(hasil.getString("idkat"));
                km.setNamakat(hasil.getString("namakat"));
                data.add(km);
            }
            db.tutupKoneksi(hasil);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Salah tampil" +e);
        }       
        return data;
    }
    
    //Untuk pencarian data
    public List caridata(String cari){
        List<KatModel> data = new ArrayList<>();
        ResultSet hasil = null;
        try {
            String sql = "select * from kategori where idkat like '%"+cari+"%'  or namakat like '%"+cari+"%' ";
            hasil = db.ambilData(sql);
            while(hasil.next()){
                KatModel km = new KatModel();
                km.setIdkat(hasil.getString("idkat"));
                km.setNamakat(hasil.getString("namakat"));
                data.add(km);
            }
            db.tutupKoneksi(hasil);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Salah cari data" +e);
        }       
        return data;
    }
    

        
    
}
