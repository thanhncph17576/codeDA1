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
    private int datBan;
    private String tenKhach;
    private String SDT;
    private String date;

    public datBan() {
    }

    public datBan(int maDatBan, int datBan, String tenKhach, String SDT, String date) {
        this.maDatBan = maDatBan;
        this.datBan = datBan;
        this.tenKhach = tenKhach;
        this.SDT = SDT;
        this.date = date;
    }

    public int getMaDatBan() {
        return maDatBan;
    }

    public void setMaDatBan(int maDatBan) {
        this.maDatBan = maDatBan;
    }

    public int getDatBan() {
        return datBan;
    }

    public void setDatBan(int datBan) {
        this.datBan = datBan;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "datBan{" + "maDatBan=" + maDatBan + ", datBan=" + datBan + ", tenKhach=" + tenKhach + ", SDT=" + SDT + ", date=" + date + '}';
    }
    
    
    
}