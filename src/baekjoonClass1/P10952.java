package baekjoonClass1;

import java.util.Scanner;

public class P10952 {

	public static void main(String[] args) {

		// https://www.acmicpc.net/problem/10952

		Scanner scanner = new Scanner(System.in);

		while(true) {
			int A = scanner.nextInt();
			int B = scanner.nextInt();
			
			if(A == 0 && B ==0)
				break;
			
			System.out.println(A+B);
		}
		
		scanner.close();
	}

}
