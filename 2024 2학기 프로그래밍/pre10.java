package pre;

import java.util.Scanner;

public class pre10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int sum=0;
		int n=in.nextInt();
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		System.out.print(sum);
		
	}

}
