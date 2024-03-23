package rhk3;

import java.util.Scanner;

public class g10 {

	public static void main(String[] args) {
		System.out.print("양의 정수를 입력하세요 :");
		int n=new Scanner(System.in).nextInt();
		if(isPrime(n))
			System.out.println(n+"은 소수입니다");
		else
			System.out.println(n+"은 소수가 아닙니다");
	}
	static boolean isPrime(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}

}
