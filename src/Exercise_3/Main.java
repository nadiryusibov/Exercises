package Exercise_3;

public class Main {
    public static void main(String[] args) {
        // Write a Java program to create a class called Shape with a method called getArea().
        // Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.

        Rectangle rectangle = new Rectangle(6.0,10.0);
        double area = rectangle.getArea();
        System.out.println("The area of the rectangle is " + area);
    }
}
