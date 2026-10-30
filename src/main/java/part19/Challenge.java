package part19;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=13800s
//        (these are static methods — you call them with the class name, like Math.round)
//
// SECTION D — Challenge. Two methods plus a helper. The test in src/test/java/part19/ChallengeTest.java
// checks all three. Change only the lines marked YOUR CODE. The README explains each one.

public class Challenge {
    public static void main(String[] args) {
        System.out.println(roundedTotal(16, 17, 18));
        System.out.println(roundedTotal(12, 13, 14));

        System.out.println(round10(15));
        System.out.println(round10(14));
        System.out.println(round10(20));

        System.out.println(canBuildWall(3, 1, 8));
        System.out.println(canBuildWall(3, 1, 9));
        System.out.println(canBuildWall(3, 2, 10));
    }

    // Round each number to the nearest 10, then add them up.
    public static int roundedTotal(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    // The helper. Rounds n to the nearest 10.
    public static int round10(int n) {
        int lastDigit = n % 10;

        if (lastDigit >= 5) {
            return n + (10 - lastDigit);
        }

        return n - lastDigit;
    }

    // Can you make a row EXACTLY goal inches long with the bricks you have?
    public static boolean canBuildWall(int small, int big, int goal) {
        int bigBricksUsed = Math.min(big, goal / 5);
        int remaining = goal - (bigBricksUsed * 5);

        return small >= remaining;
    }
}
