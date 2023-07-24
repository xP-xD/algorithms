package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class P3052 {

	public static void main(String[] args) {

		//https://www.acmicpc.net/problem/3052
		
		int A = 0;
		int B = 42;
		int numberOfInput = 10;
		
		ArrayList<Integer> remainderList = new ArrayList<Integer>();
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i =0; i<numberOfInput; i++){
			A = scanner.nextInt();
			int remainder = A%B;
			boolean duplicated = false;
			
			for(int checkDuplicated : remainderList) {
				if(checkDuplicated == remainder) {
					duplicated = true;
				}
			}
			
			if(duplicated == false) {
				remainderList.add(remainder);
			}
		}
		
		System.out.println(remainderList.size());
		
		scanner.close();
		
	}

}
