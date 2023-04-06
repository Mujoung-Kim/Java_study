package sec02.exam01;

public class AnnoymousExample {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();

		// use anonymous object field
		anony.field.wake();
		// use anonymous object local variable
		anony.method();
		// use anonymous object parameter
		anony.method2(
			new Person() {
				void study() {
					System.out.println("공부를 합니다.");
				}

				@Override
				void wake() {
					System.out.println("8시에 일어납니다.");
					study();
				}
			}
		);
	}
}