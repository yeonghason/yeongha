package tt;

import java.util.Scanner;

public class tt5{
	 String name;
	 int age;
	 String gender;
	
    String getName() {
		return name;
	}
	int age() {
		return age;
	}
	 String getGender() {
		return gender;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		Person aperson=new Person();
		aperson.name=in.next();
		aperson.age=in.nextInt();
		aperson.gender=in.next();
		
	}

}
