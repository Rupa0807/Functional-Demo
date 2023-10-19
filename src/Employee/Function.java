package Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class Function {
	
	// 1. Accepts one  argument and returns an object Function <T,R>
	// 2. The Functional interface has a method apply()
	// 3. Used when you apply operations on the input

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer> items= new ArrayList<Integer>();
		 List<Integer> doubleItems= new ArrayList<Integer>();
		 items.add(23);
		 items.add(46);
		 items.add(34);
		 items.add(8);
		 items.add(21);
		 items.add(92);
		 items.add(17);
		 
		java.util.function.Function<Integer,Integer> mod2= i->i%2;
		java.util.function.Function<Integer,Integer> add2= i->i+10;
		
		 for(int k:items) {
		doubleItems.add(mod2.andThen(add2).apply(k));
		
			 
		 }
		 
		 System.out.println(items); 
		 System.out.println(doubleItems); 
	 
		 
		
	}

}
