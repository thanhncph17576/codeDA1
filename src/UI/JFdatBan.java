/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import DAO.banDAO;
import DAO.datBanDAO;
import Entity.Ban;
import java.util.Date;
import Entity.datBan;
import Helper.Messages;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nguye
 */
public class JFdatBan extends javax.swing.JPanel {

    public static JFdatBan datBan;
    int index;
    banDAO daoB = new banDAO();

    public JFdatBan() {
        initComponents();
        datBan = this;
        fillTable();
        for (int i = 7; i <= 22; i++) {
            String t = i + "";
            cbxHours.addItem(t);
        }
        for (int i = 0; i <= 59; i++) {
            String t = i + "";
            cbxMinute.addItem(t);
        }
        fillCbb();
    }

    datBanDAO daodatBan = new datBanDAO();
    SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    SimpleDateFormat hf = new SimpleDateFormat("yyyy-MM-dd");

    public void fillTable() {
        DefaultTableModel mol = (DefaultTableModel) tbldatBan.getModel();
        mol.setColumnCount(0);
        mol.setRowCount(0);
        List<datBan> arrTale = daodatBan.selectAll();
        DefaultTableModel tbmodel = new DefaultTableModel();
        tbmodel.addColumn("Mã bàn đặt");
        tbmodel.addColumn("Tên khách hàng");
        tbmodel.addColumn("Số điện thoại");
        tbmodel.addColumn("Bàn");
        tbmodel.addColumn("Ngày");
        tbmodel.addColumn("Thời gian");

        for (datBan x : arrTale) {
            tbmodel.addRow(new Object[]{
                x.getMaDatBan(),
                x.getTenKhach(),
                x.getSDT(),
                x.getMaBan(),
                x.getGiodat(),
                x.getThoiGian()

            });
            System.out.println(hf.format(x.getThoiGian()));
        }
        tbldatBan.setModel(tbmodel);
        for (int i = 0; i < tbldatBan.getColumnCount(); i++) {
            Class<?> col = tbldatBan.getColumnClass(i);
            tbldatBan.setDefaultEditor(col, null);
        }

    }

    public void treckvadidate() {
        String p_sdt = "0[0-9]{9}";
        String p_hoten = "[a-zA-Z ]+";
        if (tfTenkhach.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Tên khách không được để trống ?");
            tfTenkhach.requestFocus();
            return;
        } else if (tfTenkhach.getText().matches(p_hoten) == false) {
            JOptionPane.showMessageDialog(this, "Tên khách sv không đúng định dạng");
            tfTenkhach.requestFocus();
            return;
        }
        if (tfSDT.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, " SDT không được để trống!");
            tfSDT.requestFocus();
            return;
        } else if (tfSDT.getText().matches(p_sdt) == false) {
            JOptionPane.showMessageDialog(this, "Sđt không đúng định dạng");
            tfSDT.requestFocus();
            return;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbTenkhach = new javax.swing.JLabel();
        lbSoban = new javax.swing.JLabel();
        lbTime = new javax.swing.JLabel();
        lbDay = new javax.swing.JLabel();
        tfTenkhach = new javax.swing.JTextField();
        cboSoban = new javax.swing.JComboBox<>();
        tfSDT = new javax.swing.JTextField();
        lbSDT = new javax.swing.JLabel();
        cbxHours = new javax.swing.JComboBox<>();
        cbxMinute = new javax.swing.JComboBox<>();
        lbl2Cham = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        dateChooser3 = new datechooser.beans.DateChooserCombo();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbldatBan = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("ĐẶT BÀN");

        lbTenkhach.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbTenkhach.setText("Tên khách hàng:");

        lbSoban.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbSoban.setText("Bàn số:");

        lbTime.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbTime.setText("Thời gian:");

        lbDay.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbDay.setText("Ngày:");

        tfTenkhach.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        cboSoban.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboSoban.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSobanActionPerformed(evt);
            }
        });

        tfSDT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSDTActionPerformed(evt);
            }
        });
        tfSDT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfSDTKeyReleased(evt);
            }
        });

        lbSDT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbSDT.setText("Số điện thoại:");

        cbxHours.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbxHours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxHoursActionPerformed(evt);
            }
        });

        cbxMinute.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lbl2Cham.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl2Cham.setText(":");

        btnSave.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/file_add.png"))); // NOI18N
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/document_edit.png"))); // NOI18N
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/file_delete.png"))); // NOI18N
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Refresh.png"))); // NOI18N
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDel, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(btnNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        dateChooser3.setCurrentView(new datechooser.view.appearance.AppearancesList("custom",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 11),
                    new java.awt.Color(0, 51, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    dateChooser3.setCalendarBackground(new java.awt.Color(133, 140, 148));
    dateChooser3.setNavigateFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11));
    dateChooser3.setBehavior(datechooser.model.multiple.MultyModelBehavior.SELECT_PERIOD);

    tbldatBan.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null, null, null, null, null},
            {null, null, null, null, null, null},
            {null, null, null, null, null, null},
            {null, null, null, null, null, null}
        },
        new String [] {
            "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
        }
    ));
    tbldatBan.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            tbldatBanMouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(tbldatBan);

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel4Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
            .addContainerGap())
    );
    jPanel4Layout.setVerticalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel4Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addContainerGap())
    );

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(21, 21, 21)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(lbSDT)
                .addComponent(lbTenkhach)
                .addComponent(lbTime)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDay)
                    .addComponent(lbSoban)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tfSDT)
                    .addComponent(cboSoban, javax.swing.GroupLayout.Alignment.LEADING, 0, 174, Short.MAX_VALUE)
                    .addComponent(tfTenkhach))
                .addComponent(dateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(cbxHours, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(5, 5, 5)
                    .addComponent(lbl2Cham)
                    .addGap(7, 7, 7)
                    .addComponent(cbxMinute, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(23, 23, 23)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(32, 32, 32)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(35, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGap(36, 36, 36))
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(77, 77, 77)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbTenkhach)
                        .addComponent(tfTenkhach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbSDT)
                        .addComponent(tfSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cboSoban, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbSoban))
                    .addGap(27, 27, 27)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbDay)
                        .addComponent(dateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbTime)
                                .addComponent(cbxHours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbxMinute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(lbl2Cham))))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(73, 73, 73)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(84, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap(53, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
        .addGroup(layout.createSequentialGroup()
            .addGap(548, 548, 548)
            .addComponent(jLabel1)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(42, Short.MAX_VALUE))
    );
    }// </editor-fold>//GEN-END:initComponents

    private void cboSobanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSobanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboSobanActionPerformed

    private void tfSDTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSDTKeyReleased

    }//GEN-LAST:event_tfSDTKeyReleased

    private void tbldatBanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbldatBanMouseClicked
        int dong = tbldatBan.getSelectedRow();
        tfTenkhach.setText(tbldatBan.getValueAt(dong, 1) + "");
        tfSDT.setText(tbldatBan.getValueAt(dong, 2) + "");
        cboSoban.setSelectedItem(tbldatBan.getValueAt(dong, 3));
        String date = tbldatBan.getValueAt(dong, 4) + "";
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        try {
            cal.setTime(sdf.parse(date));
        } catch (ParseException ex) {
            Logger.getLogger(JFdatBan.class.getName()).log(Level.SEVERE, null, ex);
        }
        dateChooser3.setSelectedDate(cal);
        String ngay = tbldatBan.getValueAt(dong, 5) + "";
        try {
            Date ngay2 = new SimpleDateFormat("HH:mm:ss").parse(ngay);
            SimpleDateFormat hf = new SimpleDateFormat("HH");
            String gio = hf.format(ngay2);
            SimpleDateFormat mf = new SimpleDateFormat("mm");
            String phut = mf.format(ngay2);
            cbxHours.setSelectedItem(gio);
            cbxMinute.setSelectedItem(phut);
        } catch (ParseException ex) {
            Logger.getLogger(JFdatBan.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_tbldatBanMouseClicked

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (tfTenkhach.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Tên khách không được để trống !");
            return;
        }
        if (tfSDT.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Số ĐT không được để trống !");
            return;
        }
        Date ngay = dateChooser3.getSelectedDate().getTime();
        String s1 = String.format("%1$tY-%1$tm-%1$td", ngay);
        try {
            //lấy từ string sang date
            Date ngay2 = new SimpleDateFormat("yyyy-MM-dd").parse(s1);
            datBan d = new datBan();
            int MaBan = cboSoban.getSelectedIndex() + 1;
            d.setMaBan(MaBan);
            d.setSDT(tfSDT.getText());
            d.setTenKhach(tfTenkhach.getText());
            d.setGiodat(ngay2);
            //lấy từ string sang time
            String gio = cbxHours.getSelectedItem() + "";
            String phut = cbxMinute.getSelectedItem() + "";
            String time = gio + ":" + phut + ":00";
            d.setThoiGian(java.sql.Time.valueOf(time));
            daodatBan.insert(d);
            fillTable();
            JOptionPane.showMessageDialog(this, "Thêm thành công !");
        } catch (ParseException ex) {
            Logger.getLogger(JFdatBan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        if (tfTenkhach.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Tên khách không được để trống !");
            return;
        }
        if (tfSDT.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Số ĐT không được để trống !");
            return;
        }
        int select = tbldatBan.getSelectedRow();
        if (select < 0) {
            JOptionPane.showMessageDialog(null, "Bạn chưa chọn bàn đặt nào !");
        } else {
            int maBanDat = (int) tbldatBan.getValueAt(select, 0);
            Date ngay = dateChooser3.getSelectedDate().getTime();
            String s1 = String.format("%1$tY-%1$tm-%1$td", ngay);
            try {
                //lấy từ string sang date
                Date ngay2 = new SimpleDateFormat("yyyy-MM-dd").parse(s1);
                datBan d = new datBan();
                int MaBan = cboSoban.getSelectedIndex() + 1;
                d.setMaBan(MaBan);
                d.setSDT(tfSDT.getText());
                d.setTenKhach(tfTenkhach.getText());
                d.setGiodat(ngay2);
                //lấy từ string sang time
                String gio = cbxHours.getSelectedItem() + "";
                String phut = cbxMinute.getSelectedItem() + "";
                String time = gio + ":" + phut + ":00";
                d.setThoiGian(java.sql.Time.valueOf(time));
                d.setMaDatBan(maBanDat);
                daodatBan.update(d);
                fillTable();
                JOptionPane.showMessageDialog(this, "Sửa thành công !");
            } catch (ParseException ex) {
                Logger.getLogger(JFdatBan.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        int[] selectedRows = tbldatBan.getSelectedRows();
        if (selectedRows.length <= 0) {
            Messages.alert(this, "Bạn chưa chọn bàn ");
        } else {
            ArrayList<Integer> ListMaBan = new ArrayList<Integer>();
            String sp = "";
            for (int i : selectedRows) {
                int ma = (int) tbldatBan.getValueAt(i, 0);
                ListMaBan.add(ma);
                String tenban = (String) tbldatBan.getValueAt(i, 1);
                sp += tenban + "\n";
            }
            int nutbam = JOptionPane.showConfirmDialog(new JFrame(), "Bạn chắc chắn xóa?", "Trà sữa Goky", JOptionPane.YES_NO_OPTION);
            if (nutbam == JOptionPane.YES_OPTION) {
                int cacdong[] = tbldatBan.getSelectedRows();
                for (int i = 0; i < cacdong.length; i++) {
                    String maban = tbldatBan.getValueAt(cacdong[i], 0).toString();
                    daodatBan.delete(maban);
                    fillTable();
                }
            }
        }

    }//GEN-LAST:event_btnDelActionPerformed

    private void cbxHoursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxHoursActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxHoursActionPerformed

    private void tfSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSDTActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        tfTenkhach.setText("");
        tfSDT.setText("");
        cboSoban.setSelectedItem("1");
        cbxHours.setSelectedItem("7");
        cbxMinute.setSelectedItem("0");
    }//GEN-LAST:event_btnNewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cboSoban;
    private javax.swing.JComboBox<String> cbxHours;
    private javax.swing.JComboBox<String> cbxMinute;
    private datechooser.beans.DateChooserCombo dateChooser3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbDay;
    private javax.swing.JLabel lbSDT;
    private javax.swing.JLabel lbSoban;
    private javax.swing.JLabel lbTenkhach;
    private javax.swing.JLabel lbTime;
    private javax.swing.JLabel lbl2Cham;
    private javax.swing.JTable tbldatBan;
    private javax.swing.JTextField tfSDT;
    private javax.swing.JTextField tfTenkhach;
    // End of variables declaration//GEN-END:variables

    private void fillCbb() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboSoban.getModel();
        model.removeAllElements();
        List<Ban> list = daoB.selectAll();
        System.out.println(list);
        for (Ban x : list) {
            model.addElement(x.getMaBan());
        }
    }
}
