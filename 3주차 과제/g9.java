package rhk3;

public class g9 {

	public static void main(String[] args) {
		foo("안녕",1);
		foo("안녕하세요",1,2);
		foo("잘 있어");
	}
	static void foo(String x,int y,int z) {
		System.out.println(x+""+y+""+z);
	}
	static void foo(String x,int y) {
		System.out.println(x+""+y);
	}
	static void foo(String x) {
		System.out.println(x);
	}

}
