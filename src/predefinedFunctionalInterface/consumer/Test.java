package predefinedFunctionalInterface.consumer;

import java.util.function.Consumer;
public class Test {
	//take the input ,perform the operation and don't return anything
	//protype-
	//Interface Consumer<T>{
		//public void accept(T t);
	//}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Consumer<String> c = s->System.out.println(s);
		//c.accept("Neelima");
			
		
		Consumer<Movie> c1 = m->System.out.println(m.name+" ready to release"); 
		Consumer<Movie> c2 = m->System.out.println(m.name+" release but it is bigger flop!"); 
		Consumer<Movie> c3 = m->System.out.println(m.name+" Storing information in database"); 
		Consumer<Movie> cc=c1.andThen(c2).andThen(c3);
		Movie m = new Movie("Spider");
		cc.accept(m);
			
	}

}
