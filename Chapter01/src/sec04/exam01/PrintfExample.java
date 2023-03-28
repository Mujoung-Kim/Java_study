package sec04.exam01;

public class PrintfExample {

	public static void main(String[] args) {
		int value = 123;
		
		// %d, s, f의 앞에 숫자를 넣어 왼쪽, 오른쪽 정렬할 수 있다.
		System.out.printf("sample pirce : %d\n", value);
		System.out.printf("sample pirce : %6d\n", value);
		System.out.printf("sample pirce : %-6d\n", value);
		System.out.printf("sample pirce : %06d\n", value);
		
		double area = 3.14159 * 10 * 10;
		
		System.out.printf("반 지름이 %d인 원의 넓이 : %10.2f\n", 10, area);
		
		String name = "Jadon Sancho";
		String number = "7";
		
		System.out.printf("%6d | %-10s | %10s\n", 1, name, number);
		System.out.printf("No.%s %s.\n", number, name);
	}
}