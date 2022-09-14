package encapsulation;

import java.util.Arrays;
import java.util.List;

//Encapsulation is defined as the wrapping up of data under a single unit. It is the mechanism that binds together code and the data it manipulates. Another way to think about encapsulation is, that it is a protective shield that prevents the data from being accessed by the code outside this shield. 

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ingredients[] = {"Abc","def"};

		Medicine m = new Medicine(25,Arrays.asList(ingredients),152.6);
		
		System.out.println(m.getGrams());
		
	}

}
