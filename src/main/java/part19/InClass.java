package part19;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=13800s
//        rewatch the static keyword part if you get stuck
//
// In-class exercise — we do this together in class. Not graded, but commit it.
// The README (In-class exercise) has the steps and the output to match.

public class InClass {
    public static void main(String[] args) {

        // STEP 1

        Player a = new Player("Ana");
        Player b = new Player("Ben");
        Player c = new Player("Cal");

        System.out.println("Players: " + Player.count);
        Player.announce();
        System.out.println(a.name + " is player " + a.number);
        System.out.println(c.name + " is player " + c.number);


    // STEP 2 — fix the bugs. Each line below has ONE mistake.
        // Move ONE line at a time above the /* line, so Java sees it.
        // Read the red error. Fix it. Run it. Then do the next line.

        // greet() is not static, so it must be called with an object
// greet();
// name is not static, so it must be called with a Player object
// System.out.println(Player.name);
// announce is a method, so it needs parentheses
        Player.announce();

    }
}



// STEP 1 — we build the Player class together.
class Player {

    static int count = 0;
    String name;
    int number;

    Player(String name) {
        this.name = name;
        count++;
        number = count;
    }

    static void announce() {
        System.out.println("There are " + count + " players on the team");
    }
}
