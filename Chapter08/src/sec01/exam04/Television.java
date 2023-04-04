package sec01.exam04;

import sec01.exam03.RemoteControl;

public class Television implements RemoteControl {
	// Field
	private int volume;
	
	// turnOn() abstract method define
	public void turnOn() {
		System.out.println("Power on TV.");
	}
	
	public void turnOff() {
		System.out.println("Power off TV.");
	}
	
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME)
			this.volume = RemoteControl.MAX_VOLUME;
		else if (volume < RemoteControl.MIN_VOLUME)
			this.volume = RemoteControl.MIN_VOLUME;
		else 
			this.volume = volume;
		
		System.out.printf("Now TV volume : %d\n", this.volume);
	}
}