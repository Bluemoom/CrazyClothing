/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect;

import controller.RegisterServlet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sunny
 */
// lớp kết nối CSDL
public class DBConnect {

    public static Connection getSQLServerConnection()
            throws SQLException, ClassNotFoundException {

        String hostName = "localhost";
        String sqlInstanceName = "SQLEXPRESS";
        String database = "CrazyClothing";
        String userName = "CrazyClothing";
        String password = "Thuan1714";

        return getSQLServerConnection1(hostName, sqlInstanceName,
                database, userName, password);

    }

    public static Connection getSQLServerConnection1(String hostname, String sqlInstanceName, String database, String username, String password) throws ClassNotFoundException, SQLException {
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
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
//    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//      String hostName = "localhost";
//      String sqlInstanceName = "SQLEXPRESS";
//      String database = "CrazyClothing";
//      String userName = "CrazyClothing";
//      String password = "Thuan1714";
//        System.out.println(getSQLServerConnection1(hostName, sqlInstanceName,database, userName, password));
//    }

    public static String sinhMa(String table, String ColumName) throws SQLException, ClassNotFoundException {
        Connection conn = getSQLServerConnection();
        String _matruoc = "";

        String query = "Select Top 1 * from " + table + " order by " + ColumName + " desc";
        try {
            Statement st = null;
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                _matruoc = rs.getString(""+ColumName+"");
            }
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(RegisterServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        String ma = "";

        if (_matruoc == null || _matruoc == "") {
            _matruoc = "100000";

        } else if (_matruoc == "999999") {
            return null;
        }
        ma = Integer.toString(Integer.parseInt(_matruoc) + 1);
        return ma;
    }
}
