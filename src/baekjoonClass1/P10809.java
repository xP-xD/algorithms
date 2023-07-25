package baekjoonClass1;

import java.util.Scanner;

public class P10809 {

	public static void main(String[] args) {

		//https://www.acmicpc.net/problem/10809
		
		Scanner scanner = new Scanner(System.in);
		
		String S = scanner.next();
		
		for(char i = 'a'; i <='z'; i++) {
			System.out.print(S.indexOf(i)+ " ");
		}
		
		scanner.close();
	}

}
