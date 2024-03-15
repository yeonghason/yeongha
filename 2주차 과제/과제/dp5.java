package rhk1;

import java.util.Scanner;

public class dp5 {

	public static void main(String[] args) {
		
		  Scanner in =new Scanner(System.in);
	        System.out.print("소문자 입력:");
	        char input=in.next().charAt(0);
	        int input2= (int)input;
	    
	        System.out.println("대문자 출력:"+(char)(input2-32));


	}

}
