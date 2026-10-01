package part17;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=12340s
//        (this part's lesson starts here — GUIDE.md has it written out)

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

// You do not change this file. It checks your answers in Challenge.java.
// Run it with the green arrow next to "class ChallengeTest".

class ChallengeTest {

    // ---- sumSkip13 ----

    @Test
    void sumSkip13NoThirteens() {
        assertEquals(6, Challenge.sumSkip13(new int[] {1, 2, 3}));
    }

    @Test
    void sumSkip13EmptyArray() {
        assertEquals(0, Challenge.sumSkip13(new int[] {}));
    }

    @Test
    void sumSkip13SkipsThirteenAndTheNumberAfterIt() {
        assertEquals(3, Challenge.sumSkip13(new int[] {1, 13, 5, 2}));
    }

    @Test
    void sumSkip13ThirteenAtTheEnd() {
        assertEquals(5, Challenge.sumSkip13(new int[] {5, 13}));
    }

    @Test
    void sumSkip13TwoThirteensInARow() {
        assertEquals(0, Challenge.sumSkip13(new int[] {13, 13, 1}));
    }

    @Test
    void sumSkip13OnlyThirteen() {
        assertEquals(0, Challenge.sumSkip13(new int[] {13}));
    }

    // ---- hasPair ----

    @Test
    void hasPairAtTheEnd() {
        assertTrue(Challenge.hasPair(new int[] {1, 2, 2}, 2));
    }

    @Test
    void hasPairNotNextToEachOther() {
        assertFalse(Challenge.hasPair(new int[] {2, 1, 2}, 2));
    }

    @Test
    void hasPairEmptyArray() {
        assertFalse(Challenge.hasPair(new int[] {}, 2));
    }

    @Test
    void hasPairOnlyOneElement() {
        assertFalse(Challenge.hasPair(new int[] {7}, 7));
    }

    @Test
    void hasPairThreeInARow() {
        assertTrue(Challenge.hasPair(new int[] {3, 3, 3}, 3));
    }

    @Test
    void hasPairOfADifferentNumber() {
        assertFalse(Challenge.hasPair(new int[] {4, 4}, 5));
    }
}
