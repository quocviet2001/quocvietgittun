public class TestPerson {
	public static void main(String[] args) {
		Person p1 = new Person("A", "Ha Noi");
		System.out.println(p1);
		p1.setAddress("Hai Phong");
		System.out.println(p1.getName());
		System.out.println(p1.getAddress());
	}
}