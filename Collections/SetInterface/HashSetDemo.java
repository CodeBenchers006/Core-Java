package Collections.SetInterface;

import java.util.HashSet;
import java.util.Set;

//HashSet is a class of Java Set interface
//Can store multiple type of values
//Duplicates are not allowed
//Order is not followed
//Maintains the functionality of HashTable

//can only contain one null element


public class HashSetDemo {
	
	public static void main(String[] args) {
		Set s = new HashSet();
		
		s.add("Strings");
		s.add(123);
		s.add(123);
		s.add("HashSet");
		s.add(null);
		s.add(null); //this will get rejected as duplicates are not allowed and therefore a HashSet can only has one null element
		
		s.stream().forEach(System.out::println);
		
		
		
	}

}
