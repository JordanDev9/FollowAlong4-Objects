package part18;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=13121s
//        (this part's lesson starts here — GUIDE.md has it written out)

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

// You do not change this file. It checks your answers in Challenge.java.
// Run it with the green arrow next to "class ChallengeTest".

class ChallengeTest {

    // ---- uniqueSum ----

    @Test
    void uniqueSumAllDifferent() {
        assertEquals(6, Challenge.uniqueSum(1, 2, 3));
    }

    @Test
    void uniqueSumFirstAndLastMatch() {
        assertEquals(2, Challenge.uniqueSum(3, 2, 3));
    }

    @Test
    void uniqueSumAllTheSame() {
        assertEquals(0, Challenge.uniqueSum(3, 3, 3));
    }

    @Test
    void uniqueSumFirstTwoMatch() {
        assertEquals(5, Challenge.uniqueSum(1, 1, 5));
    }

    @Test
    void uniqueSumLastTwoMatch() {
        assertEquals(0, Challenge.uniqueSum(0, 4, 4));
    }

    // ---- fixTeen ----

    @Test
    void fixTeenThirteenIsZero() {
        assertEquals(0, Challenge.fixTeen(13));
    }

    @Test
    void fixTeenNineteenIsZero() {
        assertEquals(0, Challenge.fixTeen(19));
    }

    @Test
    void fixTeenFifteenAndSixteenStay() {
        assertEquals(15, Challenge.fixTeen(15));
        assertEquals(16, Challenge.fixTeen(16));
    }

    @Test
    void fixTeenNotATeen() {
        assertEquals(12, Challenge.fixTeen(12));
        assertEquals(20, Challenge.fixTeen(20));
    }

    // ---- sumWithoutTeens ----

    @Test
    void sumWithoutTeensNoTeens() {
        assertEquals(6, Challenge.sumWithoutTeens(1, 2, 3));
    }

    @Test
    void sumWithoutTeensTeenInTheMiddle() {
        assertEquals(3, Challenge.sumWithoutTeens(2, 13, 1));
    }

    @Test
    void sumWithoutTeensTeenAtTheEnd() {
        assertEquals(3, Challenge.sumWithoutTeens(2, 1, 14));
    }

    @Test
    void sumWithoutTeensFifteenAndSixteenCount() {
        assertEquals(31, Challenge.sumWithoutTeens(15, 16, 17));
    }

    @Test
    void sumWithoutTeensAllTeens() {
        assertEquals(0, Challenge.sumWithoutTeens(19, 19, 19));
    }
}
