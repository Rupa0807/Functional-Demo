package Employee;

     import static java.lang.System.*;
	import java.io.*;
	public class serialization {

	   public static void main(String [] args) {
		   
		   StringBuilder s1 = new StringBuilder("Hello"); 
		   out.println(s1 +""+s1.hashCode()); 
		   
	         s1 = new StringBuilder(" World"); 
	         out.println(s1+""+s1.hashCode());//String 2  
	        
		   final Employee objectName ;// new Employee();
		 objectName=new  Employee(); // Blank final reference variable

		   System.out.println("apple".compareTo("banana"));
	      Employee e = new Employee();
	      e.setName("Reyan Ali");
	    e.setId(1234);
	     
	      
	      try {
	         FileOutputStream fileOut =
	         new FileOutputStream("/tmp/employee.doc");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	       out.writeObject(e);
	         out.close();
	         fileOut.close();
	         System.out.println("Serialized data is saved in /tmp/employee.ser");
	      } catch (IOException i) {
	         i.printStackTrace();
	      }
	   }
	}


