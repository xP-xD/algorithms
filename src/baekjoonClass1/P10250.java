package baekjoonClass1;

import java.util.Scanner;

public class P10250 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//https://www.acmicpc.net/problem/10250
		
		Scanner scanner = new Scanner(System.in);
		
		int T = scanner.nextInt();
		int H = 0;
		int W = 0;
		int N = 0;
		
		for(int i =0; i<T; i++) {
			//층수
			H = scanner.nextInt();
			//방개수
			W = scanner.nextInt();
			//N번째 손님
			N = scanner.nextInt();
			
			int assignedRoom = 0;
			int removeTurnoverCount = 0;
			
			//방번호 구하는 공식 = N번째 손님에서 최대 층수 값을 빼고 나머지 값에 100을 곱하면 층수 + 호수는 N-H의 회전 수 + 방은 1호부터 시작하기 때문에 +1
			while(H<N) {
				N -=H;
				removeTurnoverCount++;
			}
			assignedRoom = N * 100 + removeTurnoverCount + 1;
			
			System.out.println(assignedRoom);
			
		}

		scanner.close();
	}

}
