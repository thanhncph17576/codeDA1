/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.SanPham;
import Helper.JDBC;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DANG HOANG
 */
public class thucDonDAO extends DAO<SanPham, String>{
    String INSERT_SQL = "insert into SanPham (MaMon,TenMon,MaLoai,DonGia,DVT) values (?,?,?,?,?)";
    String UPDATE_SQL = "update SanPham set TenMon = ? , MaLoai = ? , DonGia = ? , DVT = ? where MaMon = ?";
    String DELETE_SQL = "delete from SanPham where MaMon = ?";
    String SELECT_ALL_SQL = "select * from SanPham";
    String SELECT_BY_ID_SQL = "select * from SanPham where MaMon = ?";

    @Override
    public void insert(SanPham entity) {
        JDBC.update(INSERT_SQL,
                entity.getMaSanPham(), entity.getTenSanPham(), entity.getMaLoaiSanPham(),
                entity.getDonVi(), entity.getDonViTinh());
    }

    @Override
    public void update(SanPham entity) {
        JDBC.update(UPDATE_SQL, 
                entity.getTenSanPham(), entity.getMaLoaiSanPham(),
                entity.getDonVi(), entity.getDonViTinh(),entity.getMaSanPham());
    }

    @Override
    public void delete(String id) {
        JDBC.update(DELETE_SQL, id);
    }

    @Override
    public List<SanPham> selectAll() {
        return this.selectBySQL(SELECT_ALL_SQL);
    }

    @Override
    public SanPham selectByID(String id) {
        List<SanPham> list = this.selectBySQL(SELECT_BY_ID_SQL, id);
        if(list.isEmpty()){
            return null;
        }
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    protected List<SanPham> selectBySQL(String sql, Object... args) {
        List<SanPham> list = new ArrayList<>();
        try {
            ResultSet rs = JDBC.query(sql, args);
            while(rs.next()){
                SanPham S = new SanPham();
                S.setMaSanPham(rs.getInt("MaSanPham"));
                S.setTenSanPham(rs.getString("TenSanPham"));
                S.setMaLoaiSanPham(rs.getInt("MaLoaiSanPham"));
                S.setDonVi(rs.getInt("DonVi"));
                S.setDonViTinh(rs.getInt("DonViTinh"));
                list.add(S);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
