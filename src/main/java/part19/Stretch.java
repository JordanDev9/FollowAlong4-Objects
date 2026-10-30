package part19;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=13857s
//        rewatch from about 3:51:00 for static variables,
//        and from about 3:54:50 for static methods and Math.round
// Guide: GUIDE.md in this folder, steps 3–9
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
// Stretch B3 also adds to your Friend class.
//
// There is no main method here yet. Typing it is part of the stretch.

public class Stretch {
    public static void main(String[] args) {

        /* MY GUESS:
           0
           2
           You have 2 friends
        */

        // Stretch A
        System.out.println(Friend.numberOfFriends);
        Friend a = new Friend("Gary");
        Friend b = new Friend("Plankton");
        System.out.println(Friend.numberOfFriends);
        Friend.displayFriends();

        // B1
        long rounded = Math.round(3.7);
        double root = Math.sqrt(81);
        int bigger = Math.max(4, 9);
        System.out.println(rounded + " " + root + " " + bigger);

        // B2
        System.out.println(Stretch.square(5));
        System.out.println(square(12));

        // B3
        Friend c = new Friend("Karen");
        System.out.println("Newest friend: " + Friend.newestFriend);
    }

    static int square(int n) {
        return n * n;
    }
}


