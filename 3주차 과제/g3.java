package rhk3;

import java.util.Scanner;

public class g3 {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int a=0;
			System.out.print("양의 정수를 입력하세요 :");
			int b=in.nextInt();
			do {
				if(b%2==0)
					a+=b;
				System.out.print("양의 정수를 입력하세요 :");
				b=in.nextInt();
		}while (b>0);
			System.out.print("입력한 양의 정수 중에서 짝수의 합은 :"+a);
		}
	}

		

