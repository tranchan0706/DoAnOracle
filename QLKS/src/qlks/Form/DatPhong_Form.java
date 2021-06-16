/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlks.Form;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import qlks.DichVu;
import qlks.KhachHang;
import static qlks.MyConnection.getConnection;
import static qlks.Form.DangNhap_Form.Hostname;
import static qlks.Form.DangNhap_Form.Password;
import static qlks.Form.DangNhap_Form.Port;
import static qlks.Form.DangNhap_Form.SID;
import static qlks.Form.DangNhap_Form.Username;
import qlks.thuephong;

/**
 *
 * @author Dell
 */
public class DatPhong_Form extends javax.swing.JFrame {

    

    public DatPhong_Form() {
        initComponents();
        load_phong();
        Load_makh();
        setLocationRelativeTo(null);
    }
    Vector title = new Vector();
    Vector data = new Vector();
    Statement st = null;
    Statement st1 = null;
    
    public void load_phong() {
        title.clear();
        data.clear();
        title.add("Số phòng");
        title.add("Loại Phòng");
        title.add("Giá phòng");
        title.add("Tình trạng");
        Connection con = getConnection(Hostname,Port,SID,Username,Password);
        try {
            st = (Statement) con.createStatement();
            String sql = "select * from hr.phong";
            System.out.print(sql);
            // Thưc thi câu lệnh truy vấn
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                data.add(v);
            }
        } catch (Exception ex) {
            ex.printStackTrace();

        }
        jTablePHONG.setModel(new DefaultTableModel(data, title));
    }

    public ArrayList<KhachHang> layDanhSachKhachHang() {
        ArrayList<KhachHang> dskh = new ArrayList<KhachHang>();
        Connection con = getConnection(Hostname,Port,SID,Username,Password);
        try {
            st = (Statement) con.createStatement();

            // Thưcj thi câu lệnh truy vấn
            ResultSet rs = st.executeQuery("select * from hr.khachhang");

            KhachHang kh;
            while (rs.next()) {
                kh = new KhachHang(rs.getString("MAKH"), rs.getString("TENKH"), rs.getDate("NGAYSINH"), rs.getString("GIOITINH"), rs.getString("CMND"), rs.getString("QUOCTICH"), rs.getString("SDT"), rs.getString("LOAIKH"));

                //Thêm vào danh sách
                dskh.add(kh);
            }
        } catch (Exception ex) {
            ex.printStackTrace();

        }
        return dskh;
    }

    public void Load_makh() {
        cb_makh.removeAllItems();

        ArrayList<KhachHang> ds;
        ds = layDanhSachKhachHang();
        for (KhachHang a : ds) {
            Vector v = new Vector();
            v.add(a.getMAKH());
            //add cb
            cb_makh.addItem(a.getMAKH());

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePHONG = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        giatu = new javax.swing.JTextField();
        giaden = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btn_xemphong = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        thoat = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_madk = new javax.swing.JTextField();
        txt_thue = new javax.swing.JButton();
        cb_makh = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txt_songay1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 102));

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setForeground(new java.awt.Color(0, 204, 204));

        jTablePHONG.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTablePHONG);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Giá Phòng"));

        jLabel2.setText("Từ");

        giatu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                giatuKeyTyped(evt);
            }
        });

        giaden.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                giadenKeyTyped(evt);
            }
        });

        jLabel3.setText("Đến");

        btn_xemphong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlks/Form/hinh/Knob-Search-icon.png"))); // NOI18N
        btn_xemphong.setText("Tìm");
        btn_xemphong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xemphongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(giatu, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(giaden, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btn_xemphong)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(giatu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(giaden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btn_xemphong))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlks/Form/hinh/xemphong.png"))); // NOI18N
        jButton4.setText("Xem Phòng còn trống");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        thoat.setBackground(new java.awt.Color(204, 204, 204));
        thoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlks/Form/hinh/Knob-Snapback-icon.png"))); // NOI18N
        thoat.setText("Hủy");
        thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thoatActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlks/Form/hinh/thuephong.png"))); // NOI18N
        jLabel1.setText("Danh sách phòng");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông TIn"));

        jLabel4.setText("Chọn Khách Hàng:");

        jLabel5.setText("Số Ngày Thuê:");

        txt_madk.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_madkKeyTyped(evt);
            }
        });

        txt_thue.setBackground(new java.awt.Color(255, 255, 0));
        txt_thue.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_thue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlks/Form/hinh/datphong.png"))); // NOI18N
        txt_thue.setText("Đặt");
        txt_thue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_thueActionPerformed(evt);
            }
        });

        cb_makh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setText("Mã Đăng Kí Phòng:");

        txt_songay1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_songay1KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cb_makh, 0, 204, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(txt_songay1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_thue))
                    .addComponent(txt_madk, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cb_makh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_madk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 17, Short.MAX_VALUE)
                        .addComponent(txt_thue))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_songay1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(220, 220, 220))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(thoat)))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
         public void datphong() {
        int pos = jTablePHONG.getSelectedRow();
        String sp = jTablePHONG.getValueAt(pos, 0).toString();
        Connection con = getConnection(Hostname,Port,SID,Username,Password);
        try {
            st = (Statement) con.createStatement();
            st1 = (Statement) con.createStatement();
            String sql = "update hr.phong set tinhtrang='DA DAT' where sophong='" + sp + "'";
            System.out.print(sql);
            String sql1 = "insert into hr.thuephong values"
                    + "('" + txt_madk.getText().toString() + "','" + cb_makh.getSelectedItem().toString() 
                    + "','" + sp + "',sysdate,sysdate+1,'" +txt_songay1 .getText() + "')";
            System.out.print(sql1);
            // Thưc thi câu lệnh truy vấn
            ResultSet rs = st.executeQuery(sql);
            ResultSet rs1 = st1.executeQuery(sql1);
            if (rs != null && rs1 != null) {
                System.out.println();
                System.out.println("=> thành công");
                JOptionPane.showMessageDialog(rootPane, "Đặt Phòng Thành Công =))");
                this.dispose();
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Đặt Phòng thất bại =((");
            System.out.println("=> Đặt Thất Bại =((");
            //ex.printStackTrace();

        }
        jTablePHONG.setModel(new DefaultTableModel(data, title));
    }
    private void txt_thueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_thueActionPerformed

        int pos = jTablePHONG.getSelectedRow();

        if (pos < 0) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn 1 dòng!!");
            return;
        } else {
            if (txt_madk.getText().equals("") || txt_songay1.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Nhập Đầy Đủ Thông Tin!!");
                return;
            }

            String tinhtrang = jTablePHONG.getValueAt(pos, 3).toString();
            if (tinhtrang.equals("DA DAT")) {
                JOptionPane.showMessageDialog(rootPane, "Phòng đã có người đặt!!");
                return;
            } else {
                datphong();
            }
        }
    }//GEN-LAST:event_txt_thueActionPerformed

    public Boolean kiemtratxt() {
        if (giatu.getText().equals("") || giaden.getText().equals("") ) {
            JOptionPane.showMessageDialog(this, "Vui long nhap day du thong tin tim kiem", "Thong bao", 2);
            return false;
        }
        return true;
    }
    private void btn_xemphongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xemphongActionPerformed
        // TODO add your handling code here:
        title.clear();
        data.clear();
        title.add("Số phòng");
        title.add("Loại Phòng");
        title.add("Giá phòng");
        title.add("Tình trạng");
        Connection con = getConnection(Hostname,Port,SID,Username,Password);
        if(kiemtratxt())
        {
        try {
            st = (Statement) con.createStatement();
            String sql = "select * from hr.phong where giaphong between " + giatu.getText() + " and " + giaden.getText() + " order by 2";
            System.out.print(sql);
            // Thưc thi câu lệnh truy vấn
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                data.add(v);
            }
        } catch (Exception ex) {
            ex.printStackTrace();

        }
        jTablePHONG.setModel(new DefaultTableModel(data, title));
        }
    }//GEN-LAST:event_btn_xemphongActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        title.clear();
        data.clear();
        title.add("Số phòng");
        title.add("Loại Phòng");
        title.add("Giá phòng");
        title.add("Tình trạng");
        Connection con = getConnection(Hostname,Port,SID,Username,Password);
        try {
            st = (Statement) con.createStatement();
            String sql = "select * from hr.phong where tinhtrang LIKE '%CON TRONG%' order by 2";
            System.out.print(sql);
            // Thưc thi câu lệnh truy vấn
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                data.add(v);
            }
        } catch (Exception ex) {
            ex.printStackTrace();

        }
        jTablePHONG.setModel(new DefaultTableModel(data, title));
    }//GEN-LAST:event_jButton4ActionPerformed

    private void thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thoatActionPerformed
        // TODO add your handling code here:
        thoat.setToolTipText("Click để quay lại chương trình ");
        int selected = JOptionPane.showConfirmDialog(this, "Bạn có muốn quay lại không?", "Thông báo", JOptionPane.YES_NO_OPTION);
        if (selected == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_thoatActionPerformed

    private void txt_madkKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_madkKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_txt_madkKeyTyped

    private void txt_songay1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_songay1KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txt_songay1KeyTyped

    private void giatuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_giatuKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_giatuKeyTyped

    private void giadenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_giadenKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_giadenKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatPhong_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_xemphong;
    private javax.swing.JComboBox<String> cb_makh;
    private javax.swing.JTextField giaden;
    private javax.swing.JTextField giatu;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePHONG;
    private javax.swing.JButton thoat;
    private javax.swing.JTextField txt_madk;
    private javax.swing.JTextField txt_songay1;
    private javax.swing.JButton txt_thue;
    // End of variables declaration//GEN-END:variables
}
