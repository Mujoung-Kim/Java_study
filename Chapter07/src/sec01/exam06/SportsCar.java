package sec01.exam06;

public class SportsCar extends Car{
	@Override
	public void speedUp() {
		speed += 10;
	}
	
	// final method로 선언했기 때문에 override 불가능
//	@Override
//	public void stop() {
//		System.out.println("Stop sportscar!");
//		speed = 0;
//	}
}