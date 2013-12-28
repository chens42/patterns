package builder;

public class PersonBuilder {
	private String firstName;
	private String lastName;
	private String emailAddress;

	public PersonBuilder firstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public PersonBuilder lastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public PersonBuilder emailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
		return this;
	}

	public Person build() {
		return new Person(lastName, firstName, emailAddress);
	}
}
