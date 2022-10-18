package com.javatpoint;
import javax.servlet.*;
import java.sql.*;

public class MyListener implements ServletContextListener{

	public void contextInitialized(ServletContextEvent arg0) {
		int status=0;
		Connection con=null;
	
      try{
		
  System.out.println("else if part table does not exist new table has created"+status);
		PreparedStatement ps3=con.prepareStatement("CREATE SEQUENCE javatpoint MINVALUE 1 MAXVALUE 999999999999 INCREMENT BY 1 START WITH 1 NOCACHE  NOORDER  NOCYCLE");
		ps3.executeUpdate();
		
		PreparedStatement ps=con.prepareStatement("CREATE TABLE  NEWMEMBER(ID NUMBER,USERNAME VARCHAR2(4000),PASSWORD VARCHAR2(4000),REPASSWORD VARCHAR2(4000),PHONE NUMBER, ADDERESS VARCHAR2(4000),SYD VARCHAR2(4000),PRIMARY KEY (ID))");
		ps.executeUpdate();
		
		PreparedStatement ps2=con.prepareStatement("CREATE TABLE  NEWSTAFFMEMBER(ID NUMBER,USERNAME VARCHAR2(4000),PASSWORD VARCHAR2(4000),REPASSWORD VARCHAR2(4000),PHONE NUMBER, ADDERESS VARCHAR2(4000),SYD VARCHAR2(4000),PRIMARY KEY (ID))");
		ps2.executeUpdate();
		
	
		
		ps5.executeUpdate();
	
		ps5 = con.prepareStatement("Insert into BOOKDETAILS values(?,?,?)");
		ps5.setInt(1,101);
	    ps5.setString(2,"math");
		ps5.setString(3,"desuja");
		ps5.executeUpdate();
		
	int ar1[] = { 1, 5, 10, 20, 40, 80 };
        int ar2[] = { 6, 7, 20, 80, 100 };
        int ar3[] = { 3, 4, 15, 20, 30, 70, 80, 120 };
        
        int i = 0, j = 0, k = 0;
        
        while (i < ar1.length && j < ar2.length
                && k < ar3.length) {
             // If x = y and y = z, print any of them and
             // move ahead in all arrays
             if (ar1[i] == ar2[j] && ar2[j] == ar3[k]) {
                 System.out.print(ar1[i] + " ");
                 i++;
                 j++;
                 k++;
             }
		
		
		
		}
	    catch(Exception e){e.printStackTrace();}
	    }
	    public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("project undeployed");
		
	}
}
