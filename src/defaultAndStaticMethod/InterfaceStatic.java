package defaultAndStaticMethod;

public interface InterfaceStatic {
	public static void m5() {
		System.out.println("Hello i am static method in interface");
	}
	default void m1() {
		System.out.println("Hello m1");
	}
	public static void main(String[] args) {//yes,It is possible  we can take main method inside interface
		m5();								//onwards 1.8 version because of 
		System.out.println("Hello i am inside static");
		
	}

}
