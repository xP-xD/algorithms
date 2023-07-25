package baekjoonClass1;

import java.util.Scanner;

public class P10869 {

	public static void main(String[] args) {
		
		//https://www.acmicpc.net/problem/10869

		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		
		System.out.println(A+B);
		System.out.println(A-B);
		System.out.println(A*B);
		System.out.println(A/B);
		System.out.println(A%B);
		
		scanner.close();
	}

}
