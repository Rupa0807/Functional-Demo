package Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class mainApp {
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee>
	people= new ArrayList<Employee>();
		people.add( new  Employee("alex",12));
		people.add(new Employee("John",1));
		people.add(new Employee("Bob",6));
		people.add(new Employee("suzy",3));
		
		
		
	List<Employee>evenId=new ArrayList<>();
	evenId=people.stream().filter(
				(e)-> e.getId()%2==0).collect(Collectors.toList());
	
	evenId.forEach(System.out::println);

	}

}
