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
public class Receiver{
    private String name;
    private int number;
    private int catches;
    private int yards;

    public Receiver(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public int getCatches() {
        return catches;
    }

    public int getYards() {
        return yards;
    }

    public void catchBall(int gain) {
        catches++;
        yards += gain;
    }

    public String toString() {
        return "#" + number + " " + name + ": " + catches + " catches, " + yards + " yards";
    }
}