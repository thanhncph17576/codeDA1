
package Entity;

public class DsOrder {
    private String TenMon, MaMon, DVT; 
    private int Gia, SoLuong, MaHoaDon;
    
    public DsOrder(){

    }

    public DsOrder(String TenMon, String MaMon, String DVT, int Gia, int SoLuong, int MaHoaDon) {
        this.TenMon = TenMon;
        this.MaMon = MaMon;
        this.DVT = DVT;
        this.Gia = Gia;
        this.SoLuong = SoLuong;
        this.MaHoaDon = MaHoaDon;
    }

    public String getTenMon() {
        return TenMon;
    }

    public void setTenMon(String TenMon) {
        this.TenMon = TenMon;
    }

    public String getMaMon() {
        return MaMon;
    }

    public void setMaMon(String MaMon) {
        this.MaMon = MaMon;
    }

    public String getDVT() {
        return DVT;
    }

    public void setDVT(String DVT) {
        this.DVT = DVT;
    }

    public int getGia() {
        return Gia;
    }

    public void setGia(int Gia) {
        this.Gia = Gia;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public int getMaHoaDon() {
        return MaHoaDon;
    }

    public void setMaHoaDon(int MaHoaDon) {
        this.MaHoaDon = MaHoaDon;
    }

    @Override
    public String toString() {
        return "DsOrder{" + "TenMon=" + TenMon + ", MaMon=" + MaMon + ", DVT=" + DVT + ", Gia=" + Gia + ", SoLuong=" + SoLuong + ", MaHoaDon=" + MaHoaDon + '}';
    }
    
}
