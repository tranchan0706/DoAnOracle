/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlks;

/**
 *
 * @author khoa
 */
public class Phong {
    private String SOPHONG;
    private String LOAIPHONG;
    private int GIAPHONG;
    private String TINHTRANG;

    public Phong() {
    }

    public Phong(String SOPHONG, String LOAIPHONG, int GIAPHONG, String TINHTRANG) {
        this.SOPHONG = SOPHONG;
        this.LOAIPHONG = LOAIPHONG;
        this.GIAPHONG = GIAPHONG;
        this.TINHTRANG = TINHTRANG;
    }

    public String getSOPHONG() {
        return SOPHONG;
    }

    public void setSOPHONG(String SOPHONG) {
        this.SOPHONG = SOPHONG;
    }

    public String getLOAIPHONG() {
        return LOAIPHONG;
    }

    public void setLOAIPHONG(String LOAIPHONG) {
        this.LOAIPHONG = LOAIPHONG;
    }

    public int getGIAPHONG() {
        return GIAPHONG;
    }

    public void setGIAPHONG(int GIAPHONG) {
        this.GIAPHONG = GIAPHONG;
    }

    public String getTINHTRANG() {
        return TINHTRANG;
    }

    public void setTINHTRANG(String TINHTRANG) {
        this.TINHTRANG = TINHTRANG;
    }

    @Override
    public String toString() {
        return "Phong{" + "SOPHONG=" + SOPHONG + ", LOAIPHONG=" + LOAIPHONG + ", GIAPHONG=" + GIAPHONG + ", TINHTRANG=" + TINHTRANG + '}';
    }
    
    
    
}
