package QL_BanGao.dao;

import java.sql.CallableStatement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Connection {
      String url="jdbc:sqlserver://localhost:1433;databaseName=QL_BanGao";
      public static String user ="hr";
      public static String pass ="123";
      public static Connection conn;
      Statement statement = null;
      public Connection Connect()
      {
          try {
              conn = (Connection) DriverManager.getConnection(url, user,pass);
              return conn;
           
          } catch (Exception e) {
               return null;
          }
      }

    CallableStatement prepareCall(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
