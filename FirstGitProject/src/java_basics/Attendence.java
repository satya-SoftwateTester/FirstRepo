package java_basics;

import java.util.Scanner;

public class Attendence {

	public static void main(String[] args)
	{
		int class_hold;
		int class_attend;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter class hold no:");
		class_hold=sc.nextInt();
		System.out.println("Enter class attend:");
		class_attend=sc.nextInt();
		sc.close();

		float percentage;
		percentage=((float)class_attend/class_hold)*100;
		System.out.println("The percentage of class attend is :"+percentage);
		int mandetory_percentage=75;
		if(percentage>mandetory_percentage) 
		{
			System.out.println("student will allow to attend the exam");

		}
		else 
		{
			System.out.println("not allowed");
		}
	}

}
