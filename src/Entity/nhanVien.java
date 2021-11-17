/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author DANG HOANG
 */
public class nhanVien {
    private int ID;
    private String UserName;
    private String Pass;
    private String Loai;

    public nhanVien() {
    }

    public nhanVien(int ID, String UserName, String Pass, String Loai) {
        this.ID = ID;
        this.UserName = UserName;
        this.Pass = Pass;
        this.Loai = Loai;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }

    public String getLoai() {
        return Loai;
    }

    public void setLoai(String Loai) {
        this.Loai = Loai;
    }

    @Override
    public String toString() {
        return "nhanVien{" + "ID=" + ID + ", UserName=" + UserName + ", Pass=" + Pass + ", Loai=" + Loai + '}';
    }
    
    

    
    
    
    
}
