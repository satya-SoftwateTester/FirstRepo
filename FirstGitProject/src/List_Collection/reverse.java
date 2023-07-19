package List_Collection;

import java.util.ArrayList;
import java.util.List;

public class reverse {

	public static void main(String[] args) 
	{
		List<Integer> r=new ArrayList<Integer>();
		r.add(10);
		r.add(20);
		r.add(30);
		r.add(40);
		int temp=0;
		for(int i=0;i<r.size();i++) 
		{
			for(int j=i+1;j<r.size();j++) 
			{
				temp=r.get(i);
				r.set(i,r.get(j));
				r.set(j, temp);
			}
		}
		System.out.println("The reverse is"+r);
	}

}
