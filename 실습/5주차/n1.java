package mp1;

import java.util.Scanner;

public class n1 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("문자열을 입력하세요 :");
		String s=in.nextLine();
		for(int i=s.length()-1;i>=0;i--) {
		System.out.print(s.charAt(i));
		}
	}

}
