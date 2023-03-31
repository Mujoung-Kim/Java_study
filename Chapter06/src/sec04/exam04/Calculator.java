package sec04.exam04;

public class Calculator {
	int plus(int x, int y) {
		return x + y;
	}
	
	double avg(int x, int y) {
		double sum = plus(x, y);
		
		return sum / (double) 2;
	}
	
	void execute() {
		double result = avg(7, 10);
		
		println("result : " + result);
	}
	
	void println(String message) {
		System.out.println(message);
	}
}