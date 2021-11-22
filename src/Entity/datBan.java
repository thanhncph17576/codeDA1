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
public class datBan {
    private int maDatBan;
    private int maBan;
    private String tenKhach;
    private String SDT;
    private Date giodat;

    public datBan() {
    }

    public datBan(int maDatBan, int maBan, String tenKhach, String SDT, Date giodat) {
        this.maDatBan = maDatBan;
        this.maBan = maBan;
        this.tenKhach = tenKhach;
        this.SDT = SDT;
        this.giodat = giodat;
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

    

    @Override
    public String toString() {
        return "datBan{" + "maDatBan=" + maDatBan + ", maBan=" + maBan + ", tenKhach=" + tenKhach + ", SDT=" + SDT + ", giodat=" + giodat + '}';
    }

    

    
    
    
    
}