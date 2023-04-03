package sec02.exam03;

public class Tire {
	// Field
	public int maxRotation;
	public int accumulatedRotation;
	public String location;
	
	// Constructor
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	// Methods
	public boolean roll() {
		++accumulatedRotation;
		
		if (accumulatedRotation < maxRotation) {
			System.out.printf("%s Tire life : %d회\n", location, maxRotation - accumulatedRotation);
			
			return true;
		} else {
			System.out.printf("*** %s Flat tire ***\n", location);
			
			return false;
		}
	}
}