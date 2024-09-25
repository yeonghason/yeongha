package pre;

public class pre11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,sum;
		for(sum=0,i=1;i<=10;i++) {
			sum+=i;
			System.out.print(i);
			if(i==10) {
				System.out.print("=");
				System.out.print(sum);
			}
			else
				System.out.print("+");
		}
		
	}

}
