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
public class hoaDonCT {
    private int maHoaDonCT;
    private int maHoaDon;
    private String maMon;
    private int soLuong;
    private  int gia;

    public hoaDonCT() {
    }

    public hoaDonCT(int maHoaDonCT, int maHoaDon, String maMon, int soLuong, int gia) {
        this.maHoaDonCT = maHoaDonCT;
        this.maHoaDon = maHoaDon;
        this.maMon = maMon;
        this.soLuong = soLuong;
        this.gia = gia;
    }

    public int getMaHoaDonCT() {
        return maHoaDonCT;
    }

    public void setMaHoaDonCT(int maHoaDonCT) {
        this.maHoaDonCT = maHoaDonCT;
    }

    public int getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getMaMon() {
        return maMon;
    }

    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    

    @Override
    public String toString() {
        return "hoaDonCT{" + "maHoaDonCT=" + maHoaDonCT + ", maSP=" + maHoaDon + ", maMon=" + maMon + ", soLuong=" + soLuong + ", gia=" + gia + '}';
    }

   
    
    
}