package streamapi;
import java.util.*;
import java.util.stream.Collectors;
//based on string length sorting
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
		al.add("Sunney loene");
		al.add("Kajal Agrawal");
		al.add("Prabhas");
		al.add("Anushka Shetty");
		al.add("Malika sherawat");
		System.out.println(al);
		Comparator<String> c = (s1,s2) ->{
			int l1=s1.length();
			int l2=s2.length();
			if(l1<l2) return -1;
			else if(l1>l2) return 1;
			else return s1.compareTo(s2);
		};
		List <String> l2=al.stream().sorted(c).collect(Collectors.toList());
		System.out.println(l2);
		
	}

}
