/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseDAO;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author ikayu
 */
public interface BaseDAO {
    
    String URL = "jdbc:mysql://localhost/spk_karyawan";
    String USER = "root";
    String PWD ="";
    String JDBC = "com.mysql.jdbc.Driver";
    
    void connection(Connection con) throws SQLException;
    
}
