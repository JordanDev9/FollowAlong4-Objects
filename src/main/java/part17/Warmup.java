package part17;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=12340s
//        (warm-up first — no video until OverloadedConstructors.java)

// Warm-up — 5 minutes, before the video.
//
// Open part16/Stretch.java and look at your Stretch B1 for 30 seconds. Then close it.
// Without looking again, type Stretch B1 here and make it print the same thing.
//
// You will need to type the main method yourself. That is the point.

public class Warmup {
    public static void main(String[] args) {
        Pet pet1 = new Pet("Max", 3);
        Pet pet2 = new Pet("Luna", 5);
        pet1.speak();
        pet2.speak();
    }

}
class Pet {
    String name;
    int age;

    Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void speak() {
        System.out.println(name + " is " + age + " years old");
    }
}
