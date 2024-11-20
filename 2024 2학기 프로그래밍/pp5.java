package pp;

class Person4{
	public String name;
	public double age;
	
	public void setAge(MyDouble i) {
		age=i.val;
		i.val*=1.5;
	}
}
class MyDouble{
	double val;
}

public class pp5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person4 aperson=new Person4();
		MyDouble a=new MyDouble();
		a.val=33;
		aperson.setAge(a);
		
		System.out.print(a.val);
	}

}
