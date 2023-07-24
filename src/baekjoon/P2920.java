package baekjoon;

import java.util.Scanner;

public class P2920 {

	public static void main(String[] args) {

		// https://www.acmicpc.net/problem/2920

		Scanner scanner = new Scanner(System.in);

		String scales = scanner.nextLine();
		String[] scaleArray = scales.split(" ");

		int orderCount = 0;
		for (int i = 0; i < scaleArray.length; i++) {
			if (Integer.parseInt(scaleArray[i]) == i + 1) {
				orderCount++;
			} else if (i == scaleArray.length - Integer.parseInt(scaleArray[i])) {
				orderCount--;
			}
		}

		if (orderCount == scaleArray.length) {
			System.out.println("ascending");
		} else if (orderCount == -scaleArray.length) {
			System.out.println("descending");
		} else {
			System.out.println("mixed");
		}

		scanner.close();
	}

}
