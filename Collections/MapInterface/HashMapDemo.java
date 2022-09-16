package Collections.MapInterface;

import java.util.*;
import java.util.Map.Entry;


//HashMap uses HashTable to store elements
//element with null key refers to the top most element
//HashMap does not contain duplicates as internally it causes Hashing Collision which is fixed using equals operator and linked list implementation



public class HashMapDemo {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("Java", 101);
		map.put("C++", 110);
		map.put(null, 130);
		
		System.out.println("Key Value of Java :"+map.get("Java"));
		
		System.out.println("Map: "+map);
		
		//Convert Map to Set
		
		Set<Entry<String, Integer>> set = map.entrySet();
		System.out.println("Map as a Set: "+set);
		
		Set<String> keySet = map.keySet();
		System.out.println("Keys :"+keySet);
		
		Collection<Integer> valueSet = map.values();
		System.out.println("Values :"+valueSet);
		
		
		//Traversing HashMap
		//------------------------------
		//Using Iterator
		//We can't directly traverse HashMap using an iterator, we need to either convert it to a set or use entrySet()
		
		Iterator it = map.entrySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//Using Stream
		//map.entrySet().stream().forEach(System.out::println);
		
		
	}

}
