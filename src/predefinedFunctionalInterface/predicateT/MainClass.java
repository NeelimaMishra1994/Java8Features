package predefinedFunctionalInterface.predicateT;

import java.util.ArrayList;
import java.util.function.Predicate;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> l=new ArrayList<Employee>();
		l.add(new Employee("Neelima",10000));
		l.add(new Employee("Harish",20000));
		l.add(new Employee("Tanya",30000));
		l.add(new Employee("Shiva",40000));
		l.add(new Employee("Mahesh",50000));
		l.add(new Employee("Adarsh",60000));
		Predicate<Employee> p=e -> e.Salary>30000;
		for(Employee e1:l) {
			if(p.test(e1)) {
				System.out.println(e1.name+""+e1.Salary);
			}
		}
	}

}
