/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlks.Form;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import static qlks.MyConnection.getConnection;
import static qlks.Form.DangNhap_Form.Hostname;
import static qlks.Form.DangNhap_Form.Password;
import static qlks.Form.DangNhap_Form.Port;
import static qlks.Form.DangNhap_Form.SID;
import static qlks.Form.DangNhap_Form.Username;

/**
 *
 * @author Hieu
 */
public class Them_Xoa_Tablespace extends javax.swing.JFrame {

    /**
     * Creates new form Them_Xoa_Tablespace
     */
    public Them_Xoa_Tablespace() {
        initComponents();
        txt_ten.setEnabled(false);
        btn_them.setEnabled(false);
        setLocationRelativeTo(null);
    }

    Connection con = null;
    Statement st = null;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btn_them1 = new javax.swing.JButton();
        txt_ten1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_datafile1 = new javax.swing.JTextField();
        txt_size1 = new javax.swing.JTextField();
        btn_sua1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_them = new javax.swing.JButton();
        txt_ten = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_datafile = new javax.swing.JTextField();
        txt_size = new javax.swing.JTextField();
        btn_sua = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_datafile2 = new javax.swing.JTextField();
        txt_ten2 = new javax.swing.JTextField();
        btn_themDatafile = new javax.swing.JButton();
        btn_xoaDatafile = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txt_size2 = new javax.swing.JTextField();
        thoat4 = new javax.swing.JButton();

        jButton2.setText("jButton2");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Thêm / Sửa Tablespace"));

        jLabel4.setText("Tên Tablespace:");

        btn_them1.setText("Them");
        btn_them1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_them1ActionPerformed(evt);
            }
        });

        txt_ten1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ten1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Datafile");

        jLabel6.setText("Size");

        txt_size1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_size1ActionPerformed(evt);
            }
        });

        btn_sua1.setText("Sửa");
        btn_sua1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sua1ActionPerformed(evt);
            }
        });

        jButton4.setText("new");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_size1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(txt_datafile1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_ten1)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addComponent(btn_them1)
                        .addGap(18, 18, 18)
                        .addComponent(btn_sua1)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_ten1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_datafile1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_size1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(59, 59, 59)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_them1)
                    .addComponent(btn_sua1)
                    .addComponent(jButton4))
                .addGap(22, 22, 22))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Thêm / Sửa Tablespace"));

        jLabel1.setText("Tên Tablespace:");

        btn_them.setText("Them");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

        txt_ten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tenActionPerformed(evt);
            }
        });

        jLabel2.setText("Datafile");

        jLabel3.setText("Size");

        txt_size.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sizeActionPerformed(evt);
            }
        });

        btn_sua.setText("Sửa");
        btn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaActionPerformed(evt);
            }
        });

        jButton3.setText("new");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_size, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(txt_datafile, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_ten)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addComponent(btn_them)
                        .addGap(18, 18, 18)
                        .addComponent(btn_sua)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_ten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_datafile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_size, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_them)
                    .addComponent(btn_sua)
                    .addComponent(jButton3))
                .addGap(22, 22, 22))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Thêm, xóa một datafile vào một tablespace"));

        jLabel10.setText("Tablespace:");

        jLabel11.setText("Datafile:");

        txt_datafile2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_datafile2ActionPerformed(evt);
            }
        });

        btn_themDatafile.setText("Thêm");
        btn_themDatafile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themDatafileActionPerformed(evt);
            }
        });

        btn_xoaDatafile.setText("Xóa");
        btn_xoaDatafile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaDatafileActionPerformed(evt);
            }
        });

        jLabel12.setText("Size:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(30, 30, 30)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txt_datafile2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_ten2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_size2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_xoaDatafile, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_themDatafile, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_ten2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_themDatafile))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txt_datafile2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_xoaDatafile))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txt_size2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        thoat4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlks/Form/hinh/THOAT.png"))); // NOI18N
        thoat4.setText("Thoát");
        thoat4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thoat4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(thoat4)
                        .addGap(21, 21, 21))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(thoat4))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_sizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_sizeActionPerformed

    private void txt_tenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tenActionPerformed

    public boolean ktra_txt1()
    {
        if(txt_ten.getText().equals("")||txt_datafile.getText().equals("")||txt_size.getText().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane, "Nhập đầy đủ thông tin");
            return false;
        }
        return true;
    }
    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        // TODO add your handling code here:
        Connection con = getConnection(Hostname,Port,SID,Username,Password);
        if(ktra_txt1())
        {
        try {
            st = (Statement) con.createStatement();
            String sql = "create tablespace "+txt_ten.getText()+" datafile '"+txt_datafile.getText()+".dbf' size "+txt_size.getText()+"m";
            System.out.print(sql);
            // Thưc thi câu lệnh truy vấn
            ResultSet rs = st.executeQuery(sql);
            if (con != null) {
                System.out.println();
              System.out.println("=> thành công");
              JOptionPane.showMessageDialog(rootPane, "Thêm Thành Công!");
            }
            txt_ten.setEnabled(false);
            btn_sua.setEnabled(true);
            btn_them.setEnabled(true);
        } catch (Exception ex) {
            System.out.println();
            System.out.println("=> không thành công");
            JOptionPane.showMessageDialog(rootPane, "Thêm Thất Bại!");
            ex.printStackTrace();

        }
        }
    }//GEN-LAST:event_btn_themActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        txt_ten.setEnabled(true);
        btn_sua.setEnabled(false);
        btn_them.setEnabled(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        // TODO add your handling code here:\
        Connection con = getConnection(Hostname,Port,SID,Username,Password);
        if(ktra_txt1())
        {
        try {
            st = (Statement) con.createStatement();
            String sql = "alter database datafile '"+txt_datafile.getText()+".dbf' resize "+txt_size.getText()+"m";
            System.out.print(sql);
            // Thưc thi câu lệnh truy vấn
            ResultSet rs = st.executeQuery(sql);
            if (con != null) {
              System.out.println();
              System.out.println("=> thành công");
              JOptionPane.showMessageDialog(rootPane, "Sửa Thành Công!");
            }
            txt_ten.setEnabled(false);
            btn_sua.setEnabled(true);
        } catch (Exception ex) {
            System.out.println();
            System.out.println("=> không thành công");
            JOptionPane.showMessageDialog(rootPane, "Sửa Thất Bại!");
            ex.printStackTrace();

        }
        }
    }//GEN-LAST:event_btn_suaActionPerformed

    private void btn_them1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_them1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_them1ActionPerformed

    private void txt_ten1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ten1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ten1ActionPerformed

    private void txt_size1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_size1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_size1ActionPerformed

    private void btn_sua1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sua1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_sua1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txt_datafile2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_datafile2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_datafile2ActionPerformed

    public boolean ktra_txt()
    {
        if(txt_ten2.getText().equals("")||txt_datafile2.getText().equals("")||txt_size2.getText().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane, "Nhập đầy đủ thông tin");
            return false;
        }
        return true;
    }
    private void btn_themDatafileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themDatafileActionPerformed
        // TODO add your handling code here:
        
        Connection con = getConnection(Hostname,Port,SID,Username,Password);
        if(ktra_txt())
        {
        try {
            st = (Statement) con.createStatement();
            String sql = "alter tablespace "+txt_ten2.getText()+" add datafile '"
                    +txt_datafile2.getText()+".dbf' size "+txt_size2.getText()+"m";
            System.out.print(sql);
            // Thưc thi câu lệnh truy vấn
            ResultSet rs = st.executeQuery(sql);
            if (rs != null) {
                System.out.println();
              System.out.println("=> thành công");
              JOptionPane.showMessageDialog(rootPane, "Thêm Thành Công!");
            }
        } catch (Exception ex) {
            //ex.printStackTrace();
            System.out.println();
              System.out.println("=> không thành công");
              JOptionPane.showMessageDialog(rootPane, "Thêm Thất bại");
        }
        }
    }//GEN-LAST:event_btn_themDatafileActionPerformed

    private void btn_xoaDatafileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaDatafileActionPerformed
        // TODO add your handling code here: app_ff.dbf
        Connection con = getConnection(Hostname,Port,SID,Username,Password);
        if(ktra_txt())
        {
        try {
            st = (Statement) con.createStatement();
            String sql = "alter tablespace "+txt_ten2.getText()+" drop datafile '"+txt_datafile2.getText()+".dbf'";
            System.out.print(sql);
            // Thưc thi câu lệnh truy vấn
            ResultSet rs = st.executeQuery(sql);
            if (rs != null) {
                System.out.println();
              System.out.println("=> thành công");
              JOptionPane.showMessageDialog(rootPane, "Xóa Thành Công!");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println();
              System.out.println("=> không thành công");
              JOptionPane.showMessageDialog(rootPane, "Xóa Thất Bại!");
        }
        }
    }//GEN-LAST:event_btn_xoaDatafileActionPerformed

    private void thoat4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thoat4ActionPerformed
        // TODO add your handling code here:
        thoat4.setToolTipText("Click để thoát chương trình ");
        int selected = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn thoát chương"
            + " trình không", "Thông báo", JOptionPane.YES_NO_OPTION);
        if (selected == JOptionPane.YES_OPTION) {
            this.dispose();

        }
    }//GEN-LAST:event_thoat4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Them_Xoa_Tablespace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Them_Xoa_Tablespace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Them_Xoa_Tablespace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Them_Xoa_Tablespace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Them_Xoa_Tablespace().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_sua1;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_them1;
    private javax.swing.JButton btn_themDatafile;
    private javax.swing.JButton btn_xoaDatafile;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton thoat4;
    private javax.swing.JTextField txt_datafile;
    private javax.swing.JTextField txt_datafile1;
    private javax.swing.JTextField txt_datafile2;
    private javax.swing.JTextField txt_size;
    private javax.swing.JTextField txt_size1;
    private javax.swing.JTextField txt_size2;
    private javax.swing.JTextField txt_ten;
    private javax.swing.JTextField txt_ten1;
    private javax.swing.JTextField txt_ten2;
    // End of variables declaration//GEN-END:variables
}