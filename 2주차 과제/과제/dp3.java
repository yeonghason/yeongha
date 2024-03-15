package rhk1;

import java.util.Scanner;

public class dp3 {

	public static void main(String[] args) {
		double w,h,v;
		Scanner in =new Scanner(System.in);
		System.out.print("원기둥의 밑면 반지름은?");
		w=in.nextDouble();
		System.out.print("원기둥의 높이는?");
		h=in.nextDouble();
		v=3.14*w*w*h;
		System.out.print("원기둥의 부피는" + v + "입니다.");

	}

}
