package pre;

import java.util.Scanner;

public class pre3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int h=0;
		double sum=0;
		int n=in.nextInt();
		while(n!=0) {
			sum+=n;
			h++;
			n=in.nextInt();
		}
		System.out.print(sum);
	}

}
