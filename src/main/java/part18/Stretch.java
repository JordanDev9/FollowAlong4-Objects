package part18;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=13181s
//        rewatch from about 3:39:40 for arrays of objects,
//        and from about 3:46:10 for passing an object to a method
// Guide: GUIDE.md in this folder, steps 2–9
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
// Stretch B2 also adds a method to your Garage class.
//
// There is no main method here yet. Typing it is part of the stretch.

public class Stretch {
    public static void main(String[] args) {

        /* MY GUESS:
           taco
           null
           2
        */

        Food[] lunch = new Food[2];
        lunch[0] = new Food("taco");
        System.out.println(lunch[0].name);
        System.out.println(lunch[1]);
        System.out.println(lunch.length);

        // B1
        String[] fridge = {"milk", "eggs", "cheese"};
        for (String item : fridge) {
            System.out.println("In the fridge: " + item);
        }

        // B2
        Garage garage = new Garage();
        Car bmw = new Car("BMW");
        garage.park(bmw);
        garage.leave(bmw);

        // B3
        Car[] lot = {new Car("Honda"), new Car("Ford"), new Car("Kia")};
        for (Car car : lot) {
            garage.park(car);
        }
    }
}


