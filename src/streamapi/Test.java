package streamapi;
import java.util.*;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> marks=new ArrayList<Integer>();
		marks.add(0);
		marks.add(15);
		marks.add(10);
		marks.add(5);
		marks.add(20);
		marks.add(25);
		System.out.println(marks);
		List <Integer> l2=marks.stream().filter(i->i%2==0).collect(Collectors.toList());
		List <Integer> updatedmarks=marks.stream().map(i->i+5).collect(Collectors.toList());
		int noofFailedSudents=(int) marks.stream().filter(m->m<10).count();
		System.out.println("noofFailedSudents:"+noofFailedSudents);
		System.out.println(l2);
		System.out.println("updatedmarks:"+updatedmarks);
		
		List <Integer> sortedMethod=marks.stream().sorted().collect(Collectors.toList());
		System.out.println("DNSO:ortedMethod:"+sortedMethod);
		
		List <Integer> CustomizedSortingOrder=marks.stream().sorted((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList());//Comparator
		System.out.println("CustomizedSortingOrder:"+CustomizedSortingOrder);
		
		List <Integer> SortedList=marks.stream().sorted((i1,i2)-> i1.compareTo(i2)).collect(Collectors.toList());//comparable for asending DNSO
		System.out.println(SortedList);
		
		List <Integer> SortedList1=marks.stream().sorted((i1,i2)-> -i1.compareTo(i2)).collect(Collectors.toList());//comparable for descending order
		System.out.println(SortedList1);
		
		//Also you can do this
		List <Integer> SortedList2=marks.stream().sorted((i1,i2)-> i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println(SortedList2);
		//List <Integer> max=marks.stream().max(null;)
	}

}
