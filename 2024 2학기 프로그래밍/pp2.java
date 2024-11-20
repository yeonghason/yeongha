package pp;

class Person1{
	public String name;
	public int age;
	
	public void setAge(int n) {
		age=n;
		n++;
	}
}
public class pp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person1 aperson=new Person1();
		int a=33;
		
		aperson.setAge(a);
		
		System.out.print(a);
	}

}
