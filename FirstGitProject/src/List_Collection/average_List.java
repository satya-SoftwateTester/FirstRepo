package List_Collection;

import java.util.ArrayList;
import java.util.List;

public class average_List {

	public static void main(String[] args) 
	{
		List<Integer> l=new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		int sum=0;
		int avg=0;
		for(int i=0;i<l.size();i++) 
		{
			sum=sum+l.get(i);
		}
		avg=sum/l.size();
		System.out.println("The average is "+avg);
	}

}
