public class Circle extends Shape{

    int radius;

    Circle(int radius, String name) {
        super(name);
        this.radius = radius;
    }

    @Override
    public void area() {
        System.out.println("Area = " + (3.14 * radius * radius));
    }

    @Override
    public void draw() {
        System.out.println("This is a Circle");
    }
}
