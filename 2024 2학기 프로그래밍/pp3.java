package pp;
class Person2{
	public String name;
	public int age;
	
	public int setAge(int n) {
		age=n;
		n++;
		return n;
	}
}
public class pp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person2 aperson=new Person2();
		int a=33;
		
		a=aperson.setAge(a);
		
		System.out.print(a);
	}

}
