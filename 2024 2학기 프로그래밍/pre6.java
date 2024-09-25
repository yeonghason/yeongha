package pre;

	import java.util.Scanner;

	public class pre6 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner in=new Scanner(System.in);
			char grade;
			while(in.hasNext()) {
				int score=in.nextInt();
				if(score>=90.0)
					grade='a';
				else if(score>=80.0)
					grade='b';
				else if(score>=70.0)
					grade='c';
				else if(score>=60.0)
					grade='d';
				else
					grade='f';
			}
			System.out.print(grade);
		}

	}