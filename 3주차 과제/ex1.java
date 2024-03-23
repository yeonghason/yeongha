package rhk3;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		
		System.out.print("팩토리얼 계산을 위한 정수값 입력 :");
		int n = in.nextInt();
		int result = 1; 

		while (n > 0) {
			result *= n--;
		}
		System.out.println(result);

	}

}
