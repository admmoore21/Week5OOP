package wk5OOP;

public class SpacedLogger implements Logger{

	@Override
	public void Log(String string) {
		for (char c : string.toCharArray()) {
			System.out.print(c + " ");
		}
	}
	@Override
	public void Error(String string) {
		System.out.println();
		System.out.print("ERROR: ");
		for (char c : string.toCharArray()) {
			System.out.print(c + " ");
		}
	}

}
