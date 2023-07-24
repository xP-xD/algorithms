package baekjoon;

import java.util.Scanner;

public class P2884 {

	public static void main(String[] args) {

		// https://www.acmicpc.net/problem/2884

		Scanner scanner = new Scanner(System.in);

		int H = scanner.nextInt();
		int M = scanner.nextInt();
		
		M -= 45;

		if (M >= 60) {
			M -= 60;
			H++;
		} else if (M <= -1) {
			M += 60;
			H--;
		}
		
		if (H >= 24) {
			H = 0;
		} else if (H <= -1) {
			H = 23;
		}

		System.out.println(H + " " + M);
		
		scanner.close();
	}

}
