package pp;
class Person3{
	public String name;
	public int age;
	
	public void setAge(MyInt i) {
		age=i.val;
		i.val++;
	}
}
class MyInt{
	int val;
}

public class pp4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person3 aperson=new Person3();
		MyInt a=new MyInt();
		a.val=33;
		aperson.setAge(a);
		
		System.out.print(a.val);
	}

}
