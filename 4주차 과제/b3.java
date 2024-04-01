package rhk4;

class Member {
	private String Name, Id, PassWord;
	private int age;

	String getName() {
		return Name;
	}

	String getId() {
		return Id;
	}

	String getPassword() {
		return PassWord;
	}

	int getage() {
		return age;
	}

	void setMember(String Name, String Id, String PassWord, int age) {
		this.Name = Name;
		this.Id = Id;
		this.PassWord = PassWord;
		this.age = age;
	}

	public Member(String Name, String Id, String PassWord, int age) {
		this.Name = Name;
		this.Id = Id;
		this.PassWord = PassWord;
		this.age = age;
	}
}