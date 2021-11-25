/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.loaiSanPham;
import Helper.JDBC;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DANG HOANG
 */
public class loaiSanPhamDAO extends DAO<loaiSanPham, String>{
    
    String INSERT_SQL = "insert into loaiSP (MaLoai, TenLoai,MauSac) values (?,?,?)";
    String UPDATE_SQL = "update loaiSP set TenLoai = ?, MauSac = ? where MaLoai = ?";
    String DELETE_SQL = "delete from loaiSP where MaLoai = ?";
    String SELECT_ALL_SQL = "select * from loaiSP ";
    String SELECT_BY_ID_SQL = "select * from loaiSP where MaLoai = ?";

    @Override
    public void insert(loaiSanPham entity) {
        JDBC.update(INSERT_SQL,
                entity.getMaLoaiSP(),
                entity.getTenLoaiSP(),
                entity.getMauSac());
    }

    @Override
    public void update(loaiSanPham entity) {
        JDBC.update(UPDATE_SQL,
                entity.getTenLoaiSP(),
                entity.getMauSac(),
                entity.getMaLoaiSP()
        );
    }

    @Override
    public void delete(String id) {
        JDBC.update(DELETE_SQL, id);
    }

    @Override
    public List<loaiSanPham> selectAll() {
        return this.selectBySQL(SELECT_ALL_SQL);
    }

    @Override
    public loaiSanPham selectByID(String id) {
        List<loaiSanPham> list = this.selectBySQL(SELECT_BY_ID_SQL, id);
        if(list.isEmpty()){
            return null;
        }
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    protected List<loaiSanPham> selectBySQL(String sql, Object... args) {
        List<loaiSanPham> list = new ArrayList<loaiSanPham>();
        try {
            ResultSet rs = JDBC.query(sql, args);
            while(rs.next()){
                loaiSanPham L = new loaiSanPham();
                L.setMaLoaiSP(rs.getInt("MaLoai"));
                L.setTenLoaiSP(rs.getString("TenLoai"));
                L.setMauSac(rs.getString("MauSac"));
                list.add(L);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

   

}
