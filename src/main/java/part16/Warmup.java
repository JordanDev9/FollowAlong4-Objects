package part16;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=11407s
//        (warm-up first — no video until Constructors.java)
//
// Warm-up — 5 minutes, before the video. Practice, not graded.
//
// Open part15/Stretch.java and look at your Stretch B1 for 30 seconds:
// the Phone class AND the four lines in main that use it.
// Close it. Without looking again, type Stretch B1 here from memory.
// The Phone class goes BELOW the last } of class Warmup, without the word public.
//
// You will need to type the main method yourself.

public class Warmup {
    public static void main(String[] args) {
        Phone phone = new Phone();

        phone.charge();
        phone.charge();

        System.out.println(phone.brand + " battery: " + phone.battery);
    }
    static class Phone {
        String brand = "Apple";
        int battery = 80;

        final int MAX_BATTERY = 100;

        void charge() {
            battery = battery + 10;

            if (battery > MAX_BATTERY) {
                battery = MAX_BATTERY;
            }

            System.out.println("Charging... " + battery + "%");
        }
    }



}
