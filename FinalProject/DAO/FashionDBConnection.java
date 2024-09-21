package com.evergent.corejava.DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class FashionDBConnection {
    public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/fashiondb", "root", "admin");
    }
}
