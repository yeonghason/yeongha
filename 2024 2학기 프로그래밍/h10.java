package hh;
import java.util.Scanner;
public class h10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
		int num=0;
		
		
		while(true) {
			if(in.nextInt()==-1) {
				break;
				num++;
			}
			System.out.print(num);
		}
	}

}
