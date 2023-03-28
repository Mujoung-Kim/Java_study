package sec04.exam03;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String inputData;
		
		while (true) {
			inputData = input.nextLine();
			
			if (inputData.equals(":q"))
				break;
			else 
				System.out.println(inputData);
		}
		
		System.out.println("System end!");
	}
}