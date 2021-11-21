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
    private int maBanDat;
    private int MaBan;
    private String tenKhach;
    private String SDT;
    private String gioDat;
    public datBan() {
    }

    public datBan(int maBanDat, int MaBan, String tenKhach, String SDT, String gioDat) {
        this.maBanDat = maBanDat;
        this.MaBan = MaBan;
        this.tenKhach = tenKhach;
        this.SDT = SDT;
        this.gioDat = gioDat;
    }

    public int getMaBanDat() {
        return maBanDat;
    }

    public void setMaBanDat(int maBanDat) {
        this.maBanDat = maBanDat;
    }

    public int getMaBan() {
        return MaBan;
    }

    public void setMaBan(int MaBan) {
        this.MaBan = MaBan;
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
        return "datBan{" + "maBanDat=" + maBanDat + ", MaBan=" + MaBan + ", tenKhach=" + tenKhach + ", SDT=" + SDT + ", gioDat=" + gioDat + '}';
    }

   

    
    
    
    
}