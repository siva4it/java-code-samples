public class Rectangle extends Shape {

    int length, width;

    Rectangle(int length, int width, String name) {
        super(name);
        this.length = length;
        this.width = width;
    }

    @Override
    public void area() {
        System.out.println("Area = " + (length * width));
    }

    @Override
    public void draw() {
        System.out.println("This is a Rectangle");
    }
}
