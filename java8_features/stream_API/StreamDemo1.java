package java8_features.stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamDemo1 {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,45,32,16,19);
		
		//using for each with stream API to traverse each and every element of list
		list.stream().forEach(System.out::println);
		
		
		//using filter with stream API to add a condition to the loop
		List<Integer> numDivBy2 = list.stream().filter(i->i%2==0).collect(Collectors.toList());

		System.out.println(numDivBy2);
		
		Optional<Integer> max = list.stream().max((x, y) -> x.compareTo(y) );
		
		System.out.println("Max value:"+max.get());
	}

}
