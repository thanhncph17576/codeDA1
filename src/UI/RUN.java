/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Entity.nhanVien;

/**
 *
 * @author nguye
 */
public class RUN {
    public static nhanVien nv;
    public static jfLogin login;
    public static JFmain main;
    public static void main(String[] args) {
        lg();
    }
    public static void lg(){
        login = new jfLogin();
        login.setVisible(true);
    }
}
