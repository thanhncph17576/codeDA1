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
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class sanphamDAO extends DAO<SanPham, String> {

    String INSERT_SQL = "insert into SanPham(TenMon,MaLoai,DonGia,DVT) values (?,?,?,?)";
    String UPDATE_SQL = "update SanPham set TenMon = ? , MaLoai = ? , DonGia = ? , DVT = ? where MaMon = ?";
    String DELETE_SQL = "delete from SanPham where MaMon = ?";
    String SELECT_ALL_SQL = "select * from SanPham ";
    String SELECT_BY_ID_SQL = "select * from SanPham where MaMon = ?";

    @Override
    public void insert(SanPham entity) {
        JDBC.update(INSERT_SQL,               
                entity.getTenMon(),
                entity.getMaLoai(),
                entity.getDonGia(),
                entity.getDVT()
        );
    }

    @Override
    public void update(SanPham entity) {
        JDBC.update(UPDATE_SQL,                              
                entity.getTenMon(),
                entity.getMaLoai(),
                entity.getDonGia(),
                entity.getDVT(),
                entity.getMaMon()
        );
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
        List<SanPham> list = new ArrayList<SanPham>();
        try {
            ResultSet rs = JDBC.query(sql, args);
            while(rs.next()){
                SanPham sp = new SanPham();
                sp.setMaMon(rs.getInt("MaMon"));
                sp.setTenMon(rs.getString("TenMon"));
                sp.setMaLoai(rs.getInt("MaLoai"));
                sp.setDonGia(rs.getInt("DonGia"));
                sp.setDVT(rs.getString("DVT"));
                list.add(sp);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public List<SanPham> selectTheoLoai(int maLoai){
       String sql = "select * from SanPham  where MaLoai = ?";
       return this.selectBySQL(sql,maLoai);
   } 
    
    public List<SanPham> GetSanphamByMa(String ma){
        List<SanPham> arrSanPham = null;
        String sql;
            sql = "Select * From SanPham Where MaMon = ?";
        return arrSanPham;        
    }
    public List<SanPham> selectByKeyword(String keyword){
        String sql = "SELECT * FROM SanPham WHERE TenMon LIKE ?";
        return this.selectBySQL(sql, "%" + keyword + "%");
            }
    
    public List<SanPham> thongKeMon(){
        String sql = "select TenMon, MaMon, DVT,DonGia,MaLoai from SanPham where MaMon in (select chitiethd.MaMon from chitiethd)";
        return this.selectBySQL(sql);
    }
        public ArrayList<SanPham> GetThucDonByMa(String ma){
        ArrayList<SanPham> arrThucDon = null;
        String sql;

            sql = "Select * From SanPham Where MaMon = ? ";
        try{
            ResultSet rs = JDBC.query(sql, ma);
            arrThucDon = new ArrayList<SanPham>();
            while(rs.next()){
                SanPham td = new SanPham(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5));
                arrThucDon.add(td);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Không lấy được danh sách thực đơn !");
        }
        return arrThucDon;        
    }
       
   
}