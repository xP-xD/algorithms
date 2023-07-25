package baekjoonClass1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class P1152 {

	public static void main(String[] args) {
		
		//참고:https://cokes.tistory.com/87
		
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine().trim();
		
		StringTokenizer wordList = new StringTokenizer(string, " ");
		
		int wordCount = wordList.countTokens();
		
		System.out.println(wordCount);
		
		scanner.close();
	}

}
