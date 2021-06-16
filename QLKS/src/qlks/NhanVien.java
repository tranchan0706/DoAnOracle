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
public class NhanVien {
    private String MANV;
    private String TENNV;
    private String CHUCVU;
    private int LUONGNV;
    private Date NGAYSINH;
    private String GIOITINH;
    private String MANQL;
    private String ANHNV;

    public NhanVien() {
    }

    public NhanVien(String MANV, String TENNV, String CHUCVU, int LUONGNV, Date NGAYSINH, String GIOITINH, String MANQL, String ANHNV) {
        this.MANV = MANV;
        this.TENNV = TENNV;
        this.CHUCVU = CHUCVU;
        this.LUONGNV = LUONGNV;
        this.NGAYSINH = NGAYSINH;
        this.GIOITINH = GIOITINH;
        this.MANQL = MANQL;
        this.ANHNV = ANHNV;
    }

    public String getMANV() {
        return MANV;
    }

    public void setMANV(String MANV) {
        this.MANV = MANV;
    }

    public String getTENNV() {
        return TENNV;
    }

    public void setTENNV(String TENNV) {
        this.TENNV = TENNV;
    }

    public String getCHUCVU() {
        return CHUCVU;
    }

    public void setCHUCVU(String CHUCVU) {
        this.CHUCVU = CHUCVU;
    }

    public int getLUONGNV() {
        return LUONGNV;
    }

    public void setLUONGNV(int LUONGNV) {
        this.LUONGNV = LUONGNV;
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

    public String getMANQL() {
        return MANQL;
    }

    public void setMANQL(String MANQL) {
        this.MANQL = MANQL;
    }

    public String getANHNV() {
        return ANHNV;
    }

    public void setANHNV(String ANHNV) {
        this.ANHNV = ANHNV;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "MANV=" + MANV + ", TENNV=" + TENNV + ", CHUCVU=" + CHUCVU + ", LUONGNV=" + LUONGNV + ", NGAYSINH=" + NGAYSINH + ", GIOITINH=" + GIOITINH + ", MANQL=" + MANQL + ", ANHNV=" + ANHNV + '}';
    }
    
    
}