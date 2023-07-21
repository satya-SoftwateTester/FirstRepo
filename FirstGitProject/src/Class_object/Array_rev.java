package Class_object;

import java.util.Scanner;

public class Array_rev {

	public static void main(String[] args)
	{
		reverse revs=new reverse();
		int []res=revs.enter();
		revs.rev(res);
	}
}

class reverse
{
	public static int[]enter()
	{
		int n;
		System.out.println("enetre the array length");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("the element are ");
		for(int i=0;i<n;i++) 
		{
			arr[i]=sc.nextInt();

		}
		return arr;
	}
	public  void rev(int []arr)
	{
		int size=arr.length-1;
		int temp=0;
		for(int i=0;i<arr.length/2;i++) 
		{
			temp=arr[i];
			arr[i]=arr[size];
			arr[size]=temp;

			size--;

		}
		System.out.println("The reverse is ");
		for (int i=0;i<arr.length;i++) 
		{
			System.out.println(arr[i]);
		}
	}

}
