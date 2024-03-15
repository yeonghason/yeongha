package rhk1;

import java.util.Scanner;

public class dp8 {

	public static void main(String[] args) {
	
		Scanner in= new Scanner(System.in);
        String a ;
        System.out.print("0~999 사이의 숫자를 입력하세요: ");
        a=in.next();
        int sum=0;
        for(int i=0;i<a.length();i++) {
        sum+=Integer.parseInt(a.substring(i,i+1));
        }
        System.out.println("각 자릿수의 합="+sum);

	}

}
