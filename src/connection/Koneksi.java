package connection;

import static BaseDAO.BaseDAO.JDBC;
import static BaseDAO.BaseDAO.PWD;
import static BaseDAO.BaseDAO.URL;
import static BaseDAO.BaseDAO.USER;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
 
public class Koneksi {
    public static Connection con;
    public static Statement stm;
    public static void main(String args[]){
        try {
//            String url;
//            url = 
//            String user="root";
//            String pass="";
            Class.forName(JDBC);
            con =DriverManager.getConnection(URL, USER, PWD);
            stm = con.createStatement();
            System.out.println("koneksi berhasil;");
        } catch (Exception e) {
            System.err.println("koneksi gagal" +e.getMessage());
        }
    }
    
}