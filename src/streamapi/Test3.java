package streamapi;
import java.util.*;
import java.util.stream.Collectors;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(0);
		al.add(15);
		al.add(5);
		al.add(20);
		System.out.println(al);
		Integer min = al.stream().min((i1,i2)->i1.compareTo(i2)).get();
		Integer max = al.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("MIN:"+min);
		System.out.println("Max:"+max);
		
	}

}
