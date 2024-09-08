package com.evergent.java.jdbc.crudOperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class ImplementationClassOfAJDBC implements ApplicationOfJDBCInterface{
	Connection con=null;
	PreparedStatement pstmt=null;
	Statement st=null;
	String query;
	public int  insert(ApplicationBean ab) {
		int empId;
		String empName;
		double sal;
		try {
		con=ApplicationDB.getConnection();
	    query="insert into employee9 values(?,?,?)";
		pstmt=con.prepareStatement(query);
		pstmt.setInt(1,ab.getEmpId());
		pstmt.setString(2,ab.getEmpName());
		pstmt.setDouble(3,ab.getSal());
		int updateCount = pstmt.executeUpdate();
		con.close();
		return updateCount;
		}
		catch(Exception e){
			return 0;
		}
		
	}
     public int update(ApplicationBean ab) {
    	try {
    		con=ApplicationDB.getConnection();
    	    query="insert into employee9 values(?,?,?)";
    		pstmt=con.prepareStatement(query);
    		pstmt.setInt(1,ab.getEmpId());
    		pstmt.setString(2,ab.getEmpName());
    		pstmt.setDouble(3,ab.getSal());
    		int updateCount = pstmt.executeUpdate();
    		con.close();
    		return updateCount;
    		}
    		catch(Exception e){
    			return 0;
    		}
    		
    	}
      public void read() {
    	try{
    		con=ApplicationDB.getConnection();
            Statement stmt = con.createStatement();                
            ResultSet rs=stmt.executeQuery("Select * from employee9");
                while(rs.next()){
          	 System.out.println("Employee No :" + rs.getInt(1));
               System.out.println("Employee Name :" + rs.getString("ename"));
          	   System.out.println("Employee sal :"+rs.getInt(3));
            }
          con.close();
         }
        catch (Exception e){
          e.printStackTrace();
        }  
       }
       public  int delete(ApplicationBean ab) {
    	   try {
    		   con=ApplicationDB.getConnection();
	               String query1="delete from employee9 where no = ?";
		          //PreparedStatement pstmt1=(PreparedStatement)con.prepareStatement(query1);
					PreparedStatement pstmt1=con.prepareStatement(query1);	
				    pstmt1.setInt(1,ab.getEmpId());
					int a=pstmt1.executeUpdate();
					return a;
    	   }
    	   catch(Exception e)
    	   {
    		   return 0;
    	   }
    	
    }
    public void exit() {
    	System.exit(0);
    	
    }
	

}
