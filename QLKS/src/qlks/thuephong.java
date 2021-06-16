/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package qlks;
import java.util.Date;
/**
 *
 * @author Hieu
 */
public class thuephong {
    private String MADK;
    private String MAKH;
    private String SOPHONG;
    private Date NGAYDK;
    private Date NGAYDI;
    private int SONGAY;

    public thuephong() {
    }

    public thuephong(String MADK, String MAKH, String SOPHONG, Date NGAYDK, Date NGAYDI, int SONGAY) {
        this.MADK = MADK;
        this.MAKH = MAKH;
        this.SOPHONG = SOPHONG;
        this.NGAYDK = NGAYDK;
        this.NGAYDI = NGAYDI;
        this.SONGAY = SONGAY;
    }

    public String getMADK() {
        return MADK;
    }

    public void setMADK(String MADK) {
        this.MADK = MADK;
    }

    public String getMAKH() {
        return MAKH;
    }

    public void setMAKH(String MAKH) {
        this.MAKH = MAKH;
    }

    public String getSOPHONG() {
        return SOPHONG;
    }

    public void setSOPHONG(String SOPHONG) {
        this.SOPHONG = SOPHONG;
    }

    public Date getNGAYDK() {
        return NGAYDK;
    }

    public void setNGAYDK(Date NGAYDK) {
        this.NGAYDK = NGAYDK;
    }

    public Date getNGAYDI() {
        return NGAYDI;
    }

    public void setNGAYDI(Date NGAYDI) {
        this.NGAYDI = NGAYDI;
    }

    public int getSONGAY() {
        return SONGAY;
    }

    public void setSONGAY(int SONGAY) {
        this.SONGAY = SONGAY;
    }

    @Override
    public String toString() {
        return "thuephong{" + "MADK=" + MADK + ", MAKH=" + MAKH + ", SOPHONG=" + SOPHONG + ", NGAYDK=" + NGAYDK + ", NGAYDI=" + NGAYDI + ", SONGAY=" + SONGAY + '}';
    }
    
    
    
    
}
