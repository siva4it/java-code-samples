abstract class Shape {
    String name;

    Shape(String name) {
        this.name = name;
    }

    public void moveTO(int x, int y) {
        System.out.println(this.name + " "
                + "has been moved to"
                + " x = " + x + " and y = " + y);
    }

    abstract public void area();
    abstract public void draw();
}
