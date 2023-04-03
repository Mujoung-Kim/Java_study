package sec02.exam03;

public class KumhoTire extends Tire {
	// Field
	
	// Constructor
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	// Methods
	@Override
	public boolean roll() {
		++accumulatedRotation;
		
		if (accumulatedRotation < maxRotation) {
			System.out.printf("%s KumhoTire life : %d회\n", location, maxRotation - accumulatedRotation);
			
			return true;
		} else {
			System.out.printf("*** %s Flat KumhoTire ***\n", location);
			
			return false;
		}
	}
}