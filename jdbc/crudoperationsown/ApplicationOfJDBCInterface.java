package com.evergent.java.jdbc.crudOperation;
import java.sql.DriverManager;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
public interface ApplicationOfJDBCInterface {
   int  insert(ApplicationBean ab);
   int update(ApplicationBean ab);
    void read();
    int delete(ApplicationBean ab);
    void exit();
    
}
