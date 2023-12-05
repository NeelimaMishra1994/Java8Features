package defaultAndStaticMethod;

public class MainClass implements InterF {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass mc= new MainClass();
				mc.m3();//we can directly call Default method in implementation class
				mc.m4();
	}
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
	public void m4() {//this is the way how can we override the default method of interface

		System.out.println("This is override version of default method m4");
	}
	
}
