package rhk1;

import java.util.Scanner;

public class dp9 {

	public static void main(String[] args) {
		
		int a,b,c;
		Scanner in =new Scanner(System.in);
		System.out.print("전공이수학점 :");
		a=in.nextInt();
		System.out.print("교양이수학점 :");
		b=in.nextInt();
		System.out.print("일반이수학점 :");
		c=in.nextInt();
		System.out.print(a<70 || b+c<80 || a+b+c<140 ? "졸업불가능":"졸업가능");
		
		
        }

	}