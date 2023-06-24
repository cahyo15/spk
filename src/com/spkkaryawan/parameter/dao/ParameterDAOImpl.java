/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spkkaryawan.parameter.dao;

import com.spkkaryawan.parameter.model.Parameter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class ParameterDAOImpl implements ParameterDAO {
    
    private Connection con = null;
    private PreparedStatement pst = null;
    private ResultSet rs = null;
    
    
      @Override
    public void connection(Connection con)
            throws SQLException {
       this.con = con;
    }

    @Override
    public int save(Parameter parameter)
            throws SQLException {
        
        int result = 0;
        
        String sql = "insert into paramter (param_code, nama_parameter, deskripsi) " +
                "values (?, ?, ?)";
        
        pst = con.prepareStatement(sql);
        
        pst.setString(1, parameter.getParamCode());
        pst.setString(2,
                parameter.getDeskripsi());
        pst.setString(3,
                parameter.getParamName());
        
        result = pst.executeUpdate();
        
        return result;
        
    }

    @Override
    public int update(Parameter parameter)
            throws SQLException {
        
        int result = 0;
        
        String sql = "update paramter set " +
                "nama_parameter = ?, " +
                "deskripsi = ? " +
                "where param_code = ?";
        
        pst = con.prepareStatement(sql);
        
        pst.setString(1,
                parameter.getParamName());
        pst.setString(2, parameter.getDeskripsi());
        pst.setString(3,
                parameter.getParamCode());
        
        result = pst.executeUpdate();
        
        return result;
    }

    @Override
    public int delete(String paramCode)
            throws SQLException {
        
        int result = 0;
        
        
        String sql = "delete from parameter where param_code = ?";
        
        pst = con.prepareStatement(sql);
        
        pst.setString(1,
                paramCode);
        
        result = pst.executeUpdate();
        return result;
        
    }

    @Override
    public List<Parameter> search()
            throws SQLException {
       
        List<Parameter> paramList = new ArrayList<Parameter>();
        
        String sql = "select * from parameter";
        
        pst = con.prepareStatement(sql);
        
        rs = pst.executeQuery();
        
        while(rs.next()) {
            Parameter parameter = new Parameter();
            
            parameter.setParamCode(rs.getString("param_code"));
            parameter.setParamName(rs.getString("nama_parameter"));
            parameter.setDeskripsi(rs.getString("deskripsi"));
            
            paramList.add(parameter);
            
        }
        
        
        return paramList;
        
    }

    @Override
    public Parameter findById(String paramCode)
            throws SQLException {
        
        Parameter parameter = null;
        
        String sql = "select * from parameter where param_code = ?";
        
        pst = con.prepareStatement(sql);
        
        pst.setString(1, paramCode);
        rs = pst.executeQuery();
        
        
        if(rs.next()) {
            
            parameter.setParamCode(rs.getString("param_code"));
            parameter.setParamName(rs.getString("nama_parameter"));
            parameter.setDeskripsi(rs.getString("deskripsi"));
            
           
            
        }
        
        return parameter;
    }

    @Override
    public int deleteChild(String paramCode)
            throws SQLException {
       
        int result = 0;
        
        String sql = "delete from parameterDetail where param_code = ?";
        
        pst = con.prepareStatement(sql);
        
        pst.setString(1,
                paramCode);
         
        return result;
    }

  
    
}
