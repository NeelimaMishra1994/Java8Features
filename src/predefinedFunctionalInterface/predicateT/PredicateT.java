package predefinedFunctionalInterface.predicateT;

import java.util.function.*;

public class PredicateT {
	//it has only one abstract method test
	//public boolean test(T t);here i can not write just i kept for reference
	public static void main(String[] args) {
//		Predicate<Integer> p1 = i->i%2==0;
//		System.out.println(p1.test(10));
//		System.out.println(p1.test(15));

//		Predicate<Employee> p1=e->e.salary>1000 && e.isHavingGF==true;
//		System.out.println(p1.test(e));
		
		//Q write a predicate to check whether length of string is >5 or not
		
//		Predicate<String> p1=str->str.length()>5;
//		System.out.println(p1.test("Neelima"));
		
		String [] s= {"Nag", "Chiranjeevi","Venkatesh","Balaiah","Sunny","Katrina"};
		Predicate<String> p = s1->s1.length()>5;
		for(String s1:s) {
			if(p.test(s1)) {
				System.out.println(s1);
			}
		}
		
	}

}
//Npte:so in our programming at place of conditional checking we can use predicate