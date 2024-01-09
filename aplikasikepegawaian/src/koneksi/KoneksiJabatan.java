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
public class KoneksiJabatan {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    private String sql;
    public String id_jabatan;
    public String nm_jabatan;
    public String gapok_jabatan;
    
     public void simpan()throws SQLException {
        conn = config.configDB();
        sql = "INSERT INTO jabatan(id_jabatan,nm_jabatan,gapok_jabatan)VALUES(?,?,?)";
        pst = conn.prepareStatement(sql);
        pst.setString(1,id_jabatan);
        pst.setString(2, nm_jabatan);
        pst.setString(3, gapok_jabatan);
        pst.execute();
        pst.close();       
    }
    public void edit()throws SQLException {
        conn = config.configDB();
        sql = "INSERT INTO jabatan(id_jabatan,nm_jabatan,gapok_jabatan)VALUES(?,?,?)";
        pst = conn.prepareStatement(sql);
        pst.setString(1,id_jabatan);
        pst.setString(2, nm_jabatan);
        pst.setString(3, gapok_jabatan);
        pst.close();       
    }
    public void hapus()throws SQLException {
        conn = config.configDB();
        var sql = "DELETE from jabatan where id_jabatan=?";
        try{
            pst = conn.prepareStatement(sql);
            pst.setString(1, sql);
            pst.execute();
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public ResultSet Updatetbjabatan()throws SQLException {
        conn = config.configDB();
        sql = "select id_jabatan,nm_jabatan,gapok_jabatan";
        pst = conn.prepareStatement(sql);
        rs = pst.executeQuery();
        return rs;
    }
}
