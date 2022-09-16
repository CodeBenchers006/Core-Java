package Collections.ListInterface;

import java.util.Iterator;
import java.util.LinkedList;


//Follows Doubly Linked List
//Duplicates are allowed
//Order is maintained
//can be accessed using index values

public class LinkedListDemo {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> linkedList = new LinkedList();
		
		linkedList.add(12);
		
		linkedList.add(12);
		
		System.out.println("Current list elements "+linkedList);
		
		linkedList.addFirst(10);
		
		linkedList.addLast(16);
		
		System.out.println("Current list elements "+linkedList);
		
		//peek returns the head of the list
		System.out.println("Peek: "+linkedList.peek());
		
		//returns and removes the first element (FIFO)
		System.out.println("Pop: "+linkedList.pop());
		
		System.out.println("Current list elements "+linkedList);
		
//		Iterator<Integer> it = linkedList.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		linkedList.stream().forEach(System.out::println);
	}

}
