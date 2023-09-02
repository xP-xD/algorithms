package baekjoonClass2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

class WordList {
	
	ArrayList<String> content;
	HashSet<String> removedDuplication;

	public WordList() {
		this.content = new ArrayList<String>();
		this.removedDuplication = new HashSet<String>();
	}
	
	public void removeDuplication(String data) {
		if(removedDuplication.add(data)) {
			content.add(data);
		}
	}
	
	public void sort() {
		//중복이 제거된 단어 목록에 사전순 정렬 후 길이순으로 정렬
		content.sort(Comparator.naturalOrder());
		content.sort(Comparator.comparing(String::length));
		
	}
	
	public void println() {
		for (String word : content) {
			System.out.println(word);
		}
	}

}

public class P1181 {

	public static void main(String[] args) {

		// https://www.acmicpc.net/problem/1181

		Scanner scanner = new Scanner(System.in);
		WordList wordList = new WordList();
		
		int N = scanner.nextInt();

		//중복제거
		for (int i = 0; i < N; i++) {
			wordList.removeDuplication(scanner.next());
		}
		
		wordList.sort();
		
		wordList.println();
		
		scanner.close();

	}

}
