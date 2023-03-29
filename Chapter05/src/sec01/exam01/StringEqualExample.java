package sec01.exam01;

public class StringEqualExample {

	public static void main(String[] args) {
		String strValue1 = "Jadon Sancho";
		String strValue2 = "Jadon Sancho";
		
		if (strValue1 == strValue2)
			System.out.println("strValue1과 strValue2는 참조가 같음");
		else
			System.out.println("strValue1과 strValue2는 참조가 다름");
		
		if (strValue1.equals(strValue2))
			System.out.println("strValue1과 strValue2는 참조가 같음");
		
		String strValue3 = new String("Jadon Sancho");
		String strValue4 = new String("Jadon Sancho");
		
		if (strValue3 == strValue4)
			System.out.println("strValue3과 strValue4는 참조가 같음");
		else
			System.out.println("strValue3과 strValue4는 참조가 다름");
		
		if (strValue3.equals(strValue4))
			System.out.println("strValue3과 strValue4는 참조가 같음");
	}
}