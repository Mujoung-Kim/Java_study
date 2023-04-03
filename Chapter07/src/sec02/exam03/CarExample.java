package sec02.exam03;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		
		for (int i = 1; i < 6; i++) {
			int problemLocation = car.run();
			
			switch (problemLocation) {
				case 1:
					System.out.println("Front_left to changed HankookTire.");
					car.frontLeftTire = new HankookTire("Front_left", 15);
					break;
				case 2:
					System.out.println("Front_Right to changed KumhoTire.");
					car.frontRightTire = new KumhoTire("Front_Right", 13);
					break;
				case 3:
					System.out.println("Back_left to changed HankookTire.");
					car.backLeftTire = new HankookTire("Back_left", 14);
					break;
				case 4:
					System.out.println("Back_Right to changed KumhoTire.");
					car.backRightTire = new KumhoTire("Back_right", 17);
					break;
			}
			
			System.out.println("-----------------------------------");
		}
	}
}