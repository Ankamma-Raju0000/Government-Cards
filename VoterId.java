package com;

import java.util.Random;
import java.util.Scanner;

public class VoterId 
{
		static Random r = new Random();
		static long voterNum=r.nextLong();
		public static VoterId v;
		
		private VoterId() {
			
		}
		public static void voterObject()
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
			if(u.getAge()>=18)
			{
				if(v==null)
				{
					v=new VoterId();
					System.out.println("Voter Id Created Successfully.......");
					u.userInfo();
					System.out.println("Your Voter Id number : "+voterNum);
					System.out.println("**********************************************");
				}
				else
				{
					System.out.println("Voter Id Alredy Exist");
				}
			}
			else
			{
				System.out.println("You are not elegible to applay Voter Id");
			}
		}
}
