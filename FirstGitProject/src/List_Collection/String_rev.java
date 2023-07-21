package List_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class String_rev {

	public static void main(String[] args) 
	{
		List<String > r=new ArrayList();
		r.add("Satya");
		r.add("apple");
		r.add("the");
		r.add("yee");
		r.add("ahh");
				Collections.reverse(r);
		System.out.print(r);
		r.add("rinku");
		Collections.reverse(r);
		System.out.println(r);
	}

}
