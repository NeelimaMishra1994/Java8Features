package defaultAndStaticMethod;

public class InterfaceExample implements InterF1,InterF2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceExample Ie= new InterfaceExample();
		Ie.display();

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		InterF1.super.display();//this the way how you can call spefific interface method if name is same
		InterF2.super.display();
	}
}
