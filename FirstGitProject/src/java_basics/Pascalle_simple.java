package java_basics;

public class Pascalle_simple {

	public static void main(String[] args)
	{
		int n=5;
		//int spaces=n;
		int number=1;
		for(int i=0;i<n;i++) 
		{
			for(int s=1;s<=n-i;s++) 
			{
				System.out.print(" ");
			}
			number=1;
			for(int j=0;j<=i;j++) 
			{
				System.out.print(number+" ");
				number=number*(i-j)/(j+1);
			}
			//spaces--;
			System.out.println();
		}
	}

}
