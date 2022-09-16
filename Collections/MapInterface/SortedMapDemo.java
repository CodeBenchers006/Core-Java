package Collections.MapInterface;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

//TreeMap is a SortedMap, where elements gets sorted as per the Key
//Duplicates not allowed
//null keys not allowed

public class SortedMapDemo {
	

	public static void main(String[] args) {
		
		TreeMap<String, Integer> map = new TreeMap<>();
		
		map.put("Java", 101);
		map.put("C++", 110);
		
		//map.put(null, 130); TreeMap cannot contain null
		
		System.out.println("Key Value of Java :"+map.get("Java"));
		
		System.out.println("Map: "+map);
		
		//Convert Map to Set
		
		Set<Entry<String, Integer>> set = map.entrySet();
		System.out.println("Map as a Set: "+set);
		
		Set<String> keySet = map.keySet();
		System.out.println("Keys :"+keySet);
		
		Collection<Integer> valueSet = map.values();
		System.out.println("Values :"+valueSet);
	}
}
