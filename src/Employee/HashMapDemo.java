package Employee;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.*;

public class HashMapDemo {
	
	
	public static void main(String[] args) {
	Map<String,String> countries = new HashMap<>();
	Map<String,String> capitals = new HashMap<>();
	Map<Integer,Map<String,String>> table = new HashMap<>();
	
	//add a key and value
	countries.put("USA","Washington DC");
	countries.put("India","New Delhi");
	countries.put("Russia","Moscow");
	countries.put("China","Beijing");
	
	
	capitals.put("USA","Washington DC");
	capitals.put("India","New Delhi");
	capitals.put("Russia","Moscow");
	capitals.put("China","Beijing");
	
	table.put(1, countries);
	table.put(2, capitals);
	
	
	
	 
		Map<Integer, Employee> usersMap = Map.of(
			    1, new Employee("Alex",1),

			    4, new Employee("Bob", 4),
			    5, new Employee("gen", 6),
			    7, new Employee("voilet", 7),
			    2, new Employee("Allencapitals", 2),
			    3, new Employee("Briancountries", 3),
			    8, new Employee("Bobcapitals", 4),
		
			    9, new Employee("gencapitals", 6));
		
		
		List<Integer> idList = List.of(1,3,6,7);
		
		for(Map.Entry<Integer,Employee> i:usersMap.entrySet()) {
			System.out.println(i.getKey() +" value: "+ i.getValue().toString());
		}
		Map<Integer, Employee> SortedMap = null;
		try {
			SortedMap = usersMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(e->e.getKey(), Map.Entry::getValue,(e1,e2)->e2,LinkedHashMap::new));
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		Map<Integer, Employee> newMap= usersMap.entrySet().stream().filter(i->idList.contains(i.getKey())).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
	System.out.println("****************************************************************");	
	System.out.println("newMap\n"+SortedMap);
	System.out.println("*************************");
				
	for(Map.Entry<String,String> i:countries.entrySet()) {
		System.out.println(i.getKey()+" : " + i.getValue());
	
	}
	System.out.println("*************************");
	countries.forEach((k,v)->{System.out.println(k+"'s capital is "+v);});
	
	System.out.println("*************************");
	
	countries.entrySet().stream().forEach(e->{System.out.println(e.getKey()+" ; "+e.getValue());});
	
	
	System.out.println("*************************");
	
	
	for(Map.Entry<Integer, Map<String,String>> i:table.entrySet()) {
		System.out.println(i.getKey() +" : "+i.getValue());
	}
	
	for(Entry<Integer, Map<String, String>> i:table.entrySet()) {
		
		System.out.println(i.getValue());
		
	}

}
	
}