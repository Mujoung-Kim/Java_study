package sec02.exam01;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		System.out.printf("company : %s\n", myCar.company);
		System.out.printf("model : %s\n", myCar.model);
		System.out.printf("coloe : %s\n", myCar.color);
		System.out.printf("max_speed : %d\n", myCar.maxSpeed);
		System.out.printf("now_speed : %d\n", myCar.speed);
		
		myCar.speed = 60;
		
		System.out.printf("mod_speed : %d\n", myCar.speed);
	}
}