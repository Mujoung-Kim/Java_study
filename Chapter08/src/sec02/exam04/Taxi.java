package sec02.exam04;

import sec02.exam03.Vehicle;

public class Taxi implements Vehicle {
	@Override
	public void run() {
		System.out.println("Running taxi.");
	}
}