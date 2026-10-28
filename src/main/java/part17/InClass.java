package part17;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=12340s
//        rewatch the overloaded constructors and toString parts if you get stuck
//
// In-class exercise — we do this together in class. Not graded, but commit it.
// The README (In-class exercise) has the steps and the output to match.

public class InClass {
    public static void main(String[] args) {

        // STEP 1

        Smoothie s1 = new Smoothie();
        Smoothie s2 = new Smoothie("mango");
        Smoothie s3 = new Smoothie("strawberry", "large");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


        // STEP 2 — fix the bugs. Each line below has ONE mistake.
        // Move ONE line at a time above the /* line, so Java sees it.
        // Read the red error. Fix it. Run it. Then do the next line.
        // not of the construtors allow this to be the arg
        Smoothie s4 = new Smoothie("kiwi", "7");
        // never created a NEW object
        Smoothie s5 = new Smoothie("mango");
        // this line needs toString to have () because its a function
        System.out.println(s1.toString());

    }
}

// STEP 1 — we build the Smoothie class together, here: two fields, three constructors,
// and a toString method.
class Smoothie {

    String fruit;
    String size;

    Smoothie() {
        this.fruit = "banana";
        this.size = "small";
    }

    Smoothie(String fruit) {
        this.fruit = fruit;
        this.size = "small";
    }

    Smoothie(String fruit, String size) {
        this.fruit = fruit;
        this.size = size;
    }

    public String toString() {
        return "a " + size + " " + fruit + " smoothie";
    }
}
