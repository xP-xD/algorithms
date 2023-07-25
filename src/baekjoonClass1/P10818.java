package baekjoonClass1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P10818 {

	public static void main(String[] args) {
		
		//https://www.acmicpc.net/problem/10818
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		int N = scanner.nextInt();
		int max = 0;
		int min = 0;
		
		for(int i =0; i <N; i++) {
			arrayList.add(scanner.nextInt());
		}
		
		Collections.sort(arrayList);
		min = arrayList.get(0);
		max = arrayList.get(arrayList.size()-1);
		
		System.out.println(min + " "+ max);
		
		scanner.close();
	}

}
