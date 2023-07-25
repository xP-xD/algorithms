package baekjoonClass1;

import java.util.Scanner;

public class P10950 {
	public static void main(String[] args) {

		//https://www.acmicpc.net/problem/10950

		Scanner scanner = new Scanner(System.in);
		
		int testCase = scanner.nextInt();
		
		for(int i =0; i<testCase; i++ ) {
			int A = scanner.nextInt();
			int B = scanner.nextInt();
			
			System.out.println(A+B);
		}

		scanner.close();
	}
}
