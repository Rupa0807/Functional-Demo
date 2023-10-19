package Employee;

import java.util.*;
import java.util.stream.Stream;

public interface EnumDemo {



	
	public static void main(String[] args) {
	 Planets p= Planets.EARTH;

	Planets[] parray= Planets.values();
		Stream.of(parray).forEach(i->System.out.println(i.getI()+" " +i+" is the planet number "+i.getName()));
	System.out.println("**************************");
	
	for(Planets i:Planets.values()){
	System.out.println(i);	
	}
	
	
	}
	
	
	
}

