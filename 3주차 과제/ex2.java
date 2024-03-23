package rhk3;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.print("팩토리얼 계산을 위한 정수값 입력 :");
		int n = in.nextInt();
		System.out.print(factorial(n));
	}

	public static int factorial(int x) {
		int r = 1;
		while (x > 0) {
			r *= x--;
		}
		return r;
	}

}
