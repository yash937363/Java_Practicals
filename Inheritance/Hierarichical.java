import java.util.Scanner;

class Circle {
    int radius;

    public void getRadius() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Radius : ");
        radius = s.nextInt();
    }
}

class Area extends Circle {
    float area;

    public void calculateArea() {
        area = 3.14f * radius * radius;
        System.out.println("Area of Circle " + area);
    }
}

class Circumference extends Circle {
    float circumference;

    public void calculateCircumference() {
        circumference = 2 * radius * radius;
        System.out.println("Circumference of Circle " + circumference);
    }
}

class Hierarichical {
    public static void main(String[] args) {
        Area a = new Area();
        a.getRadius();
        a.calculateArea();
        Circumference c = new Circumference();
        c.getRadius();
        c.calculateCircumference();
    }
}