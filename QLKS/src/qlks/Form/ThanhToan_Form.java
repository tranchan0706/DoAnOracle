/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlks.Form;

import com.sun.media.jfxmediaimpl.MediaUtils;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.text.Document;
import qlks.CThoadon;
import qlks.DichVu;
import qlks.HoaDon;
import qlks.KhachHang;
import qlks.MyConnection;
import static qlks.MyConnection.getConnection;
import static qlks.Form.DangNhap_Form.Hostname;
import static qlks.Form.DangNhap_Form.Password;
import static qlks.Form.DangNhap_Form.Port;
import static qlks.Form.DangNhap_Form.SID;
import static qlks.Form.DangNhap_Form.Username;

public class ThanhToan_Form extends javax.swing.JFrame {

    public ThanhToan_Form() {
        initComponents();
        setLocationRelativeTo(null);
        hienthichitietthue();
        jButton3.setEnabled(false);
        enable();
        jTextField1.requestFocus();
        cbdichvu.removeAllItems();
        cbdichvu.setEnabled(false);
    }
    Vector title = new Vector();
    Vector data = new Vector();
    Connection con = null;
    Statement st = null;

    public void LoadDV() {
        cbdichvu.removeAllItems();

        ArrayList<DichVu> ds;
        ds = layDanhSachDichVu();
        for (DichVu a : ds) {
            Vector v = new Vector();
            v.add(a.getMADV());
            v.add(a.getTENDV());
            //add cb
            cbdichvu.addItem(a.getTENDV());

        }

    }

    public void TienDV() {
        ArrayList<DichVu> ds;
        ds = layDanhSachDichVu();
        for (DichVu a : ds) {
            if (a.getTENDV().equals(cbdichvu.getSelectedItem().toString())) {
                jTextFieldTIENDV.setText(String.valueOf(a.getGIADV()));
                cbdichvu.setEnabled(false);
                break;
            }
        }
    }

    public ArrayList<DichVu> layDanhSachDichVu() {
        ArrayList<DichVu> dsdv = new ArrayList<DichVu>();
        Connection con = getConnection(Hostname,Port,SID,Username,Password);
        try {
            st = (Statement) con.createStatement();
            String sql = "select * from hr.dichvu";
            // Thưcj thi câu lệnh truy vấn
            ResultSet rs = st.executeQuery(sql);

            DichVu dv;
            while (rs.next()) {
                dv = new DichVu(rs.getString("MADV"), rs.getString("TENDV"), rs.getInt("GIADV"), rs.getString("NGUOIQL"));
                //Thêm vào danh sách
                dsdv.add(dv);
            }
        } catch (Exception ex) {
            ex.printStackTrace();

        }
        return dsdv;
    }

    
    public void enable() {
        jTextFieldGIAMGIA.setRequestFocusEnabled(false);
        jTextFieldGIAPHONG.setRequestFocusEnabled(false);
        jTextFieldLOAIKH.setRequestFocusEnabled(false);
        jTextFieldMAHD.setRequestFocusEnabled(false);
        jTextFieldMAKH.setRequestFocusEnabled(false);
        jTextFieldSONGAY.setRequestFocusEnabled(false);
        jTextFieldSOPHONG.setRequestFocusEnabled(false);
        jTextFieldTIENDV.setRequestFocusEnabled(false);
        jTextFieldTIENPHONG.setRequestFocusEnabled(false);
        jTextFieldTONGTIEN.setRequestFocusEnabled(false);
        jTextFieldTONGTIENDV.setRequestFocusEnabled(false);
        
    }

    public void hienthichitietthue() {
        title.clear();
        data.clear();
        title.add("Mã HD");
        title.add("Số Phòng");
        title.add("Mã Khách");
        title.add("Số Ngày");
        title.add("Giá Phòng");
        title.add("Ghi Chú");
        title.add("Loại Khách");
        title.add("Mã Đăng ký");
        Connection con = getConnection(Hostname,Port,SID,Username,Password);
        try {
            st = (Statement) con.createStatement();
            String sql = "select c.mahd,t.sophong,t.makh,songay,p.giaphong,c.ghichu,k.loaikh,c.madk\n"
                    + "from hr.thuephong t join hr.CTHoadon c on t.madk=c.madk\n"
                    + "                 join hr.hoadon h on c.mahd=h.mahd\n"
                    + "                 join hr.Phong p on p.sophong= t.sophong"
                    + "                 join hr.khachhang k on h.makh=k.makh";
            System.out.print(sql);
            // Thưc thi câu lệnh truy vấn
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                v.add(rs.getString(5));
                v.add(rs.getString(6));
                v.add(rs.getString(7));
                v.add(rs.getString(8));
                data.add(v);
            }
        } catch (Exception ex) {
            ex.printStackTrace();

        }

        jTableTHANHTOAN.setModel(new DefaultTableModel(data, title));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_thue = new javax.swing.JButton();
        thoat = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldGIAPHONG = new javax.swing.JTextField();
        jTextFieldSONGAY = new javax.swing.JTextField();
        jTextFieldMAKH = new javax.swing.JTextField();
        jTextFieldSOPHONG = new javax.swing.JTextField();
        jTextFieldMAHD = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldLOAIKH = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldTIENDV = new javax.swing.JTextField();
        jTextFieldTIENPHONG = new javax.swing.JTextField();
        jTextFieldTONGTIEN = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbdichvu = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldGIAMGIA = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextFieldTONGTIENDV = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTHANHTOAN = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 102));

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setForeground(new java.awt.Color(0, 204, 204));

        txt_thue.setBackground(new java.awt.Color(255, 255, 0));
        txt_thue.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txt_thue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlks/Form/hinh/thanhtoan.png"))); // NOI18N
        txt_thue.setText("THANH TOÁN");
        txt_thue.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_thue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_thueActionPerformed(evt);
            }
        });

        thoat.setBackground(new java.awt.Color(204, 204, 204));
        thoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlks/Form/hinh/Knob-Snapback-icon.png"))); // NOI18N
        thoat.setText("Quay Lại");
        thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thoatActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Chi Tiết"));

        jLabel3.setText("Mã HD");

        jLabel4.setText("Số Phòng");

        jLabel9.setText("Mã Khách");

        jLabel10.setText("Số Ngày Thuê");

        jLabel5.setText("Giá Phòng");

        jLabel11.setText("Loại Khách");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel11)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextFieldLOAIKH)
                                .addGap(1, 1, 1))
                            .addComponent(jTextFieldGIAPHONG, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldSONGAY, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldMAKH, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldSOPHONG, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldMAHD, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldMAHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSOPHONG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldMAKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldSONGAY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldGIAPHONG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldLOAIKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Thành Tiền"));

        jLabel8.setText("Tiền dịch vụ");

        jTextFieldTIENDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTIENDVActionPerformed(evt);
            }
        });

        jLabel12.setText("Tổng tiền");

        jLabel7.setText("Tiền phòng");

        cbdichvu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbdichvu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbdichvuMouseClicked(evt);
            }
        });
        cbdichvu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbdichvuActionPerformed(evt);
            }
        });

        jLabel2.setText("Chọn dịch vụ");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlks/Form/hinh/tongtien.png"))); // NOI18N
        jButton1.setText("Tổng Tiền");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel13.setText("Giảm Giá");

        jLabel6.setText("+");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("-");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("=");

        jLabel16.setText("______________________________________________");

        jButton2.setText("Load");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Thêm");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextFieldTONGTIENDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTONGTIENDVActionPerformed(evt);
            }
        });

        jLabel17.setText("Tổng Tiền DV");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel7))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldTONGTIEN, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldTONGTIENDV, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextFieldTIENPHONG, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                                        .addComponent(jTextFieldGIAMGIA, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(32, 32, 32)
                                .addComponent(cbdichvu, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel16)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel15))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel17)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6))
                                .addComponent(jLabel14))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(36, 36, 36)
                                .addComponent(jTextFieldTIENDV, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbdichvu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(9, 9, 9))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldTIENDV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldTONGTIENDV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldTIENPHONG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jLabel14)
                .addGap(3, 3, 3)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextFieldGIAMGIA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTONGTIEN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(13, 13, 13)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlks/Form/hinh/âsasasasasa.png"))); // NOI18N
        jLabel1.setText("THANH TOÁN");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTableTHANHTOAN.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableTHANHTOAN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTHANHTOANMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTableTHANHTOANMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(jTableTHANHTOAN);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(77, 77, 77)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(txt_thue, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118)
                        .addComponent(thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_thue, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(thoat))
                                .addGap(25, 25, 25))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void xoathanhtoan()
    {
        int i = jTableTHANHTOAN.getSelectedRow();
        TableModel model = jTableTHANHTOAN.getModel();
        Connection con = getConnection(Hostname,Port,SID,Username,Password);
        try {
            // Tạo một đối tượng để thực hiện công việc
            st = (Statement) con.createStatement();
            String query = "delete from hr.cthoadon\n"
                    + "where mahd='"+jTextFieldMAHD.getText()+"' and madk='"+model.getValueAt(i, 7).toString()+"'";
            String xoa_hd = "DELETE FROM hr.hoadon WHERE MAHD = '" + jTextFieldMAHD.getText() + "'";
            String xoa_dk = "DELETE FROM hr.thuephong WHERE madk = '" + model.getValueAt(i, 7).toString() + "'";
            String traphong = "update hr.phong set tinhtrang='CON TRONG' where sophong='" + jTextFieldSOPHONG.getText() + "'";
            System.out.print(query);
            
            st.executeUpdate(query);
            st.executeUpdate(xoa_hd);
            st.executeUpdate(xoa_dk);
            st.executeUpdate(traphong);
            
            hienthichitietthue();
            JOptionPane.showMessageDialog(rootPane, "Thanh Toán Thành Công =))");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Thanh Toán Thất Bại =((");
            //ex.printStackTrace();
        }
    }
    private void txt_thueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_thueActionPerformed
        int pos = jTableTHANHTOAN.getSelectedRow();
        if (pos < 0) {
            JOptionPane.showMessageDialog(rootPane, "Bạn Hãy Chọn 1 dòng để thanh toán");
        } else {
            if (jTextFieldTONGTIEN.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Vui lòng tính tổng tiền");
            } else {

                inHD();
                xoathanhtoan();
                Xuat_File frm = new Xuat_File();
                frm.setVisible(true);
            }
        }
    }//GEN-LAST:event_txt_thueActionPerformed

    private void thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thoatActionPerformed
        // TODO add your handling code here:
        thoat.setToolTipText("Click để quay lại chương trình ");
        int selected = JOptionPane.showConfirmDialog(this, "Bạn có muốn quay lại không?", "Thông báo", JOptionPane.YES_NO_OPTION);
        if (selected == JOptionPane.YES_OPTION) {
            this.dispose();

        }
    }//GEN-LAST:event_thoatActionPerformed

    private void jTableTHANHTOANMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTHANHTOANMouseClicked
        // TODO add your handling code here:

        int i = jTableTHANHTOAN.getSelectedRow();
        TableModel model = jTableTHANHTOAN.getModel();
        Connection con = getConnection(Hostname,Port,SID,Username,Password);
        jTextFieldTONGTIEN.setText("");
        jTextFieldMAHD.setText(model.getValueAt(i, 0).toString());
        jTextFieldSOPHONG.setText(model.getValueAt(i, 1).toString());
        jTextFieldMAKH.setText(model.getValueAt(i, 2).toString());
        jTextFieldSONGAY.setText(model.getValueAt(i, 3).toString());
        jTextFieldGIAPHONG.setText(model.getValueAt(i, 4).toString());
        jTextFieldLOAIKH.setText(model.getValueAt(i, 6).toString());
        int a = Integer.parseInt(jTextFieldSONGAY.getText());
        int b = Integer.parseInt(jTextFieldGIAPHONG.getText());
        String c = String.valueOf(a * b);
        jTextFieldTIENPHONG.setText(c);
        String lp = jTextFieldLOAIKH.getText().toString();
        if (lp.equals("VIP")) {
            int tp = Integer.parseInt(c);
            int gg = tp * 15 / 100;
            jTextFieldGIAMGIA.setText(String.valueOf(gg));
        } else if (lp.equals("THAN THIET")) {
            int tp = Integer.parseInt(c);
            int gg = tp * 5 / 100;
            jTextFieldGIAMGIA.setText(String.valueOf(gg));
        } else {
            int tp = Integer.parseInt(c);
            int gg = 0 * tp;
            jTextFieldGIAMGIA.setText(String.valueOf(gg));
        }

    }//GEN-LAST:event_jTableTHANHTOANMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (jTextFieldTONGTIENDV.getText().equals("")) {
            int b = Integer.parseInt(jTextFieldTIENPHONG.getText());
            int c = Integer.parseInt(jTextFieldGIAMGIA.getText());
            String d = String.valueOf( b - c);
            jTextFieldTONGTIEN.setText(d);
        } else {
            int a = Integer.parseInt(jTextFieldTONGTIENDV.getText());
            int b = Integer.parseInt(jTextFieldTIENPHONG.getText());
            int c = Integer.parseInt(jTextFieldGIAMGIA.getText());
            String d = String.valueOf(a + b - c);
            jTextFieldTONGTIEN.setText(d);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbdichvuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbdichvuMouseClicked
        // TODO add your handling code here:
        jButton3.setEnabled(true);
        TienDV();
    }//GEN-LAST:event_cbdichvuMouseClicked

    private void jTextFieldTIENDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTIENDVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTIENDVActionPerformed

    private void cbdichvuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbdichvuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbdichvuActionPerformed

    private void jTableTHANHTOANMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTHANHTOANMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableTHANHTOANMouseEntered

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        cbdichvu.setEnabled(true);
        
                LoadDV();
    }//GEN-LAST:event_jButton2ActionPerformed
    public void load_tongtiendv(int c)
    {
        jTextFieldTONGTIENDV.setText(String.valueOf(c));
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jButton3.setEnabled(false);
        jTextField1.requestFocus();
        if(jTextFieldTONGTIENDV.getText().equals(""))
        {
            jTextFieldTONGTIENDV.setText(jTextFieldTIENDV.getText().toString());
            
        }else{
        int a = Integer.parseInt(jTextFieldTIENDV.getText());
        int b = Integer.parseInt(jTextFieldTONGTIENDV.getText());
        int c = a+b;
        
        load_tongtiendv(c);
        
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextFieldTONGTIENDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTONGTIENDVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTONGTIENDVActionPerformed

    public static String MaHD;
    public static String SOPHONG;
    public static String MAKH;
    public static String SONGAYTHUE;
    public static String GIAPHONG;
    public static String LOAIKH;
    public static String TIENDV;
    public static String TIENP;
    public static String GIAMGIA;
    public static String TONGTIEN;
    public void inHD()
    {
        MaHD=jTextFieldMAHD.getText();
        SOPHONG=jTextFieldSOPHONG.getText();
        MAKH=jTextFieldMAKH.getText();
        SONGAYTHUE=jTextFieldSONGAY.getText();
        GIAPHONG=jTextFieldGIAPHONG.getText();
        LOAIKH=jTextFieldLOAIKH.getText();
        TIENDV=jTextFieldTIENDV.getText();
        TIENP=jTextFieldTIENPHONG.getText();
        GIAMGIA=jTextFieldGIAMGIA.getText();
        TONGTIEN=jTextFieldTONGTIEN.getText();
    }
    public static void main(String args[]) throws IOException {

        /////////////////////////////////////////////////////////////////////////////////////////////
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ThanhToan_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThanhToan_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThanhToan_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThanhToan_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThanhToan_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbdichvu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTHANHTOAN;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldGIAMGIA;
    private javax.swing.JTextField jTextFieldGIAPHONG;
    private javax.swing.JTextField jTextFieldLOAIKH;
    private javax.swing.JTextField jTextFieldMAHD;
    private javax.swing.JTextField jTextFieldMAKH;
    private javax.swing.JTextField jTextFieldSONGAY;
    private javax.swing.JTextField jTextFieldSOPHONG;
    private javax.swing.JTextField jTextFieldTIENDV;
    private javax.swing.JTextField jTextFieldTIENPHONG;
    private javax.swing.JTextField jTextFieldTONGTIEN;
    private javax.swing.JTextField jTextFieldTONGTIENDV;
    private javax.swing.JButton thoat;
    private javax.swing.JButton txt_thue;
    // End of variables declaration//GEN-END:variables
}
