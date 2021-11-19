/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author conan
 */
public class Ban {
        private String  TenBan, TrangThai;
    private int MaBan;

    public Ban() {
    }

    public Ban(String TenBan, String TrangThai, int MaBan) {
        this.TenBan = TenBan;
        this.TrangThai = TrangThai;
        this.MaBan = MaBan;
    }

    public void setTenBan(String TenBan) {
        this.TenBan = TenBan;
    }

    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }

    public void setMaBan(int MaBan) {
        this.MaBan = MaBan;
    }

    public String getTenBan() {
        return TenBan;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public int getMaBan() {
        return MaBan;
    }

    @Override
    public String toString() {
        return TenBan ;
    }
    
    
}
