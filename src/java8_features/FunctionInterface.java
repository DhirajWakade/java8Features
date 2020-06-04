package java8_features;

public class FunctionInterface {
	public static void main(String args[]) {
		Interf i = (a, b) -> {
			System.out.println("Addition=" + (a + b));
		};

		i.add(10, 20);

		FunctionalInterface1 fi1 = (a, b) -> a + b;
		int add = fi1.add(10, 20);
		System.out.println("Addition=" + add);

	}
}
