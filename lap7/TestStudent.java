public class TestStudent {
	public static void main(String[] args) {
		Student student1 = new Student("Hoang", "Ha Noi", "Math", 2019, 1000.0);
		System.out.println(student1);
		student1.setProgram("Philosophy");
		student1.setYear(2020);
		student1.setFee(1234.5);
		System.out.println(student1.getProgram());
		System.out.println(student1.getYear());
		System.out.println(student1.getFee());
	}
}
