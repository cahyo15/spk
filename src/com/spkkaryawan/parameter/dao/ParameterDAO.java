/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spkkaryawan.parameter.dao;

import com.spkkaryawan.parameter.model.Parameter;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author ASUS
 */
public interface ParameterDAO {
    
    
    int save(Parameter parameter) throws SQLException;
    int update(Parameter parameter) throws SQLException;
    int delete (String paramCode) throws SQLException;
    int deleteChild(String paramCode) throws SQLException;
    
    List<Parameter> search()throws SQLException;
    
    Parameter findById(String paramCode) throws SQLException;
    
}
