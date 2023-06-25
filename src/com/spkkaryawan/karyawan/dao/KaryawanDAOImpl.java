/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spkkaryawan.karyawan.dao;

import com.spkkaryawan.karyawan.model.Karyawan;
import com.spkkaryawan.login.model.Login;
import com.spkkaryawan.parameter.model.Parameter;
import com.spkkaryawan.parameter.model.ParameterDetail;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ikayu
 */
public class KaryawanDAOImpl implements KaryawanDAO, Serializable {

    private Connection con = null;
    private ResultSet rs = null;
    private PreparedStatement pst = null;
    
      @Override
    public void connection(Connection con) throws SQLException {
       this.con = con;
    }
    
    
    @Override
    public int save(Karyawan karyawan) throws SQLException {
      int result = 0;
     
        
            String sql = "insert into tabel_karyawan(karyawan_no, nama, no_hp, address, birth_place, birth_date, gender)"
                    + "values(?, ?, ?, ?, ?, ?, ?)";
           pst = con.prepareStatement(sql);
           pst.setString(1, karyawan.getKaryawanNo());
           pst.setString(2, karyawan.getKaryawanName());
           pst.setString(3, karyawan.getBirthPlace());
           pst.setDate(4, new java.sql.Date(karyawan.getBirthDate().getTime()));
           pst.setString(5, karyawan.getGender().getDetailCode());
           
           result = pst.executeUpdate();
           
           pst.close();
        
        return result;
    }

    @Override
    public int update(Karyawan karyawan) throws SQLException {
        int result = 0;
        
        String sql = "update karyawan set "
                + "nama = ?, "
                + "no_hp = ?, "
                + "address = ?, "
                + "birth_place = ?, "
                + "birth_date = ?, "
                + "gender = ? "
                + "where karyawan_no = ?";
        pst = con.prepareStatement(sql);
        
        pst.setString(1, karyawan.getKaryawanName());
        pst.setString(2, karyawan.getNoHp());
        pst.setString(3, karyawan.getAddress());
        pst.setString(4, karyawan.getBirthPlace());
        pst.setDate(5, new java.sql.Date(karyawan.getBirthDate().getTime()));
        pst.setString(6, karyawan.getGender().getDetailCode());
        pst.setString(7, karyawan.getKaryawanNo());
        
        result = pst.executeUpdate();
        
         pst.close();
        return result;
    }

    @Override
    public int delete(String karyawanNo) throws SQLException {
        int result = 0;
        
        String sql = "delete from tabel_karyawan where karyawan_no = ?";
        
        pst = con.prepareStatement(sql);
        
        pst.setString(1, karyawanNo);
        
        result = pst.executeUpdate();
        
         pst.close();
        return result;
    }

    @Override
    public Karyawan findById(Long karyawanId) throws SQLException {
        Karyawan karyawan = null;
        
        String sql = "select * from tabel_karyawan where karyawan_id = ?";
        
        pst = con.prepareStatement(sql);
        pst.setLong(1, karyawanId);
        
        rs = pst.executeQuery();
        if(rs.next()) {
            karyawan.setKaryawanNo(rs.getString("karyawan_no"));
            karyawan.setKaryawanName(rs.getString("nama"));
            karyawan.setAddress(rs.getString("address"));
            karyawan.setBirthPlace(rs.getString("birth_place"));
            karyawan.setBirthDate(rs.getDate("birth_date"));
            karyawan.setGender(new ParameterDetail(rs.getString("detail_code"), new Parameter(rs.getString("param_code")), rs.getString("param_value")));
        }
         pst.close();
        return karyawan;
    }

    @Override
    public Karyawan findByUk(String karyawanNo) throws SQLException {
      
         Karyawan karyawan = null;
        
        String sql = "select * from tabel_karyawan where karyawan_no = ?";
        
        pst = con.prepareStatement(sql);
        pst.setString(1, karyawanNo);
        
        rs = pst.executeQuery();
        if(rs.next()) {
            karyawan = new Karyawan();
             karyawan.setKaryawanNo(rs.getString("karyawan_no"));
            karyawan.setKaryawanName(rs.getString("nama"));
            karyawan.setAddress(rs.getString("address"));
            karyawan.setBirthPlace(rs.getString("birth_place"));
            karyawan.setBirthDate(rs.getDate("birth_date"));
            karyawan.setGender(new ParameterDetail(rs.getString("detail_code"), new Parameter(rs.getString("param_code")), rs.getString("param_value")));
        }
         pst.close();
        return karyawan;
    }
    

    @Override
    public List<Karyawan> search() throws SQLException {
       
        String sql = "select * from tabel_karyawan";
        List<Karyawan> result = new ArrayList<Karyawan>();
        
        pst = con.prepareStatement(sql);
        
        rs = pst.executeQuery();
        
        while(rs.next()) {
            Karyawan karyawan = new Karyawan();
            karyawan.setKaryawanNo(rs.getString("karyawan_no"));
            karyawan.setKaryawanName(rs.getString("nama"));
            karyawan.setAddress(rs.getString("address"));
            karyawan.setBirthPlace(rs.getString("birth_place"));
            karyawan.setBirthDate(rs.getDate("birth_date"));
            karyawan.setGender(new ParameterDetail(rs.getString("detail_code"), new Parameter(rs.getString("param_code")), rs.getString("param_value")));
            
            result.add(karyawan);
            
        }
        
         pst.close();
        return result;
    }

    @Override
    public int deleteChild(Long karyawanId) throws SQLException {
        int result =0;
        
        String sql = "delete from login where karyawan_id = ?";
        
        pst = con.prepareStatement(sql);
        
        result = pst.executeUpdate();
        
         pst.close();
        return result;
    }

  
    
}
