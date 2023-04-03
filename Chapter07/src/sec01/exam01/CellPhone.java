package sec01.exam01;

public class CellPhone {
	// Field
	String model;
	String color;
	
	// Constructor
	
	// Methods
	void powerOn() {
		System.out.println("Power On");
	}
	
	void powerOff() {
		System.out.println("Power Off");
	}
	
	void bell() {
		System.out.println("벨이 울림");
	}
	
	void sendVoice(String message) {
		System.out.printf("Sender : %s\n", message);
	}
	
	void receiveVoice(String message) {
		System.out.printf("Receiver : %s\n", message);
	}
	
	void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
}