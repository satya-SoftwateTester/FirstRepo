package java_basics;

public class armstrong {

	public static void main(String[] args) 
	{
		int n=1000;
		for(int i=1;i<=n;i++) 
		{
			int temp=i,res=0,rem,sum=0;
			while(temp>0) 
			{
				temp=temp/10;
				sum=sum+1;
			}
			int temp1=i;
			while(temp1>0) 
			{
				int value=1;
				rem=temp1%10;
				for(int k=1;k<=sum;k++) 
				{
					value=value*rem;
				}
				res=res+value;
				temp1=temp1/10;
			}
			if(res==i) 
			{
				System.out.println(i);
			}
		}
	}

}
