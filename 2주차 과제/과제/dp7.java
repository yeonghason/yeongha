package rhk1;

import java.util.Scanner;

public class dp7 {

	public static void main(String[] args) {
	
		Scanner in =new Scanner(System.in);
        int input=in.nextInt();
        System.out.println(input%4==0 &&input%5==0 ? "true" : "false");
        System.out.println(input%4==0 ||input%5==0 ? "true" : "false");
        System.out.println((input%4==0 ||input%5==0)&&(input%4!=0 &&input%5!=0) ? "true" : "false");

	}

}
