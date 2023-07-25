package baekjoonClass1;

import java.util.Scanner;

public class P10871 {

	public static void main(String[] args) {
		
		//https://www.acmicpc.net/problem/10871

		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int X = scanner.nextInt();
		
		for(int i = 0;i<N;i++) {
			int A = scanner.nextInt();
			
			if(A < X) {
				System.out.print(A + " ");
			}
		}
		
		scanner.close();
	}

}
