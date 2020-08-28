package Team_2;

public class Person {
	private String name;
	private int birth;
	private int phoneNumber;

	Person(String name, int birth, int phonenumber){
		this.name = name;
		this.birth = birth;
		this.phoneNumber = phonenumber;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirth() {
		return birth;
	}

	public void setBirth(int birth) {
		this.birth = birth;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
