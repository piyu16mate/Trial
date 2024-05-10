package Collection_Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class frequencyMapElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="peitape";
		
	Map<Character, Integer> map=new HashMap<Character, Integer>();
	
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		if(map.containsKey(ch))
		{
			map.put(ch, map.get(ch)+1);
		}
		else
			map.put(ch, 1);
		
	}
	System.out.println(map);
	
	//now if you want to present in key value pair use Map.Entry
	
				Set set=map.entrySet();
					Iterator it=set.iterator();
					while(it.hasNext())
					{
						Map.Entry<Character,Integer> map1=(Map.Entry)it.next();
						
						System.out.println(map1.getKey()+""+map1.getValue());
					}
	
	
	
	}
	

}
