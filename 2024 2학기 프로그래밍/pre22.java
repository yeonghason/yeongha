package pre;

import java.util.Scanner;

public class pre22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1, sum=0;
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		
		while(i<=n) {
			sum+=i;
			++i;
		}
		System.out.print(sum);
	}

}
