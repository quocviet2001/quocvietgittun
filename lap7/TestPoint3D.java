public class TestPoint3D {
	public static void main(String[] args) {
		Point3D p3a = new Point3D(11, 12, 13);
		System.out.println(p3a); 
		Point2D p3b = new Point3D(); 
		System.out.println(p3b);
		p3a.setX(21);
		p3a.setY(22);
		p3a.setZ(23);
		System.out.println(p3a); 
		System.out.println("x is: " + p3a.getX());
		System.out.println("y is: " + p3a.getY()); 
		System.out.println("z is: " + p3a.getZ()); 
	}
}
