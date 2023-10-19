package Employee;

import java.math.BigDecimal;
import java.lang.System;
import java.util.random.*;

public class Methodrefernces {
	int a;
	
public Methodrefernces() {
		
	System.out.println("inside constructor method refernce "+a*a);	// TODO Auto-generated constructor stub
	}
public  Methodrefernces(int h) {
	this.a=h;
	System.out.println( a);
		// TODO Auto-generated constructor stub
	
	}
int	mySquare(int a){
	return a*a;	
	}
 static int  mystaticSquare(int a) {
	return a*a;
}
public static void main(String[] args) {
	
Methodrefernces m= new Methodrefernces(8);
//Instance method reference of object type
Arithmetic a=m::mySquare;
System.out.println("square= "+a.square(6));


// static method reference
Arithmetic astatic= Methodrefernces::mystaticSquare;
System.out.println("square= "+astatic.square(11));


// method reference to an instant method of arbitrary object of a particular type
myprint arbitaryObj= System.out::println;
arbitaryObj.print(7);

//method reference to constructor
myprint constobj= Methodrefernces::new;
constobj.print(9);
}	

}
@FunctionalInterface
interface myprint{
	
	void print(int a);	
}

@FunctionalInterface
interface Arithmetic{
	
	int square(int a);	
}