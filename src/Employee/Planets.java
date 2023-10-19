package Employee;

import java.util.Arrays;

public enum Planets {
	//1.group of constants that behave like object
	//2.constant should be declared first
	MERCURY(1,"First Panet"),VENUS(2,"Second"),EARTH(3,"third"),MARS(4,"Fourth");
	/**
	 * @return the i
	 */
	public int getI() {
		return i;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	//3.semicolon  at the end of constants before declaring constructors and fields
	int i;
	String name;
	private Planets(int i, String name) {
		this.i = i;
		this.name = name;
	}
	private Planets() {}

	

		
	}
	
	
	

