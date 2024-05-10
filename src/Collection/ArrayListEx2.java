package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
		List<Integer>list=new ArrayList<Integer>();
		list.add(11);
		list.add(1);
		list.add(56);
		list.add(5);
		list.add(1234);
		list.add(6);
		Collections.sort(list);//through build method
		System.out.println(list);
		
		for(int i=0;i<list.size();i++)
		{
			temp=0;
			for(int j=i+1;j<list.size();j++)
			{
				if(list.get(i)>list.get(j))
				{
					temp=list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
					
				}
			}
		
		}
		
		System.out.println(list);

	}

}
