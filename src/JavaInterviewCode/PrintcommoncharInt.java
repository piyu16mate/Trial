package JavaInterviewCode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PrintcommoncharInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	int arr[]= {1,4,5,6,7,9,56,77};
		int arr1[]= {5,6,7,56,45,191};
		
		Set<Integer>set=new HashSet<Integer>();
		Set<Integer>set1=new HashSet<Integer>();
		for(int a : arr)
		{
			set.add(a);
		}

		for(int b : arr1)
		{
			set1.add(b);
		}
		
		set.retainAll(set1);
		System.out.println(set);*/
		
		
		
		String inputStr1="kdfj addsds";
		
		String inputStr2="edha nsbd";
		
	char ch[]=inputStr1.replaceAll("\\s","").toCharArray();
	char ch1[]=inputStr2.replaceAll("\\s","").toCharArray();
		
		
		
		Set<Character>set=new HashSet<Character>();
		Set<Character>set1=new HashSet<Character>();
		
		
		for(char ch0 : ch)
		{
			set.add(ch0);
			
		}
		for(char ch2 : ch1)
		{
			set1.add(ch2);
			
		}
		
		set.retainAll(set1);
		System.out.println(set);
		char[] lastValue=new char[set.size()];
		Iterator<Character>it=set.iterator();
		int l=0;
		while(it.hasNext())
		{
			lastValue[l]=it.next();
			
			l++;
			
		}
		
		for(int i=0;i<lastValue.length;i++)
			System.out.print(lastValue[i]);
		
		
		

	}

}
