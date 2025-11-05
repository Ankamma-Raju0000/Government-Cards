package com;

import java.util.Random;
import java.util.Scanner;

public class AadharCard 
{
		static Random r = new Random();
		static long aadharNum=r.nextLong();
		public static AadharCard a;
		
		private AadharCard() {
			
		}
		public static void aadharObject()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter User name");
			String name =sc.next();
			System.out.println("Enter Your age");
			int age=sc.nextInt();
			System.out.println("Enter your mobile number");
			long mobile=sc.nextLong();
			System.out.println("Enter your Gender");
			String gender=sc.next();
			System.out.println("Enter location");
			String location=sc.next();
			System.out.println("Enter father name");
			String fName=sc.next();
			User u = new User(name,age,mobile,gender,location,fName);
			if(a==null)
			{
				a=new AadharCard();
				System.out.println("Adhar card created successfully");
				u.userInfo();
				System.out.println("Aadhar Number : "+aadharNum);
				System.out.println("*************************************");
			}
			else
			{
				System.out.println("Adhar Card Already Exist");
			}
		}
}

