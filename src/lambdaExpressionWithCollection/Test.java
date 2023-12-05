package lambdaExpressionWithCollection;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(20);
		al.add(10);
		al.add(25);
		al.add(5);
		al.add(30);
		al.add(0);
		al.add(15);
		Comparator <Integer> c= (o1,o2) ->(o1<o2)?-1:(o1>o2)?1:0;
		Collections.sort(al, c);
		System.out.println(al);

	}

}
