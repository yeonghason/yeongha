package hh;
import java.util.Scanner;
public class h2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int i,sum;
		int n=in.nextInt();
		for(sum=0,i=1;i<=n;i++) {
			sum+=i;
			System.out.print(i);
			if(i==n) {
				System.out.print("=");
				System.out.print(sum);
				
			}
			else
				System.out.print("+");
		}
	}

}
