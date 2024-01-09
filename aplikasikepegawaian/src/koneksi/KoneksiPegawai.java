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
public class KoneksiPegawai {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    private String sql;
    public String id_pagawai;
    public String nama;
    public String tgl_lahir;
    public String jns_kelamin;
    public String alamat;
    
    public void simpan()throws SQLException {
        conn = config.configDB();
        sql = "INSERT INTO pegawai(id_pegawai,nama,tgl_lahir,jns_kelamin,alamat)VALUES(?,?,?,?,?)";
        pst = conn.prepareStatement(sql);
        pst.setString(1,id_pagawai);
        pst.setString(2, nama);
        pst.setString(3, tgl_lahir);
        pst.setString(4, jns_kelamin);
        pst.setString(5, alamat);
        pst.execute();
        pst.close();       
    }
    public void edit()throws SQLException {
        conn = config.configDB();
        sql = "INSERT INTO pegawai(id_pegawai,nama,tgl_lahir,jns_kelamin,alamat)VALUES(?,?,?,?,?)";
        pst = conn.prepareStatement(sql);
        pst.setString(1,id_pagawai);
        pst.setString(2, nama);
        pst.setString(3, tgl_lahir);
        pst.setString(4, jns_kelamin);
        pst.setString(5, alamat);
        pst.execute();
        pst.close();       
    }
    public void hapus()throws SQLException {
        conn = config.configDB();
        var sql = "DELETE from pegawai where id_pegawai=?";
        try{
            pst = conn.prepareStatement(sql);
            pst.setString(1, sql);
            pst.execute();
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public ResultSet Updatetbpegawai()throws SQLException {
        conn = config.configDB();
        sql = "select id_pegawai,nama,tgl_lahir,jns_kelamin,alamat";
        pst = conn.prepareStatement(sql);
        rs = pst.executeQuery();
        return rs;
    }
}
