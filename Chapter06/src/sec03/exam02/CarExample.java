package sec03.exam02;

public class CarExample {

	public static void main(String[] args) {
		Car car1 = new Car();
		
		System.out.printf("car1.company : %s\n", car1.company);
		System.out.println();
		
		Car car2 = new Car("Fony");
		
		System.out.printf("car2.company : %s\n", car2.company);
		System.out.printf("car2.model : %s\n", car2.model);
		System.out.println();

		Car car3 = new Car("Fony", "Red");
		
		System.out.printf("car3.company : %s\n", car3.company);
		System.out.printf("car3.model : %s\n", car3.model);
		System.out.printf("car3.color : %s\n", car3.color);
		System.out.println();
		
		Car car4 = new Car("Taxi", "Black", 200);
		
		System.out.printf("car4.company : %s\n", car4.company);
		System.out.printf("car4.model : %s\n", car4.model);
		System.out.printf("car4.color : %s\n", car4.color);
		System.out.printf("car4.maxSpeed : %d\n", car4.maxSpeed);
		System.out.println();
	}
}