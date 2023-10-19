package Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class predicate {

	
	// 1. accepts one argument and returns boolean PRedicate<T>
	// 2. Used in If conditions 
	// 3. Functional interface with method test();
	
	 public static void main (String[] args){
		 
		 List<Integer> items= new ArrayList<Integer>();
		 List<Integer> Evenitems= new ArrayList<Integer>();
		 items.add(23);
		 items.add(46);
		 items.add(34);
		 items.add(8);
		 items.add(21);
		 items.add(92);
		 items.add(17);
		 
		 Predicate<Integer> mod2= (i->i%2==0);
		 
		 Evenitems= items.stream().filter(mod2).collect(Collectors.toList());
		 System.out.println(Evenitems);
	 }
	 
	
	
}
