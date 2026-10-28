package part15;

public class Car {
        String make = "Chevrolet";
        String model = "Corvette";
        int year = 2020;
        String color = "blue";
        double price = 50000.00;

    public static void main(String[] args) {
        Car myCar = new Car();
        System.out.println(myCar.make);
        System.out.println(myCar.model);
        myCar.drive();
        myCar.brake();
        Car myCar2 = new Car();
        System.out.println();
        System.out.println(myCar2.make);
        System.out.println(myCar2.model);
    }
    void drive() {
        System.out.println("You drive the car");
    }

    void brake() {
        System.out.println("You step on the brakes");
    }
}
