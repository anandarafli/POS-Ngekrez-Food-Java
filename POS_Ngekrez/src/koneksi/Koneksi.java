package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Koneksi {
    private static Connection mysqlconfig;
    
    public static Connection configDB() throws SQLException {
        try {
            // URL Database, pastikan nama database sesuai dengan yang di phpMyAdmin
            String url = "jdbc:mysql://localhost:3306/db_ngekrez_pos"; 
            String user = "root"; // Default user XAMPP
            String pass = "";     // Default password XAMPP kosong
            
            // Mendaftarkan driver dan membuat koneksi
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig = DriverManager.getConnection(url, user, pass);
            
        } catch (Exception e) {
            System.err.println("Koneksi Gagal: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Koneksi Database Gagal: " + e.getMessage());
        }
        return mysqlconfig;
    }
}