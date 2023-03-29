package sec01.exam03;

public class IfDiceExample {

	public static void main(String[] args) {
		// random() + a -> a는 최소값을 의미
		int dice = (int) (Math.random() * 6) + 1;
		
		if (dice == 1) 
			System.out.println("Dice number is 1.");
		else if (dice == 2)
			System.out.println("Dice number is 2.");
		else if (dice == 3)
			System.out.println("Dice number is 3.");
		else if (dice == 4)
			System.out.println("Dice number is 4.");
		else if (dice == 5)
			System.out.println("Dice number is 5.");
		else
			System.out.println("Dice number is 6.");
	}
}