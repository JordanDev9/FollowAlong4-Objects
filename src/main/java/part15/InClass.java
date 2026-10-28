package part15;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=10770s
//        rewatch 2:59:30 for objects, and 2:57:15 for final
//
// In-class exercise — we do this together in class. Not graded, but commit it.
// The README (In-class exercise) has the steps and the output to match.

public class InClass {
    public static void main(String[] args) {

        // STEP 1b — we make two speakers and use them together, here.
        Speaker speaker1 = new Speaker();
        Speaker speaker2 = new Speaker();

        speaker1.louder();
        speaker1.louder();

        speaker2.mute();

        speaker1.describe();
        speaker2.describe();

        System.out.println("Max volume: " + speaker1.MAX_VOLUME);



        // STEP 2 — fix the bugs. Each line below has ONE mistake.
        // Move ONE line at a time above the /* line, so Java sees it.
        // Read the error. Fix it. Run it. Then do the next line.
        // the "max volume" in this case is final so it cannot be changed even if we put it to 10
        //speaker1.MAX_VOLUME = 11;
        // that not how you spell louder
        speaker1.louder();
        // there is no speaker 3 right
        //Speaker speaker3; speaker3.louder();

    }
}

// STEP 1a — a second class in the same file. This is allowed because it is not public.
class Speaker {
    final int MAX_VOLUME = 10;
    String brand = "JBL";
    int volume = 5;

    void louder() {
        volume++;
    }

    void mute() {
        volume = 0;
    }

    void describe() {
        System.out.println(brand + " speaker at volume " + volume);
    }
}


