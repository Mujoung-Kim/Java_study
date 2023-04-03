package sec02.exam05;

public class ChildExample {

	public static void main(String[] args) {
		Parent parent = new Child();
		
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		/*
		 parent.field2 = "data2";
		 parent.method3();
		 */
		
		// 자동 타입변환이 된 후 다시 자식 class의 내용을 사용하고 싶을 때 강제로 타입을 변환
		Child child = (Child) parent;
		
		child.field2 = "yyy";
		child.method3();
	}
}