package Employee;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Employee  implements Serializable{

	private String name;
	private int id;
	private HashMap<String,String> hm;
	/**
	 * @return the hm
	 */
	public HashMap<String, String> getHm() {
		return (HashMap<String, String>) hm.clone();
	}
	/**
	 * @param hm the hm to set
	 */
	public void setHm(HashMap<String, String> hm) {
		this.hm = hm;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int i, String string, Map<String, String> countries) {
		// TODO Auto-generated constructor stub
	}
	
}
