/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper;

import Entity.hoaDonCT;
import Entity.HoaDon;
import Entity.Ban;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author nguye
 */
public class JDBC {
    static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    static String dburl = "jdbc:sqlserver://localhost:1433;databaseName=QuanLyTraSua3";
    static String user = "sa";
    static String pass = "123456";

    //Nap Driver
//    static {
//        try {
//            Class.forName(driver);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }

    //Xjdbc.GETSTMT()
    public static PreparedStatement getStmt(String sql, Object... args) throws SQLException {
        Connection conn = DriverManager.getConnection(dburl, user, pass);
        PreparedStatement stmt;

        if (sql.trim().startsWith("{")) {
            stmt = conn.prepareCall(sql); //PROC
        } else {
            stmt = conn.prepareStatement(sql); //SQL
        }

        for (int i = 0; i < args.length; i++) {
            stmt.setObject(i + 1, args[i]);
        }
        return stmt;
    }

    //Xjdbc.QUERY()
    public static ResultSet query(String sql, Object... args) throws SQLException {
        PreparedStatement stmt = JDBC.getStmt(sql, args);
        return stmt.executeQuery();
    }

    //Xjdbc.VALUE()
    public static Object value(String sql, Object... args) {
        try {
            ResultSet rs = JDBC.query(sql, args);
            if (rs.next()) {
                return rs.getObject(0);
            }
            rs.getStatement().getConnection().close();
            return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    //Xjdbc.UPDATE()
    public static int update(String sql, Object... args) {
        try {
            PreparedStatement stmt = JDBC.getStmt(sql, args);
            try {
                return stmt.executeUpdate();
            } finally {
                stmt.getConnection().close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    
    private Connection cn;
    
    public JDBC(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=QuanLyTraSua3";
            String s = System.getProperty("os.name");
            if(s.contains("Windows")){
                cn = DriverManager.getConnection(url, "sa", "123456");
            }else{
                cn = DriverManager.getConnection(url, "sa", "123456");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }       
    }
    
        public hoaDonCT GetDsChiTiet(String ma, int maban){
        hoaDonCT arrDs = null;
        String sql;

            sql = "Select SoLuong, Gia, MaChiTietHD From chitiethd AS ct INNER JOIN hoadon AS hd ON ct.MaHoaDon = hd.MaHoaDon Where MaMon = '"+ma+"' AND MaBan = '"+maban+"' AND hd.TrangThai = 0";
        try{
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                arrDs = new hoaDonCT();
                arrDs.setSoLuong(rs.getInt(1));
                arrDs.setGia(rs.getInt(2));
                arrDs.setMaHoaDonCT(rs.getInt(3));
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Không lấy được danh sách Order !");
        }
        return arrDs;        
    } 
    
    public int GetMaHD(int ma){
        String sql;
        int mahd = 0;
            sql = "Select MaHoaDon From hoadon Where MaBan = '"+ma+"' AND TrangThai = 0";
        try{
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                mahd = rs.getInt(1);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Không lấy được danh sách thực đơn !");
        }
        return mahd;        
    } 
        public int InsertHoaDon(HoaDon hd, String gio){
        int insert = 0;
        String sql = "Insert into hoadon (MaBan, NgayDen, TrangThai) values ('"+hd.getMaBan()+"', '"+gio+"', '"+hd.getTrangThai()+"')";
        try{
            Statement st = cn.createStatement();
            insert = st.executeUpdate(sql);
        }catch(SQLException ex){
        }
        return insert;
    }
    
    public int UpdateChiTiet(hoaDonCT ct){
        int update = 0;
        String sql = "UPDATE chitiethd SET SoLuong = '"+ct.getSoLuong()+"', Gia = '"+ct.getGia()+"' WHERE MaChiTietHD = '"+ct.getMaHoaDonCT()+"'";
        try{
            Statement st = cn.createStatement();
            update = st.executeUpdate(sql);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Update chi tiết không thành công !");
        }
        return update;        
    }
    public int InsertChiTietHD(hoaDonCT cthd){
        int insert = 0;
        String sql = "Insert into chitiethd (MaHoaDon, MaMon, SoLuong, Gia) values ('"+cthd.getMaHoaDon()+"', '"+cthd.getMaMon()+"', '"+cthd.getSoLuong()+"', '"+cthd.getGia()+"')";
        try{
            Statement st = cn.createStatement();
            insert = st.executeUpdate(sql);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Thêm chi tiết hóa đơn không thành công !"+ex.toString());
        }
        return insert;
    }
        public int UpdateBan(Ban b){
        int update = 0;
        String sql = "UPDATE ban SET TenBan = '"+b.getTenBan()+"', TrangThai = '"+b.getTrangThai()+"' WHERE MaBan = '"+b.getMaBan()+"'";
        try{
            Statement st = cn.createStatement();
            update = st.executeUpdate(sql);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Update bàn không thành công !");
        }
        return update;
    } 
}
