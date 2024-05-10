package JavaInterviewCode;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import BasicPrograms.test;

public class Test {

	public static void main(String[] args) {
	
	
		//****FIND ADDITION ARRAYS EQUALS TO GIVEN NUMBER********** 
		/*int num=20;
		int arr[]= {10,14,4,10,6,16};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++) 
			{
				if(arr[i]+arr[j]==num)
				{
					System.out.println(arr[i]+"+"+arr[j]+"="+num);
				}
			}
		}*/
		
		
		/////////********remove duplicate elements from ArrayList in Java?
		
	/*	ArrayList<String> duplicateStr= new ArrayList<String>();
		duplicateStr.add("java");
		duplicateStr.add("python");
		duplicateStr.add("java");
		duplicateStr.add("priya");
		duplicateStr.add("mate");
		duplicateStr.add("abc");
		duplicateStr.add("def");
		duplicateStr.add("abc");
		
		System.out.println("duplicate string"+duplicateStr);
		
		HashSet<String> set= new HashSet<String>(duplicateStr);
		System.out.println(set);*/
		
		//////****How to check whether one string is a rotation of another in Java?
		
		
	/*String s1="jklm";
		String s2="klmj";
	
		if(s1.length()!=s2.length())
		{
			System.out.println("s2 is not rotation of s1");
			
		}
		else 
		{
			String s3=s1+s1;
			
			if(s3.contains(s2))
				System.out.println("s2 is rotation of s1");
			else
				System.out.println("s2 not is rotation of s1");
		}
		
		*/
		///*****intersetion of two arrays
	/*String s11[]= {"priya","mate","sujit","gondane","kangana"};
		String s21[]= {"priya","sujit","adksd","kangana"};
		int count=0;
		
		HashSet<String> set= new HashSet<String>();
		for(int i=0;i<s11.length;i++)
		{
		
			for(int j=0;j<s21.length;j++)
			{
				
				if(s11[i].equals(s21[j]))
				{
					set.add(s21[j]);
					//OR set.add(s1[i]);
					
				}
			}
			
		}
		System.out.println(set);*/
		
		//****check number is binary or not
		
		/*Long binary=56888l;
		boolean flag;
		Long num;
		while(binary>0)
		{
			num=binary%10;
			if(num!=0 && num!=1)
			//System.out.println("given number is not a binary");
				flag=false;
			
			binary=binary/10;
			
		}
		flag=true;
		
		if(flag==true)
		{
			System.out.println("binary");
		}
		else
			System.out.println("not binary");
		*/
		
		///*******reverse the word
String str="java is my code";
	/*	char value[]=str.replaceAll("\\s","").toCharArray();
		System.out.println(value);
		
	for(int i=value.length-1;i>=0;i--)
		{
			System.out.print(value[i]);
		}*/

/*	String k[] =str.split(" ");
		
		for(int i=k.length-1;i>=0;i--)
		{
			System.out.println(k[i]);
		}*/
		
	
		///rotate array number by 2 positions
		
		/*int arr[]= {1,2,5,7,4,3};
		int num=2;
		int temp=0;
		
		for(int i=0;i<num;i++)
		{
			temp=arr[0]; //1
			
			for(int j=0;j<arr.length-1;j++)
			{
				arr[j]=arr[j+1]; 
			}
			arr[arr.length-1]=temp;
			
		}
		
		for(int k=0;k<arr.length;k++)
			System.out.println(arr[k]);*/
		
		
	/////***Frequency of digits in number
		
		/*int num=7845390;
		HashMap<Integer, Integer> map= new HashMap<Integer, Integer>();
		int n;
		while(num!=0)
		{
			n=num%10;
			
			if(map.containsKey(n)) {
				map.put(n, map.get(n)+1);
			}
			else
				map.put(n, 1);
		
		
		num=num/10;
		}
		System.out.println(map);*/
		
		
		///Format date
		/*Date date= new Date();
		SimpleDateFormat format= new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(format.format(date));*/
		
		////reverse Arraylist
		
		
		/*ArrayList<String> duplicateStr= new ArrayList<String>();
		duplicateStr.add("java");
		duplicateStr.add("python");
		duplicateStr.add("fgdfg");
		duplicateStr.add("priya");
		duplicateStr.add("mate");
		System.out.println(duplicateStr);
		
	Collections.reverse(duplicateStr);
	System.out.println(duplicateStr);*/
		
		
	///**print all substrings of given string
		
		
		/*String substr="priyamae";
		
		for(int i=0;i<substr.length();i++)
		{
			for(int j=i+1;j<substr.length();j++)
			{
				System.out.println(substr.substring(i, j));
			}
			
		}*/
		
		
		///////******Add two sorted arrays in merged Array
		
	/*	int arr1[]= {-4,-1,0,4,5,5};
		int arr2[]= {-9,-6,99,34,34,2,-1};
		
		int MergedArr[]=new int[arr1.length+arr2.length];
		
	
		int k=0;
		int i1=0;
		int j1=0;
		while(i1<arr1.length)
		{
			MergedArr[k]=arr1[i1];
			i1++;
			k++;
		}
		
		while(j1<arr2.length)
		{
			MergedArr[k]=arr2[j1];
			j1++;
			k++;
		}
		for(k=0;k<MergedArr.length;k++)
		System.out.print(MergedArr[k]+" ");
		
		System.out.println("after sort");
		Arrays.sort(MergedArr);
		for(k=0;k<MergedArr.length;k++)
			System.out.print(MergedArr[k]+" ");
		
		
		//Remove duplicates
		System.out.println();
		System.out.println("Remove duplicates");
		Set<Integer>set= new HashSet<Integer>();//OR we can use Treeset also
		//Set<Integer>set= new Treeset<Integer>();
		
		for(int element : MergedArr)
		{
			set.add(element);
			
		}
		
		System.out.print(set);
		
		//but we need in form of array
		
		
		
		int MergedArraywithoutduplicates[]= new int[set.size()];
		
		
		Iterator<Integer> it=set.iterator();
		int i=0;
		while(it.hasNext())
		{
			MergedArraywithoutduplicates[i]=it.next();
			i++;
		}
		
		Arrays.sort(MergedArraywithoutduplicates);
		
		System.out.println("Array sort without duplicates");
		
		for(int k1=0;k1<MergedArraywithoutduplicates.length;k1++)
		{
		System.out.print(MergedArraywithoutduplicates[k1]+" ");
		}
		
		*/
	
	
		///how to sort map with keys
		
		
		/*HashMap<Integer, String> map1= new HashMap<Integer, String>();
		
		map1.put(1, "sfdfg");
		map1.put(3, "dfg");
		map1.put(67, "dfh");
		map1.put(88, "hjk");
		map1.put(5, "cvb");
		map1.put(2, "ert");
		
		System.out.println(map1);
		TreeMap<Integer, String> tree= new TreeMap<Integer, String>(map1);
		System.out.println("After Sorting");
		System.out.println(tree);*/
	
	///Extract integer from string
		
		String strin="sap12ent";
		
		char c[]=strin.toCharArray();
		//System.out.println(strin.replaceAll("[^0-9]",""));
		
		//Find missing elements inArray
		
	/*	int a[]= {2,3,5};
		
		Set<Integer>jkl=new HashSet<Integer>();
		
		for(int n : a)
		{
			jkl.add(n);
			
		}
		
		for(int i=0;i<a.length;i++)
		{
			if(!jkl.contains(i))
			{
				System.out.print(i);
			}
			
		}*/
		//Find common elements in both array
		
	/*	int a[]= {1,2,3,4,5};
		int b[]= {4,5,6,7,8};
		
		Set<Integer> obj1= new TreeSet<Integer>();
		Set<Integer> obj2= new TreeSet<Integer>();
		
		for(int c : a)
		{
			obj1.add(c);
		}
	
		
		for(int d : b)
		{
			obj2.add(d);
		}
	
		obj1.retainAll(obj2);
		
		System.out.print(obj1);
	System.out.print(obj2);*/

	
	//find Non Repetitive character
		
		/*String s1="aabbcdss";
		int count=0;
		char sttr[]=s1.toCharArray();
		for(int i=0;i<s1.length();i++)
		{
			count=1;
			for(int j=i+1;j<s1.length();j++) 
			{
				if(sttr[i]==sttr[j])
				{
					count++;
					sttr[j]=0;
				}
				
			}
			
				if(sttr[i]!=0 && count==1)
				{
					System.out.print(sttr[i]);
				}
		}*/

		//two strings are anagram or not
		
		/*String str1="java";
		String str2="avaj";
	
		Boolean flag=false;
		char[] newstr1=str1.toCharArray();
		char[] newstr2=str2.toCharArray();
		
		Arrays.sort(newstr1);
		Arrays.sort(newstr2);
		
		if(Arrays.equals(newstr1, newstr2))
		{
			flag=true;
		}
		else
		{
			return;
		}
		
		if(flag==true)
			System.out.print("both strings are anagram");
		else
			System.out.print("both strings are  not anagram");
			
	//	System.out.println("both are Anagram"+Arrays.equals(newstr1, newstr2));*/
		
	
		
		//  Find common elements in arrays
		
	/*	Integer[] a1 ={1,2,3,2,1};

         Integer[] a2 = {1,2,3};

		Integer[] a3 = {1,2,3,4};
		
		Set<Integer> obj1= new HashSet<Integer>();
		Set<Integer> obj2= new HashSet<Integer>();
		Set<Integer> obj3= new HashSet<Integer>();
		for(Integer s1 : a1)
		{
			obj1.add(s1);
		}
		
		for(Integer s2 : a2)
		{
			obj2.add(s2);
		}
		
		for(Integer s3 : a3)
		{
			obj3.add(s3);
		}
		
		obj1.retainAll(obj2);
		System.out.print(obj1);
		obj1.retainAll(obj3);
		System.out.print(obj1);*/
		
		
		// Second Largest and Second Smallest Numbers:
		
		
	/*	int SecLarge []= {2,4,41,6,8,2,56};  //second largest
		
		int secMax=SecLarge[0];
		for(int i=0;i<SecLarge.length-1;i++)
		{
			
			if(SecLarge[i]>secMax)
			{
				secMax=SecLarge[i];
			}
		}
		System.out.print(secMax);*/
	
		
		/*int secmin[]= {1,5,6,66,71,3,9};//second min
		int t=0;
		for(int i=0;i<secmin.length;i++)
		{
			for(int j=i+1;j<secmin.length;j++)
			{
				if(secmin[i]>secmin[j])
				{
					t=secmin[i];
					secmin[i]=secmin[j];
					secmin[j]=t;
					
				}
			}
			
			System.out.print(secmin[i]+" ");
		}
		System.out.println();
		System.out.print(secmin[1]);*/
		
		
		
}
		
	}