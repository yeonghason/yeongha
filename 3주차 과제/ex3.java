package rhk3;

public class ex3 {

	public static void main(String[] args) {
		System.out.println(factorial(5));
		System.out.println(factorial(1, 5));
		System.out.println(factorial(3, 5));
		System.out.println(factorial(10, 5));

	}

	public static int factorial(int x) { // 인수가 하나인 변수를 받기 위한 메서드
		int result = 1;
		while (x > 0) {
			result *= x--;
		}
		return result;
	}

	public static int factorial(int x, int y) { // 인수가 두개인 변수를 받기 위한 메서드
		int result = 1;
		for (int i = x; i <= y; i++) {
			result *= i;
		}
		return result;

	}

}
