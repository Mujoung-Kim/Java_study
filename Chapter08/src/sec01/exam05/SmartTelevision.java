package sec01.exam05;

import sec01.exam03.RemoteControl;

public class SmartTelevision implements RemoteControl, Searchable {
	private int volume;
	
	public void turnOn() {
		System.out.println("Power on smartTV.");
	}
	
	public void turnOff() {
		System.out.println("Power off smartTV.");
	}
	
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME)
			this.volume = RemoteControl.MAX_VOLUME;
		else if (volume < RemoteControl.MIN_VOLUME)
			this.volume = RemoteControl.MIN_VOLUME;
		else
			this.volume = volume;
		
		System.out.printf("Now smartTV volume : %d\n", this.volume);
	}
	
	public void search(String url) {
		System.out.printf("%s for searching.", url);
	}
}