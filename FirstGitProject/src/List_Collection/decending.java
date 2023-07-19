package List_Collection;

import java.util.ArrayList;
import java.util.List;

public class decending {

	public static void main(String[] args)
	{
		List <Integer>dec=new ArrayList();
		dec.add(8);
		dec.add(2);
		dec.add(1);
		dec.add(6);
		int temp;
		for(int i=0;i<dec.size();i++) 
		{
			for(int j=i+1;j<dec.size();j++) 
			{
				if(dec.get(i)<dec.get(j)) 
				{
					temp=dec.get(i);
					dec.set(i, dec.get(j));
					dec.set(j, temp);
				}
			}
			
			}
		for(int i=0;i<dec.size();i++) 
		{
			System.out.println(dec.get(i));
		}
	}

}
