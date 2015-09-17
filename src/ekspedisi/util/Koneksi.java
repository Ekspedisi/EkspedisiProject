/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ekspedisi.util;

import java.sql.*;

/**
 *
 * @author M Arif Royanto
 */
public class Koneksi {
    private static String path = null;
    private static String url_db = null;
    private static String username = null;
    private static String password = null;
    public static Connection conn = null;
    public static Connection createConnection(){
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            path  = new java.io.File("DBEkspedisi.accdb").getAbsolutePath();
            url_db = "jdbc:ucanaccess://"+path;
            username= "admin";
            password= " ";
            conn = DriverManager.getConnection(url_db, path, password);
            //conn = DriverManager.getConnection(url_db);
            System.out.println("Koneksi Database Sukses");
            
        }
        catch(ClassNotFoundException e){
            System.out.println(e.getMessage() + " a");
            System.exit(0);
        }
        catch(SQLException e){
            System.out.println(e.getMessage()+" b");
            System.exit(0);
        }
        
        return conn;
    }
    
    public static Connection getConnection(){
        return conn;
    }
    
    public static void closeConnection(){
        try{
            conn.close();
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }
}
