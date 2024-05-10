package JavaInterviewCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class javaMergedArraysort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	int arr1[]= {-4,-1,0,4,5,5};
		int arr2[]= {-9,-6,99,34,34,2,-1};
		
		int MergedArr[]= new int[arr1.length+arr2.length];
		int k=0;
		for(int i=0;i<arr1.length;i++)
		{
			MergedArr[k]=arr1[i];
			k++;
		}
		for(int j=0;j<arr2.length;j++)
		{
			MergedArr[k]=arr2[j];
			k++;
		}
		
		for(int k1=0;k1<MergedArr.length;k1++)
		{
			System.out.print(MergedArr[k1]+" ");
		}
		System.out.println();
		Arrays.sort(MergedArr);
		for(int k2=0;k2<MergedArr.length;k2++)
		{
			System.out.print(MergedArr[k2]+" ");
		}
		
		//remove duplicates
		
	Set<Integer> obj= new HashSet<Integer>();
	
	for(int dup : MergedArr)
	{
		if(!obj.contains(dup))
		obj.add(dup);
		
	}
	System.out.println();
	
		System.out.print(obj);
		
		Iterator<Integer>it=obj.iterator();
		
		int mergedwoduo[]=new int[obj.size()];
		int m=0;
		while(it.hasNext())
		{
			mergedwoduo[m]=it.next();
			m++;
		}
		
		System.out.println();
		Arrays.sort(mergedwoduo);
		
		for(int n=0;n<mergedwoduo.length;n++)
			System.out.print(mergedwoduo[n]);
		
		
		
		//generate Random numbers
		System.out.println(Math.random());
		System.out.println(Math.random());
	
	

}
}
