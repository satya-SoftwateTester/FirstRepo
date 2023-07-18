package List_Collection;

import java.util.ArrayList;
import java.util.List;

public class addition {

	public static void main(String[] args)
	{
	List <Integer> l=new ArrayList();
	l.add(10);
	l.add(20);
	l.add(30);
	l.add(5);
	l.add(10);
	int sum=0;
	for(int i=0;i<l.size();i++) 
	{
		sum=sum+l.get(i);
	}
	System.out.println( "the sum is "+sum);{
		// TODO Auto-generated method stub

	}
	}
}
