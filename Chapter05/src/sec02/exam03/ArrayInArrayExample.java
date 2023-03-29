package sec02.exam03;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		int[][] mathScore = new int[2][3];
		
		for (int i = 0; i < mathScore.length; i++)
			for (int j = 0; j < mathScore[i].length; j++)
				System.out.printf("mathScore[%d][%d] = %d\n", i, j, mathScore[i][j]);
		
		int[][] englishScore = new int[2][];
		englishScore[0] = new int[2];
		englishScore[1] = new int[3];
		
		for (int i = 0; i < englishScore.length; i++)
			for (int j = 0; j < englishScore[i].length; j++)
				System.out.printf("englishScore[%d][%d] = %d\n", i, j, englishScore[i][j]);
		
		int[][] javaScore = { {95, 80}, {92, 96, 80} };
		
		for (int i = 0; i < javaScore.length; i++)
			for (int j = 0; j < javaScore[i].length; j++)
				System.out.printf("javaScore[%d][%d] = %d\n", i, j, javaScore[i][j]);
	}
}