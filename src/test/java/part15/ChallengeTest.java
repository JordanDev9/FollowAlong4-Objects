package part15;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=10635s
//        (this part's lesson starts here — GUIDE.md has it written out)

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

// You do not change this file. It checks your answers in Challenge.java.
// Run it with the green arrow next to "class ChallengeTest".

class ChallengeTest {

    @Test
    void partyGood() {
        assertEquals(1, Challenge.partyRating(6, 8));
    }

    @Test
    void partyNotEnoughSnacks() {
        assertEquals(0, Challenge.partyRating(3, 8));
    }

    @Test
    void partyLotsOfSnacks() {
        assertEquals(2, Challenge.partyRating(20, 6));
    }

    @Test
    void partyExactlyDoubleDrinks() {
        assertEquals(2, Challenge.partyRating(5, 10));
    }

    @Test
    void partyFiveAndFiveIsGood() {
        assertEquals(1, Challenge.partyRating(5, 5));
    }

    @Test
    void partyBadWinsOverGreat() {
        assertEquals(0, Challenge.partyRating(4, 20));
    }

    @Test
    void partyAlmostDouble() {
        assertEquals(1, Challenge.partyRating(7, 13));
    }

    @Test
    void fizzBuzzFifteen() {
        assertEquals("FizzBuzz", Challenge.fizzBuzz(15));
    }

    @Test
    void fizzBuzzThirty() {
        assertEquals("FizzBuzz", Challenge.fizzBuzz(30));
    }

    @Test
    void fizzNine() {
        assertEquals("Fizz", Challenge.fizzBuzz(9));
    }

    @Test
    void buzzTen() {
        assertEquals("Buzz", Challenge.fizzBuzz(10));
    }

    @Test
    void plainSeven() {
        assertEquals("7", Challenge.fizzBuzz(7));
    }

    @Test
    void plainOne() {
        assertEquals("1", Challenge.fizzBuzz(1));
    }
}
