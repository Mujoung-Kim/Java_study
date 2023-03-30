package sec03.exam02;

public class Car {
	// Field
	String company = "Hyundai";
	String model;
	String color;
	int maxSpeed;
	
	// constructor
	Car() {
	}
	
	Car(String model) {
//		this.model = model;
		// short code
		this(model, "siver", 250);
	}
	
	Car(String model, String color) {
//		this.model = model;
//		this.color = color;
		// short code
		this(model, color, 250);
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}