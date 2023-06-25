/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spkkaryawan.parameter.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ikayu
 */
public class Parameter {

    private String paramCode;
    private String paramName;
    private String deskripsi;
    
    
    public Parameter(){}

    public Parameter(String paramCode, String paramName, String deskripsi) {
        this.paramCode = paramCode;
        this.paramName = paramName;
        this.deskripsi = deskripsi;
    }
    
    
    public Parameter(String paramCode) {
        this.paramCode = paramCode;
    }
    
    
    private List<ParameterDetail> details = new ArrayList<ParameterDetail>();

    public List<ParameterDetail> getDetails() {
        return details;
    }

    public void setDetails(List<ParameterDetail> details) {
        this.details = details;
    }
    
    public String getParamCode() {
        return paramCode;
    }

    public void setParamCode(String paramCode) {
        this.paramCode = paramCode;
    }

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

}
