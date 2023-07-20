package baekjoon;

import java.util.Scanner;

public class P2753 {
	
	//https://www.acmicpc.net/problem/2753

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int leapYear = scanner.nextInt();

		if (leapYear % 4 == 0 && leapYear % 100 != 0 || leapYear % 400 == 0) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}

		scanner.close();
	}

}
