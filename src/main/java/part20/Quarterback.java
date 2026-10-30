package part20;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo
//        (no video in this part — it is a checkpoint. Use it to look things up)

// Part 20 — CHECKPOINT. No video, no guide.
//
// You write this whole class yourself, starting from an empty file.
// The README lists everything a Quarterback needs, one step at a time.
// Main.java uses it, so you can run Main to check your work.
//
// Leave the "package part20;" line alone.
// Under these comments, type the class: public class Quarterback { ... }
//
// When it works, put a // comment ABOVE every line of code, in YOUR OWN WORDS (Section B).
public class Quarterback{
        private String name;
        private int armStrength;
        private int attempts;
        private int completions;
        private int passingYards;

        public Quarterback(String name, int armStrength) {
            this.name = name;
            this.armStrength = armStrength;
        }

        public String getName() {
            return name;
        }

        public int getAttempts() {
            return attempts;
        }

        public int getCompletions() {
            return completions;
        }

        public int getPassingYards() {
            return passingYards;
        }

        public boolean throwTo(Receiver target, int yards) {
            attempts++;

            if (yards > armStrength) {
                System.out.println(name + " -> " + target.getName() + ", " + yards + " yards: INCOMPLETE");
                return false;
            }

            completions++;
            passingYards += yards;
            target.catchBall(yards);

            System.out.println(name + " -> " + target.getName() + ", " + yards + " yards: CAUGHT");
            return true;
        }

        public int completionPercentage() {
            if (attempts == 0) {
                return 0;
            }

            return completions * 100 / attempts;
        }

        public String toString() {
            return name + ": " + completions + "/" + attempts + ", " + passingYards + " yards, " + completionPercentage() + "%";
        }

        public boolean throwTo(Receiver target) {
            return throwTo(target, 10);
        }
    }
