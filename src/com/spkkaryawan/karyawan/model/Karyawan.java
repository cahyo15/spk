/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spkkaryawan.karyawan.model;

import com.spkkaryawan.parameter.model.ParameterDetail;
import com.spkkaryawan.login.model.Login;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ikayu
 */
public class Karyawan {
    
    private Long karywanId;
    private String karyawanNo;
    private String karyawanName;
    private String noHp;
    private String address;
    private String birthPlace;
    private Date birthDate;
    private ParameterDetail gender;
    
    private List<Login> logins = new ArrayList<Login>();
    
    
    public Karyawan(){}

    public Karyawan(Long karywanId, String karyawanNo, String karyawanName, String noHp, String address, String birthPlace, Date birthDate, ParameterDetail gender) {
        this.karywanId = karywanId;
        this.karyawanNo = karyawanNo;
        this.karyawanName = karyawanName;
        this.noHp = noHp;
        this.address = address;
        this.birthPlace = birthPlace;
        this.birthDate = birthDate;
        this.gender = gender;
    }
    
    public Karyawan(String karyawanNo) {
        this.karyawanNo = karyawanNo;
    }

    public Long getKarywanId() {
        return karywanId;
    }

    public void setKarywanId(Long karywanId) {
        this.karywanId = karywanId;
    }

    public String getKaryawanNo() {
        return karyawanNo;
    }

    public void setKaryawanNo(String karyawanNo) {
        this.karyawanNo = karyawanNo;
    }

    public String getKaryawanName() {
        return karyawanName;
    }

    public void setKaryawanName(String karyawanName) {
        this.karyawanName = karyawanName;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public ParameterDetail getGender() {
        return gender;
    }

    public void setGender(ParameterDetail gender) {
        this.gender = gender;
    }

    public List<Login> getLogins() {
        return logins;
    }

    public void setLogins(List<Login> logins) {
        this.logins = logins;
    }
    
    
    
}
