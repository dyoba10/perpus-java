/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Gen-Xander
 */
public class Koneksi {
    private Connection konek;
    private Statement st;
    
    public void koneksi(){
        try {
            String db = "jdbc:mysql://localhost:3306/dbperpusse03";
            String user = "root";
            String pass = "";
            Class.forName("com.mysql.jdbc.Driver");
            konek = DriverManager.getConnection(db, user, pass);
            st = konek.createStatement();
        } catch (Exception e) {
            System.out.println("Koneksi Gagal : " +e);
        }
    }
    
    public ResultSet ambilData(String sql){
        ResultSet rs = null;
        try {
            koneksi();
            rs = st.executeQuery(sql);
        } catch (Exception e) {
            System.out.println("Salah ambil data : " +e);
        }
        return rs;       
    }
    
    public void simpanData(String sql){
        try {
            koneksi();
            st.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println("Salah simpan data : " +e);
        }
    }
    
    public void tutupKoneksi(ResultSet rs){
        try {
            if(rs != null ){
                rs.close();
            }
            st.close();
            konek.close();
        } catch (Exception e) {
            System.out.println("Salah tutup koneksi : " +e);
        }
    }
    
}
