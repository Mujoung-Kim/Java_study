package sec01.exam02;

public class IfElseIfExample {

	public static void main(String[] args) {
		int score = 75;
		
		if (score >= 90) {
			System.out.println("Your score 90 ~ 100.");
			System.out.println("Your rank A.");
		} else if (score >= 80) {
			System.out.println("Your score 80 ~ 89.");
			System.out.println("Your rank B.");
		} else if (score >= 70) {
			System.out.println("Your score 70 ~ 79.");
			System.out.println("Your rank C.");
		} else {
			System.out.println("Your score 70.");
			System.out.println("Your rank D.");
		}
	}
}