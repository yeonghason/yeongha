package rhk5;

public class as2 {

	public static void main(String[] args) {
		System.out.println(sumExceptFirst(1, 2, 3, 4));
		int arr[] = { 2, 3 };
		System.out.println(sumExceptFirst(1, arr));
		System.out.println(sumExceptFirst(1, 2, 3, 4, 5));
	}

	
	private static int sumExceptFirst(int b, int... v) {
		int sum = 0;
        
		
		for (int j = 0; j < v.length; j++) {
			sum += v[j];
		}
        
	
		for (int i : v) { 
			sum += i;
		}
		return sum;
	}
}