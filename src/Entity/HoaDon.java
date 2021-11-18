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
public class HoaDon {
    private int maHoaDon;
    private int maBan;
    private String giamGia;
    private int tongTien;
    private String trangThai;
    private int gioDen;

    public HoaDon() {
    }

    public HoaDon(int maHoaDon, int maBan, String giamGia, int tongTien, String trangThai, int gioDen) {
        this.maHoaDon = maHoaDon;
        this.maBan = maBan;
        this.giamGia = giamGia;
        this.tongTien = tongTien;
        this.trangThai = trangThai;
        this.gioDen = gioDen;
    }

    public int getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public int getMaBan() {
        return maBan;
    }

    public void setMaBan(int maBan) {
        this.maBan = maBan;
    }

    public String getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(String giamGia) {
        this.giamGia = giamGia;
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public int getGioDen() {
        return gioDen;
    }

    public void setGioDen(int gioDen) {
        this.gioDen = gioDen;
    }
    
    
}
