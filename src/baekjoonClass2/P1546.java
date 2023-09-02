package baekjoonClass2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P1546 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//https://www.acmicpc.net/problem/1546
		
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		
		int M = 0;
		int N = scanner.nextInt();
		float total = 0;
		float avg = 0;
		
		//값들을 배열에 저장
		for(int i =0; i <N; i++) {
			numberList.add(scanner.nextInt());
		}

		//역정렬
		Collections.sort(numberList, Collections.reverseOrder());
		
		for(Integer number : numberList) {
			//최고점
			M = numberList.get(0);
			//공식 대입
			float fixedScore = (float)number/M * 100;
			total += fixedScore;
			
		}
		
		avg = total/numberList.size();
		
		System.out.println(avg);
		
		scanner.close();
	}

}
