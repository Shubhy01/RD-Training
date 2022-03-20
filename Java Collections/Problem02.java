//3) Write java code to demonstrate usage of custom class objects (example Student/Employee) in HashMap 

package java_collections;
import java.util.HashMap;

public class Problem02 {

	public static void main(String[] args) {
		HashMap<Student, Integer> record = new HashMap<>();
		
		Student s1 = new Student();
		s1.setId(1);
		s1.setName("Shubham");
		s1.setStream("Electrical");
		
		record.put(s1, 90);
		
		System.out.println(record);
	}

}
