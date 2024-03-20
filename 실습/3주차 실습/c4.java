package chap1;

public class c4 {

	public static void main(String[] args) {
		int row = 2;
		while (row < 10) {
			int column = 1;
			while (column < 10) {
				System.out.printf("%4d", row * column);
				column++;
			}
			System.out.println();
			row++;
		}
	}
}