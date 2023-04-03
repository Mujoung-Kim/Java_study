package sec02.exam03;

public class Car {
	// Field
	Tire frontLeftTire = new Tire("Front_left", 6);
	Tire frontRightTire = new Tire("Front_right", 2);
	Tire backLeftTire = new Tire("Back_left", 3);
	Tire backRightTire = new Tire("Back_right", 4);
	
	// Constructor
	
	// Methods
	int run() {
		System.out.println("[Car running.]");
		
		if (frontLeftTire.roll() == false) {
			stop();
			
			return 1;
		}
		if (frontRightTire.roll() == false) {
			stop();
			
			return 2;
		}
		if (backLeftTire.roll() == false) {
			stop();
			
			return 3;
		}
		if (backRightTire.roll() == false) {
			stop();
			
			return 4;
		}
		return 0;
	}
	
	void stop() {
		System.out.println("[Stop car!]");
	}
}