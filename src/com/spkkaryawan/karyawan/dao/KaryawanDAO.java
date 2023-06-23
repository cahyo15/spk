/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spkkaryawan.karyawan.dao;

import BaseDAO.BaseDAO;
import com.spkkaryawan.karyawan.model.Karyawan;
//import com.spkkaryawan.login.model.Login;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author ikayu
 */
public interface KaryawanDAO extends BaseDAO {
    
    int save(Karyawan karyawan) throws SQLException;
    int update(Karyawan karyawan) throws SQLException;
    int delete(String karyawanNo) throws SQLException;
    List<Karyawan> search() throws SQLException;
    int deleteChild(Long karyawanId) throws SQLException;
    
//    List<Login> search(Long karyawanId) throws SQLException;
    Karyawan findById(Long karyawanId) throws SQLException;
    Karyawan findByUk(String karyawanNo) throws SQLException;
}
