package connection;

import static BaseDAO.BaseDAO.JDBC;
import static BaseDAO.BaseDAO.PWD;
import static BaseDAO.BaseDAO.URL;
import static BaseDAO.BaseDAO.USER;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
 
public class Koneksi {
  private static Connection database;
    public static Connection getDatabase() {
        
     if(database == null ) {
         try {
//             String url;
//             url=("jdbc:mysql://localhost:3306/paud08");
//             String username = "root";
//             String password = "";
             DriverManager.registerDriver(new com.mysql.jdbc.Driver());
             database=DriverManager.getConnection(URL, USER,PWD);
         }catch (SQLException t) {
             JOptionPane.showMessageDialog(null, "Tidak Ada Koneksi");
         }
     }return database;   
    }static Object getConnection() {
    throw new UnsupportedOperationException("Yes Implentasi");
}
    
}