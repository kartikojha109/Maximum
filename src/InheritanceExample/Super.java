package InheritanceExample;

public class Super {

	public int phoneNumber = 9893954;
	public String name = "Kartik Ojha";
	public int age = 26;
	public String city = "Indore";

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getCity() {
		return city;
	}

	public int calculateApproxAge() {

		return age * 2;

	}
	
	public void incree() {
		age = age + 20;
	}

}
