package part17;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=12741s
//        (no video for the challenge — it uses arrays, from part 10)
//
// SECTION D — Challenge. Two methods. The test in src/test/java/part17/ChallengeTest.java checks them.
// Change only the lines marked YOUR CODE. The README explains each one.

public class Challenge {

    // Add up the numbers in the array, but 13 does not count,
    // and neither does the number right after a 13.
    //   sumSkip13({1, 2, 3})      → 6
    //   sumSkip13({1, 13, 5, 2})  → 3     (13 and 5 are skipped)
    //   sumSkip13({})             → 0
    public static int sumSkip13(int[] nums) {
        return 0;   // YOUR CODE
    }

    // true if two numbers NEXT TO EACH OTHER in the array are both equal to value.
    //   hasPair({1, 2, 2}, 2)  → true
    //   hasPair({2, 1, 2}, 2)  → false   (the 2s are not next to each other)
    //   hasPair({7}, 7)        → false
    public static boolean hasPair(int[] nums, int value) {
        return false;   // YOUR CODE
    }
}
