package sec05.exam01;

public class Car {
	// Field
	String model;
	int speed;
	
	// Construct
	Car(String model) {
		this.model = model;
	}
	
	// Methods
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for (int i = 10; i < 51; i += 10) {
			this.setSpeed(i);
			System.out.printf("%s running. (speed : %dkm/h)\n", this.model, this.speed);
		}
	}
}