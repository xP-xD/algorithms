package baekjoonClass1;

import java.util.Scanner;

public class P27866 {

	public static void main(String[] args) {
		
		//https://www.acmicpc.net/problem/27866

		Scanner scanner = new Scanner(System.in);
		
		String S = scanner.next();
		int i = scanner.nextInt();
		
		System.out.println(S.charAt(i-1));
		
		scanner.close();
	}

}
