package baekjoonClass1;

import java.util.Scanner;

public class P11720 {

	public static void main(String[] args) {
		
		//https://www.acmicpc.net/problem/11720
		
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		String number = scanner.next();
		int result = 0;
		
		for(int i = 0; i < N; i++) {
			result += number.charAt(i)-48;
		}
		System.out.println(result);
		
		scanner.close();
	}

}
