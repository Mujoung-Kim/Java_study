package sec02.exam02;

public class WhileSumFrom1To100Example {

	public static void main(String[] args) {
		int result = 0;
		int i = 1;
		
		while (i < 101) {
			result += i;
			i++;
		}
		
		System.out.println(result);
	}
}