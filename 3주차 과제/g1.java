package rhk3;

import java.util.Scanner;

public class g1 {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int age;
		System.out.print("나이를 입력하세요 :");
		age=in.nextInt();
		if (age>=19)
			System.out.print("성년");
		else
			System.out.print("미성년");
	}

}
