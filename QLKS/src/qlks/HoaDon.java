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
public class HoaDon {
    private String MAHD;
    private String TENHD;
    private String MADV;
    private String MAKH;
    private Date NGAYLAP;
    private String MANV;
    private String SOPHONG;

    public HoaDon() {
    }

    public HoaDon(String MAHD, String TENHD, String MADV, String MAKH, Date NGAYLAP, String MANV, String SOPHONG) {
        this.MAHD = MAHD;
        this.TENHD = TENHD;
        this.MADV = MADV;
        this.MAKH = MAKH;
        this.NGAYLAP = NGAYLAP;
        this.MANV = MANV;
        this.SOPHONG = SOPHONG;
    }

    public String getMAHD() {
        return MAHD;
    }

    public void setMAHD(String MAHD) {
        this.MAHD = MAHD;
    }

    public String getTENHD() {
        return TENHD;
    }

    public void setTENHD(String TENHD) {
        this.TENHD = TENHD;
    }

    public String getMADV() {
        return MADV;
    }

    public void setMADV(String MADV) {
        this.MADV = MADV;
    }

    public String getMAKH() {
        return MAKH;
    }

    public void setMAKH(String MAKH) {
        this.MAKH = MAKH;
    }

    public Date getNGAYLAP() {
        return NGAYLAP;
    }

    public void setNGAYLAP(Date NGAYLAP) {
        this.NGAYLAP = NGAYLAP;
    }

    public String getMANV() {
        return MANV;
    }

    public void setMANV(String MANV) {
        this.MANV = MANV;
    }

    public String getSOPHONG() {
        return SOPHONG;
    }

    public void setSOPHONG(String SOPHONG) {
        this.SOPHONG = SOPHONG;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "MAHD=" + MAHD + ", TENHD=" + TENHD + ", MADV=" + MADV + ", MAKH=" + MAKH + ", NGAYLAP=" + NGAYLAP + ", MANV=" + MANV + ", SOPHONG=" + SOPHONG + '}';
    }
    
    
    
}
