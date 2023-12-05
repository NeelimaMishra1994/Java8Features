package lambdaExpressionWithCollection;
import java.util.*;
public class mainClass {

	public static void main(String[] args) {
//		Employee e = new Employee("Neelima", 23);
//		System.out.println(e);
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee("Neelima",123));
		al.add(new Employee("Harish",456));
		al.add(new Employee("Khangar",789));
		al.add(new Employee("Tanya",1011));
		al.add(new Employee("Sreya",1213));
		al.add(new Employee("Yannam",1415));
		Collections.sort(al,(e1,e2)->(e1.eno<e2.eno)?-1:(e1.eno>e2.eno?1:0));
		System.out.println(al);
		//sort based on Alphabetical order
		//s1.compareTo(s2)//always aplicable for alphabetical order
		//CpmpateTo is appplicable for alphabetical order if it is string object && if it is number it is applicable
		//ascending order
		Collections.sort(al,(e1,e2)->e1.name.compareTo(e2.name));
		System.out.println(al);
		
		
	}

}
