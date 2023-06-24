package com.spkkaryawan.parameter.dao;

import BaseDAO.BaseDAO;
import com.spkkaryawan.parameter.model.Parameter;

import java.sql.SQLException;
import java.util.List;

public interface ParameterDAO extends BaseDAO {

    int save (Parameter parameter) throws SQLException;
    int update (Parameter parameter) throws SQLException;
    int delete (String paramCode) throws SQLException;
    List<Parameter> search() throws SQLException;
    Parameter findById(String paramCode) throws SQLException;
    int deleteChild(String paramCode) throws SQLException;
}
