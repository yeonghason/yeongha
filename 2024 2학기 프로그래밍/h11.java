package hh;

public class h11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1; i<=100; i++) {
			if(i%2==1)
				continue;
			
			sum+=i;
		}
		System.out.print("1부터 100까지 짝수의 합은"+sum);
	}

}
