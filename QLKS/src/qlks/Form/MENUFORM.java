/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlks.Form;

import qlks.Form.DangNhap_Form;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import qlks.Form.QLThuePhong_Form;
import qlks.Form.DichVu_Form;
import qlks.Form.HoaDon_Form;
import qlks.Form.KhachHang_Form;
import qlks.Form.menu_hethong;
import qlks.Form.NhanVien_Form;
import qlks.Form.Phong_Form;
import static qlks.Form.DangNhap_Form.Name_Ac;
import static qlks.Form.DangNhap_Form.check;

public class MENUFORM extends javax.swing.JFrame {

    /**
     * Creates new form MENUFORM
     */
    public MENUFORM() {
        initComponents();
        lbl_NameAccount.setText("Hello: " + Name_Ac);
        System.out.println(Name_Ac);
        enable();
        
        setLocationRelativeTo(null);
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButtonnhanvien = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btn_nhac = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbl_NameAccount = new javax.swing.JLabel();
        thoat = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();

        jButton6.setText("jButton6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 255));
        jPanel1.setLayout(null);

        jButtonnhanvien.setBackground(new java.awt.Color(255, 255, 255));
        jButtonnhanvien.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButtonnhanvien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlks/Form/hinh/nhanvien.png"))); // NOI18N
        jButtonnhanvien.setText("Nhân Viên");
        jButtonnhanvien.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonnhanvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonnhanvienActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonnhanvien);
        jButtonnhanvien.setBounds(30, 290, 190, 60);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlks/Form/hinh/Knob-Favorite-icon.png"))); // NOI18N
        jButton8.setText("Hệ Thống");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);
        jButton8.setBounds(240, 370, 115, 30);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlks/Form/hinh/sssssasasas.png"))); // NOI18N
        jButton3.setText("Dịch Vụ");
        jButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(280, 210, 190, 60);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlks/Form/hinh/qqqqq.png"))); // NOI18N
        jButton1.setText("Phòng");
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(30, 130, 190, 60);

        btn_nhac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlks/Form/hinh/Knob-Play-Green-icon.png"))); // NOI18N
        btn_nhac.setText("Music");
        btn_nhac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nhacActionPerformed(evt);
            }
        });
        jPanel1.add(btn_nhac);
        btn_nhac.setBounds(370, 370, 101, 30);

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlks/Form/hinh/thuephong.png"))); // NOI18N
        jButton5.setText("Thuê Phòng");
        jButton5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(280, 130, 190, 60);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlks/Form/hinh/khachhang.png"))); // NOI18N
        jButton2.setText("Khách Hàng");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(280, 290, 190, 60);

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlks/Form/hinh/hoadon.png"))); // NOI18N
        jButton4.setText("Hóa Đơn");
        jButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(30, 210, 190, 60);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 44)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlks/Form/hinh/quanlikhachsan.png"))); // NOI18N
        jLabel1.setText("QUẢN LÝ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(60, 0, 560, 120);

        lbl_NameAccount.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_NameAccount.setForeground(new java.awt.Color(0, 51, 255));
        lbl_NameAccount.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(lbl_NameAccount);
        lbl_NameAccount.setBounds(480, 10, 90, 19);

        thoat.setBackground(new java.awt.Color(204, 204, 204));
        thoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlks/Form/hinh/Knob-Snapback-icon.png"))); // NOI18N
        thoat.setText("Đăng Xuất");
        thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thoatActionPerformed(evt);
            }
        });
        jPanel1.add(thoat);
        thoat.setBounds(480, 370, 120, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlks/Form/hinh/anhmenu.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 600, 400);

        jButton7.setText("jButton7");
        jPanel1.add(jButton7);
        jButton7.setBounds(160, 330, 79, 25);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public  void enable()
    {
        if (check == true && Name_Ac.equals("sys"))
        {jButton8.setEnabled(true);}
        if (check == true && Name_Ac.equals("hr"))
        {jButton8.setEnabled(false);}
    }
    private void jButtonnhanvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonnhanvienActionPerformed
        // TODO add your handling code here
        NhanVien_Form nvf = new NhanVien_Form();
        nvf.setVisible(true);
        nvf.pack();
        nvf.setLocationRelativeTo(null);
        nvf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButtonnhanvienActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        DichVu_Form dvf = new DichVu_Form();
        dvf.setVisible(true);
        dvf.pack();
        dvf.setLocationRelativeTo(null);
        dvf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code
        Phong_Form pf = new Phong_Form();
        pf.setVisible(true);
        pf.pack();
        pf.setLocationRelativeTo(null);
        pf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        KhachHang_Form khf = new KhachHang_Form();
        khf.setVisible(true);
        khf.pack();
        khf.setLocationRelativeTo(null);
        khf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here
        HoaDon_Form hdf = new HoaDon_Form();
        hdf.setVisible(true);
        hdf.pack();
        hdf.setLocationRelativeTo(null);
        hdf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thoatActionPerformed
        // TODO add your handling code here:
         thoat.setToolTipText("Click để quay lại chương trình ");
        int selected = JOptionPane.showConfirmDialog(this, "Bạn có muốn đăng xuất không?", "Thông báo", JOptionPane.YES_NO_OPTION);
        if (selected == JOptionPane.YES_OPTION) {
            this.dispose();
            DangNhap_Form ql = new DangNhap_Form();
                ql.setVisible(true);

        }
    }//GEN-LAST:event_thoatActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        QLThuePhong_Form pf = new QLThuePhong_Form();
        pf.setVisible(true);
        pf.pack();
        pf.setLocationRelativeTo(null);
        pf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        menu_hethong ql = new menu_hethong();
        ql.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    public void playSound() {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream
        (new File("C:\\Users\\Dell\\Desktop\\Oracle_DoAn_QLKS\\nhac.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
    }
    private void btn_nhacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nhacActionPerformed

        playSound();
    }//GEN-LAST:event_btn_nhacActionPerformed

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
            java.util.logging.Logger.getLogger(MENUFORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MENUFORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MENUFORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MENUFORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MENUFORM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_nhac;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButtonnhanvien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel lbl_NameAccount;
    private javax.swing.JButton thoat;
    // End of variables declaration//GEN-END:variables
}