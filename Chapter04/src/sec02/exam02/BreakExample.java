package sec02.exam02;

import java.util.ArrayList;
import java.util.List;

public class BreakExample {

	public static void main(String[] args) {
//		List<Integer> result = new ArrayList<>();
//		List<Integer> tmp = new ArrayList<>();
//		int count = 0;
		
		while (true) {
			int num = (int) (Math.random() * 6) + 1;
			
//			tmp.add(num);
			System.out.println(num);
			
//			System.out.println("tmp.len : " + tmp.size());
			if (num == 6)
//				System.out.println("6 : " + tmp.size());
//				result.add(1/tmp.size());
//				count++;
				break;
//			if (count == 100)
//				break;
		}
		
//		System.out.println(result);
		System.out.println("System end.");
	}
}