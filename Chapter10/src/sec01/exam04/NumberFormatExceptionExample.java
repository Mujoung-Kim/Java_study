package sec01.exam04;

public class NumberFormatExceptionExample {

	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a100";
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		int result = value1 + value2;
		
		// data2가 문자형이기 때문에 value2에서 값을 받을 때 문자로 인식되는 부분을 제거
		System.out.printf("%s + %s = %d\n", data1, data2, result);
	}
}