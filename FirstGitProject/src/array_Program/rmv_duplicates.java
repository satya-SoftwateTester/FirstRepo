package array_Program;

import java.util.Scanner;

public class rmv_duplicates {

	public static void main(String[] args) 
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array ");
		n=sc.nextInt();
		int a[]=new int[n];
		//int b[]=new int[n];
		System.out.println("Enter your element");
		for(int i=0;i<n;i++) 
		{
			a[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<n;i++) 
		{
			for(int j=i;j<n;j++) 
			{
				if(a[i]==a[j]) 
				{
					count++;
					for( int k=i-1;k>=0;k--) 
					{
						if(a[k]==a[i]) 
						{
							count--;
						}
					}
				}
			}
			/*System.out.println(b[i]);*/
			if(count>0) 
			{
				System.out.println(a[i]);
			}
			count=0;
		}
	}

}
