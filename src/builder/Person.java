package builder;

public class Person {
	private String lastName;
	private String firstName;
	private String emailAddress;
	
	public Person(String lastName, String firstName, String emailAddress) {
		
		this.lastName = lastName;
		this.firstName = firstName;
		this.emailAddress = emailAddress;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}


}
