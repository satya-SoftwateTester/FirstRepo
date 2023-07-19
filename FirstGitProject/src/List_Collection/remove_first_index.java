package List_Collection;

import java.util.LinkedList;

public class remove_first_index {

	public static void main(String[] args)
	{
		LinkedList<Integer> r=new LinkedList<Integer>();
		r.add(10);
		r.add(20);
		r.add(60);
		r.removeFirst();
		System.out.println(r);
		r.clear();
		System.out.println(r);
	}

}
