package hh;
import java.util.Scanner;
public class h14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int intArray[]=new int[5];
		System.out.print("5개의 정수를 입력하시오");
		
		for(int i=0;i<5;++i)
			intArray[i]=in.nextInt();
		
		System.out.print("입력된 수는 아래와 같습니다");
		for(int i=0;i<5;++i)
			System.out.print(intArray[i]);
	}

}
