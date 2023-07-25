package baekjoonClass1;

import java.util.Scanner;

public class P2438 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		
		//별을 i줄에 줄마다 i번씩 찍기
		for(int i=0; i<length; i++) {

			int repeat = i+1;
			while(repeat !=0) {
				System.out.print("*");
				repeat--;
			}
			System.out.println();
		}
		
	}

}
