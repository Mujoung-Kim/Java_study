package sec01.exam02;

public class StudentExample {

	public static void main(String[] args) {
		Student student = new Student("Jadon Sancho", "000325-7562413", 1);
		
		System.out.printf("Name : %s\n", student.name);
		System.out.printf("Ssn : %s\n", student.ssn);
		System.out.printf("StudentNo : %d\n", student.studentNo);
	}
}