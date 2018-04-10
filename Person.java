
public class Person {
	enum Gender{
		F, M;
	}
	String firstName;
	String lastName;
	Person.Gender gender;
	long phoneNumber;
	
	public Person(String firstName, String lastName, Person.Gender gender, long phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
	}
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public void displayDetails() {
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(gender);
		System.out.println(phoneNumber);
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}