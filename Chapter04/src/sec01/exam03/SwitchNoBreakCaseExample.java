package sec01.exam03;

public class SwitchNoBreakCaseExample {

	public static void main(String[] args) {
		int time = (int) (Math.random() * 4) + 8;
		
		System.out.println("What time is it?");
		System.out.printf("Time is : %dhour\n", time);
		
		switch (time) {
			case 8:
				System.out.println("출근합니다.");
			case 9:
				System.out.println("회의를 합니다.");
			case 10:
				System.out.println("업무를 합니다.");
			default:
				System.out.println("외근을 나갑니다.");
		}
	}
}