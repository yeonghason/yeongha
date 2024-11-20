package pp;

public class pp9 {
	 public int getSum(int i, int j) {
		 return i + j;
		 }
		 public int getSum(int i, int j, int k) {
		 return i + j + k;
		 }
		 public double getSum(double i, double j) {
		 return i + j;
		 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		pp9 a = new pp9();
		int i = a.getSum(1, 2);
		 System.out.println(i);
		 int j = a.getSum(1, 2, 3);
		 System.out.println(j);
		 double k = a.getSum(1.1, 2.2);
		 System.out.println(k);
	}

}
