package sec02.exam02;

public class FieldInitValueExample {

	public static void main(String[] args) {
		FieldInitValue fiv = new FieldInitValue();
		
		System.out.printf("byteValue : %d\n", fiv.byteField);
		System.out.printf("shortValue : %d\n", fiv.shortField);
		System.out.printf("intValue : %d\n", fiv.intField);
		System.out.printf("longValue : %d\n", fiv.longField);
		System.out.printf("booleanValue : %s\n", fiv.booleanField);
		System.out.printf("charValue : %c\n", fiv.charField);
		System.out.printf("floatValue : %.1f\n", fiv.floatField);
		System.out.printf("doubleValue : %.1f\n", fiv.doubleField);
		System.out.printf("arrValue : %d\n", fiv.arrField);
		System.out.printf("referenceValue : %s\n", fiv.referenceField);
	}
}