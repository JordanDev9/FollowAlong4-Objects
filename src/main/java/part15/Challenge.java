package part15;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=10635s
// Guide: GUIDE.md in this folder
//
// SECTION D — Challenge. Finish the two methods below. Then run ChallengeTest until every
// test is green. Change only the lines marked YOUR CODE.
// You learned everything you need for these in parts 06 and 07: if, else, &&, ||, %.

public class Challenge {

    // Rate a party from its snacks and drinks.
    //   0 (bad)   if snacks OR drinks is less than 5. This rule wins over the others.
    //   2 (great) if one of them is at least DOUBLE the other.
    //   1 (good)  otherwise.
    // partyRating(6, 8)    should return 1
    // partyRating(3, 8)    should return 0
    // partyRating(20, 6)   should return 2
    public static int partyRating(int snacks, int drinks) {
        return -1;   // YOUR CODE
    }

    // Count-off game.
    //   divisible by 3 AND 5  -> "FizzBuzz"
    //   divisible by 3 only   -> "Fizz"
    //   divisible by 5 only   -> "Buzz"
    //   anything else         -> the number as text, like "7"
    // fizzBuzz(15)   should return "FizzBuzz"
    // fizzBuzz(9)    should return "Fizz"
    // fizzBuzz(7)    should return "7"
    // Hint: n % 3 == 0 means "n divides evenly by 3". String.valueOf(7) gives "7".
    public static String fizzBuzz(int n) {
        return "";   // YOUR CODE
    }
}
