package pp;

class Person{
	public String name;
	public int age;
	
	public String getName() {return name;}
}

public class pp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[]pa;
		pa=new Person[10];
		for(int i=0;i<pa.length;i++) {
			pa[i]=new Person();
			pa[i].age=30+i;
		}
		for(int i=0;i<pa.length;i++)
			System.out.print(pa[i].age+"");
	}

}