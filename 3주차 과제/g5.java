package rhk3;

public class g5 {

	public static void main(String[] args) {
		for(int a=1;a<20;a++) {
			for(int b=1;b<20;b++) {
				for(int c=1;c<20;c++) {
					if(a*a+b*b==c*c) {
						System.out.printf("%d,%d,%d" ,a,b,c);
						System.out.println();
					}
				}
			}
		}
	}
}
