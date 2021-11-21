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
    private int maChiTietHD;
    private int maHoaDon;
    private int maMon;
    private  int soLong;
    private  int gia;

    public hoaDonCT() {
    }

    public hoaDonCT(int maChiTietHD, int maHoaDon, int maMon, int soLong, int gia) {
        this.maChiTietHD = maChiTietHD;
        this.maHoaDon = maHoaDon;
        this.maMon = maMon;
        this.soLong = soLong;
        this.gia = gia;
    }

    public int getMaChiTietHD() {
        return maChiTietHD;
    }

    public void setMaChiTietHD(int maChiTietHD) {
        this.maChiTietHD = maChiTietHD;
    }

    public int getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public int getMaMon() {
        return maMon;
    }

    public void setMaMon(int maMon) {
        this.maMon = maMon;
    }

    public int getSoLong() {
        return soLong;
    }

    public void setSoLong(int soLong) {
        this.soLong = soLong;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "hoaDonCT{" + "maChiTietHD=" + maChiTietHD + ", maHoaDon=" + maHoaDon + ", maMon=" + maMon + ", soLong=" + soLong + ", gia=" + gia + '}';
    }
    
    
}
