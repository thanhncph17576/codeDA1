/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.Ban;
import java.util.List;
import Helper.JDBC;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author nguye
 */
public class banDAO extends DAO<Ban, String>{

    
    String INSERT_SQL = "insert into ban (TenBan, TrangThai) values (?,?)";
    String UPDATE_SQL = "update ban set TenBan = ? , TrangThai = ? where MaBan = ?";
    String DELETE_SQL = "delete from ban where MaBan = ?";
    String SELECT_ALL_SQL = "select * from ban";
    String SELECT_BY_ID_SQL = "select * from ban where MaBan = ?";
//    String SELECT_trng_thai ="UPDATE ban SET TrangThai = ? WHERE MaBan = ?";
    
    @Override
    public void insert(Ban entity) {
        JDBC.update(INSERT_SQL, 
                 entity.getTenBan(), entity.getTrangThai());
    }

    @Override
    public void update(Ban entity) {
        JDBC.update(UPDATE_SQL, 
                entity.getTenBan(), entity.getTrangThai(), entity.getMaBan());
    }    
    
//    public void updateTT(Ban entity) {
//        JDBC.update(SELECT_trng_thai, 
//                entity.getTrangThai(), entity.getMaBan());
//    }
    
    @Override
    public void delete(String id) {
        JDBC.update(DELETE_SQL, id);
    }

    @Override
    public List<Ban> selectAll() {
       return this.selectBySQL(SELECT_ALL_SQL);
    }

    @Override
    public Ban selectByID(String id) {
        List<Ban> list = this.selectBySQL(SELECT_BY_ID_SQL, id);
        if(list.isEmpty()){
            return null;
        }
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    protected List<Ban> selectBySQL(String sql, Object... args) {
       List<Ban> list = new ArrayList<Ban>();
        try {
            ResultSet rs = JDBC.query(sql, args);
            while(rs.next()){
                Ban b = new Ban();
                b.setMaBan(rs.getInt("MaBan"));
                b.setTenBan(rs.getString("TenBan"));
                b.setTrangThai(rs.getString("TrangThai"));
                list.add(b);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public int UpdateBan(Ban b){
       int updateb = 0;
       String sql = "select * from SanPham  where MaLoai = ?";
        return updateb;}
    public int UpdateBan1(Ban b){
        int update = 0;
        String sql = "UPDATE ban SET TenBan = ?, TrangThai = ? WHERE MaBan = ?";
        return update;
    } 
 
}
