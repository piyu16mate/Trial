package JavaInterviewCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class YoutubeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//remove duplicates in string
		
		
		String str="ssndeepp";
		
		Set<Character> set= new HashSet<Character>();
		
		
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			
			if(!set.contains(c))
			{
				set.add(c);
				System.out.print(c);
				
			}
		}	
		;
		
	
	
		//Reverse the words
		
		/*String str1="Welcome to the world";
		
		String[] splistr=str1.split(" ");
		
		
		for(int i=splistr.length-1;i>=0;i--)
		{
			System.out.print(splistr[i]);
		}
		*/
		
		//Remove Element
		
		/*int arr[]= {1,4,5,6,88,9};
			int e=5;
		int newarr[]=new int[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=e)
			{
				newarr[i]=arr[i];
			
			System.out.println(newarr[i]);
			}
		}*/
		
		
		//find even length string
		/*String even="hell world po fgh";
		
		String evenV[]=even.split(" ");
		
		for(int i=0;i<evenV.length;i++)
		{
			if(evenV[i].length()%2==0)
			{
				System.out.print(evenV[i]);
			}
		}*/
		
		
		//sort string
		
	/*	String sorts="java";
		
		char sortc[]=sorts.toCharArray();
		
		Arrays.sort(sortc);
		
		System.out.println(sortc);*/
		
		
		//sort in form occurence in decending order
		
		//find missing number in array
		
	/*	int [] arr= {2,4,1,5,7,8,0};
		
		Set<Integer> objj= new HashSet<Integer>();
		
		for(int a : arr)
			objj.add(a);
		
		int s=arr.length;
		
		for(int i=0;i<s;i++)
		{
			if(!objj.contains(i))
			{
				System.out.print(i);
			}
		}*/
		
		//Sort names in array
		
		/*String fruits[]= {"Apple","Grapes","Kiwi","Banana"};
		String temp=null;
		for(int i=0;i<fruits.length;i++)
		{
			for(int j=i+1;j<fruits.length;j++)
			{
				if(fruits[i].compareTo(fruits[j])>0)
				{
					temp=fruits[i];
					fruits[i]=fruits[j];
					fruits[j]=temp;
					
				}}
			System.out.println(fruits[i]);}
				
				
			for(String n : fruits)
		{
			System.out.println(n);
		}*/
		
		//intersection of two arays
		
		int a1[]= {1,2,3,4,5,6};
		int a2[]= {4,5,6,7,8};
		int a3[]= {5,6,11,23};
		Set<Integer> set1= new HashSet<Integer>();
		
		for(int i=0;i<a1.length;i++)
		{
			set1.add(a1[i]);
		}
		
		for(int i=0;i<a2.length;i++)
		{
			if(set1.contains(a2[i]))
				System.out.print("common elements"+a2[i]);
		}
		
		
		//String Comoression
		
		/*String compS="aabbdee";
		Map<Character,Integer> map= new HashMap<Character, Integer>();
		for(int i=0;i<compS.length();i++)
		{
			char ch=compS.charAt(i);
			if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch)+1);
			}
			else
				map.put(ch, 1);
		}
			System.out.println(map);

			Set set2=map.entrySet();
			
			Iterator it=set2.iterator();
			
			while(it.hasNext())
			{
				Map.Entry<Character,Integer> map1=(Map.Entry)it.next();
				System.out.print(map1.getKey()+""+map1.getValue());
			}
		*/
		
	int arr[]= {1,2,5,6,7,2,1};
		
		
		Set<Integer>d= new HashSet<Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(!d.contains(arr[i]))
			{
				d.add(arr[i]);
			//	System.out.print(i);
				System.out.print(arr[i]);
			}
		}
		
	}
	}
	
