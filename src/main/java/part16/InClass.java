package part16;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=11407s
//        rewatch 3:10:07 for constructors, and 3:19:50 for local and global variables
//
// In-class exercise — we do this together in class. Not graded, but commit it.
// The README (In-class exercise) has the steps and the output to match.

public class InClass {
    public static void main(String[] args) {

        // STEP 1b

        Jersey jersey1 = new Jersey("Davis", 11);
        Jersey jersey2 = new Jersey("Brooks", 84);

        jersey1.describe();
        jersey2.describe();

        int number = 99;

        System.out.println("number in main: " + number);
        System.out.println("number in jersey1: " + jersey1.number);


        // STEP 2 — fix the bugs. Each line below has ONE mistake.
        // Move ONE line at a time above the /* line, so Java sees it.
        // Read the error. Fix it. Run it. Then do the next line.

        // tje consturcter expects 2 args string and int only gave string
        Jersey jersey3 = new Jersey("Lee", 7);
        // THIS LINE expects a string then a int not a int then a string
        Jersey jersey4 = new Jersey("kim", 17);
        // this line wants label to print but label is a local variable not global
        //System.out.println(label);
    }

}

// STEP 1a — a second class in the same file. This is allowed because it is not public.
class Jersey {
    String name;
    int number;
    String label;

    Jersey(String name, int number) {
        this.name = name;
        this.number = number;
    }

    void describe() {
        label = name + " #" + number;
        System.out.println(label);
    }
}


