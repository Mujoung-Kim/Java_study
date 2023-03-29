package sec02.exam01;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		int sum = 0;
		int[] score;
		
		score = new int[] { 83, 90, 87 };
		for (int i = 0; i < score.length; i++)
			sum += score[i];
		
		System.out.println("score_sum : " + sum);
		
		int sum2 = add(new int[] { 83, 90, 87 });
		
		System.out.println("total_score : " + sum2);
		System.out.println();
	}
	
	public static int add(int[] score) {
		int sum = 0;
		
		for (int i = 0; i < score.length; i++)
			sum += score[i];
		
		return sum;
	}
}