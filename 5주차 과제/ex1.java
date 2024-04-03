package rhk5;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		int numOfStudents = 0;
		int scoreOfStudents = 0;
		int scores[];
		Scanner in= new Scanner(System.in);

		System.out.printf("학생 수? ");
		numOfStudents = in.nextInt();
		scores = new int[numOfStudents];

		System.out.println(numOfStudents + "명의 학생 성적을 입력하세요.");
		for (int i = 0; i < scores.length; i++) {
			scoreOfStudents = in.nextInt();
			scores[i] = scoreOfStudents;
		}
		System.out.println(numOfStudents + "명의 학생 성적은 다음과 같습니다.");
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + " ");
		}
	}
}