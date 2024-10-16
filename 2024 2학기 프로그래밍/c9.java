package cccc;

import java.util.Scanner;

public class c9 {
	static int[]makeArray(){
		Scanner in=new Scanner(System.in);
		System.out.print("입력");
		int n=in.nextInt();
		int temp[]=new int[n];
		for(int i=0;i<temp.length;i++)
			temp[i]=i;
		return temp;
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int intArray[];
			intArray=makeArray();
			for(int i=0;i<intArray.length;i++)
				System.out.println(intArray[i]);
		}

	}
