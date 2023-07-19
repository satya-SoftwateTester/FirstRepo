package List_Collection;

import java.util.LinkedList;

public class get_first_element {

	public static void main(String[] args) 
	{
		LinkedList<Integer> g=new LinkedList<Integer>();
		g.add(10);
		g.add(80);
		g.add(30);
		System.out.println(g.getFirst());
		System.out.println(g.getLast());
	}

}
