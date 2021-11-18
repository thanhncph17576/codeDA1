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
    private int maSP;
    private int soLuong;
    private  int gia;

    public hoaDonCT() {
    }

    public hoaDonCT(int maHoaDonCT, int maSP, int soLuong, int gia) {
        this.maHoaDonCT = maHoaDonCT;
        this.maSP = maSP;
        this.soLuong = soLuong;
        this.gia = gia;
    }

    public int getMaHoaDonCT() {
        return maHoaDonCT;
    }

    public void setMaHoaDonCT(int maHoaDonCT) {
        this.maHoaDonCT = maHoaDonCT;
    }

    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
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
        return "hoaDonCT{" + "maHoaDonCT=" + maHoaDonCT + ", maSP=" + maSP + ", soLuong=" + soLuong + ", gia=" + gia + '}';
    }
    
    
}