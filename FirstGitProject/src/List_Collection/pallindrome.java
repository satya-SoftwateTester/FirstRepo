package List_Collection;

import java.util.ArrayList;
import java.util.List;

public class pallindrome {

	public static void main(String[] args) 
	{
		List<Integer> pal=new ArrayList();
		pal.add(10);
		pal.add(20);
		pal.add(20);
		pal.add(10);
		int m=pal.size()-1;
		int x=0;
		for(int i=0;i<pal.size();i++) 
		{
			if(pal.get(i)==pal.get(m)) 
			{
				x=0;
			}
			else 
			{
				x=1;
			}
			m--;
		}
		if(x==0) 
		{
		System.out.println("It is a pallindrome number");	
		}
		else 
		{
			System.out.println("it is not a pallindrome number");
		}
	}

}
