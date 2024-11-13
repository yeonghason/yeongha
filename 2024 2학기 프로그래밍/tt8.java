package tt;
import java.util.Scanner;
class Person2{
	String name;
	int age;
	String gender;
	String getName() {return name;}
	int getAge() {return age;}
	String getGender() {return gender;}
}
public class tt8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person2[] apersonArray;
		apersonArray=new Person2[3];
		Scanner s=new Scanner(System.in);
		for(int i=0;i<apersonArray.length;i++) {
			apersonArray[i]=new Person2();
			apersonArray[i].name=s.next();
			apersonArray[i].age=s.nextInt();
			apersonArray[i].gender=s.next();
	}
		for(int i=0; i<apersonArray.length;i++) {
			System.out.print(apersonArray[i].getName()+"");
			System.out.print(apersonArray[i].getAge()+"");
			System.out.print(apersonArray[i].getGender()+"");
	}
	}

}
