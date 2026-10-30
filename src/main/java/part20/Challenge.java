package part20;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo
//        (no video in this part — it is a checkpoint. Use it to look things up)

// No video in this part — it is a checkpoint.
//
// SECTION D — Challenge. Two methods. The test in src/test/java/part20/ChallengeTest.java checks them.
// Change only the lines marked YOUR CODE. The README explains each one.

public class Challenge {

    public static void main(String[] args) {
        System.out.println(ticketResult(2, 2, 2));
        System.out.println(ticketResult(1, 2, 3));
        System.out.println(ticketResult(2, 2, 1));

        System.out.println(sameCount("catdog", "cat", "dog"));
        System.out.println(sameCount("catcat", "cat", "dog"));
        System.out.println(sameCount("", "cat", "dog"));
    }

    // A lottery ticket has three numbers.
    // all three the same → 10
    // b and c are BOTH different from a → 5
    // anything else → 0
    public static int ticketResult(int a, int b, int c) {
        if (a == b && b == c) {
            return 10;
        }
        if (b != a && c != a) {
            return 5;
        }
        return 0;
    }

    // true if x and y show up the same number of times inside s.
    public static boolean sameCount(String s, String x, String y) {
        return count(s, x) == count(s, y);
    }

    public static int count(String s, String word) {
        int count = 0;
        int start = 0;

        while (true) {
            int index = s.indexOf(word, start);

            if (index == -1) {
                return count;
            }

            count++;
            start = index + word.length();
        }
    }
}