package sec03.exam01;

public abstract class Phone {
	// Field
	public String owner;
	
	// Constructor
	public Phone(String owner) {
		this.owner = owner;
	}
	
	// Methods
	public void turnOn() {
		System.out.println("Power on phone.");
	}
	
	public void turnOff() {
		System.out.println("Power off phone.");
	}
}