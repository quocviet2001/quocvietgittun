public class TestPoint2D {
	public static void main(String[] args) {
		Point2D p2a = new Point2D(1, 2);
		System.out.println(p2a); 
		Point2D p2b = new Point2D();
		System.out.println(p2b);
		p2a.setX(3); 
		p2a.setY(4);
		System.out.println(p2a); 
		System.out.println("x is: " + p2a.getX());
		System.out.println("x is: " + p2a.getY());
    }
}


