package sec02.exam02;

public class BreakOutterExample {

	public static void main(String[] args) {
		// labeling example label_name:
		Outter: for (char upper = 'A'; upper <= 'Z'; upper++)
			for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);

				if (lower == 'g')
					break Outter;
			}

		System.out.println("System end.");
	}
}