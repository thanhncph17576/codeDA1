/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.Ban;
import Entity.hoaDonCT;
import Helper.JDBC;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class hoaDonCTDAO extends DAO<hoaDonCT, String>{
    String INSERT_SQL = "insert into chitiethd(MaChiTietHD, MaHoaDon, MaMon, SoLuong, Gia)values(?,?,?,?,?)";
    String UPDATE_SQL = "update chitiethd set MaHoaDon = ? , MaMon = ? , SoLuong = ? , Gia = ? where MaCHiTietHD =? ";
    String DELETE_SQL = "delete from chitiethd wwhere MaChiTietHD = ?";
    String SELECT_ALL_SQL = "select * from chitiethd";
    String SELECT_BY_ID_SQL = "select * from banDat where MaChiTietHD = ?";

    @Override
    public void insert(hoaDonCT entity) {
       JDBC.update(INSERT_SQL, 
                entity.getMaHoaDonCT(), entity.getMaHoaDon(), entity.getMaMon(), entity.getSoLuong(), entity.getGia());
    }

    @Override
    public void update(hoaDonCT entity) {
      JDBC.update(UPDATE_SQL, 
                 entity.getMaHoaDon(), entity.getMaMon(), entity.getSoLuong(), entity.getGia(),entity.getMaHoaDonCT());
    }

    @Override
    public void delete(String id) {
       JDBC.update(DELETE_SQL, id);              
    }

    @Override
    public List<hoaDonCT> selectAll() {
       return this.selectBySQL(SELECT_ALL_SQL);
    }

    @Override
    public hoaDonCT selectByID(String id) {
          List<hoaDonCT> list = this.selectBySQL(SELECT_BY_ID_SQL, id);
        if(list.isEmpty()){
            return null;
        }
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    protected List<hoaDonCT> selectBySQL(String sql, Object... args) {
        List<hoaDonCT> list = new ArrayList<hoaDonCT>();
        try {
            ResultSet rs = JDBC.query(sql, args);
            while(rs.next()){
                hoaDonCT b = new hoaDonCT();
                b.setMaHoaDonCT(rs.getInt("MaHoaDonCT"));
                b.setMaHoaDon(rs.getInt("MaHoaDon"));
                b.setMaMon(rs.getString("MaMon"));
                b.setSoLuong(rs.getInt("SoLuong"));
                b.setGia(rs.getInt("Gia"));
                list.add(b);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public hoaDonCT LayDSHDCT(String ma, int maban){
        hoaDonCT arrDs = null;
        String sql;
            sql = "Select SoLuong, Gia, MaChiTietHD From chitiethd AS ct INNER JOIN hoadon AS hd ON ct.MaHoaDon = hd.MaHoaDon Where MaMon = ? AND MaBan = ? AND hd.TrangThai = 0";
        return arrDs;  
    }
    public int UpdateChiTiet(hoaDonCT ct){
        int update = 0;
        String sql = "UPDATE chitiethd SET SoLuong = ?, Gia =? WHERE MaChiTietHD = ?";
        return update;        
    }
    public int InsertChiTietHD(hoaDonCT cthd){
        int insert = 0;
        String sql = "Insert into chitiethd (MaHoaDon, MaMon, SoLuong, Gia) values (?, ?, ?,?)";
        return insert;
    }
    
    
}
