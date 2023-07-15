package java_basics;

public class Reserve_Number_Pyramid {

	public static void main(String[] args) 
	{
		int n=5;
		for(int i=n;i>=0;i--) 
		{
			for( int j=1;j<=n-i;j++) 
			{
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--) 
			{
				System.out.print(k);
			}
			for(int l=2;l<=i;l++) 
			{
				System.out.print(l);
			}
			System.out.println();
		}
	}

}
