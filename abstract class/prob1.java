abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    void area() {
        System.out.println("Area: " + (3.14 * 5 * 5));
    }
}

class Main {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.area();
    }
}
