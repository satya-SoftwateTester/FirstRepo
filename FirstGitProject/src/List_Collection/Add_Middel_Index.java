package List_Collection;

import java.util.ArrayList;
import java.util.List;

public class Add_Middel_Index {

	public static void main(String[] args) 
	{
		List<String> m=new ArrayList<String>();
		m.add("Satya");
		m.add("Rinku");
		m.add("ram");
		String data="Rinku";
		String input="hari";
		List<Integer> l=new ArrayList<Integer>();
		l.add(10);
		l.add(200);
		System.out.println(l);
		for(int i=0;i<m.size();i++) 
		{
			if(m.get(i)==data) 
			{
				m.add(i+1,input);
				break;
			}
		}
		System.out.println(m);
		System.out.println(m.remove(1));
		System.out.println(m);

	}

}
