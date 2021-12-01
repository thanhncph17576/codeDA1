/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author ADMIN
 */
public class SanPham {
    private int maMon;
    private String tenMon;
    private int maLoai;
    private int donGia;
    private String DVT;

    public SanPham() {
    }

    public SanPham(int maMon, String tenMon, int maLoai, int donGia, String DVT) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.maLoai = maLoai;
        this.donGia = donGia;
        this.DVT = DVT;
    }

    public int getMaMon() {
        return maMon;
    }

    public void setMaMon(int maMon) {
        this.maMon = maMon;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public int getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(int maLoai) {
        this.maLoai = maLoai;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public String getDVT() {
        return DVT;
    }

    public void setDVT(String DVT) {
        this.DVT = DVT;
    }

    @Override
    public String toString() {
        return "SanPham{" + "maMon=" + maMon + ", tenMon=" + tenMon + ", maLoai=" + maLoai + ", donGia=" + donGia + ", DVT=" + DVT + '}';
    }

    public void setMaLoai(String MaNhom) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

   
    
    
}
