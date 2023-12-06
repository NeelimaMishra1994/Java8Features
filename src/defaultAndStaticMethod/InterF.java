package defaultAndStaticMethod;

public interface InterF {
	public void m1();
	public void m2();
	//public void m3();so if you want to add new method you have to implement method in all the classes irespective
	//of you need it in that class or that, to overcome this problem, java people introduced default method in interface 
	//so that we will not add extra code where there is no requirement
	default void m3() {
		System.out.println("default method");
	}
	default void m4() {
		System.out.println("default method of m4");
	}
//	default int hashCode() {//default method can not override the object class method.
							//because it is already availlable to all the implementation class
//		return 0;
//	}
	public static void m5() {
		System.out.println("Hello i am static method");
	}
}
