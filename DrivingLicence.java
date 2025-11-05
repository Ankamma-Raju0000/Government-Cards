package com;

import java.util.Random;
import java.util.Scanner;

public class DrivingLicence 
{
	    static Random r = new Random();
		static long licenceCardNum=r.nextLong();
		public static DrivingLicence d=null;
		private DrivingLicence()
		{
			
		}
		public static void createDrivingLicence()
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
			System.out.println("Enter vehcil Brand");
			String brand =sc.next();
			System.out.println("Enter Vechil Color");
			String color=sc.next();
			System.out.println("Enter your vehchil number");
			String vehchilNum=sc.next();
			System.out.println("Enter chasi number ");
			long chasiNum=sc.nextLong();
			System.out.println("Enter number of wheels");
			int numOfveels=sc.nextInt();
			User u = new User(name,age,mobile,gender,location,fName);
			Vehicle c = new Vehicle(brand,color,vehchilNum,chasiNum,numOfveels);
			if(u.getAge()>=18)
			{
				if(d==null)
				{
					d = new DrivingLicence();
					System.out.println("Driving licence created");
					System.out.println("Licence Card number : "+licenceCardNum);
					u.userInfo();
					System.out.println("*******************************************");
				}
				else
				{
					System.out.println("Driving licence already exist");
				}
			}
			else
			{
				System.out.println("You are not eligible for apply Driving Licence");
			}
		}
	}
