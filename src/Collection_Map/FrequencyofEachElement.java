package Collection_Map;

import java.util.HashMap;
import java.util.Map;

public class FrequencyofEachElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Selenipriya";//we make every  character as key
		Map<Character,Integer> map= new HashMap<Character,Integer>();
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
	}

}
