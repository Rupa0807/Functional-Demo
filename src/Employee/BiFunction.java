package Employee;

import java.util.ArrayList;
import java.util.List;

public class BiFunction {
	
	
	// 1. Accepts two arguments and returns one value BiFunction<T,U,R>
	// 2. Used to apply operation involving both the arguments.
	// 3. Functional Interface with Method Accept(x,y);
	// 4. ToIntBiFunction Accepts two arguments and returns one value ToIntBiFunction<T,U>
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer> items= new ArrayList<Integer>();
		 List<Integer> doubleItems= new ArrayList<Integer>();
		 items.add(1);
		 items.add(2);
		 items.add(3);
		 items.add(8);
		 items.add(6);
		 items.add(9);
		 items.add(7);
		 java.util.function.ToIntBiFunction<Integer,Integer> intfunc=(x,y)->x+y;
		 
		java.util.function.BiFunction<Integer,Integer,Integer> mod2= (x,y)->x*2+--y;
		java.util.function.Function<Integer,Integer> add2= i->i+10;
		
		 for(int k:items) {
		doubleItems.add(intfunc.applyAsInt(k,10));
		
			 
		 }
		 
		 System.out.println(items); 
		 System.out.println(doubleItems); 
	 
		 
		
	}


}
