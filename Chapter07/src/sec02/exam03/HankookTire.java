package sec02.exam03;

public class HankookTire extends Tire {
	// Field
	
	// Constructor
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	// Methods
	@Override
	public boolean roll() {
		++accumulatedRotation;
		
		if (accumulatedRotation < maxRotation) {
			System.out.printf("%s HankookTire life : %d회\n", location, maxRotation - accumulatedRotation);
			
			return true;
		} else {
			System.out.printf("*** %s Flat HankookTire ***\n", location);
			
			return false;
		}
	}
}