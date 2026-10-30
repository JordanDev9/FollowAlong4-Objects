package part18;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=13478s
//        (passing things to a method, then using them — same idea as park(car))
//
// SECTION D — Challenge. Two methods plus a helper. The test in src/test/java/part18/ChallengeTest.java
// checks all three. Change only the lines marked YOUR CODE. The README explains each one.

public class Challenge {
    public static void main(String[] args) {
    System.out.println(uniqueSum(1, 2, 3));
    System.out.println(uniqueSum(3, 2, 3));
    System.out.println(uniqueSum(3, 3, 3));

    System.out.println(sumWithoutTeens(1, 2, 3));
    System.out.println(sumWithoutTeens(2, 13, 1));
    System.out.println(sumWithoutTeens(15, 16, 17));

    System.out.println(fixTeen(13));
    System.out.println(fixTeen(15));
    System.out.println(fixTeen(20));
}

    // Add up a, b and c — but a number only counts if the other two are different from it.
    // uniqueSum(1, 2, 3) → 6
    // uniqueSum(3, 2, 3) → 2
    // uniqueSum(3, 3, 3) → 0
    public static int uniqueSum(int a, int b, int c) {
        int sum = 0;
        if (a != b && a != c) {
            sum += a;
        }
        if (b != a && b != c) {
            sum += b;
        }
        if (c != a && c != b) {
            sum += c;
        }
        return sum;
    }

    // Add up a, b and c — but "teens" (13 to 19) count as 0, EXCEPT 15 and 16.
    public static int sumWithoutTeens(int a, int b, int c) {
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }

    // The helper. Gives back 0 for 13, 14, 17, 18 and 19.
    public static int fixTeen(int n) {
        if (n == 13 || n == 14 || n == 17 || n == 18 || n == 19) {
            return 0;
        }
        return n;
    }
}