/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlks;

import java.util.Date;

/**
 *
 * @author khoa
 */
public class KhachHang {
    private String MAKH;
    private String TENKH;
    private Date NGAYSINH;
    private String GIOITINH;
    private String CMND;
    private String QUOCTICH;
    private String SDT;
    private String LOAIKH; 

    public KhachHang() {
    }

    public String getMAKH() {
        return MAKH;
    }

    public void setMAKH(String MAKH) {
        this.MAKH = MAKH;
    }

    public String getTENKH() {
        return TENKH;
    }

    public void setTENKH(String TENKH) {
        this.TENKH = TENKH;
    }

    public Date getNGAYSINH() {
        return NGAYSINH;
    }

    public void setNGAYSINH(Date NGAYSINH) {
        this.NGAYSINH = NGAYSINH;
    }

    public String getGIOITINH() {
        return GIOITINH;
    }

    public void setGIOITINH(String GIOITINH) {
        this.GIOITINH = GIOITINH;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getQUOCTICH() {
        return QUOCTICH;
    }

    public void setQUOCTICH(String QUOCTICH) {
        this.QUOCTICH = QUOCTICH;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getLOAIKH() {
        return LOAIKH;
    }

    public void setLOAIKH(String LOAIKH) {
        this.LOAIKH = LOAIKH;
    }

    public KhachHang(String MAKH, String TENKH, Date NGAYSINH, String GIOITINH, String CMND, String QUOCTICH, String SDT, String LOAIKH) {
        this.MAKH = MAKH;
        this.TENKH = TENKH;
        this.NGAYSINH = NGAYSINH;
        this.GIOITINH = GIOITINH;
        this.CMND = CMND;
        this.QUOCTICH = QUOCTICH;
        this.SDT = SDT;
        this.LOAIKH = LOAIKH;
    }

    @Override
    public String toString() {
        return "KhachHang{" + "MAKH=" + MAKH + ", TENKH=" + TENKH + ", NGAYSINH=" + NGAYSINH + ", GIOITINH=" + GIOITINH + ", CMND=" + CMND + ", QUOCTICH=" + QUOCTICH + ", SDT=" + SDT + ", LOAIKH=" + LOAIKH + '}';
    }
    
}
