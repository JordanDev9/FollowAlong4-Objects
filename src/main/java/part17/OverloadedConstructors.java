package part17;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=12340s
//        starts at about 3:25:40 — stop at about 3:32:05, before "the toString method"
// Guide: GUIDE.md in this folder, steps 1–7
//
// Part 17, topic 1 — overloaded constructors
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called OverloadedConstructors.
//    Leave the "package part17;" line and the class line alone. Type everything else yourself.
//    You also make a new class called Pizza. The README shows how.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. Do this in Pizza.java too.

public class OverloadedConstructors {
    public static void main(String[] args) {

        // this line creates a pizza object with all 4 ingredients
        Pizza pizza = new Pizza("thick crust", "tomato", "mozzarella", "pepperoni");

// this prints a message before showing the ingredients
        System.out.println("Here are the ingredients of your pizza: ");

// this prints the bread type of the pizza
        System.out.println(pizza.bread);

// this prints the sauce type of the pizza
        System.out.println(pizza.sauce);

// this prints the cheese type of the pizza
        System.out.println(pizza.cheese);

// this prints the topping of the pizza
        System.out.println(pizza.topping);

// this creates a second pizza object using the 3-parameter constructor
        Pizza pizza2 = new Pizza("thick crust", "tomato", "mozzarella");
    }

}
