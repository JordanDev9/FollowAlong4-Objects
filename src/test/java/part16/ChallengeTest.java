package part16;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=11407s
//        (this part's lesson starts here — GUIDE.md has it written out)

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

// You do not change this file. It checks your answers in Challenge.java.
// Run it with the green arrow next to "class ChallengeTest".

class ChallengeTest {

    @Test
    void doubleHi() {
        assertEquals("hhii", Challenge.doubleLetters("hi"));
    }

    @Test
    void doubleJava() {
        assertEquals("JJaavvaa", Challenge.doubleLetters("Java"));
    }

    @Test
    void doubleEmpty() {
        assertEquals("", Challenge.doubleLetters(""));
    }

    @Test
    void doubleSpacesToo() {
        assertEquals("aa  bb", Challenge.doubleLetters("a b"));
    }

    @Test
    void doubleOneLetter() {
        assertEquals("xx", Challenge.doubleLetters("x"));
    }

    @Test
    void countThreeHi() {
        assertEquals(3, Challenge.countWord("hi hi hi", "hi"));
    }

    @Test
    void countNoOverlap() {
        assertEquals(2, Challenge.countWord("aaaa", "aa"));
    }

    @Test
    void countNone() {
        assertEquals(0, Challenge.countWord("hello", "bye"));
    }

    @Test
    void countEmptyText() {
        assertEquals(0, Challenge.countWord("", "hi"));
    }

    @Test
    void countWordsTouching() {
        assertEquals(2, Challenge.countWord("abcabc", "abc"));
    }

    @Test
    void countInsideOtherWords() {
        assertEquals(2, Challenge.countWord("this is it", "is"));
    }
}
