package tt;

class Person3{
	public String name;
	public int age;
	
	public void setAge(int n) {
		age=n;
		n++;
	}
}

public class tt9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person3 aperson=new Person3();
				int a=33;
				aperson.setAge(a);
				System.out.print(a);
	}

}
