package sec03.exam01;

public class PhoneExample {

	public static void main(String[] args) {
		// Phone phone = new Phone();
		SmartPhone smartPhone = new SmartPhone("Marcus Rashford");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}
}