package predefinedFunctionalInterface.function;

import java.util.function.Function;

//Input --> perform some operation and produce result,
//return type could be anything need not be boolean
//then we should go for Function.


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//first is input type second is return type
		//Wherever conditional check required can use predicate 
		//wherever you required to perform some operation can use function
		Function<Student, String> f= s->{
			int marks=s.marks;
			String grade="";
			if(marks>=80)  grade="A[Dictinction]";
			else if(marks>=60)  grade="A[First Class]";
			else if(marks>=50)  grade="B[Second class]";
			else if(marks>=35)  grade="C[third class]";
			else   grade="D[failed]";
			return grade;		
		};
		Student [] s= {new Student("Durga",100),
					  new Student("Sunnny",65),
					  new Student("Bunny",55),
					  new Student("chinny",45),
					  new Student("vinny",25),
				};
		for(Student s1:s) {
			System.out.println("Student Name:"+s1.name);
			System.out.println("Student marks:"+s1.marks);
			System.out.println("Student grades:"+f.apply(s1));
			System.out.println();
			
		}

	}

}
