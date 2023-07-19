package baekjoon;

import java.util.Scanner;

public class P2439 {
	public static void main(String[] args) {

		//https://www.acmicpc.net/problem/2439
		
		//공백도 객체로 생각하는 사고가 필요한 문제
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		
		for(int i=0; i<length; i++) {

			int space = length-i-1;
			int repeat = i+1;
			
			while(space !=0) {
				System.out.print(" ");
				space--;
			}
			
			while(repeat !=0) {
				System.out.print("*");
				repeat--;
			}
			System.out.println();
		}
		
	}

}
