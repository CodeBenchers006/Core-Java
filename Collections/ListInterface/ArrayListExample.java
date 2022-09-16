package Collections.ListInterface;

import java.util.*;

//ArrayList is a class of List Interface
//Allows to store duplicate elements
//Order is maintained
//Can be accessed using index number
//Can store only one type of element

public class ArrayListExample {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		//elements of List are always ordered
		
		//can be accessed using their index positions
		list.get(0);
		
		//looping over the list can be done in the following ways
		
		//1. for loop
		System.out.println("Using for loop");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("Using enhanced for loop");
		for(int i:list) {
			System.out.println(i);
		}
		
		System.out.println("Using Java 8 Stream");
		list.stream().forEach(System.out::println);
		
	}

}
