/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlks;
import java.sql.DriverManager;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author khoa
 */
public class MyConnection {
    public static boolean checkdn = false;
    public static java.sql.Connection getConnection(String Hostname,String Port, String SID,String Username, String Password) {
        java.sql.Connection conn = null;
        java.sql.Statement st = null;
        java.sql.ResultSet rs = null;
        try {
            String url = "jdbc:oracle:thin:@"+Hostname+":"+Port+":"+SID;
            conn = DriverManager.getConnection(url, Username, Password);
            if (conn != null) {
                checkdn=true;
              System.out.println("Kết nối thành công");
            }
        } catch (Exception e) {
            System.out.println(Hostname+Port+SID+Username+Password);
            System.out.println("Kết nối không thành công");
            checkdn=false;
            e.printStackTrace();
             // TODO: handle exception
        }
        return conn;
    }
    
    public static void closeConnection(java.sql.Connection c) {
        try {
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        }
    }
    
    
}
