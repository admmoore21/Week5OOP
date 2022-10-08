package wk5OOP;

public class App {

	public static void main(String[] args) {
		
		String greeting = "Welcome!";
		String name1 = "Adam";

		Logger test1 = new AsteriskLogger();
		test1.Log(greeting);
		test1.Error(name1);
		
		Logger test2 = new SpacedLogger();
		test2.Log(greeting);
		test2.Error(name1);
		
	}

}
