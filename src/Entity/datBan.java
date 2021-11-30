/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author ADMIN
 */
public class datBan {
    private int maDatBan;
    private int maBan;
    private String tenKhach;
    private String SDT;
    private Date giodat;
    private Time thoiGian;

    public datBan() {
    }

    public datBan(int maDatBan, int maBan, String tenKhach, String SDT, Date giodat, Time thoiGian) {
        this.maDatBan = maDatBan;
        this.maBan = maBan;
        this.tenKhach = tenKhach;
        this.SDT = SDT;
        this.giodat = giodat;
        this.thoiGian = thoiGian;
    }

    public int getMaDatBan() {
        return maDatBan;
    }

    public void setMaDatBan(int maDatBan) {
        this.maDatBan = maDatBan;
    }

    public int getMaBan() {
        return maBan;
    }

    public void setMaBan(int maBan) {
        this.maBan = maBan;
    }

    public String getTenKhach() {
        return tenKhach;
    }

    public void setTenKhach(String tenKhach) {
        this.tenKhach = tenKhach;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public Date getGiodat() {
        return giodat;
    }

    public void setGiodat(Date giodat) {
        this.giodat = giodat;
    }

    public Time getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(Time thoiGian) {
        this.thoiGian = thoiGian;
    }

    @Override
    public String toString() {
        return "datBan{" + "maDatBan=" + maDatBan + ", maBan=" + maBan + ", tenKhach=" + tenKhach + ", SDT=" + SDT + ", giodat=" + giodat + ", thoiGian=" + thoiGian + '}';
    }

   

    

    

    

    
    
    
    
}