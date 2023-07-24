package baekjoon;

import java.util.Scanner;

public class P8958 {

	public static void main(String[] args) {

		// https://www.acmicpc.net/problem/8958

		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int continueAnswerCount = 0;
		int point = 0;

		for (int i = 0; i < N; i++) {
			String answers = scanner.next();
			for (char answer : answers.toCharArray()) {
				if (answer == 'O') {
					continueAnswerCount++;
					point += continueAnswerCount;
				} else {
					continueAnswerCount = 0;
					point += continueAnswerCount;
				}
			}
			System.out.println(point);
			point = 0;
			continueAnswerCount = 0;
		}

		scanner.close();

	}

}
