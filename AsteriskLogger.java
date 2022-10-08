package wk5OOP;

public class AsteriskLogger implements Logger{

	@Override
	public void Log(String string) {
		System.out.println("***" + string + "***");
	}
	@Override
	public void Error(String string) {
		System.out.println("*****************");
		System.out.println("***" + "ERROR: " + string + "***");
		System.out.println("*****************");
	}

}
