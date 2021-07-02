/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author Gen-Xander
 */
public class ReportModel {
    Connection con=null;
    Statement st=null;
    ResultSet rs=null;
    String sql=null;

        
    public ReportModel() {

    try{
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbperpusse03","root","");
        st=con.createStatement();
        }catch(Exception a){
        JOptionPane.showMessageDialog(null, "Koneksi Database Gagal, Terjadi kesalahaan Pada : \n"+a);
        }
    }    
    
    public void cetakanggota() {
        try{
            InputStream sumber = getClass().getResourceAsStream("/report/reportanggota.jrxml");
            JasperReport jr = JasperCompileManager.compileReport(sumber);
            Map params = new HashMap();
            JasperPrint jp = JasperFillManager.fillReport(jr, params, con);
            JasperViewer viewer = new JasperViewer(jp, false);
            viewer.setExtendedState(viewer.getExtendedState() | 0x6);
            viewer.setVisible(true);
            viewer.setTitle("Laporan Semua Anggota");
        }catch(JRException ex){
            JOptionPane.showMessageDialog(null, "Tidak dapat tampil report "+ex);
                    
        }
    }   

    public void cetakkategori() {
        try{
            InputStream sumber = getClass().getResourceAsStream("/report/reportkategori.jrxml");
            JasperReport jr = JasperCompileManager.compileReport(sumber);
            Map params = new HashMap();
            JasperPrint jp = JasperFillManager.fillReport(jr, params, con);
            JasperViewer viewer = new JasperViewer(jp, false);
            viewer.setExtendedState(viewer.getExtendedState() | 0x6);
            viewer.setVisible(true);
            viewer.setTitle("Laporan Kategori Buku");
        }catch(JRException ex){
            JOptionPane.showMessageDialog(null, "Tidak dapat tampil report "+ex);
                    
        }
    }   
    
    public void cetakbuku() {
        try{
            InputStream sumber = getClass().getResourceAsStream("/report/reportbuku.jrxml");
            JasperReport jr = JasperCompileManager.compileReport(sumber);
            Map params = new HashMap();
            JasperPrint jp = JasperFillManager.fillReport(jr, params, con);
            JasperViewer viewer = new JasperViewer(jp, false);
            viewer.setExtendedState(viewer.getExtendedState() | 0x6);
            viewer.setVisible(true);
            viewer.setTitle("Laporan Semua Buku");
        }catch(JRException ex){
            JOptionPane.showMessageDialog(null, "Tidak dapat tampil report "+ex);
                    
        }
    }   
    
}
