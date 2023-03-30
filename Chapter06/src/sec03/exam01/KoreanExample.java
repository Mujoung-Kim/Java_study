package sec03.exam01;

public class KoreanExample {

	public static void main(String[] args) {
		Korean k1 = new Korean("Hyun-min Son", "011225-1234567");
		
		System.out.printf("k1.name : %s\n", k1.name);
		System.out.printf("k1.ssh : %s\n", k1.ssn);

		Korean k2 = new Korean("Ji-sung Park", "930525-0654321");
		
		System.out.printf("k2.name : %s\n", k2.name);
		System.out.printf("k2.ssh : %s\n", k2.ssn);
	}
}