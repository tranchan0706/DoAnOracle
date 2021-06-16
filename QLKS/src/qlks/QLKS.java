/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlks;

import static qlks.MyConnection.getConnection;
import static qlks.Form.DangNhap_Form.Hostname;
import static qlks.Form.DangNhap_Form.Password;
import static qlks.Form.DangNhap_Form.Port;
import static qlks.Form.DangNhap_Form.SID;
import static qlks.Form.DangNhap_Form.Username;

/**
 *
 * @author khoa
 */
public class QLKS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        getConnection(Hostname,Port,SID,Username,Password);
        
        
    }
    
}
