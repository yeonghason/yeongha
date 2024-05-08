package tkdthr11;

interface Portable{
	void inMyBag();
}

public class Notebook extends Computer implements Portable {
	public void inMyBag() {
		System.out.println("노트북은 가방에 있다.");
	}
	public void turn0n() {
		System.out.println("노트북을 켠다.");
	}
	public void turn0ff() {
		System.out.println("노트북을 끈다.");
	}

	public static void main(String[] args) {
		Notebook n=new Notebook();
		
		n.turn0n();
		n.turn0ff();
		n.inMyBag();
	}

}
