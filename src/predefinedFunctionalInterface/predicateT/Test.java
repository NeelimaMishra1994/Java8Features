package predefinedFunctionalInterface.predicateT;

import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {0,5,10,15,20,25,30,35};
		Predicate<Integer> p1 = i -> i%2==0;
		Predicate<Integer> p2 = i -> i >10;
		//and,or and negate()
		System.out.println("The numbers which are not even :");
		for(int x1:x) {
			//if(p1.and(p2.test(x1)))
			//if(p1.or(p2.test(x1)))
			if(p1.negate().test(x1)) {
				System.out.println(x1);
			}
			
//			if(p1.or(p2).test(x1)) {
//				System.out.println(x1);
//			}
		}
	}

}
//Note:for boolean checking purpose we use predicate.
//we can combine two predicate into one predicate using and ,or and negate() method
//predicate can take only one input argument and return always boolean
