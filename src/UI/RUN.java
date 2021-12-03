
package UI;

import Entity.nhanVien;

public class RUN {
    public static nhanVien nv;
    public static frmLogIn login;
    public static JFmain QLTS;
    public static void main(String[] args) {
        lg();
    }
    public static void lg(){
        login = new frmLogIn();
        login.setVisible(true);
    }
    public static void QLTS(){
        QLTS = new JFmain();
        QLTS.setVisible(true);
    }
}
