package sec01.exam03;

public class ComputerExample {

	public static void main(String[] args) {
		int r = 10;

		Calculator calculator = new Calculator();
		
		System.out.println("areaCircle : " + calculator.areaCircle(r));
		System.out.printf("areaCircle : %.3f\n", calculator.areaCircle(r));
		
		Computer computer = new Computer();
		System.out.println("areaCircle : " + computer.areaCircle(r));
		System.out.printf("areaCircle : %.13f\n", computer.areaCircle(r));
	}
}