package part19;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=13800s
//        starts at about 3:50:00 — stop at about 3:57:15, at "that's the basics of the static keyword"
// Guide: GUIDE.md in this folder, steps 1–9
//
// Part 19 — the static keyword
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called StaticKeyword.
//    Leave the "package part19;" line and the class line alone. Type everything else yourself.
//    You also make a new class called Friend. The README shows how.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. Do this in Friend.java too.

public class StaticKeyword {
    public static void main(String[] args) {
        // this line prints the current number of friends
        System.out.println(Friend.numberOfFriends);
// this line creates a Friend object named SpongeBob
        Friend friend1 = new Friend("SpongeBob");
// this line prints the updated number of friends
        System.out.println(Friend.numberOfFriends);
// this line creates a Friend object named Patrick
        Friend friend2 = new Friend("Patrick");
// this line prints the updated number of friends
        System.out.println(Friend.numberOfFriends);
// this line creates a Friend object named Squidward
        Friend friend3 = new Friend("Squidward");
// this line prints the updated number of friends
        System.out.println(Friend.numberOfFriends);
// this line prints the shared friend count using friend1
        System.out.println(friend1.numberOfFriends);
// this line calls the displayFriends method
        Friend.displayFriends();
// this line creates a Friend object named Sandy
        Friend friend4 = new Friend("Sandy");
// this line calls the displayFriends method again
        Friend.displayFriends();
// this line rounds 3.14 to the nearest whole number and prints it
        System.out.println(Math.round(3.14));
    }

}
