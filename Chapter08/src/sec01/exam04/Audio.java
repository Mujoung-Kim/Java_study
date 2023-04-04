package sec01.exam04;

import sec01.exam03.RemoteControl;

public class Audio implements RemoteControl {
	// Field
	private int volume;
	
	public void turnOn() {
		System.out.println("Power on audio.");
	}
	
	public void turnOff() {
		System.out.println("Power off audio.");
	}
	
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME)
			this.volume = RemoteControl.MAX_VOLUME;
		else if (volume < RemoteControl.MIN_VOLUME)
			this.volume = RemoteControl.MIN_VOLUME;
		else
			this.volume = volume;
		
		System.out.printf("Now audio volume : %d\n", this.volume);
	}
}