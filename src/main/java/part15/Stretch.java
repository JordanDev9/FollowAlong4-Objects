package part15;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=10770s
//        rewatch 2:59:30–3:09:48 for objects, 2:57:15–2:59:12 for final
// Guide: GUIDE.md in this folder
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.
// Stretch A uses YOUR Car class from the follow-along, so do Section A first.
// Stretch B: your Phone class goes in THIS file, BELOW the last } of class Stretch.

public class Stretch {
    public static void main(String[] args) {

        /* MY GUESS:
           blue
           red
           red
           3000.0
        */

        // Stretch A
        Car a = new Car();
        Car b = new Car();

        b.color = "red";

        System.out.println(a.color);
        System.out.println(b.color);

        a = b;

        System.out.println(a.color);

        final double TAX_RATE = 0.06;

        System.out.println(a.price * TAX_RATE);

        // B1
        Phone phone = new Phone();

        phone.charge();
        phone.charge();

        System.out.println(phone.brand + " battery: " + phone.battery);

        // B2
        Phone phone2 = new Phone();
        phone2.brand = "Samsung";

        System.out.println(phone.brand + " / " + phone2.brand);
        System.out.println(phone.battery + " / " + phone2.battery);

        // B3
        Phone full = new Phone();
        full.battery = 95;

        full.charge();
        full.charge();
    }
}

class Phone {

    String brand = "Apple";
    int battery = 80;

    final int MAX_BATTERY = 100;

    void charge() {
        battery = battery + 10;

        if (battery > MAX_BATTERY) {
            battery = MAX_BATTERY;
        }

        System.out.println("Charging... " + battery + "%");
    }
}

