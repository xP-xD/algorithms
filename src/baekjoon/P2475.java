package baekjoon;

import java.util.Scanner;

public class P2475 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//https://www.acmicpc.net/problem/2475
		
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		int D = scanner.nextInt();
		int E = scanner.nextInt();
		
		int parityNum = (A*A+B*B+C*C+D*D+E*E)%10;
		
		System.out.println(parityNum);
	}

}
