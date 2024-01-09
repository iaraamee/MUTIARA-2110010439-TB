/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author USER
 */
public class config {
    public static void main(String[] args) {
        try {
            Connection connection = config.configDB();
            
            // Lakukan operasi lainnya dengan koneksi di sini
            
            // Pastikan untuk menutup koneksi setelah digunakan
            if (connection != null) {
                connection.close();
                System.out.println("Koneksi Berhasil");
            }
        } catch (SQLException e) {
            System.err.println("Gagal mendapatkan koneksi: " + e.getMessage());
        }
    }
    private static Connection mysqlconfig;
    public static Connection configDB() throws SQLException{
        try {
            String url = "jdbc:mysql://localhost:3306/db_kepegawian";
            String user = "root";
            String pass = "";
             Class.forName("com.mysql.cj.jdbc.Driver");
             mysqlconfig =  DriverManager.getConnection(url, user, pass);
        }
        catch (ClassNotFoundException | SQLException e){
            System.err.println("koneksi gagal"+e.getMessage());
        }
        return mysqlconfig;
    }
    
}
