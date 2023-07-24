package Class_object;

import java.util.Scanner;

public class duplicate_rmv {

	public static void main(String[] args) 
	{

		duplicate res=new duplicate();
		res.dplicate();
		duplicate res1=new duplicate();
		res1.rmvduplicte();
	}


}
class duplicate
{
	public void dplicate() 
	{
		int n,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the element");
		for(int i=0;i<n;i++) 
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Duplicate number is ");
		for(int i=0;i<n;i++) 
		{
			for(int j=i+1;j<n;j++) 
			{
				if(a[i]==a[j]) 
				{
					count++;
					for(int k=i-1;k>=0;k--) 
					{
						if(a[k]==a[i]) 
						{
							count--;
						}
					}
				}
			}
			if(count>=1) 
			{
				System.out.println(a[i]);
			}
			count=0;
		}
	}
	public void rmvduplicte() 
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array ");
		n=sc.nextInt();
		int a[]=new int[n];			
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
			if(count>0) 
			{
				System.out.println(a[i]);
			}
			count=0;
		}
	}

}
