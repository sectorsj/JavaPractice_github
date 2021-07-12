package dmdev.level2.pack23serializationdeserialization;

import java.io.Serializable;

public class PersonForSerialization implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int age;
	
	// пометка transient говорит о том, что мы не хотим чтобы это поле сериализовывалось.
	private transient String firstName;
	
	public PersonForSerialization(int age, String firstName) {
		this.age = age;
		this.firstName = firstName;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}

//	public void setAge(int age) {
//		this.age = age;
//	}
	
	
	@Override
	public String toString() {
		return "PersonForSerialization{" +
				"age=" + age +
				", firstName='" + firstName + '\'' +
				'}';
	}
}
