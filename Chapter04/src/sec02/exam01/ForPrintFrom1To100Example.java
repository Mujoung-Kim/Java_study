package sec02.exam01;

public class ForPrintFrom1To100Example {

	public static void main(String[] args) {
		int result = 0;
		
		for (int i = 1; i < 101; i++) 
			result += i;
		
		System.out.println(result);
	}
}