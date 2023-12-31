/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spkkaryawan.karyawan.service;

import com.spkkaryawan.karyawan.dao.KaryawanDAO;
import com.spkkaryawan.karyawan.dao.KaryawanDAOImpl;
import com.spkkaryawan.karyawan.model.Karyawan;
import connection.Koneksi;
import java.util.List;
import utility.ServiceException;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class KaryawanServiceImpl implements KaryawanService {
    
    private Connection con;
    private final KaryawanDAO karyawanDAO = new KaryawanDAOImpl();

    @Override
    public int save(Karyawan karyawan)
            throws ServiceException {
       int result = 0;
        try {
            
            con = Koneksi.getDatabase();
            karyawanDAO.connection(con);
            
            result = karyawanDAO.save(karyawan);
            
            con.setAutoCommit(false);
            con.commit();
            con.setAutoCommit(true);
        }catch(SQLException e) {
            
           try {
               con.rollback();
                con.setAutoCommit(true);
                
                throw new ServiceException("Can't insert data employed", e);
                
           } catch (SQLException ex) {
               Logger.getLogger(KaryawanServiceImpl.class.getName()).
                       log(Level.SEVERE,
                       null,
                       ex);
           }
            
        } finally {
            
           try {
               con.close();
           } catch (SQLException ex) {
               Logger.getLogger(KaryawanServiceImpl.class.getName()).
                       log(Level.SEVERE,
                       null,
                       ex);
           }
        }
        
        return result;
    }

    @Override
    public int edit(Karyawan karyawan)
            throws ServiceException {
        int result = 0;
        Karyawan exist = null;
        try {
            
            con = Koneksi.getDatabase();
            karyawanDAO.connection(con);
            
            exist = karyawanDAO.findByUk(karyawan.getKaryawanNo());
            
            result = karyawanDAO.update(exist);
            
            con.setAutoCommit(false);
            con.commit();
            con.setAutoCommit(true);
        }catch(SQLException e) {
            
           try {
               con.rollback();
                con.setAutoCommit(true);
                
                throw new ServiceException("Can't update data employed", e);
                
           } catch (SQLException ex) {
               Logger.getLogger(KaryawanServiceImpl.class.getName()).
                       log(Level.SEVERE,
                       null,
                       ex);
           }
            
        } finally {
            
           try {
               con.close();
           } catch (SQLException ex) {
               Logger.getLogger(KaryawanServiceImpl.class.getName()).
                       log(Level.SEVERE,
                       null,
                       ex);
           }
        }
        
        return result;
    }

    @Override
    public int delete(String karyawanNo)
            throws ServiceException {
                int result = 0;
                
                Karyawan karyawan = null;
        try {
            
            con = Koneksi.getDatabase();
            karyawanDAO.connection(con);
            
            karyawan = karyawanDAO.findByUk(karyawanNo);
            
            
            karyawanDAO.deleteChild(karyawan.getKarywanId());
            result = karyawanDAO.delete(karyawanNo);
            
            con.setAutoCommit(false);
            con.commit();
            con.setAutoCommit(true);
        }catch(SQLException e) {
            
           try {
               con.rollback();
                con.setAutoCommit(true);
                
                throw new ServiceException("Can't delete data employed", e);
                
           } catch (SQLException ex) {
               Logger.getLogger(KaryawanServiceImpl.class.getName()).
                       log(Level.SEVERE,
                       null,
                       ex);
           }
            
        } finally {
            
           try {
               con.close();
           } catch (SQLException ex) {
               Logger.getLogger(KaryawanServiceImpl.class.getName()).
                       log(Level.SEVERE,
                       null,
                       ex);
           }
        }
        
        return result;
    }

    @Override
    public List<Karyawan> search()
            throws ServiceException {
       List<Karyawan> karyawan = null;
               
      try {
            
            con = Koneksi.getDatabase();
            karyawanDAO.connection(con);
            
            karyawan = karyawanDAO.search();

            con.setAutoCommit(false);
            con.commit();
            con.setAutoCommit(true);
        }catch(SQLException e) {
            
           try {
               con.rollback();
                con.setAutoCommit(true);
                
                throw new ServiceException("Can't search data employed", e);
                
           } catch (SQLException ex) {
               Logger.getLogger(KaryawanServiceImpl.class.getName()).
                       log(Level.SEVERE,
                       null,
                       ex);
           }
            
        } finally {
            
           try {
               con.close();
           } catch (SQLException ex) {
               Logger.getLogger(KaryawanServiceImpl.class.getName()).
                       log(Level.SEVERE,
                       null,
                       ex);
           }
        }
      
      return karyawan;
    }

    @Override
    public Karyawan findById(Long karyawanId)
            throws ServiceException {
        
        Karyawan karyawan = null;
        
        try {
            
            con = Koneksi.getDatabase();
            karyawanDAO.connection(con);
            
            karyawan = karyawanDAO.findById(karyawanId);

            con.setAutoCommit(false);
            con.commit();
            con.setAutoCommit(true);
        }catch(SQLException e) {
            
           try {
               con.rollback();
                con.setAutoCommit(true);
                
                throw new ServiceException("Can't search by id employed", e);
                
           } catch (SQLException ex) {
               Logger.getLogger(KaryawanServiceImpl.class.getName()).
                       log(Level.SEVERE,
                       null,
                       ex);
           }
            
        } finally {
            
           try {
               con.close();
           } catch (SQLException ex) {
               Logger.getLogger(KaryawanServiceImpl.class.getName()).
                       log(Level.SEVERE,
                       null,
                       ex);
           }
        }
        
        return karyawan;
    }

    @Override
    public Karyawan findByUk(String karyawanNo)
            throws ServiceException {
         Karyawan karyawan = null;
        
        try {
            
            con = Koneksi.getDatabase();
            karyawanDAO.connection(con);
            
            karyawan = karyawanDAO.findByUk(karyawanNo);

            con.setAutoCommit(false);
            con.commit();
            con.setAutoCommit(true);
        }catch(SQLException e) {
            
           try {
               con.rollback();
                con.setAutoCommit(true);
                
                throw new ServiceException("Can't search by number employed", e);
                
           } catch (SQLException ex) {
               Logger.getLogger(KaryawanServiceImpl.class.getName()).
                       log(Level.SEVERE,
                       null,
                       ex);
           }
            
        } finally {
            
           try {
               con.close();
           } catch (SQLException ex) {
               Logger.getLogger(KaryawanServiceImpl.class.getName()).
                       log(Level.SEVERE,
                       null,
                       ex);
           }
        }
        
        return karyawan;
    }
    
}
