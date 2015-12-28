/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author sunny
 */
public class DBConnect {
    public static Connection getSQLServerConnection()
          throws SQLException, ClassNotFoundException {

      String hostName = "localhost";
      String sqlInstanceName = "SQLEXPRESS";
      String database = "CrazyClothing";
      String userName = "Java";
      String password = "Thuan1714";
 
      return getSQLServerConnection1(hostName, sqlInstanceName,
              database, userName, password);
    
}
    public static Connection getSQLServerConnection1(String hostname, String sqlInstanceName, String database, String username, String password) throws ClassNotFoundException, SQLException
    {
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        // Cấu trúc URL Connection dành cho SQLServer
      // Ví dụ:
      // jdbc:sqlserver://ServerIp:1433/SQLEXPRESS;databaseName=simplehr
      String connectionURL = "jdbc:sqlserver://" + hostname + ":1433"
              + ";instance=" + sqlInstanceName + ";databaseName=" + database;
 
      conn = DriverManager.getConnection(connectionURL, username,
              password);
        }
        catch(Exception e){
        e.printStackTrace();}
      return conn;
    }
//    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//      String hostName = "localhost";
//      String sqlInstanceName = "SQLEXPRESS";
//      String database = "CrazyClothing";
//      String userName = "Java";
//      String password = "Thuan1714";
//        System.out.println(getSQLServerConnection(hostName, sqlInstanceName,
//              database, userName, password));
//    }
    
}
