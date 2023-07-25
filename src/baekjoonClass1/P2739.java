package baekjoonClass1;

import java.util.Scanner;

public class P2739 {

	//https://www.acmicpc.net/problem/2739
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();

		for (int j = 1; j < 10; j++) {
			System.out.println(N + " * " + j + " = " + (N*j));
		}
		
		scanner.close();
	}

}
