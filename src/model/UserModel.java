/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Gen Xander
 */
public class UserModel {
    String id_user, nama_user, username, password, level;

    public String getId_user() {
        return id_user;
    }

    public void setId_user(String id_user) {
        this.id_user = id_user;
    }

    public String getNama_user() {
        return nama_user;
    }

    public void setNama_user(String nama_user) {
        this.nama_user = nama_user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
    
    Koneksi db = null;
    public UserModel(){
        db = new Koneksi();
    }
 

    

    public List tampil(){
        List<UserModel> data = new ArrayList<>();
        ResultSet rs = null;
        try {
            String sql = "select * from user";
            rs = db.ambilData(sql);

            while(rs.next()){
                UserModel um = new UserModel();
                um.setId_user(rs.getString("id_user"));
                um.setNama_user(rs.getString("nama_user"));
                um.setUsername(rs.getString("username"));
                um.setPassword(rs.getString("password"));
                um.setLevel(rs.getString("level"));
                data.add(um);
            }
            db.tutupKoneksi(rs);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Salah tampil" +e);
        }       
        return data;
    }

    

    
    
    public List cariLogin(String username,String password){
    List<UserModel> data = new ArrayList<>();
        ResultSet rs = null;
        try {
            String sql = "select username,password,level from user where username='"+username+"' and password='"+password+"'";
            rs = db.ambilData(sql);

            while(rs.next()){
                UserModel um = new UserModel();
                um.setUsername(rs.getString("username"));
                um.setPassword(rs.getString("password"));
                um.setLevel(rs.getString("level"));
                data.add(um);
            }
            db.tutupKoneksi(rs);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Salah tampil" +e);
        }       
        return data;  
    }
    
    

}


