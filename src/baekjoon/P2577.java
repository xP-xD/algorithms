package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class P2577 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//https://www.acmicpc.net/problem/2577
		
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		Scanner scaneer = new Scanner(System.in);

		int A = scaneer.nextInt();
		int B = scaneer.nextInt();
		int C = scaneer.nextInt();

		int multiplyNum = A * B * C;
		while (multiplyNum > 0) {
			numberList.add(multiplyNum%10);
			multiplyNum /= 10;
		}

		for (int i = 0; i < 10; i++) {
			int count = 0;
			for(int numberOfSame : numberList) {
				if(i==numberOfSame) {
					count++;
				}
			}
			System.out.println(count);
		}
	}

}
