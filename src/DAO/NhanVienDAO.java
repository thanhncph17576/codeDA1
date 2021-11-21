/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.Ban;
import Entity.hoaDonCT;
import Entity.DsOrder;
import Entity.HoaDon;
import Entity.loaiSanPham;
import Entity.nhanVien;
import Entity.ThucDon;
import Entity.datBan;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class NhanVienDAO {
        private Connection cn;
    public boolean CheckLogin(nhanVien tk)
    {
        boolean check = false;
        String sql;
            sql = "Select * From nhanVien Where username = '"+tk.getUserName()+"' AND pass='"+tk.getPass()+"'";
        try{
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                check = true;
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Đã xảy ra lỗi khi đăng nhập !");
        }
        return check; 
    }
    public int LVTK(nhanVien tk)
    {
        int lvtk =0;
        String sql;
            sql = "Select lv From nhanVien Where username = '"+tk.getUserName()+"' AND password='"+tk.getPass()+"'";
        try{
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                lvtk = rs.getInt(1);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Đã xảy ra lỗi !");
        }
        return lvtk; 
    }
    
    public ArrayList<nhanVien> GetnhanVien(){
        ArrayList<nhanVien> arrtd = null;
        String sql;
            sql = "SELECT * FROM nhanVien WHERE lv != 1";
        try{
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            arrtd = new ArrayList<nhanVien>();
            while(rs.next()){
                nhanVien td = new nhanVien(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
                arrtd.add(td);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "lỗi !");
        }
        return arrtd;
    }
    public boolean DeletenhanVien(ArrayList<Integer> listMaBan){
        boolean check = false;
        try{
            String sql;
            for(int ma : listMaBan){
                sql = "Delete From nhanVien Where id = '"+ma+"'";
                Statement st = cn.createStatement();
                st.executeUpdate(sql);
            } 
            check = true;
        }catch(SQLException ex){
            
        }
        return check;
    } 
    
    public int InserTK(nhanVien b){
        int insert = 0;
        String sql = "Insert into nhanVien (username, password, lv) values ('"+b.getUserName()+"', '"+b.getPass()+"', '"+b.getLoai()+"')";
        try{
            Statement st = cn.createStatement();
            insert = st.executeUpdate(sql);
            
        }catch(SQLException ex){
        }
        return insert;
    } 
    public nhanVien Getnhanvien(int id){
        nhanVien td = null;
        String sql;
            sql = "SELECT * FROM nhanVien WHERE id = '"+id+"'";
        try{
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
               td  = new nhanVien(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "lỗi !");
        }
        return td;
    }
   
    public nhanVien Getnhanvien(String name, String pass){
        nhanVien td = null;
        String sql;
            sql = "SELECT * FROM nhanVien Where username = '"+name+"' AND password='"+pass+"'";
        try{
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
               td  = new nhanVien(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "lỗi !");
        }
        return td;
    }
    public int UpdateTK(nhanVien b){
        int update = 0;
        String sql = "UPDATE nhanVien SET username = '"+b.getUserName()+"', password = '"+b.getPass()+"', lv = '"+b.getLoai()+"' WHERE id = '"+b.getID()+"'";
        try{
            Statement st = cn.createStatement();
            update = st.executeUpdate(sql);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "lỗi !");
        }
        return update;
    }
}
