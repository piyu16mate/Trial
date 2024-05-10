package arraysExamples;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[]= {1,4,6,8};
		int arr2[]= {5,8,9,11};
		int pos=0;
		int mergeArr[]=new int [arr1.length+arr2.length];
		
		for(int element : arr1)
		{
			mergeArr[pos]=element;
			pos++;
		}
		for(int element : arr2)
		{
			mergeArr[pos]=element;
			pos++;
		}
		
		for(int i=0;i<mergeArr.length;i++)
		System.out.print(mergeArr[i]);
		System.out.println();
		Arrays.sort(mergeArr);
		
		
		

	}

}
