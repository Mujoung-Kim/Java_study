package sec06.exam06;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		// wrong speed change
		myCar.setSpeed(-50);
		
		System.out.printf("now_speed : %d\n", myCar.getSpeed());
		
		// correct speed change
		myCar.setSpeed(60);
		
		// stop
		if (!myCar.isStop()) 
			myCar.setStop(true);
		
		System.out.printf("now_speed : %d\n", myCar.getSpeed());
	}
}