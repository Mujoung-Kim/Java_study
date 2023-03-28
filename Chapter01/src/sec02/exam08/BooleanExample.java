package sec02.exam08;

public class BooleanExample {

	public static void main(String[] args) {
		boolean stop = true;
		
		if (stop) {
			System.out.println("System stop");
			stop = false;
		}
		else System.out.println("System start");
	}
}