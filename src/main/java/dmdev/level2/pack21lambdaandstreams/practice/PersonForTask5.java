package dmdev.level2.pack21lambdaandstreams.practice;

public class PersonForTask5 {
	
	private String firstName;
	private String lastName;
	private int age;
	
	public PersonForTask5(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	public String getFullName() {
		return firstName + " " + lastName;
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return "PersonForTask5{" +
				"firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", age=" + age +
				'}';
	}
}
