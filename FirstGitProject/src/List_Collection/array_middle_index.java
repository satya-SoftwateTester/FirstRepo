package List_Collection;

import java.util.ArrayList;
import java.util.List;

public class array_middle_index {

	public static void main(String[] args)
	{
		List<Integer>  m=new ArrayList<Integer>();
		m.add(1);
		m.add(2);
		m.add(4);
		m.add(5);
		int ele=4;
		int input=3;
		for(int i=0;i<m.size();i++) 
		{
			if(m.get(i)==ele) 
			{
				m.add(i,input);
				break;
			}
		}
		for(int i=0;i<m.size();i++) 
		{
			System.out.println(m.get(i));
		}
	}

}
