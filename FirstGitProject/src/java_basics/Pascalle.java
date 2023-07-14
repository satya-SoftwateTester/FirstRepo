package java_basics;

public class Pascalle {

	public static void main(String[] args) 
	{
		int n=5,res=0;
		for( int i=0;i<=n;i++) 
		{
			for(int j=1;j<=n-i;j++) 
			{
				System.out.print(" ");
			}
			for(int c=0;c<=i;c++) 
			{
				int ifact=1;
				for(int k=1;k<=i;k++) 
				{
					ifact=ifact*k;
				}
				int ijfact=1;
				for(int ij=1;ij<=i-c;ij++) 
				{
					ijfact=ijfact*ij;
				}
				int mfact=1;
				for(int m=1;m<=c;m++) 
				{
					mfact=mfact*m;
				}
				res=(ifact)/(ijfact*mfact);
				System.out.print(res+" ");
			}
			System.out.println();
		}
	}

}
