/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;
import javax.swing.JOptionPane;
import java.sql.*;
/**
 *
 * @author USER
 */
public class KoneksiGaji {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    private String sql;
    public String id_gaji;
    public String nm_pegawai;
    public String jabatan;
    public String gapok;
    public String uang_makan;
    
    public void simpan()throws SQLException {
        conn = config.configDB();
        sql = "INSERT INTO gaji(id_gaji,nm_pegawai,jabatan,gapok,uang_makan)VALUES(?,?,?,?,?)";
        pst = conn.prepareStatement(sql);
        pst.setString(1,id_gaji);
        pst.setString(2, nm_pegawai);
        pst.setString(3, jabatan);
        pst.setString(4, gapok);
        pst.setString(5, uang_makan);
        pst.execute();
        pst.close();       
    }
    public void edit()throws SQLException {
        conn = config.configDB();
        sql = "INSERT INTO gaji(id_gaji,nm_pegawai,jabatan,gapok,uang_makan)VALUES(?,?,?,?,?)";
        pst = conn.prepareStatement(sql);
        pst.setString(1,id_gaji);
        pst.setString(2, nm_pegawai);
        pst.setString(3, jabatan);
        pst.setString(4, gapok);
        pst.setString(5, uang_makan);
        pst.execute();
        pst.close();       
    }
    public void hapus()throws SQLException {
        conn = config.configDB();
        var sql = "DELETE from gaji where id_gaji=?";
        try{
            pst = conn.prepareStatement(sql);
            pst.setString(1, sql);
            pst.execute();
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public ResultSet Updatetbgaji()throws SQLException {
        conn = config.configDB();
        sql = "select id_gaji,nm_pegawai,jabatan,gapok,uang_makan";
        pst = conn.prepareStatement(sql);
        rs = pst.executeQuery();
        return rs;
    }
}
