package Collection_Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer>list=new ArrayList<Integer>();
		
		list.add(11);
		list.add(1);
		list.add(5);
		list.add(4);
		list.add(11);
		list.add(121);
		list.add(5);
		list.add(6);
		list.add(90);
		
		System.out.println("Arraylist with duplicate values"+list);
		
		/*use set to remove diplicate*/
		
		
		Set<Integer>set=new HashSet<Integer>(list);
		System.out.println("Set without duplicate"+set);
		
		Set<Integer>set2=new TreeSet<Integer>(list);
		System.out.println("Get sorted values with Treeset"+set2);
		
		
		
	}

}
