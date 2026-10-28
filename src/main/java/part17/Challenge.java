package part17;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=12741s
//        (no video for the challenge — it uses arrays, from part 10)
//
// SECTION D — Challenge. Two methods. The test in src/test/java/part17/ChallengeTest.java checks them.
// Change only the lines marked YOUR CODE. The README explains each one.

public class Challenge {
    public static void main(String[] args) {
        System.out.println(sumSkip13(new int[]{1, 2, 3}));
        System.out.println(sumSkip13(new int[]{1, 13, 5, 2}));
        System.out.println(sumSkip13(new int[]{}));
        System.out.println(hasPair(new int[]{1, 2, 2}, 2));
        System.out.println(hasPair(new int[]{2, 1, 2}, 2));
        System.out.println(hasPair(new int[]{7}, 7));

    }

    // Add up the numbers in the array, but 13 does not count,
// and neither does the number right after a 13.
// sumSkip13({1, 2, 3}) → 6
// sumSkip13({1, 13, 5, 2}) → 3 (13 and 5 are skipped)
// sumSkip13({}) → 0
    public static int sumSkip13(int[] nums) {

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 13) {
                continue;
            }

            if (i > 0 && nums[i - 1] == 13) {
                continue;
            }

            sum += nums[i];
        }

        return sum;
    }

    // true if two numbers NEXT TO EACH OTHER in the array are both equal to value.
// hasPair({1, 2, 2}, 2) → true
// hasPair({2, 1, 2}, 2) → false (the 2s are not next to each other)
// hasPair({7}, 7) → false
    public static boolean hasPair(int[] nums, int value) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == value && nums[i + 1] == value) {
                return true;
            }
        }

        return false;
    }
}
