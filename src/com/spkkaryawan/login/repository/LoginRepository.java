/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spkkaryawan.login.repository;

import BaseDAO.BaseDAO;
import com.spkkaryawan.login.model.Login;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public interface LoginRepository extends BaseDAO {
    
    int save (Login login) throws SQLException;
    
}
