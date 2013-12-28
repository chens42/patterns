package builder;

public class Test {
	public static void main(String[] args) {
		PersonBuilder personBuilder = new PersonBuilder();
		personBuilder.firstName("peter").lastName("wang")
				.emailAddress("123456@hotmail.com");
		Person person = personBuilder.build();
		System.out.println(person.getFirstName());
		System.out.println(person.getLastName());
		System.out.println(person.getEmailAddress());
	}

}
