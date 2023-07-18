package List_Collection;
import  java.util.ArrayList;
import java.util.List;

public class Ascending {

	public static void main(String[] args) 
	{
		List <Integer>asc=new ArrayList();
		asc.add(9);
		asc.add(87);
		asc.add(1);
		asc.add(6);
		int temp;
		for(int i=0;i<asc.size();i++) 
		{
			for(int j=i+1;j<asc.size();j++) 
			{
				if(asc.get(i)>asc.get(j)) 
				{
					temp=asc.get(i);
					asc.set(i, asc.get(j));
					asc.set(j, temp);
				}
			}

		}
		for(int i=0;i<asc.size();i++) 
		{
			System.out.println(asc.get(i));
		}

	}

}
