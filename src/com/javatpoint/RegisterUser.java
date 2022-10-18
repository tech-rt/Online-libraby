package com.javatpoint;
import java.sql.*;
public class RegisterUser {
static int status=0;
//int accountno=1;
public static int register(String username,String password,String repassword,double phone,String adderess,String syd){
	//public static int register(String email,String password,String gender,String country,String name){

	Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of array");
		int a = sc.nextInt();
		int[] arr = new int[a];

		System.out.println("Enter the array");

		for (int i = 0; i < a; i++) {
			arr[i] = sc.nextInt();
		} 
		
		int index1 = 0;
		int index2 = 0;
		
		for (int i = a-2; i >= 0; i--) {
			if (arr[i] < arr[i+1]) {
				index1 = i;
				break;
			}
		}
		
		for (int i = a-1; i >= 0; i--) {
			if (arr[i] > arr[index1]) {
				index2 = i;
				break;
			}
		}
	
		//swap
		int tempindex;
		tempindex = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = tempindex;
		
		//reverse
		int temp;
		int nul = index1 +1;
		int b = a-1;
       
       while (nul < b)
       {
           temp = arr[nul];
           arr[nul] = arr[b];
           arr[b] = temp;
           nul++;
           b--;
       }
		
		System.out.println("the new array");

		for (int i = 0; i < a; i++) {
			System.out.print(arr[i]);
		} 

	}

	
	Connection con=GetCon.getCon();
	PreparedStatement ps;
	try {
		ps = con.prepareStatement("Insert into NEWMEMBER values(?,?,?,?,?,?,?)");
		int	nextvalue1=GetCon.getPrimaryKey();
	 	ps.setInt(1,nextvalue1);
	    ps.setString(2,username);
		ps.setString(3,password);
		ps.setString(4,repassword);
		ps.setDouble(5,phone);
		ps.setString(6,adderess);
		ps.setString(7,syd);
			
		status=ps.executeUpdate();
		System.out.println(status);
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	return status;
	
}
}
