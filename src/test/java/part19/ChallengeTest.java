package part19;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=13800s
//        (this part's lesson starts here — GUIDE.md has it written out)

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

// You do not change this file. It checks your answers in Challenge.java.
// Run it with the green arrow next to "class ChallengeTest".

class ChallengeTest {

    // ---- round10 ----

    @Test
    void round10RoundsUpAtFive() {
        assertEquals(20, Challenge.round10(15));
        assertEquals(30, Challenge.round10(25));
    }

    @Test
    void round10RoundsDownBelowFive() {
        assertEquals(10, Challenge.round10(14));
        assertEquals(0, Challenge.round10(4));
    }

    @Test
    void round10AlreadyRound() {
        assertEquals(20, Challenge.round10(20));
        assertEquals(0, Challenge.round10(0));
    }

    @Test
    void round10Nine() {
        assertEquals(10, Challenge.round10(9));
    }

    // ---- roundedTotal ----

    @Test
    void roundedTotalAllRoundUp() {
        assertEquals(60, Challenge.roundedTotal(16, 17, 18));
    }

    @Test
    void roundedTotalAllRoundDown() {
        assertEquals(30, Challenge.roundedTotal(12, 13, 14));
    }

    @Test
    void roundedTotalMixed() {
        assertEquals(10, Challenge.roundedTotal(6, 4, 4));
    }

    @Test
    void roundedTotalWithFivesAndZero() {
        assertEquals(40, Challenge.roundedTotal(25, 0, 5));
    }

    // ---- canBuildWall ----

    @Test
    void canBuildWallBigPlusSmall() {
        assertTrue(Challenge.canBuildWall(3, 1, 8));
    }

    @Test
    void canBuildWallOneInchShort() {
        assertFalse(Challenge.canBuildWall(3, 1, 9));
    }

    @Test
    void canBuildWallOnlyBigBricks() {
        assertTrue(Challenge.canBuildWall(0, 3, 10));
        assertFalse(Challenge.canBuildWall(0, 3, 11));
    }

    @Test
    void canBuildWallOnlySmallBricks() {
        assertTrue(Challenge.canBuildWall(7, 0, 7));
    }

    @Test
    void canBuildWallNotEnoughSmall() {
        assertFalse(Challenge.canBuildWall(1, 4, 12));
    }

    @Test
    void canBuildWallHugeNumbers() {
        assertTrue(Challenge.canBuildWall(3, 1000000, 100003));
        assertFalse(Challenge.canBuildWall(2, 1000000, 100003));
    }
}
