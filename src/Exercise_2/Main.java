package Exercise_2;

import Exercise_1.Cat;

public class Main {
    public static void main(String[] args) {
        // Write a Java program to create a class called Vehicle with a method called drive().
        // Create a subclass called Car that overrides the drive() method to print "Repairing a car".

        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        vehicle.drive();
        car.drive();
    }
}
