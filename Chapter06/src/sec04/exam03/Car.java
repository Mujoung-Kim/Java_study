package sec04.exam03;

public class Car {
	// Field
	int gas;
	
	// Constructor
	
	// Methods
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("No gas");
			return false;
		}
		
		System.out.println("Gas is not empty!");
		return true;
	}
	
	void run() {
		while (true) {
			if (gas > 0) {
				System.out.printf("Running. (gas : %d)\n", gas);
				gas -= 1;
			} else {
				System.out.printf("Stop. (gas : %d)\n", gas);
				return;
			}
		}
	}
}