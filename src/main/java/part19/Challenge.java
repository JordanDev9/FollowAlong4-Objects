package part19;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=13800s
//        (these are static methods — you call them with the class name, like Math.round)
//
// SECTION D — Challenge. Two methods plus a helper. The test in src/test/java/part19/ChallengeTest.java
// checks all three. Change only the lines marked YOUR CODE. The README explains each one.

public class Challenge {

    // Round each number to the nearest 10, then add them up. Use round10() for each one.
    //   roundedTotal(16, 17, 18)  → 60    (20 + 20 + 20)
    //   roundedTotal(12, 13, 14)  → 30    (10 + 10 + 10)
    public static int roundedTotal(int a, int b, int c) {
        return 0;   // YOUR CODE — use round10
    }

    // The helper. Rounds n to the nearest 10. A last digit of 5 or more rounds UP.
    //   round10(15) → 20     round10(14) → 10     round10(20) → 20
    public static int round10(int n) {
        return 0;   // YOUR CODE
    }

    // Small bricks are 1 inch long. Big bricks are 5 inches long.
    // Can you make a row EXACTLY goal inches long with the bricks you have?
    //   canBuildWall(3, 1, 8)  → true    (one big + three small)
    //   canBuildWall(3, 1, 9)  → false   (one inch short)
    //   canBuildWall(3, 2, 10) → true    (two big)
    // No loop needed — and with huge numbers a loop is too slow anyway.
    public static boolean canBuildWall(int small, int big, int goal) {
        return false;   // YOUR CODE
    }
}
