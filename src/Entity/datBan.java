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
    private int maban;
    private String tenKhach;
    private String SDT;
    private String ghichu;

    
    public datBan() {
    }

    public datBan(int maban,String tenKhach, String SDT, String ghichu) {
                this.maban = maban;
        this.tenKhach = tenKhach;
        this.SDT = SDT;
        this.ghichu = ghichu;

    }
   public int getMaban() {
        return maban;
    }
    public void setMaban(int maban) {
        this.maban = maban;
    }
    public String getTenKhach() {
        return tenKhach;
    }

    public String getSDT() {
        return SDT;
    }

    public String getGhichu() {
        return ghichu;
    }

 
    public void setTenKhach(String tenKhach) {
        this.tenKhach = tenKhach;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    @Override
    public String toString() {
        return "datBan{" + "maban=" + maban + ", tenKhach=" + tenKhach + ", SDT=" + SDT + ", ghichu=" + ghichu + '}';
    }


    
    
}