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
public class SanPham {
    private int maSanPham;
    private int maLoaiSanPham;
    private String tenSanPham;
    private int donVi;
    private int donViTinh;

    public SanPham(int maSanPham, int maLoaiSanPham, String tenSanPham, int donVi, int donViTinh) {
        this.maSanPham = maSanPham;
        this.maLoaiSanPham = maLoaiSanPham;
        this.tenSanPham = tenSanPham;
        this.donVi = donVi;
        this.donViTinh = donViTinh;
    }

    public SanPham() {
    }
    

    public int getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }

    public int getMaLoaiSanPham() {
        return maLoaiSanPham;
    }

    public void setMaLoaiSanPham(int maLoaiSanPham) {
        this.maLoaiSanPham = maLoaiSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public int getDonVi() {
        return donVi;
    }

    public void setDonVi(int donVi) {
        this.donVi = donVi;
    }

    public int getDonViTinh() {
        return donViTinh;
    }

    public void setDonViTinh(int donViTinh) {
        this.donViTinh = donViTinh;
    }
    
    
}
