package com.evergent.java.jdbc.crudOperation;

import java.sql.Connection;
import java.sql.DriverManager;

public class ApplicationDB {
	 public static Connection getConnection()throws Exception {
     String url = "jdbc:mysql://localhost:3306/";
     String dbName = "evergentdb";
     String driverName = "com.mysql.jdbc.Driver";
     String userName = "root";
     String password = "admin";
     Class.forName(driverName);
     Connection conn = DriverManager.getConnection(url+dbName, userName, password);
     return conn;
	 }


}
