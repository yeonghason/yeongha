package chap1;

public class c5 {

	public static void main(String[] args) {
		for (int row = 2; row < 10; row++) {
			for (int column = 1; column < 10; column++) {
				System.out.printf("%4d", row * column);
			}
			System.out.println();
		}
	}

}
