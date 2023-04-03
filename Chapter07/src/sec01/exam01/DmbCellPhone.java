package sec01.exam01;

public class DmbCellPhone extends CellPhone {
	// Field
	int channel;
	
	// Constructor
	public DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	// Methods
	void turnOnDmb() {
		System.out.printf("Channel : %d번 DMB 방송 수신을 시작합니다.\n", channel);
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.printf("Channel : %d번으로 변경합니다.\n", channel);
	}
	
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}