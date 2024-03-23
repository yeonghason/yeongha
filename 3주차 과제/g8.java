package rhk3;

import java.util.Scanner;

public class g8 {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.print("정수를 입력하세요 :");
		int x=in.nextInt();
		System.out.print(factorial(x));
	}
	static int factorial(int n) {
		return switch(n) {
		case 2->2;
		default->n*factorial(n-1);
		};
	}

}
