/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import DAO.banDAO;
import Entity.Ban;
import Helper.Messages;
import java.awt.Color;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import static java.lang.Thread.sleep;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author ThangIKCU
 */
public final class JFmain extends javax.swing.JFrame {
    /**
     * Creates new form frmMain
     */   
    public static JFmain main;
    public JFmain() {
        initComponents();
        main = this;
        Clock clock= new Clock(); 
        clock.start(); 
        btnmute.setVisible(false);
        
        txtqtv.setText(RUN.nv.getUserName());
        if(RUN.nv.getLoai()!= 1)
        {
            btnQuanLy.setEnabled(false);
            btnThongKe.setEnabled(false);
       }
        btnmute.setVisible(false);
    }
             
    banDAO banDao = new banDAO();
    SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss_a");
    public class Clock extends Thread{ 
    public Clock(){    } 
    @Override
    public void run(){ 
        while(true){    
            int banDat=0, banPhucVu=0;
            List<Ban> list = banDao.selectAll();
            for(int i = 0;i<list.size();i++){
                if(list.get(i).getTrangThai().equals("Đang phục vụ")){
                    banPhucVu++;
                }
                if(list.get(i).getTrangThai().equals("Đã đặt trước")){
                    banDat++;
                }            
            } 
            lblpv.setText(+banPhucVu+" bàn đang phục vụ");
            lbldat.setText(+banDat+" bàn đặt trước");
            Calendar calendar = Calendar.getInstance();                
            String str;  
            str= sdf.format(calendar.getTime()); 
            lbltime.setText(str); 
        try{ 
            sleep(1000); 
          } catch(Exception e){ 
             System.out.println(e); 
            } 
      } 
    }
    }
    JFmain.MP3 mp3;
    JFsetting set;
    JFbanHang ban;
    JFhome home;
    JFquanLy quanLy;
    JFthongKe tk;
    JFdatBan datBan;
    JPchart ve;
    
    
    public void reloadPanel(int i) {
        jpLayout.removeAll();
        switch (i) {
            case 1:
                if (home == null) {
                    home = new JFhome();
                }
                //btnTrangChu.setPressedIcon(new ImageIcon("down.png"));
                mp3 = new JFmain.MP3 ("src/Sound/kasya.MP3");
                mp3.play();
                jpLayout.add(home);
                break;
                
            case 2:
                if (ban == null) {
                    ban = new JFbanHang();
                } 
                //btnBanHang.setPressedIcon(new ImageIcon("down.png"));
                mp3 = new JFmain.MP3 ("src/Sound/kasya.MP3");
                mp3.play();
                jpLayout.add(ban);
                break;
            case 3:
                if(quanLy == null){
                    quanLy = new JFquanLy();
                }
                //btnQuanLy.setPressedIcon(new ImageIcon("down.png"));
                                mp3 = new JFmain.MP3 ("src/Sound/kasya.MP3");
                mp3.play();
                jpLayout.add(quanLy);
                break;
            case 4:
                if(tk == null){
                   tk = new JFthongKe();
                }
                //btnQuanLy.setPressedIcon(new ImageIcon("down.png"));
                mp3 = new JFmain.MP3 ("src/Sound/kasya.MP3");
                mp3.play();               
                jpLayout.add(tk);
                break;
            case 5:
                if(datBan == null){
                   datBan = new JFdatBan();
                }
                //btnQuanLy.setPressedIcon(new ImageIcon("down.png"));
                mp3 = new JFmain.MP3 ("src/Sound/kasya.MP3");
                mp3.play();
                jpLayout.add(datBan);
                break;

            case 6:
                if (set == null) {
                    set = new JFsetting();
                } 
                //btnThietLap.setPressedIcon(new ImageIcon("down.png"));
                mp3 = new JFmain.MP3 ("src/Sound/kasya.MP3");
                mp3.play();
                jpLayout.add(set);
                break;     
            case 7: 
                if (ve==null) {
                    ve = new JPchart();
                }
                jpLayout.add(ve);
            default:
                break;
        }
        jpLayout.updateUI();
    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jPanel2 = new javax.swing.JPanel();
        btnThietLap = new javax.swing.JButton();
        btnQuanLy = new javax.swing.JButton();
        btnBanHang = new javax.swing.JButton();
        btnThongKe = new javax.swing.JButton();
        btnDS = new javax.swing.JButton();
        jpLayout = new javax.swing.JPanel();
        btnthoat = new javax.swing.JButton();
        btnTrangChu = new javax.swing.JButton();
        lbltime = new javax.swing.JLabel();
        lblpv = new javax.swing.JLabel();
        lbldat = new javax.swing.JLabel();
        txtqtv = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnSound = new javax.swing.JButton();
        btnmute = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trà sữa Goky");
        setBackground(Color.decode("#e6e6e6")
        );
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setForeground(new java.awt.Color(255, 204, 255));
        setLocation(new java.awt.Point(0, 0));
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jPanel2.setBackground(Color.decode("#e6e6e6"));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 0), 2));
        jPanel2.setPreferredSize(new java.awt.Dimension(1280, 600));

        btnThietLap.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnThietLap.setForeground(new java.awt.Color(51, 51, 51));
        btnThietLap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Settings-L-icon.png"))); // NOI18N
        btnThietLap.setText("THIẾT LẬP");
        btnThietLap.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThietLap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThietLapActionPerformed(evt);
            }
        });

        btnQuanLy.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnQuanLy.setForeground(new java.awt.Color(51, 51, 51));
        btnQuanLy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon-hoc-nau-an-Huong-nghiep-a-au-2015.png"))); // NOI18N
        btnQuanLy.setText("QUẢN LÝ");
        btnQuanLy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQuanLy.setPreferredSize(new java.awt.Dimension(140, 49));
        btnQuanLy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLyActionPerformed(evt);
            }
        });

        btnBanHang.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBanHang.setForeground(new java.awt.Color(51, 51, 51));
        btnBanHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sellicon.png"))); // NOI18N
        btnBanHang.setText("BÁN HÀNG");
        btnBanHang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBanHang.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btnBanHang.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnBanHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBanHangActionPerformed(evt);
            }
        });

        btnThongKe.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnThongKe.setForeground(new java.awt.Color(51, 51, 51));
        btnThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/thongke.png"))); // NOI18N
        btnThongKe.setText("THỐNG KÊ");
        btnThongKe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeActionPerformed(evt);
            }
        });

        btnDS.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDS.setForeground(new java.awt.Color(51, 51, 51));
        btnDS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ico-Table.png"))); // NOI18N
        btnDS.setText("DANH SÁCH ĐẶT BÀN");
        btnDS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDSActionPerformed(evt);
            }
        });

        jpLayout.setBackground(Color.decode("#e6e6e6")
        );
        jpLayout.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 0), new java.awt.Color(0, 51, 51)));
        jpLayout.setLayout(new java.awt.BorderLayout());

        btnthoat.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnthoat.setForeground(new java.awt.Color(0, 51, 0));
        btnthoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logout.png"))); // NOI18N
        btnthoat.setText("Đăng xuất");
        btnthoat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnthoat.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btnthoat.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnthoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthoatActionPerformed(evt);
            }
        });

        btnTrangChu.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnTrangChu.setForeground(new java.awt.Color(51, 51, 51));
        btnTrangChu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/HOME.png"))); // NOI18N
        btnTrangChu.setText("TRANG CHỦ");
        btnTrangChu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTrangChu.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btnTrangChu.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnTrangChu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnTrangChuFocusGained(evt);
            }
        });
        btnTrangChu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTrangChuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTrangChuMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnTrangChuMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnTrangChuMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTrangChuMouseClicked(evt);
            }
        });
        btnTrangChu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrangChuActionPerformed(evt);
            }
        });

        lbltime.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lbltime.setForeground(new java.awt.Color(51, 102, 0));
        lbltime.setText("jLabel1");

        lblpv.setForeground(new java.awt.Color(94, 94, 21));
        lblpv.setText("jLabel1");

        lbldat.setForeground(new java.awt.Color(94, 94, 21));
        lbldat.setText("jLabel1");

        txtqtv.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtqtv.setForeground(new java.awt.Color(204, 0, 0));
        txtqtv.setText("jLabel1");

        jLabel1.setForeground(new java.awt.Color(51, 51, 0));
        jLabel1.setText("QTV:");

        btnSound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Sound.png"))); // NOI18N
        btnSound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSoundActionPerformed(evt);
            }
        });

        btnmute.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/mute.png"))); // NOI18N
        btnmute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmuteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpLayout, javax.swing.GroupLayout.PREFERRED_SIZE, 1238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnTrangChu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBanHang)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnQuanLy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnThongKe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnThietLap)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblpv)
                            .addComponent(lbltime)
                            .addComponent(lbldat))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnmute, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSound, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtqtv))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnthoat)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnTrangChu)
                                .addComponent(btnBanHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnQuanLy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnThietLap))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lbltime)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblpv)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbldat)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnmute, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(txtqtv)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSound)
                            .addComponent(btnthoat))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpLayout, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1241, 1241, 1241)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1307, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(387, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 653, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
class MP3 {
    private Player player;
    private String filename;
    
    public MP3(String filename) {
        this.filename = filename;
    }
    
    public void stop() {
        if (player != null)
            player.close();
    }
public void play() {
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filename));
            player = new Player(bis);
        } catch (FileNotFoundException | JavaLayerException ex) {
            System.out.println(ex);
        }
        
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    player.play();
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }
        }).start();
    }
}
    private void btnBanHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBanHangActionPerformed
        reloadPanel(2);
    }//GEN-LAST:event_btnBanHangActionPerformed
    
    private void btnthoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthoatActionPerformed
        // TODO add your handling code here:
        if (Messages.confirm(this, "Bạn muốn đăng xuất")) {
            RUN.login.setVisible(true);
            this.setVisible(false);
            new frmLogIn().setVisible(true);
        }
        
        
    }//GEN-LAST:event_btnthoatActionPerformed

    private void btnTrangChuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrangChuActionPerformed
        // TODO add your handling code here:
        reloadPanel(1);
    }//GEN-LAST:event_btnTrangChuActionPerformed

    private void btnThietLapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThietLapActionPerformed
        // TODO add your handling code here:
        reloadPanel(6);
    }//GEN-LAST:event_btnThietLapActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void btnDSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDSActionPerformed
        reloadPanel(5);
    }//GEN-LAST:event_btnDSActionPerformed

    private void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeActionPerformed
        reloadPanel(4);
    }//GEN-LAST:event_btnThongKeActionPerformed

    private void btnTrangChuFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnTrangChuFocusGained
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnTrangChuFocusGained

    private void btnTrangChuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrangChuMouseClicked
               // TODO add your handling code here:
                
    }//GEN-LAST:event_btnTrangChuMouseClicked

    private void btnTrangChuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrangChuMouseEntered
              // TODO add your handling code here:
               
    }//GEN-LAST:event_btnTrangChuMouseEntered

    private void btnTrangChuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrangChuMouseExited
        // TODO add your handling code here:
         
    }//GEN-LAST:event_btnTrangChuMouseExited

    private void btnTrangChuMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrangChuMouseReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnTrangChuMouseReleased

    private void btnTrangChuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrangChuMousePressed
        
    }//GEN-LAST:event_btnTrangChuMousePressed

    private void btnQuanLyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLyActionPerformed
        // TODO add your handling code here:
        reloadPanel(3);
        
    }//GEN-LAST:event_btnQuanLyActionPerformed
        MP3 nhacnen;
    private void btnSoundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSoundActionPerformed
        // TODO add your handling code here:
        nhacnen = new MP3 ("src/Sound/Fur Elise - Richard Clayderman.MP3");
        nhacnen.play();
        btnSound.setVisible(false);
        btnmute.setVisible(true);
    }//GEN-LAST:event_btnSoundActionPerformed

    private void btnmuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmuteActionPerformed
        // TODO add your handling code here:
       nhacnen.stop();
       btnSound.setVisible(true);
       btnmute.setVisible(false);
    }//GEN-LAST:event_btnmuteActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBanHang;
    private javax.swing.JButton btnDS;
    private javax.swing.JButton btnQuanLy;
    private javax.swing.JButton btnSound;
    private javax.swing.JButton btnThietLap;
    private javax.swing.JButton btnThongKe;
    private javax.swing.JButton btnTrangChu;
    private javax.swing.JButton btnmute;
    private javax.swing.JButton btnthoat;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jpLayout;
    private javax.swing.JLabel lbldat;
    private javax.swing.JLabel lblpv;
    private javax.swing.JLabel lbltime;
    private javax.swing.JLabel txtqtv;
    // End of variables declaration//GEN-END:variables
}
