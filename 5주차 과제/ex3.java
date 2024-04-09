package rhk5;

import java.util.Scanner;

public class ex3 {

		public enum Grade {
			A("최우수"), B("우수"), C("보통"), D("미흡"), E("탈락");

			private String s;

			private Grade(String s) {
				this.s = s;
			}

			public String toString() {
				return s;
			}
		}


			public static void main(String[] args) {
				int numOfStudents = 0;
				int scoreOfStudents = 0;
				int scores[];
				Grade grade;
				Scanner in = new Scanner(System.in);

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
				System.out.println();

				for (int i = 0; i < scores.length; i++) {
					if (scores[i] >= 90) {
						grade = Grade.valueOf("A");
						System.out.println((i + 1) + "번 학생의 등급은 " + grade + "입니다.");
					} else if (scores[i] >= 80) {
						grade = Grade.valueOf("B");
						System.out.println((i + 1) + "번 학생의 등급은 " + grade + "입니다.");
					} else if (scores[i] >= 70) {
						grade = Grade.valueOf("C");
						System.out.println((i + 1) + "번 학생의 등급은 " + grade + "입니다.");
					} else if (scores[i] >= 60) {
						grade = Grade.valueOf("D");
						System.out.println((i + 1) + "번 학생의 등급은 " + grade + "입니다.");
					} else {
						grade = Grade.valueOf("E");
						System.out.println((i + 1) + "번 학생의 등급은 " + grade + "입니다.");
					}
				}
			}
		}