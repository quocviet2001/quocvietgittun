
public class TestStaff {

	public static void main(String[] args) {
		Staff staff1 = new Staff("A", "Ha Noi", "HUS", 2000.0);
		System.out.println(staff1);
		staff1.setSchool("Ussh");
		staff1.setPay(3456.7);
		System.out.println(staff1.getSchool());
		System.out.println(staff1.getPay());
	}
}
