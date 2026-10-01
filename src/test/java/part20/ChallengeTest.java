package part20;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo
//        (no video in this part — it is a checkpoint. Use it to look things up)

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

// You do not change this file. It checks your answers in Challenge.java.
// Run it with the green arrow next to "class ChallengeTest".

class ChallengeTest {

    // ---- ticketResult ----

    @Test
    void ticketResultAllTheSame() {
        assertEquals(10, Challenge.ticketResult(2, 2, 2));
        assertEquals(10, Challenge.ticketResult(0, 0, 0));
    }

    @Test
    void ticketResultBothDifferentFromFirst() {
        assertEquals(5, Challenge.ticketResult(1, 2, 3));
    }

    @Test
    void ticketResultLastTwoMatchButNotFirst() {
        assertEquals(5, Challenge.ticketResult(5, 1, 1));
    }

    @Test
    void ticketResultSecondMatchesFirst() {
        assertEquals(0, Challenge.ticketResult(2, 2, 1));
    }

    @Test
    void ticketResultThirdMatchesFirst() {
        assertEquals(0, Challenge.ticketResult(2, 1, 2));
    }

    // ---- sameCount ----

    @Test
    void sameCountOneEach() {
        assertTrue(Challenge.sameCount("catdog", "cat", "dog"));
    }

    @Test
    void sameCountTwoAndZero() {
        assertFalse(Challenge.sameCount("catcat", "cat", "dog"));
    }

    @Test
    void sameCountEmptyString() {
        assertTrue(Challenge.sameCount("", "cat", "dog"));
    }

    @Test
    void sameCountTwoEach() {
        assertTrue(Challenge.sameCount("dogdog catcat", "cat", "dog"));
    }

    @Test
    void sameCountDifferentWords() {
        assertFalse(Challenge.sameCount("hi hi bye", "hi", "bye"));
    }

    @Test
    void sameCountSingleLetters() {
        assertFalse(Challenge.sameCount("aaa", "a", "b"));
    }
}
