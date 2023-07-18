package List_Collection;

import java.util.LinkedList;

public class Add_first_Index {

	public static void main(String[] args) 
	{

		LinkedList <Integer> a=new LinkedList<Integer>();
		a.add(10);
		a.add(20);
		a.add(50);
		a.addFirst(80);
		System.out.println(a);
	}

}
