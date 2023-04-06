package sec02.exam02;

public class TryCatchFinallyRuntimeExceptionExample {

	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		
		try {
			data1 = args[0];
			data2 = args[1];
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			
			return;
		}
		
		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			
			System.out.printf("%s + %s = %d\n", data1, data2, result);
		} catch(NumberFormatException e) {
			System.out.println(e);
		} finally {
			System.out.println("다시 실행하세요.");
		}
	}
}