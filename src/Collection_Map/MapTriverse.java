package Collection_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTriverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> map=new HashMap<Integer,String>();
		
		map.put(1, "Pune");
		map.put(1, "Pune"); //it will not display duplicate as map dont take duplicate keys
		map.put(11, "Nagpur");
		map.put(3, "Banglore");
		map.put(6, "Delhi");
		map.put(78, "hyderabad");
		System.out.println(map);
	
		//we can not iterate directly in Map so we need to convert into set
		//coz set internally implementing map interface
		
		Set set=map.entrySet();//convert into set
		Iterator it=set.iterator();
		while(it.hasNext())
		{
			Map.Entry<Integer,String> map1=(Map.Entry)it.next();//returns a collection-view of the map, 
			//whose elements are of this class
			System.out.println(map1.getKey()+"---------"+map1.getValue());
			
		}

	}

}
