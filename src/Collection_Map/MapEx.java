package Collection_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "Pune");
		map.put(11, "Nagpur");
		map.put(3, "Banglore");
		map.put(6, "Delhi");
		map.put(78, "hyderabad");
		map.put(69, "Pune");
		map.put(3, "Hariyana");
		map.remove(69);
		System.out.println(map);
		
		
		Map<Integer,String> map1=new TreeMap<Integer,String>();
		map1.put(1, "Pune");
		map1.put(11, "Nagpur");
		map1.put(3, "Banglore");
		map1.put(6, "Delhi");
		map1.put(78, "hyderabad");
		map1.put(69, "Pune");
		map1.put(3, "Hariyana");
		map1.put(0, "India");
		map1.put(33, "Punjab");
		System.out.println(map1);
	}

}
