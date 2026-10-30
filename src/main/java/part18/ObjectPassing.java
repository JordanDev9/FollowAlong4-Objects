package part18;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=13478s
//        starts at about 3:44:40 — stop at about 3:49:20, at "that's the basics of sending objects as arguments"
// Guide: GUIDE.md in this folder, steps 7–10
//
// Part 18, topic 2 — passing objects to a method
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called ObjectPassing.
//    Leave the "package part18;" line and the class line alone. Type everything else yourself.
//    You also make two new classes, Garage and Car. The README shows how.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. Do this in Garage.java and Car.java too.

public class ObjectPassing {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Car car1 = new Car("BMW");
        Car car2 = new Car("Tesla");

        garage.park(car1);
        garage.park(car2);
    }


}
