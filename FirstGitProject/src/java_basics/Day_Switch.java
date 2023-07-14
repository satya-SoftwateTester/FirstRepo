package java_basics;

import java.util.Scanner;

public class Day_Switch {

	public static void main(String[] args) 
	{
		String day;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your day");
		day=sc.nextLine();
		sc.close();
		switch(day) 
		{
		case "monday":
			System.out.println("uff it is a weekday");
			break;
		case "tuesday":
			System.out.println("uff it is a weekday");
			break;
		case "wedenesday":
			System.out.println("uff it is a weekday");
			break;
			
		case "thurseday":
			System.out.println("uff it is a weekday");
			break;
			
		case "friday":
			System.out.println("uff it is a weekday");
			break;
			
		case "saturday":
			System.out.println("uff it is a weekend");
			break;
			
		case "sunday":
			System.out.println("uff it is weekend");
			break;
			
			
			default:
				System.out.println("invalid days");
		}

	}

}
