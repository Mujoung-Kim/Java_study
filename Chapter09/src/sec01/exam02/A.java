package sec01.exam02;

public class A {
	// Instance field
	B field1 = new B();
	C field2 = new C();
	
	// Instance method
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	
	// Static field init
	static C field4 = new C();
	
	// Static methods
	static void method2() {
		C var2 = new C();
	}
	
	// Instance member class
	class B { }
	
	// Static member class
	static class C { }
}