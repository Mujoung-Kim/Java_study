package sec01.exam01;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		// create DmbCellPhone object
		DmbCellPhone dmbCellPhone = new DmbCellPhone("JavaPhone", "Black", 10);
		
		// from CellPhone class extend field
		System.out.printf("Model : %s\n", dmbCellPhone.model);
		System.out.printf("Color : %s\n", dmbCellPhone.color);
		
		// field of DmbCellPhone class
		System.out.printf("Channel : %d\n", dmbCellPhone.channel);

		// from CellPhone class extend method call
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("Hello!");
		dmbCellPhone.receiveVoice("Hi! my name is sancho.");
		dmbCellPhone.sendVoice("Yea! nice to meet too.");
		dmbCellPhone.hangUp();
		
		// method call of DmbCellPhone class
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOnDmb();
	}
}