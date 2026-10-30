package part20;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo
//        (no video in this part — it is a checkpoint. Use it to look things up)

// Part 20 — CHECKPOINT. No video, no guide.
//
// You write this whole class yourself, starting from an empty file.
// The README lists everything a Receiver needs, one step at a time.
// Main.java uses it, so you can run Main to check your work.
//
// Leave the "package part20;" line alone.
// Under these comments, type the class: public class Receiver { ... }
//
// When it works, put a // comment ABOVE every line of code, in YOUR OWN WORDS (Section B).
public class Receiver {
    // this line stores the receiver's name
    private String name;
    // this line stores the receiver's jersey number
    private int number;
    // this line stores how many catches the receiver has
    private int catches;
    // this line stores how many yards the receiver has
    private int yards;

    // this is the constructor for the Receiver class
    public Receiver(String name, int number) {
        // this line sets the receiver's name
        this.name = name;
        // this line sets the receiver's jersey number
        this.number = number;
    }

    // this method returns the receiver's name
    public String getName() {
        return name;
    }

    // this method returns the receiver's jersey number
    public int getNumber() {
        return number;
    }

    // this method returns the number of catches
    public int getCatches() {
        return catches;
    }

    // this method returns the number of yards
    public int getYards() {
        return yards;
    }

    // this method records a catch and adds the yards gained
    public void catchBall(int gain) {
        catches++;
        yards += gain;
    }

    // this method returns the receiver's stats as a String
    public String toString() {
        return "#" + number + " " + name + ": " + catches + " catches, " + yards + " yards";
    }
    public double yardsPerCatch() {
        if (catches == 0) {
            return 0.0;
        }

        return (double) yards / catches;
    }
}