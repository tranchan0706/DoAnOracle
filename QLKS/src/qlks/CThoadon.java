/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlks;

/**
 *
 * @author Dell
 */
public class CThoadon {
    private String MAHD;
    private String MADK;
    private int TONGTIEN;
    private String GHICHU;

    public CThoadon() {
    }

    public CThoadon(String MAHD, String MADK, int TONGTIEN, String GHICHU) {
        this.MAHD = MAHD;
        this.MADK = MADK;
        this.TONGTIEN = TONGTIEN;
        this.GHICHU = GHICHU;
    }

    public String getMAHD() {
        return MAHD;
    }

    public void setMAHD(String MAHD) {
        this.MAHD = MAHD;
    }

    public String getMADK() {
        return MADK;
    }

    public void setMADK(String MADK) {
        this.MADK = MADK;
    }

    public int getTONGTIEN() {
        return TONGTIEN;
    }

    public void setTONGTIEN(int TONGTIEN) {
        this.TONGTIEN = TONGTIEN;
    }

    public String getGHICHU() {
        return GHICHU;
    }

    public void setGHICHU(String GHICHU) {
        this.GHICHU = GHICHU;
    }

    @Override
    public String toString() {
        return "CThoadon{" + "MAHD=" + MAHD + ", MADK=" + MADK + ", TONGTIEN=" + TONGTIEN + ", GHICHU=" + GHICHU + '}';
    }
    
    
}
