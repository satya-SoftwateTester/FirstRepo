package java_basics;

import java.util.Scanner;

public class Switch_Vowel {

	public static void main(String[] args)
	{
		String ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a character");
		ch=sc.next();
		sc.close();
		switch(ch) 
		{
		case "a":
			System.out.println("vowel");
			break;
		case "A":
			System.out.println("vowel");
			break;
		case "e":
			System.out.println("vowel");
			break;
		case "E":
			System.out.println("vowel");
			break;
		case "i":
			System.out.println("vowel");
			break;
			
		case "I":
			System.out.println("vowel");
			break;
		case "o":
			System.out.println("vowel");
			break;
		case "O":
			System.out.println("vowel");
			break;
		case "u":
			System.out.println("vowel");
			break;
		case "U":
			System.out.println("vowel");
			break;
			default:
				System.out.println("consonant");
			
		}

	}

}
