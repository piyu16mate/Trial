package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>list=new ArrayList<Integer>();
		list.add(11);
		list.add(2);
		list.add(56);
		list.add(5);
		list.add(1234);
		list.add(6);
		
		/*convert ArrayList into Array*/
		
		
		Object [] ar=list.toArray();
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
			
		}
		
		/*convert any Array into ArrayList or List object*/
		
		int [] ar1= new int[5];
		List list3=Arrays.asList(ar1);
		
		/*compare two arraylist*/
		
		List<Integer>list5=new ArrayList<Integer>();
		list5.addAll(list);
		System.out.println(list5.equals(list));

	}

}
