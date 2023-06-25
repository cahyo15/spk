/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spkkaryawan.karyawan.controller;

import com.spkkaryawan.karyawan.model.Karyawan;
import com.spkkaryawan.karyawan.service.KaryawanService;
import com.spkkaryawan.karyawan.service.KaryawanServiceImpl;
import java.util.List;
import utility.ServiceException;

/**
 *
 * @author ASUS
 */
public class KaryawanController {
    
    
    private KaryawanService karyawanService = null;
    
    public KaryawanController() {
        karyawanService = new KaryawanServiceImpl();
    }
    
    public  void tes() {
        List<Karyawan> karyawan = null;
        
        try {
            
            karyawan = karyawanService.search();
            
            for(Karyawan kr : karyawan) {
                
                System.out.printf("%s %s %s %n", kr.getKaryawanNo(), kr.getKaryawanName(), kr.getBirthDate());
                
            }
            
        }catch(ServiceException e) {
            e.printStackTrace();
        }
    }

}
