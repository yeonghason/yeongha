package rhk5;

import java.util.Scanner;

public class as5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String Star[] = new String[10];
		int starNumberRange[] = new int[10];
		System.out.println("숫자를 10개 입력하세요.");
		for (int j = 0; j < 10; j++) {
			Star[j] = "";
		}
		for (int i = 0; i < 10; i++) {
			int number = in.nextInt();
			starNumberRange[i] = i;
			if (number >= 90 && number < 100) {
				Star[9] += "*";
			} else if (number >= 80) {
				Star[8] += "*";
			} else if (number >= 70) {
				Star[7] += "*";
			} else if (number >= 60) {
				Star[6] += "*";
			} else if (number >= 50) {
				Star[5] += "*";
			} else if (number >= 40) {
				Star[4] += "*";
			} else if (number >= 30) {
				Star[3] += "*";
			} else if (number >= 20) {
				Star[2] += "*";
			} else if (number >= 10) {
				Star[1] += "*";
			} else if (0 < number && number < 10) {
				Star[0] += "*";
			}
		}
		for (int j = 0; j < Star.length; j++) {
			if (j == 0) {
				System.out.println(
						" " + starNumberRange[j] * 10 + " ~ " + (starNumberRange[j] * 10 + 9) + " : " + Star[j]);
			} else {
				System.out.println(starNumberRange[j] * 10 + " ~ " + (starNumberRange[j] * 10 + 9) + " : " + Star[j]);
			}
		}
	}
}