/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spkkaryawan.login.repository;

import com.spkkaryawan.login.model.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class LoginImpl implements LoginRepository {
    
    private Connection con = null;
    private ResultSet rs = null;
    private PreparedStatement pst = null;

    @Override
    public int save(Login login)
            throws SQLException {
        int result =0;
        
        int index = lastIndex();
        
        String sql = "insert into login(id,karyawan,email, username, password, status, role) " +
                "values (?, ?, ?, ?, ?, ?)";
        
        
        
        pst = con.prepareStatement(sql);
        pst.setInt(1, index);
//        pst.setLong(1,login.getKaryawan().getKarywanId());
//        pst.setLong(1, 122);
        pst.setString(2, login.getEmail());
        pst.setString(3, login.getUsername());
        pst.setString(4, login.getPassword());
        pst.setString(5, login.getStatus());
        pst.setString(6, login.getRole());
        
        result = pst.executeUpdate();
        
        pst.close();
        
        return result;
    }
    
    private int lastIndex() {
        int result = 0;
        try {
            
            
            String sql = "select LAST_INSERT_ID() from tabel_karyawan";
            
            pst = con.prepareStatement(sql);
            
            rs = pst.executeQuery();
            
            if(rs.next()) {
                result = rs.getInt(1);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(LoginImpl.class.getName()).
                    log(Level.SEVERE,
                    null,
                    ex);
        }
        return result;
    }

    @Override
    public void connection(Connection con)
            throws SQLException {
        this.con = con;
    }
    
}
