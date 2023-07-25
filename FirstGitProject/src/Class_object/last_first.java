package Class_object;

import java.util.Scanner;

public class last_first {

	public static void main(String[] args) 
	{
		last_first_index_add lst=new last_first_index_add();
		lst.last();
		last_first_index_add fst=new last_first_index_add();
		fst.first();


	}
}
class last_first_index_add
{
	public void last() 
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter the size of array");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the element ");
		for(int i=0;i<n;i++) 
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the element you want ");
		int new_ele=sc.nextInt();
		for(int i=0;i<n;i++) 
		{
			if(a[i]==a[n-1]) 
			{
				a[i]=new_ele;
			}
		}
		for(int i=0;i<n;i++) 
		{
			System.out.println(a[i]);
		}
	}
	public void first() 
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the element");
		for(int i=0;i<n;i++) 
		{
			a[i]=sc.nextInt();

		}
		System.out.println("Enter the element");
		int ele=sc.nextInt();
		int i;

		for( int k=n-1;k>0;k--) 
		{
			a[k]=a[k-1];
		}
		a[0]=ele;

		for(i=0;i<n;i++) 
		{
			System.out.println(a[i]);
		}
	}

}
