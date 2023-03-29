package sec02.exam01;

public class ArrayCreateByValueListExample {

	public static void main(String[] args) {
		int[] score = {83, 90, 87};
		int sum = 0;
		
		System.out.println("score[0] : " + score[0]);
		System.out.println("score[1] : " + score[1]);
		System.out.println("score[2] : " + score[2]);
		
		for (int i = 0; i < score.length; i++)
			sum += score[i];
		
		System.out.println("score_sum : " + sum);
		
		double avg = (double) sum / score.length;
		
		System.out.printf("score_avg : %.2f\n", avg);
	}
}