package List_Collection;

import java.util.ArrayList;

public class Two_array_Addition {

	public static void main(String[] args) 
	{
		ArrayList<Integer> t=new ArrayList();
		t.add(10);
		t.add(30);
		t.add(20);
		ArrayList<Integer>t1=new ArrayList();
		t1.add(2);
		t1.add(3);
		t1.add(5);
		int sum=0;
		ArrayList<Integer>t2=new ArrayList();

		if(t.size()==t1.size()) 
		{
			for(int i=0;i<t.size();i++) 
			{
				t2.add(t.get(i)+t1.get(i));
			}
			System.out.println( "the sum of two array index is "+t2);		
		}

	}

}
