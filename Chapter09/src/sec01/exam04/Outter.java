package sec01.exam04;

public class Outter {
	// Java 7
	public void method1(final int arg) {
		final int localVariable = 1;
		
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	
	// Java 8
	public void method2(int arg) {
		int localVariable = 1;
		
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
}