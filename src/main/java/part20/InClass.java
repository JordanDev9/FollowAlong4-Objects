package part20;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo
//        (no video in this part — it is a checkpoint. Use it to look things up)
//
// In-class exercise — we do this together in class. Not graded, but commit it.
// The README (In-class exercise) has the steps.

public class InClass {
    public static void main(String[] args) {

        // STEP 1 — design two classes together. NO code, only comments.
        // For each class, write its fields and its methods.
        //
        // Hoop
        //   fields:
        //   methods:
        //
        // Shooter
        //   fields:
        //   methods:



        // STEP 2 — fix the bugs. Each line below has ONE mistake.
        // Move ONE line at a time above the /* line, so Java sees it.
        // Read the red error (or the wrong output). Fix it. Run it. Then do the next line.
        /*
        Lamp lamp = Lamp("desk lamp"); lamp.turnOn(); System.out.println(lamp);
        Fan fan = new Fan("ceiling fan"); System.out.println(fan.name);
        sayHi();
        */
    }

    // Given. Used in STEP 2. Notice: no "static" here.
    void sayHi() {
        System.out.println("Hi from InClass");
    }
}

// Given. Used in STEP 2. This class has no bugs.
class Lamp {
    String name;
    boolean on;

    Lamp(String name) {
        this.name = name;
    }

    void turnOn() {
        on = true;
    }

    public String toString() {
        return name + " is on: " + on;
    }
}

// Given. Used in STEP 2. This class has ONE bug. Can you find it?
class Fan {
    String name;

    Fan(String name) {
        name = name;
    }
}
