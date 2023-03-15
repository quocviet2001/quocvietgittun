public class Circle {
    private double radius;
    private String color;

    public Circle() {
        radius = 1.0;
        color = "red";
    }

    public Circle(double r) {
        this.radius = r;
        color = "red";
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public Circle(double r, String c) {
        this.radius = r;
        this.color = c;
    }
    
    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }

    public String toString() {
        return "Circle[radius = " + radius + ", color =" + color + "]";
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}
