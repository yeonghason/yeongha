package pp;

public class pp10 {
	 public int getMulti(int i, int j) {
		 return i* j;
		 }
		 public int getMulti(int i, int j, int k) {
		 return i* j * k;
		 }
		 public double getMulti(double i, double j) {
		 return i* j;
		 }
		 public double getMulti(double i, double j, double k) {
		 return i* j * k;
		 }

	public static void main(String[] args) {
		pp10 a= new pp10();
		 int i= a.getMulti(1, 2);
		 int j = a.getMulti(1, 2, 3);
		 double k = a.getMulti(1.0, 2.2);
		 double l=a.getMulti(1.0,2.2, 3.3);
		 
		 System.out.print(i);
		 System.out.print(j);
		 System.out.print(k);
		 System.out.print(l);
		 }
	}
