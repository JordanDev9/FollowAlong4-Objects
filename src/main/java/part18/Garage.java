package part18;

public class Garage {
    // ths line creates a method so that the object has a behavior
    void park(Car car) {
        // this line prints the car.name from the car construsotr and whats inside the quotes
        System.out.println("The " + car.name + " is parked in the garage");
    }
    void leave(Car car) {
        System.out.println("The " + car.name + " left the garage");
    }
}
