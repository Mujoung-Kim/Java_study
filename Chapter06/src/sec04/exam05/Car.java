package sec04.exam05;

public class Car {
	// Field
	int speed;
	
	// Construct
	
	// Methods
	int getSpeed() {
		return speed;
	}
	
	void keyTurnOn() {
		System.out.println("Operation car");
	}
	
	void run() {
		for (int i = 10; i < 51; i++) {
			speed = i;
			System.out.printf("Running. (speed : %d)\n", speed);
		}
	}
}