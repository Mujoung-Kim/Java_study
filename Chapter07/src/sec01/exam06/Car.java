package sec01.exam06;

public class Car {
	// Field
	public int speed;
	
	// Constructor
	public void speedUp() {
		speed += 1;
	}
	
	// final Methods
	public final void stop() {
		System.out.println("Stop car!");
		speed = 0;
	}
}