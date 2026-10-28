package part16;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=11990s
//        starts at about 3:19:50 — stop at about 3:25:04, when he says
//        "if you would like a copy"
// Guide: GUIDE.md in this folder, Video 2 — the same lesson, written out step by step
//
// Part 16, video 2 — local and global variables (variable scope)
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide).
//    His class with main is called Main. Yours is called VariableScope.
//    Leave the "package part16;" line and the "public class VariableScope" line alone.
//    He also makes a class called DiceRoller. YOU make that file too:
//    right-click the part16 folder -> New -> Java Class -> type DiceRoller -> Enter.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    in THIS file AND in DiceRoller.java, saying in YOUR OWN WORDS what that line does.

public class VariableScope {
    public static void main(String[] args) {
        DiceRoller diceRoller = new DiceRoller();
    }
}
