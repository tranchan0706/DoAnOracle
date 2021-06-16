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
public class DichVu {
    private String MADV;
    private String TENDV;
    private int GIADV;
    private String NGUOIQL;

    public DichVu() {
    }

    public DichVu(String MADV, String TENDV, int GIADV, String NGUOIQL) {
        this.MADV = MADV;
        this.TENDV = TENDV;
        this.GIADV = GIADV;
        this.NGUOIQL = NGUOIQL;
    }

    public DichVu(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getMADV() {
        return MADV;
    }

    public void setMADV(String MADV) {
        this.MADV = MADV;
    }

    public String getTENDV() {
        return TENDV;
    }

    public void setTENDV(String TENDV) {
        this.TENDV = TENDV;
    }

    public int getGIADV() {
        return GIADV;
    }

    public void setGIADV(int GIADV) {
        this.GIADV = GIADV;
    }

    public String getNGUOIQL() {
        return NGUOIQL;
    }

    public void setNGUOIQL(String NGUOIQL) {
        this.NGUOIQL = NGUOIQL;
    }

    @Override
    public String toString() {
        return "DichVu{" + "MADV=" + MADV + ", TENDV=" + TENDV + ", GIADV=" + GIADV + ", NGUOIQL=" + NGUOIQL + '}';
    }
    
    
}
