
public class TestCircle {
    public static void main(String []args) {
        Circle circle1 = new Circle();
        System.out.println("The circle has radius of " + circle1.getRadius() + "and area of " + circle1.getArea());

        Circle circle2 = new Circle(2.0);
        System.out.println("The circle has radius of " + circle2.getRadius() + "and area of " + circle2.getArea());

        Circle circle3 = new Circle(2.0, "green");
        System.out.println("The circle has radius of " + circle3.getRadius() + "and area of " + circle3.getArea() + "and has color is " + circle3.getColor());
        
        Circle circle4 = new Circle();
        circle4.setRadius(4.4);
		System.out.println("radius is : " + circle4.getRadius());
		circle4.setColor("blue");
		System.out.println("color is : " + circle4.getColor());

		Circle circle5 = new Circle(5.5);
		System.out.println(circle5.toString());

		Circle circle6 = new Circle(6.6);
		System.out.println(circle6.toString());
		System.out.println(circle6);
		System.out.println("Operator '+' invokes toString() too: " + circle6);
	}
}

