package lambdaExpression;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Test t= new Test();
		//InterF t= new Test();
		//System.out.println(t.add(4, 5));//this is normal code
		InterF t1= (a,b) -> System.out.println((a+b));//this is lambda expression
		t1.add(5, 5);
		
	}
}
