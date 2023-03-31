package sec05.exam05;

public class PersonExample {

	public static void main(String[] args) {
		Person people = new Person("000325-1327654", "Jadon Sancho");
		
		System.out.println(people.nation);
		System.out.println(people.ssn);
		System.out.println(people.name);
		
		// people.nation = "England";
		// people.ssn = "971031-1765423";
		people.name = "Marcus Rashford";
	}
}