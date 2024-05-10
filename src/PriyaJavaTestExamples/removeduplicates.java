package PriyaJavaTestExamples;

import java.util.HashSet;
import java.util.Set;

public class removeduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[]= {4,6,3,2,2,6,8,9,1,4};
		
		Set<Integer> set= new HashSet<Integer>();
		
		for(int i : a)
		{
			if(!set.contains(i))
			{
				set.add(i);
				System.out.print(i);
			}
		}

	}

}
