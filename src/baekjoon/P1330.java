package baekjoon;

import java.util.Scanner;

public class P1330 {

	public static void main(String[] args) {

		int A = 0;
		int B = 0;

//		System.out.println("문제 : 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.");
//		System.out.println("A를 입력 후 스페이스바를 누르시고 B를 입력하세요.");

		Scanner scanner = new Scanner(System.in);

		A = scanner.nextInt();
		B = scanner.nextInt();

		if (A < B) {
			System.out.println("<");
		} else if (A > B) {
			System.out.println(">");
		} else {
			System.out.println("==");
		}
	}
}
