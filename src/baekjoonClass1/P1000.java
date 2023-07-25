package baekjoonClass1;

import java.io.IOException;

public class P1000 {

	public static void main(String[] args) {
		
		int A = 0;
		int B = 0;
		
		try {
			A = System.in.read()-48;
			System.in.read();
			while(!(0<A)) {
				A = System.in.read()-48;
				System.in.read();
			
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			B = System.in.read()-48;
			 System.in.read();
			while(!(B<10)) {
				B = System.in.read()-48;
				 System.in.read();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(A+B);
	}

}
