package baekjoon;

import java.util.Scanner;

public class P2675 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int T = scanner.nextInt();
		int R = 0;
		String S = null;
		String P = null;

		for (int i = 0; i < T; i++) {
			R = scanner.nextInt();
			S = scanner.next();
			P = "";

			for (int j = 0; j < S.length(); j++) {
				P += ((Character) S.charAt(j)).toString().repeat(R);
			}
			System.out.println(P);
		}

	}
}
