package com.javatpoint;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class verifyLogin2 {

public static boolean checkLogin(String username,String password){
	boolean status=false;
	Connection con=GetCon.getCon();
	try {
		//PreparedStatement ps=con.prepareStatement("Select * from MAILCASTINGUSER where EMAILADD = ? and PASSWORD =?");
		PreparedStatement ps=con.prepareStatement("Select * from LIBRARYADMIN where username = ? and password = ?");
		//ps.setInt(1,accountno);
		ps.setString(1,username);
		ps.setS\
			Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of array");
		int a = sc.nextInt();
		int[] arr = new int[a];

		System.out.println("Enter the array");

		for (int i = 0; i < a; i++) {
			arr[i] = sc.nextInt();
		} 
		
		int sum = 0;
		int max = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			
			sum = sum + arr[i];			
			if(sum < 0)
				sum = 0;
			if(sum> max)
				max = sum;
			}
		
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return status;
}
}
