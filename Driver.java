package com;

import java.util.Scanner;

public class Driver 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		boolean start=true;				
		while(start)
		{
			System.out.println("Choose from below \n1.AadharCard \n2.PanCard \n3.VoterId \n4.Driving Licence \n5.Exit");
			int choice=sc.nextInt();
			switch (choice)
			{
			case 1:
			{
				AadharCard.aadharObject();
				break;
			}
			case 2:
			{
				PanCard.panObject();
				break;
			}
			case 3:
			{
				VoterId.voterObject();
				break;
			}
			case 4:
			{
				System.out.println("You need to answer some question");
				System.out.println("Question 1: What is meaning of red color in signal");
				String red=sc.next();
				if(red.equals("stop") || red.equals("Stop"))
				{
					System.out.println("Correct anser");
					System.out.println("Question 2: What is the meaning of orange color in signal");
					String orange =sc.next();
					if(orange.equals("slow") || orange.equals("Slow"))
					{
						System.out.println("Correct anser");
						System.out.println("Question 3: What is the meaning of green color in signal");
						String green =sc.next();
						if(green.equals("Go") || green.equals("go"))
						{
							System.out.println("Correct anser");
							System.out.println("Please provide yoyr details");
							DrivingLicence.createDrivingLicence();
							break;
						}
						else
						{
							System.out.println(" wrong answer ,the meaning of green is go & your not elgible for apply licence");
							break;
						}
						
					}
					else
					{
						System.out.println(" wrong answer ,the meaning of orange is slow & your not elgible for apply licence");
						break;
					}
				}
				else
				{
					System.out.println(" wrong answer ,the meaning of red is stop & your not elgible for apply licence");
					break;
				}
			}
			case 5:
			{
				System.out.println("Thank you for choosing us");
				start=false;
				break;
			}
			default :
			{
				System.out.println("Choose a valid option");
			}
		}
	    }
	}
}


