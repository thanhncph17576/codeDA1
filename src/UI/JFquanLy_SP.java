/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import DAO.loaiSanPhamDAO;
import DAO.sanphamDAO;
import Entity.SanPham;
import Entity.loaiSanPham;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author ThangIKCU
 */
public class JFquanLy_SP extends javax.swing.JPanel {
    public static JFquanLy_SP sp;
    public JFquanLy_SP() {
        initComponents();
        sp =this;
        fillCbb();
        fillTable();
    }
    sanphamDAO daosp =new sanphamDAO();
//    public void Fillcbb() {
//         
//        Vector Vcbb = (Vector) daosp.selectAll();
//
//        if (Vcbb != null) {
//            DefaultComboBoxModel cbbmodel = new DefaultComboBoxModel(Vcbb);
//            cbbNhomMon.setModel(cbbmodel);
//        } else {
//            JOptionPane.showMessageDialog(null, "Không có nhóm nào !");
//        }
//
//    }  loaiSanPhamDAO daoLoai = new loaiSanPhamDAO();
    sanphamDAO daoSP = new sanphamDAO();
    loaiSanPhamDAO daoLoai =new loaiSanPhamDAO();
    public void fillCbb(){
        DefaultComboBoxModel model = (DefaultComboBoxModel) cbbNhomMon.getModel();
        model.removeAllElements();
//        List<loaiSanPham> list = daoLoai.selectTen();
        List<loaiSanPham> list = daoLoai.selectAll();
        System.out.println(list);
        for(loaiSanPham x : list){
            model.addElement(x.getTenLoaiSP());
        }
        //fillTable();
    }  
//    public void fillTable(){
//        DefaultTableModel mol =(DefaultTableModel)tbBan.getModel();
//        mol.setRowCount(0);
//        mol.setColumnCount(0);
//        List<SanPham> arrTable = daosp.selectAll();
//        DefaultTableModel tbmodel =new DefaultTableModel();
//        tbmodel.addColumn("Mã món");
//        tbmodel.addColumn("Tên món");
//        tbmodel.addColumn("Mã loại ");
//        tbmodel.addColumn("Đơn giá");
//        tbmodel.addColumn("Đơn Vị tính");
//        if(arrTable != null){
//           int somon =0;
//           for(SanPham x : arrTable){
//            somon ++;
//            tbmodel.addRow(new Object[]{
//                x.getMaMon(),
//                x.getTenMon(),
//                x.getMaLoai(),
//                x.getDonGia(),
//                x.getDVT(),                       
//            });
//           }
//          lblthongtin.setText(String.valueOf(somon)+" sản phẩm");
//        }else {
//       JOptionPane.showMessageDialog(null, "Không có sản phẩm ?");
//        }
//        tbBan.setModel(tbmodel);
//        for(int i=0; i < tbBan.getColumnCount(); i++){
//            Class<?> col = tbBan.getColumnClass(i);
//            tbBan.setDefaultEditor(col, null);
//        }
//    }
    public void fillTable(){
        DefaultTableModel model = (DefaultTableModel) tbBan.getModel();
        model.setColumnCount(0);
        model.setRowCount(0);
        model.addColumn("Mã món");
        model.addColumn("Tên món");
        model.addColumn("Mã loại");
        model.addColumn("Đơn giá");
        model.addColumn("ĐVT");
        
        int tenLoai = cbbNhomMon.getSelectedIndex()+1;
        int soMon = 0;
        List<SanPham> list = daoSP.selectTheoLoai(tenLoai);
        for (SanPham x : list){
            soMon++;
            model.addRow(new Object[]{
                x.getMaMon(),
                x.getTenMon(),
                x.getMaLoai(),
                x.getDonGia(),
                x.getDVT(), 
            });
        }
        lblthongtin.setText(soMon+"");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bntXoa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbBan = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        bntThem = new javax.swing.JButton();
        cbbNhomMon = new javax.swing.JComboBox<>();
        lblthongtin = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bntSuaMon = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txttim = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        bntXoa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bntXoa.setForeground(new java.awt.Color(51, 0, 51));
        bntXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/file_delete.png"))); // NOI18N
        bntXoa.setText("Xóa");
        bntXoa.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        bntXoa.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        bntXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntXoaActionPerformed(evt);
            }
        });

        tbBan.setForeground(new java.awt.Color(51, 0, 51));
        tbBan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbBan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbBanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbBan);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 0));
        jLabel1.setText("Nhóm món:");

        bntThem.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bntThem.setForeground(new java.awt.Color(51, 0, 51));
        bntThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/file_add.png"))); // NOI18N
        bntThem.setText("Thêm");
        bntThem.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        bntThem.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        bntThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntThemActionPerformed(evt);
            }
        });

        cbbNhomMon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbNhomMon.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbNhomMonItemStateChanged(evt);
            }
        });
        cbbNhomMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbNhomMonActionPerformed(evt);
            }
        });

        lblthongtin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblthongtin.setForeground(new java.awt.Color(153, 0, 0));
        lblthongtin.setText("Total");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 51));
        jLabel2.setText("Tổng số sản phẩm:");

        bntSuaMon.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bntSuaMon.setForeground(new java.awt.Color(51, 0, 51));
        bntSuaMon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/document_edit.png"))); // NOI18N
        bntSuaMon.setText("Sửa");
        bntSuaMon.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        bntSuaMon.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        bntSuaMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSuaMonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 0));
        jLabel3.setText("Quản lý sản phẩm");

        txttim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txttimKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Tìm sản phẩm:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbbNhomMon, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(199, 199, 199)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txttim, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 795, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bntThem, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bntSuaMon, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bntXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(38, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblthongtin, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(283, 283, 283))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbbNhomMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bntThem, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bntSuaMon, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bntXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(lblthongtin)))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tbBanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbBanMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbBanMouseClicked

    private void bntThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntThemActionPerformed
         JFquanLy_SP_them SP = new JFquanLy_SP_them(RUN.QLTS, true);
        SP.setVisible(true);
    }//GEN-LAST:event_bntThemActionPerformed

    private void bntSuaMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSuaMonActionPerformed
        int select = tbBan.getSelectedRow();
        if (select < 0) {
            JOptionPane.showMessageDialog(null, "Bạn chưa chọn sp nào !");
        } else {
            int Mamon = (int) tbBan.getValueAt(select, 0);
            JFquanLy_SP_sua sua = new JFquanLy_SP_sua(RUN.QLTS, true, Mamon);
            sua.setVisible(true);
        }
    }//GEN-LAST:event_bntSuaMonActionPerformed

    private void bntXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntXoaActionPerformed
 int[] selectedRows = tbBan.getSelectedRows();

        if (selectedRows.length <= 0) {
            JOptionPane.showMessageDialog(null, "Bạn chưa chọn mục cần xóa  !");
        } else {
            ArrayList<Integer> ListMaMon = new ArrayList<Integer>();
            String sp = "";
            for (int i : selectedRows) {
                int ma = (int) tbBan.getValueAt(i, 0);
                ListMaMon.add(ma);
                String tenmon = (String) tbBan.getValueAt(i, 1);              
                sp += tenmon + "\n";
            }                    
          int nutbam = JOptionPane.showConfirmDialog(new JFrame(), "bạn chắc chắn xóa?", "xóA", JOptionPane.YES_NO_OPTION);
        if (nutbam == JOptionPane.YES_OPTION) {
            int cacdong[] = tbBan.getSelectedRows();
            for (int i = 0; i < cacdong.length; i++) {
                String MaPhong = tbBan.getValueAt(cacdong[i], 0).toString();
                    daoSP.delete(MaPhong);
                    fillTable();
                
            }
        }
        }                
    }//GEN-LAST:event_bntXoaActionPerformed

    private void cbbNhomMonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbNhomMonItemStateChanged
//        JFquanLy_loaiSP.loaisp.fillTable();
//        JFquanLy_loaiSP.loaisp.updateUI();
    }//GEN-LAST:event_cbbNhomMonItemStateChanged

    private void txttimKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttimKeyReleased
         List<SanPham> arrTable = daoSP.selectByKeyword(txttim.getText());
          if(arrTable != null){
            DefaultTableModel tbmodel = new DefaultTableModel();
            tbmodel.addColumn("Mã món");
            tbmodel.addColumn("Tên món");
            tbmodel.addColumn("Mã loại");
            tbmodel.addColumn("Đơn giá");
            tbmodel.addColumn("ĐVT");           
            int somon = 0;
            for (SanPham td : arrTable) {
                somon++;
                tbmodel.addRow(new Object[]{td.getMaMon(), td.getTenMon(), td.getMaLoai(), td.getDonGia(), td.getDVT()});
                lblthongtin.setText(String.valueOf(somon)+" món");
            }
            tbBan.setModel(tbmodel);
            for(int i = 0; i < tbBan.getColumnCount();i++){
                Class<?> col = tbBan.getColumnClass(i);
                tbBan.setDefaultEditor(col, null);
            }
        }
    }//GEN-LAST:event_txttimKeyReleased

    private void cbbNhomMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbNhomMonActionPerformed
       fillTable();
    }//GEN-LAST:event_cbbNhomMonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntSuaMon;
    private javax.swing.JButton bntThem;
    private javax.swing.JButton bntXoa;
    private javax.swing.JComboBox<String> cbbNhomMon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblthongtin;
    private javax.swing.JTable tbBan;
    private javax.swing.JTextField txttim;
    // End of variables declaration//GEN-END:variables
}
