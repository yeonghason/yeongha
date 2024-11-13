package tt;

class Person1{
	public String name;
	public int age;
	String getName() {
		return name;
	}
}

public class tt6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person1[]pa;
		pa=new Person1[10];
		for(int i=0;i<pa.length;i++) {
			pa[i]=new Person1();
			pa[i].age=30+i;
		}
		for(int i=0;i<pa.length;i++)
			System.out.print(pa[i].age+"");
	}

}
