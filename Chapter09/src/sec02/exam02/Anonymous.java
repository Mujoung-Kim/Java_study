package sec02.exam02;

public class Anonymous {
	// Field init
	RemoteControl field = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("Turn on TV.");
		}
		
		@Override
		public void turnOff() {
			System.out.println("Turn off TV.");
		}
	};
	
	void method1() {
		// local variable init
		RemoteControl localVar = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("Turn on audio.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("Turn off audio.");
			}
		};
		
		// use local variable
		localVar.turnOn();
	}
	
	void method2(RemoteControl rc) {
		rc.turnOff();
	}
}