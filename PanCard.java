package com;

import java.util.Random;
import java.util.Scanner;

public class PanCard 
{
	    static Random r = new Random();
		static long panCardNum=r.nextLong();
		public static PanCard p;
		
		private PanCard() {
			
		}
		public static void panObject()
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
				if(p==null)
				{
					p=new PanCard();
					System.out.println("Pan Card Created Successfully......");
					u.userInfo();
					System.out.println("Your PanCard number : "+panCardNum);
					System.out.println("*******************************************");
				}
				else
				{
					System.out.println("Pan Card Already Exist");
				}
			}
			else
			{
				System.out.println("You are not eligible to apply Pan Card");
			}
		}
}
