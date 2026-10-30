package part18;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=13121s
//        starts at about 3:38:40 — stop at about 3:44:15, at "that's the basics of arrays of objects"
// Guide: GUIDE.md in this folder, steps 1–6
//
// Part 18, topic 1 — an array of objects
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called ArrayOfObjects.
//    Leave the "package part18;" line and the class line alone. Type everything else yourself.
//    You also make a new class called Food. The README shows how.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. Do this in Food.java too.

public class ArrayOfObjects {
    // this line creates an int array with 3 slots
    int[] numbers = new int[3];
    // this line creates a char array with 3 slots
    char[] letters = new char[3];
    // this line creates a String array with 3 slots
    String[] words = new String[3];

    public static void main(String[] args) {
        // this line creates a Food array called refrigerator with 3 slots
        Food[] refrigerator = new Food[3];
        // this line creates a Food object called food1
        Food food1 = new Food("pizza");
        // this line creates a Food object called food2
        Food food2 = new Food("hamburger");
        // this line creates a Food object called food3
        Food food3 = new Food("hot dog");
        // this line stores food1 in the first slot of the array
        refrigerator[0] = food1;
        // this line stores food2 in the second slot of the array
        refrigerator[1] = food2;
        // this line stores food3 in the third slot of the array
        refrigerator[2] = food3;
        // this line creates and fills a Food array in one line
        Food[] refrigerator2 = {food1, food2, food3};
        // this line prints the object stored in the first slot
        System.out.println(refrigerator[0]);
        // this line prints the name of the first food
        System.out.println(refrigerator[0].name);
        // this line prints the name of the second food
        System.out.println(refrigerator[1].name);
        // this line prints the name of the third food
        System.out.println(refrigerator[2].name);
    }
}
