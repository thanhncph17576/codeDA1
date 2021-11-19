/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.sql.Date;

/**
 *
 * @author ADMIN
 */
public class HoaDon {
    private int maHoaDon;
    private int maBan;
    private int giamGia;
    private int tongTien;
    private int trangThai;
    private Date gioDen;

    public HoaDon() {
    }

    public HoaDon(int maHoaDon, int maBan, int giamGia, int tongTien, int trangThai, Date gioDen) {
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

    public int getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(int giamGia) {
        this.giamGia = giamGia;
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public Date getGioDen() {
        return gioDen;
    }

    public void setGioDen(Date gioDen) {
        this.gioDen = gioDen;
    }
    
    
}
