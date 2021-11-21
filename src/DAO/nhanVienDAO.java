package DAO;

import Entity.nhanVien;
import Helper.JDBC;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class nhanVienDAO extends DAO<nhanVien, String>{
    
    String INSERT_SQL = "insert into nhanVien (id , username, password, lv) values (?,?,?,?)";
    String UPDATE_SQL = "update nhanVien set username = ? , password = ?, lv = ? where id = ?";
    String DELETE_SQL = "delete from nhanVien where id = ?";
    String SELECT_ALL_SQL = "select * from nhanVien";
    String SELECT_BY_ID_SQL = "select * from nhanVien where id = ?";
    

    @Override
    public void insert(nhanVien entity) {
        JDBC.update(INSERT_SQL,
                entity.getID(),
                entity.getUserName(),
                entity.getPass(),
                entity.getLoai());
    }

    @Override
    public void update(nhanVien entity) {
        JDBC.update(UPDATE_SQL,                
                entity.getUserName(),
                entity.getPass(),
                entity.getLoai(),
                entity.getID());
    }

    @Override
    public void delete(String id) {
        JDBC.update(DELETE_SQL, id);
    }

    @Override
    public List<nhanVien> selectAll() {
        return this.selectBySQL(SELECT_ALL_SQL);
    }

    @Override
    public nhanVien selectByID(String id) {
        List<nhanVien> list = this.selectBySQL(SELECT_BY_ID_SQL, id);
        if(list.isEmpty()){
            return null;
        }
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    protected List<nhanVien> selectBySQL(String sql, Object... args) {
        List<nhanVien> list = new ArrayList<nhanVien>();
        try {
            ResultSet rs = JDBC.query(sql, args);
            while(rs.next()){
                nhanVien nv = new nhanVien();
                nv.setID(rs.getInt("ID"));
                nv.setUserName(rs.getString("UserName"));
                nv.setPass(rs.getString("Pass"));
                nv.setLoai(rs.getInt("Loai"));
                list.add(nv);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}