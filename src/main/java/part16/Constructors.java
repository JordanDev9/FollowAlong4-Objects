package part16;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=11407s
//        starts at about 3:10:07 — stop at about 3:19:32, when he says
//        "if you would like a copy of all this code"
// Guide: GUIDE.md in this folder, Video 1 — the same lesson, written out step by step
//
// Part 16, video 1 — constructors
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide).
//    His class with main is called Main. Yours is called Constructors.
//    Leave the "package part16;" line and the "public class Constructors" line alone.
//    He also has a second class called Human. YOU make that file too:
//    right-click the part16 folder -> New -> Java Class -> type Human -> Enter.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    in THIS file AND in Human.java, saying in YOUR OWN WORDS what that line does.

public class Constructors {
    public static void main(String[] args) {
        // this line creates a object human and uses the constructor and the parameters
        Human human = new Human("Rick", 65, 70);
        // this line prints the name of the object human
        System.out.println(human.name);
        // this line creates a object named human2 and uses the constructor and parameters
        Human human2 = new Human("Morty", 16, 50);
        // this line prints the name of the object human
        System.out.println(human.name);
        // this line prints the name of the object human2
        System.out.println(human2.name);
        // this line excutes the method human.eat()
        human.eat();
        // this line excutes the mehtod human2.drink()
        human2.drink();
    }
}


