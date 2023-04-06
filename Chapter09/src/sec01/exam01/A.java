package sec01.exam01;

public class A {
	A() { System.out.println("Create object A."); }
	
	class B {
		B() { System.out.println("Create object B."); }
		int field1;
		
		void method1() { }
	}
	
	static class C {
		C() { System.out.println("Create object C."); }
		int field1;
		static int field2;
		
		void method1() { }
		static void method2() { }
	}
	
	void method() {
		class D {
			D() { System.out.println("Create object D."); }
			int field1;
			
			void method1() { }
		}
		D d = new D();
		
		d.field1 = 3;
		d.method1();
	}
}