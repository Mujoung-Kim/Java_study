package sec01.exam06;

import sec01.exam03.RemoteControl;
import sec01.exam04.Audio;
import sec01.exam04.Television;

public class MyClass {
	// Field
	RemoteControl rc = new Television();
	
	// Constructor
	MyClass() {
	}
	
	MyClass(RemoteControl rc) {
		this.rc = rc;
		
		rc.turnOn();
		rc.setVolume(5);
	}
	
	// Methods
	void methodA() {
		RemoteControl rc = new Audio();
		
		rc.turnOn();
		rc.setVolume(5);
	}
	
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
	}
}