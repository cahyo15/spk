/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spkkaryawan.login.model;

import com.spkkaryawan.karyawan.model.Karyawan;
import java.io.Serializable;

/**
 *
 * @author ikayu
 */
public class Login {
    
    private Long idLogin;
    private Karyawan karyawan;
    private String email;
    private String username;
    private String password;
    private String password2;
    private String status;
    private String role;

    public Login(Long idLogin,
            Karyawan karyawan,
            String email,
            String username,
            String password,
            String password2,
            String status,
            String role) {
        this.idLogin = idLogin;
        this.karyawan = karyawan;
        this.email = email;
        this.username = username;
        this.password = password;
        this.password2 = password2;
        this.status = status;
        this.role = role;
    }

    public Login(Karyawan karyawan,
            String email,
            String username,
            String password,
            String password2,
            String status,
            String role) {
        this.karyawan = karyawan;
        this.email = email;
        this.username = username;
        this.password = password;
        this.password2 = password2;
        this.status = status;
        this.role = role;
    }

    public Login(String email,
            String username,
            String password,
            String status,
            String role) {
        this.email = email;
        this.username = username;
        this.password = password;
        this.status = status;
        this.role = role;
    }

    public Login() {
        
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }
    
    

    public Long getIdLogin() {
        return idLogin;
    }

    public void setIdLogin(Long idLogin) {
        this.idLogin = idLogin;
    }

    public Karyawan getKaryawan() {
        return karyawan;
    }

    public void setKaryawan(Karyawan karyawan) {
        this.karyawan = karyawan;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    
    
    
    
    
}
