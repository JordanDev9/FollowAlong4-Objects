package part20;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo
//        (no video in this part — it is a checkpoint. Use it to look things up)

// Part 20 — CHECKPOINT. You do NOT write this file. It checks the classes you write.
//
// Every step is switched off with comments, so this file still runs before you start.
// When you finish a step in Receiver.java or Quarterback.java, switch that step ON:
//
//   1. In main(), delete the // in front of that step's line, like  // step1();
//   2. Further down, delete the /* above that step's method and the */ below it.
//
// Then run Main with the green ▶ next to main, and compare with the README.

public class Main {

    public static void main(String[] args) {
        System.out.println("=== Part 20 checkpoint ===");
        // step1();
        // step2();
        // step3();
        // step4();
        // step5();
        // step6();
    }

    static void header(String title) {
        System.out.println();
        System.out.println("=== " + title + " ===");
    }

    // Step 1 — Receiver: fields, constructor, getters
    /*
    static void step1() {
        header("Step 1");
        Receiver davis = new Receiver("Davis", 11);
        System.out.println(davis.getName() + " wears #" + davis.getNumber());
        System.out.println("catches: " + davis.getCatches());
        System.out.println("yards: " + davis.getYards());
    }
    */

    // Step 2 — Receiver: catchBall and toString
    /*
    static void step2() {
        header("Step 2");
        Receiver davis = new Receiver("Davis", 11);
        davis.catchBall(12);
        davis.catchBall(8);
        System.out.println(davis);
    }
    */

    // Step 3 — Quarterback: fields, constructor, getters
    /*
    static void step3() {
        header("Step 3");
        Quarterback carter = new Quarterback("Carter", 40);
        System.out.println(carter.getName() + " has thrown " + carter.getAttempts() + " passes");
        System.out.println(carter.getCompletions() + " completions, " + carter.getPassingYards() + " yards");
    }
    */

    // Step 4 — Quarterback: throwTo(Receiver, int)
    /*
    static void step4() {
        header("Step 4");
        Quarterback carter = new Quarterback("Carter", 40);
        Receiver davis = new Receiver("Davis", 11);
        Receiver brooks = new Receiver("Brooks", 84);

        carter.throwTo(davis, 15);
        carter.throwTo(brooks, 25);
        carter.throwTo(davis, 50);

        System.out.println(davis);
        System.out.println(brooks);
    }
    */

    // Step 5 — Quarterback: completionPercentage and toString
    /*
    static void step5() {
        header("Step 5");
        Quarterback carter = new Quarterback("Carter", 40);
        Receiver davis = new Receiver("Davis", 11);

        carter.throwTo(davis, 15);
        carter.throwTo(davis, 25);
        carter.throwTo(davis, 50);

        System.out.println(carter);
    }
    */

    // Step 6 — Quarterback: overloaded throwTo(Receiver)
    /*
    static void step6() {
        header("Step 6");
        Quarterback carter = new Quarterback("Carter", 40);
        Receiver brooks = new Receiver("Brooks", 84);

        carter.throwTo(brooks);
        carter.throwTo(brooks, 30);

        System.out.println(brooks);
    }
    */
}
