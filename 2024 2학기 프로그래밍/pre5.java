package pre;
import java.util.Scanner;

public class pre5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int count=0;
		double sum=0;
		int i=0;
		int n=in.nextInt();
		while((i=in.nextInt())!=0) {
			if(i>0) {
				sum+=i;
				count++;
			}

		}
		System.out.print(sum);
	}

}