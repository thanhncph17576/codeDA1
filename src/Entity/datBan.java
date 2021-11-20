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
public class datBan {
    private int maDatBan;
    private int maBan;
    private String tenKhach;
    private String SDT;
    private String gioDat;

    public datBan() {
    }

    public datBan(int maDatBan, int maBan, String tenKhach, String gioDat) {
        this.maDatBan = maDatBan;
        this.maBan = maBan;
        this.tenKhach = tenKhach;
        this.gioDat = gioDat;
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

    public String getGioDat() {
        return gioDat;
    }

    public void setGioDat(String gioDat) {
        this.gioDat = gioDat;
    }

    @Override
    public String toString() {
        return "datBan{" + "maDatBan=" + maDatBan + ", maBan=" + maBan + ", tenKhach=" + tenKhach + ", SDT=" + SDT + ", gioDat=" + gioDat + '}';
    }
    
}