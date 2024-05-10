package Collection_Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String>set=new HashSet<String>();
		set.add("Ravi");
		set.add("Sujit");
		set.add("David");
		set.add("Ravi");
		//set.add("priya");
		
		System.out.println(set);
		
		/*for(String itr:set)
		{
			System.out.println(itr);
		}*/
		
		
		Iterator<String>a=set.iterator();
		while(a.hasNext())
		{
			System.out.println(a.next());
		}
	}

}
