package tt;

class Person{
	public String name;
	public int age;
	
	public String getName() {
		return name;
	}
}

public class tt1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person aperson=new Person();
		aperson.name="홍길동";
		aperson.age=30;
		int i=aperson.age;
		String s=aperson.getName();
		System.out.println("Name;"+s);
		System.out.println("age"+i);
	}

}
