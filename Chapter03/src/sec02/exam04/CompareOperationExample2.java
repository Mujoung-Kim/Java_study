package sec02.exam04;

public class CompareOperationExample2 {

	public static void main(String[] args) {
		int value = 1;
		double value1 = 1.0;
		
		System.out.println(value == value1);
		
		double value2 = 0.1;
		float value3 = 0.1f;
		
		System.out.println(value2 == value3);
		System.out.println((float) value2 == value3);
	}
}