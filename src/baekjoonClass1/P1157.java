package baekjoonClass1;

import java.util.Scanner;

public class P1157 {

	// O(n)

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 입력받을 문자열
		// Input string
		String string;

		// 제일 많이 사용된 글자 저장소
		// Storage for the most frequently used character
		Character mostUsedChar = null;
		int mostCount = 0;
		// 비교할 임시 캐릭터, 카운터
		// Temporary character and counter for comparison
		Character compareChar = null;
		int compareCount = 0;

		// 키보드로부터 입력받기
		// Read input from the keyboard
		Scanner scanner = new Scanner(System.in);
		string = scanner.nextLine();

		//알파벳 순으로 문자열 알파벳을 하나씩 비교하고 같은 알파벳마다 카운트로 숫자를 증가 
		// Compare each character in the string with the alphabetical order of the alphabet,
		// and increment the count for each matching character
		for (char i = 'A'; i <= 'Z'; i++ ) {
			for (int j = 0; j < string.length(); j++) {
				if(i == Character.toUpperCase(string.charAt(j))) {
					compareChar = i;
					compareCount++;
				}
				
				//가장 많이 사용된 알파벳보다 비교값이 클 경우 값을 대입
				// If the count is greater than the count of the most frequently used character, update the value
				if(mostCount < compareCount) {
					mostUsedChar = compareChar;
					mostCount = compareCount;
				//많이 사용된 단어인데 다를 알파펫 일때는 '?'를 출력
				// If there are different characters with the same count and it is the most frequently used character, output '?'
				}else if(compareCount == mostCount && compareChar != mostUsedChar) {
					mostUsedChar = '?';
				}
			}
			//카운트 초기화
			//Reset the count
			compareCount = 0;
		}

		System.out.println(Character.toUpperCase(mostUsedChar));

	}

}
