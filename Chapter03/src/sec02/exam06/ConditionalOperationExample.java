package sec02.exam06;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		int score = 85;
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		// if score > 90 grade = 'A' else if score > 80 grade 'B' else 'C' 와 같음
		// if (score > 90) grade = 'A';	
		// else if (score > 80) grade = 'B';
		// else grade = 'C';
		
		System.out.println(grade);
	}
}