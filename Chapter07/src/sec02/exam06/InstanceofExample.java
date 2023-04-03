package sec02.exam06;

public class InstanceofExample {
	
	public static void method1(Parent parent) {
		if (parent instanceof Child) {
			Child child = (Child) parent;
			
			System.out.println("method1 - converter to Child.");
		} else
			System.out.println("method1 - not converter to Child.");
	}
	
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		
		System.out.println("method2 - converter to Child.");
	}
	
	public static void main(String[] args) {
		Parent parentA = new Child();
		
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Parent();
		
		method1(parentB);
//		method2(parentB);
	}
}