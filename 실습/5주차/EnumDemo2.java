package mp1;

public class EnumDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gender gender=Gender.FEMALE;
		if(gender==Gender.MALE)
			System.out.println(Gender.MALE+"은 병역 의무가 있다.");
		else
			System.out.println(Gender.FEMALE+"은 병역 의무가 없다.");
		for(Gender g : Gender.values())
			System.out.println(g.name());
		
		System.out.println(Gender.valueOf("MALE"));
	}

}

