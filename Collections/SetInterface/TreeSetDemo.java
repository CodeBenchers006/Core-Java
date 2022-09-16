package Collections.SetInterface;

import java.util.Set;
import java.util.TreeSet;

//TreeSet can store only one type of element
//TreeSet is a sorted Set, it auto sorts the elements in ascending order
//unordered set
//duplicates are not allowed
//null values are not allowed

public class TreeSetDemo {
	
	public static void main(String[] args) {
		
		Set s= new TreeSet();
		
		s.add("Java");
		s.add("Python");
	//	s.add(null); will throw NullPointerException as null values are not allowed in TreeSet
		
		s.stream().forEach(System.out::println);
		
	}

}
