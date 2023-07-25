package baekjoonClass1;

import java.util.ArrayList;
import java.util.Scanner;

public class P2562 {

	public static void main(String[] args) {

		// https://www.acmicpc.net/problem/2562

		ArrayList<Integer> numberList = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);

		int MaxNum = 0;
		int MaxNumRow = 0;

		System.out.println("100보다 작은 자연수를 입력해주세요.");
		for (int i = 0; i < 9; i++) {
			boolean isProblem = true;
			while (isProblem) {
				boolean isDuplication = false;
				int insertNumber = scanner.nextInt();
				// 100보다 작은 자연수가 아닌경우
				if (insertNumber < 1 || insertNumber >= 100) {
					System.out.println("100이상이거나 자연수가 아닌 값을 입력하였습니다 다시 입력해주세요.");
				} else {
					// 중복값이 있는지 검사
					for (int duplicationCheck : numberList) {
						if (duplicationCheck == insertNumber) {
							System.out.println("중복값은 허용되지 않습니다. 새로운 값을 입력해주세요.");
							isDuplication = true;
						}
					}

					// 중복이 없고, 100보다 작은 자연수가 맞다면 추가
					if (isDuplication == false) {
						numberList.add(insertNumber);
						isProblem = false;
					}
				}
			}
		}

		for (int i = 0; i < 9; i++) {
			if (MaxNum < numberList.get(i)) {
				MaxNum = numberList.get(i);
				MaxNumRow = i + 1;
			}
		}

		System.out.println(MaxNum);
		System.out.println(MaxNumRow);

	}

}
