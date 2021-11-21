/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.Ban;
import Entity.datBan;
import Helper.JDBC;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class datBanDAO extends DAO<datBan, String>{
    String INSERT_SQL = "insert into banDat (MaBanDat, MaBan, TenKhach, SDT, GioDat) values (?,?,?,?,?,?)";
    String UPDATE_SQL = "update banDat set MaBan = ? , TenKhach = ? , SDT = ? , GioDat , where MaBanDat = ?";
    String DELETE_SQL = "delete from banDat where MaBanDat = ?";
    String SELECT_ALL_SQL = "select * from banDat";
    String SELECT_BY_ID_SQL = "select * from banDat where MaBanDat = ?";
    @Override
    public void insert(datBan entity) {
        JDBC.update(INSERT_SQL, 
                entity.getMaBanDat(), entity.getMaBan(), entity.getTenKhach(),entity.getSDT(),entity.getGioDat());
    }

    @Override
    public void update(datBan entity) {
        JDBC.update(UPDATE_SQL, 
                entity.getMaBanDat(), entity.getMaBan(), entity.getTenKhach(),entity.getSDT(),entity.getGioDat());
    }

    @Override
    public void delete(String id) {
       JDBC.update(DELETE_SQL, id);
    }

    @Override
    public List<datBan> selectAll() {
         return this.selectBySQL(SELECT_ALL_SQL);    }

    @Override
    public datBan selectByID(String id) {
         List<datBan> list = this.selectBySQL(SELECT_BY_ID_SQL, id);
        if(list.isEmpty()){
            return null;
        }
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    protected List<datBan> selectBySQL(String sql, Object... args) {
        List<datBan> list = new ArrayList<datBan>();
        try {
            ResultSet rs = JDBC.query(sql, args);
            while(rs.next()){
                datBan b = new datBan();
                b.setMaBanDat(rs.getInt("MaBanDat"));
                b.setMaBan(rs.getInt("MaBan"));
                b.setTenKhach(rs.getString("TenKhach"));
                b.setSDT(rs.getString("SDT"));
                b.setGioDat(rs.getDate("GioDat"));
                list.add(b);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}