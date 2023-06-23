/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spkkaryawan.karyawan.service;

import com.spkkaryawan.karyawan.model.Karyawan;
import java.util.List;
import utility.ServiceException;

/**
 *
 * @author ASUS
 */
public interface KaryawanService {
    
    
    int save(Karyawan karyawan) throws ServiceException;
    int edit(Karyawan karyawan) throws ServiceException;
    int delete(String karyawanNo) throws ServiceException;
    
   List<Karyawan> search() throws ServiceException;
   
   Karyawan findById(Long karyawanId) throws ServiceException;
   Karyawan findByUk(String karyawanNo) throws ServiceException;
    
}
