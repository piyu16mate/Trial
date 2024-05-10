package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(10);
		list.add(2, 8);
		
		
		
		System.out.println(list);
		//System.out.println(list.indexOf(3));
		//System.out.println(list.subList(1, 4));
		
		
		List<Integer> list2= new ArrayList<Integer>();
		
		list2.addAll(list);//Append all the elements 
		System.out.println(list2);
		System.out.println(list2.size());
		
		
		
		/*for(int num:list)
		{
			System.out.println(num);
		}*/
		
		/*Iterator<Integer>li=list.iterator();
		
		while(li.hasNext())
		{
			System.out.println(li.next());
		}*/
	}

}
