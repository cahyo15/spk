/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spkkaryawan.parameter.model;

/**
 *
 * @author ikayu
 */
public class ParameterDetail {
    
    private String detailCode;
    private Parameter paramCode;
    private String detailName;
    private String paramValue;
    
    
    public ParameterDetail(){}

    public ParameterDetail(String detailCode, Parameter paramCode, String detailName, String paramValue) {
        this.detailCode = detailCode;
        this.paramCode = paramCode;
        this.detailName = detailName;
        this.paramValue = paramValue;
    }

       public ParameterDetail(String detailCode, Parameter paramCode, String detailName) {
        this.detailCode = detailCode;
        this.paramCode = paramCode;
        this.detailName = detailName;
       
    }

    public ParameterDetail(String detailCode) {
        this.detailCode = detailCode;
    }
    

    public String getDetailCode() {
        return detailCode;
    }

    public void setDetailCode(String detailCode) {
        this.detailCode = detailCode;
    }

    public Parameter getParamCode() {
        return paramCode;
    }

    public void setParamCode(Parameter paramCode) {
        this.paramCode = paramCode;
    }

    public String getDetailName() {
        return detailName;
    }

    public void setDetailName(String detailName) {
        this.detailName = detailName;
    }

    public String getParamValue() {
        return paramValue;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue;
    }
    
    
    
}
