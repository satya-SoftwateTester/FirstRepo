package Class_object;

import java.util.Scanner;

public class Ascending_decending {

	public static void main(String[] args)
	{
		asc_dec ascending=new asc_dec();
		int[]res=ascending.enter();
		ascending.asc(res);
		asc_dec decending=new asc_dec();
		int res1[]=decending.enter();
		decending.dec(res1);
			}

		}
		class asc_dec
		{
			public static int[]enter()
			{
				int n;
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter array size");
				n=sc.nextInt();
				int arr[]=new int[n];
				System.out.println("the element are");
				for(int i=0;i<arr.length;i++) 
				{
					arr[i]=sc.nextInt();
				}
				return arr;
			}
			public static int []asc(int[]arr)
			{
				int temp;
				for(int i=0;i<arr.length;i++) 
				{
					for(int j=i+1;j<arr.length;j++) 
					{
						if(arr[i]>arr[j]) 
						{
							temp=arr[i];
							arr[i]=arr[j];
							arr[j]=temp;
						}
					}
					System.out.println(arr[i]);
				}
				return arr;
			}
			public static int[]dec(int[]arr)
			{
				int temp;
				for(int i=0;i<arr.length;i++) 
				{
					for(int j=i+1;j<arr.length;j++) 
					{
						if(arr[i]<arr[j]) 
						{
							temp=arr[i];
							arr[i]=arr[j];
							arr[j]=temp;
						}
					}
					System.out.println(arr[i]);
				}
				return arr;
	}

}
