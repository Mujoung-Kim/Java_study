package sec02.exam01;

import java.util.Scanner;

public class ForMultiplicationTableExample {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i;
		
		for (i = input.nextInt(); i < 10; i++) {
			System.out.printf("***%ddan***\n", i);
			for (int j = 1; j < 10; j++)
				System.out.printf("%d x %d = %d\n", i, j, i * j);
		}
	}
}