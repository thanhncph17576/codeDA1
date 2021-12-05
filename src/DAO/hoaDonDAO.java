/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.DsOrder;
import Helper.JDBC;
import Entity.HoaDon;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Entity.SanPham;
import javax.swing.JOptionPane;

/**
 *
 * @author nguye
 */
public class hoaDonDAO extends DAO<HoaDon, String> {
    
    String INSERT_SQL = "insert into hoadon (MaHoaDon, GiamGia, MaBan, GioDen, TongTien, TrangThai) values (?,?,?,?,?,?)";
    String UPDATE_SQL = "update hoadon set GiamGia = ? where MaHoaDon = ?";
    String DELETE_SQL = "delete from hoadon where MaHoaDon = ?";
    String SELECT_ALL_SQL = "select * from hoadon";
    String SELECT_BY_ID_SQL = "select * from hoadon where MaBan = ? and TrangThai = 0";//lay danh sach
    
    @Override
    public void insert(HoaDon entity) {
        JDBC.update(INSERT_SQL, 
                entity.getMaHoaDon(), entity.getGiamGia(), entity.getMaBan(), entity.getGioDen(),
                entity.getTongTien(), entity.getTrangThai());
    }

    @Override
    public void update(HoaDon entity) {
        JDBC.update(UPDATE_SQL, 
                entity.getGiamGia(), entity.getMaHoaDon());
    }

    @Override
    public void delete(String id) {
        JDBC.update(UPDATE_SQL, id);
    }

    @Override
    public List<HoaDon> selectAll() {
        return this.selectBySQL(SELECT_ALL_SQL);
    }

    @Override
    public HoaDon selectByID(String id) {
        List<HoaDon> list = this.selectBySQL(SELECT_BY_ID_SQL, id);
        if(list.isEmpty()){
            return null;
        }
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    protected List<HoaDon> selectBySQL(String sql, Object... args) {
        List<HoaDon> list = new ArrayList<HoaDon>();
        try {
            ResultSet rs = JDBC.query(sql, args);
            while (rs.next()){
                HoaDon hd = new HoaDon();
                hd.setMaHoaDon(rs.getInt("MaHoaDon"));
                hd.setGiamGia(rs.getInt("GiamGia"));
                hd.setMaBan(rs.getInt("MaBan"));
                hd.setGioDen(rs.getDate("NgayDen"));
                hd.setTongTien(rs.getInt("TongTien"));
                hd.setTrangThai(rs.getInt("TrangThai"));
                list.add(hd);   
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public int GetMaHD(int ma){
        String sql;
        int mahd = 0;
            sql = "Select MaHoaDon From hoadon Where MaBan = ? AND TrangThai = 0";
        return mahd;        
    }
    public int InsertHoaDon(HoaDon hd, String gio){
        int insert = 0;
        String sql = "Insert into hoadon (MaBan, GioDen, TrangThai) values (?,?, ?)";
        return insert;
    }
    
    public int LayMaHD(int ma){
        String sql;
        int mahd = 0;
            sql = "Select MaHoaDon From hoadon Where MaBan = ? AND TrangThai = 0";
        return mahd;        
    } 
    
    public List<HoaDon> thongKe(){
        String sql = "select * from hoadon where TrangThai = 1";
        return this.selectBySQL(sql);       
    }
    
    public HoaDon goiMon(int id){
        String sql = "select * from hoadon where MaBan =?  and TrangThai = 0";
         List<HoaDon> list = this.selectBySQL(sql, id);
        if(list.isEmpty()){
            return null;
        }
        return list.size() > 0 ? list.get(0) : null;      
    }
    
    public ArrayList<DsOrder> getDSOrder(int ma) {
        String sql = "select chitiethd.MaMon, TenMon, DVT, SoLuong, Gia, MaHoaDon from chitiethd inner join SanPham on chitiethd.MaMon = SanPham.MaMon where MaHoaDon = ?";
        ArrayList<DsOrder> list = null;
        try {
            ResultSet rs = JDBC.query(sql, ma);
            list = new ArrayList<DsOrder>();
            while (rs.next()) {
                DsOrder ds = new DsOrder(rs.getString(2), rs.getString(1), rs.getString(3), rs.getInt(5), rs.getInt(4), rs.getInt(6));
                list.add(ds);
            }
            rs.getStatement().getConnection().close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }
    
    public ArrayList<DsOrder> getMon(int ma) {
        String sql = "select TenMon, DonGia, SoLuong,DVT from chitiethd inner join hoadon on chitiethd.MaHoaDon=hoadon.MaHoaDon inner join SanPham on SanPham.MaMon=chitiethd.MaMon where hoadon.TrangThai = 1 and chitiethd.MaMon=?";
        ArrayList<DsOrder> list = null;
        try {
            ResultSet rs = JDBC.query(sql, ma);
            list = new ArrayList<DsOrder>();
            while (rs.next()) {
                DsOrder ds = new DsOrder(rs.getString(1), null, rs.getString(4), rs.getInt(2), rs.getInt(3),0);
                list.add(ds);
            }
            rs.getStatement().getConnection().close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }
    
    public void thanhToan(int tong, int ma) {
        String sql = "UPDATE hoadon SET TongTien = ?, TrangThai = 1 WHERE MaHoaDon = ?";
        JDBC.update(sql, tong,ma);
    }

    public ArrayList<DsOrder> GetCtHDByDate(int maHoaDon, String d1, String d2) {
       ArrayList<DsOrder> listhdct = null;
        String sql;
        String ma = null;
        if(d1.equals(d2))
            sql = "Select ct.MaMon, TenMon, DVT, SoLuong, Gia, ct.MaHoaDon From chitiethd AS ct INNER JOIN thucdon AS td ON ct.MaMon = td.MaMon INNER JOIN hoadon AS hd ON hd.MaHoaDon = ct.MaHoaDon Where ct.MaHoaDon = '"+ma+"' AND hd.GioDen >= '"+d1+"'";
            else
            sql = "Select ct.MaMon, TenMon, DVT, SoLuong, Gia, ct.MaHoaDon From chitiethd AS ct INNER JOIN thucdon AS td ON ct.MaMon = td.MaMon INNER JOIN hoadon AS hd ON hd.MaHoaDon = ct.MaHoaDon Where ct.MaHoaDon = '"+ma+"' AND hd.GioDen BETWEEN '"+d1+"' AND '"+d2+"'";
        try{
            ResultSet rs = JDBC.query(sql, maHoaDon);
            listhdct = new ArrayList<DsOrder>();
            while(rs.next()){
                DsOrder order = new DsOrder(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getInt(6));
                listhdct.add(order);
            }
        }catch(Exception ex){
          JOptionPane.showMessageDialog(null, "Không lấy được danh sách chi tiết hoa đơn !"+ex.toString());
        }
        return listhdct; 
    }
}
