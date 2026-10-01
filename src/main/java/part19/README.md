# Part 19 — The static keyword

**We start this together in class · due before the next lecture · No AI**

You have typed `static` in every `main` since part 01. Now you find out what it means. A
**static** field or method belongs to the **class**, not to one object. There is only one
copy, and every object shares it.

**What you learn:**

- **static variable**: one copy, shared by every object of the class
- **static method**: a method you call with the **class name**, like `Math.round(...)`
- **`Friend.numberOfFriends`**: why you reach static things through the class, not an object
- why `main` is `static`, and the error you get when you forget `static` on your own method

> **Before you start:** open any `.java` file. Click inside it. Type `Sys` and wait two
> seconds. If a list pops up, **stop.** Autocomplete is back on. Do
> [Part 00, step 4](https://github.com/DSU-CSCI-121-F26/FollowAlong1-Basics/blob/main/src/main/java/part00/README.md#step-4--turn-off-the-autocomplete-and-the-ai) again
> before you type anything else.

---

## How this part works

**In class, together:** we start Section A (follow along), and we do the **in-class
exercise** together.

**On your own:** you finish whatever we did not get to, then do Sections B, C and D.

## How this part is graded

This part has **four graded sections**. Each one is worth **25 points**.

| Section | File | Points | Your commit message |
|---|---|---|---|
| **A · Follow along** | `StaticKeyword.java`, `Friend.java` | 25 | `part19 follow-along: static keyword` |
| **B · Comments** | the same two files | 25 | `part19 comments: explained every line of the follow-along code` |
| **C · Stretch** | `Stretch.java` (and `Friend.java`) | 25 | `part19 stretch: prediction, Math methods, square, newest friend` |
| **D · Challenge** | `Challenge.java` | 25 | `part19 challenge: roundedTotal, round10 and canBuildWall` |

When you finish a section, you **commit** it with the message in the table. That commit is
how I know you finished it. **You do not send me anything on Canvas.** A program I run reads
your commit messages, so **type each one exactly as shown.**

> **No commit, no credit.** If a section has no commit, it gets **0**, even if the code is
> on your laptop. Everything must be **pushed before the next lecture starts.**

The warm-up and the in-class exercise are practice. They are not graded, but do them. They
make the rest easier.

---

## Warm-up — 5 minutes (practice, not graded)

1. Open `part18/Stretch.java`. Look at your **Stretch B1** (the fridge loop) for
   **30 seconds**.
2. Close it.
3. Open `part19/Warmup.java`. **Without looking back**, type it again and make it print the
   same thing.

You have to type `public static void main(String[] args)` yourself. You will probably make
a mistake. **That is fine. That is what the warm-up is for.**

4. Run it with the **green ▶** next to `main`.
5. If it does not match, try to fix it yourself first. Look back only if you are really
   stuck.

---

## Section A — Follow along (25 points)

*We start this together in class. Finish it on your own if we run out of time.*

**▶ [Open the video at 3:50:00](https://www.youtube.com/watch?v=xk4_1vDrzzo&t=13800s)**

**📖 Rather read than watch? Open [GUIDE.md](GUIDE.md)** in this folder. It is the same
lesson, written out step by step, with the output you should see after each step. You can
use the video, the guide, or both. Either way, you type every line yourself.

**Watch from about 3:50:00 to about 3:57:15.** That is about 7 minutes of video. It will
take you about 15 minutes, because you keep pausing to type. That is normal.

> The times might be off by a minute. Listen for what he says:
>
> - **Start** when he says *"I'm going to be explaining the static keyword modifier."*
> - **Stop** when he says *"that's the basics of the static keyword modifier."*

### His screen looks different from yours

**Skip the opening "like and subscribe" part.**

**He types `main` in a class called `Main`. You type it in `StaticKeyword.java`.** Leave the
`package part19;` line and the `public class StaticKeyword` line alone. Type everything else.

**He already has a `Friend` class. You have to make it.** When he starts using it:

1. In the Project panel, **right-click** the `part19` folder.
2. Choose **New → Java Class**.
3. Type `Friend` and press Enter.

**Eclipse shows a little red S next to static things.** IntelliJ does not. In IntelliJ,
static fields show up in *italic* letters instead.

**When he gets the count through `friend1` instead of `Friend`, Eclipse shows a warning.**
IntelliJ also highlights it. The warning is right: use the class name.

**IntelliJ may show `friend1`, `friend2` and so on in grey.** That just means you made them
and never used them again. It is fine.

### Check your output as you go

**Check 1 (about 3:51:40): no friends yet.** Run `StaticKeyword.java`:

```
0
```

**Check 2 (about 3:52:50): three friends, printing the count after each one.**

```
0
1
2
3
```

**Check 3 (about 3:53:50 to 3:54:40): take `static` off the variable.** `Friend.numberOfFriends`
turns red, with this error. That is supposed to happen. **Put `static` back** after you see
it.

```
error: non-static variable numberOfFriends cannot be referenced from a static context
```

**Check 4 (about 3:55:50): the static method.** `Friend.displayFriends()` prints:

```
You have 3 friends
```

**Check 5 (about 3:56:05): add Sandy and call it again.** The last two lines are:

```
You have 3 friends
You have 4 friends
```

### Stuck? Check these first

| What you see | What is usually wrong |
|---|---|
| `cannot find symbol` and `class Friend` | You have not made the class yet, or its name is spelled differently. Right-click `part19` → **New → Java Class** |
| `non-static variable numberOfFriends cannot be referenced from a static context` | The word `static` is missing in front of `int numberOfFriends` in `Friend.java` |
| `non-static method displayFriends() cannot be referenced from a static context` | The word `static` is missing in front of `void displayFriends()` |
| The count stays at `0` after you make friends | You forgot `numberOfFriends++;` in the constructor |
| Every friend says `1` | `numberOfFriends` is not `static`, so each friend has its own copy |
| `cannot find symbol` and `variable friend` | `Friend` is the **class**. It needs a capital **F**: `Friend.numberOfFriends` |
| You fixed your code, but the output did not change | You ran a **different file**. Use the ▶ **next to `main`** in the file you are working on |

### ✅ Commit Section A

When your output matches Check 5, type this in the terminal:

```bash
git add -A
git commit -m "part19 follow-along: static keyword"
```

---

## In-class exercise — counting players (together, not graded)

We do this one together in class, in `InClass.java`. Everyone types their own copy.

### Step 1 — One number shared by every player

At the bottom of `InClass.java`, build the `Player` class together:

- `static int count = 0;` — **one** count, shared by every player.
- `String name;` and `int number;` — **each** player has their own.
- A constructor `Player(String name)` that saves the name, adds 1 to `count`, and sets
  `number` to the new `count`.
- `static void announce()` that prints `There are <count> players on the team`.

Then, in `main` under `STEP 1`, make three players (`Ana`, `Ben`, `Cal`) and print. Your
output:

```
Players: 3
There are 3 players on the team
Ana is player 1
Cal is player 3
```

Things to figure out together:

- Why do we write `Player.count` with the **class** name, but `a.name` with a **variable**?
- Every player changed `count`. Why does Ana's `number` stay `1`?

### Step 2 — Fix the bugs

Under `STEP 2` there are three broken lines, inside a `/* ... */` comment so they don't
stop your program from running. One at a time:

1. Move **one** broken line up, above the `/*` line. Now Java can see it.
2. Read the **red error**. What is Java telling you?
3. Fix the line. Run the program.
4. Do the next line.

| Broken line | The error Java gives you |
|---|---|
| `greet();` | `non-static method greet() cannot be referenced from a static context` |
| `System.out.println(Player.name);` | `non-static variable name cannot be referenced from a static context` |
| `Player.announce;` | `not a statement` |

**Hints, if you need them:** `main` is `static`, so it can't call `greet()` by itself.
Either add `static` to `greet`, or call it on an object: `new InClass().greet();`. Which
player's name did the second line want? Use a player variable, like `a.name`. The third
one is a method, so it needs `( )`.

### ✅ Commit the in-class exercise

```bash
git add -A
git commit -m "part19 in-class: counting players with static"
```

---

## Section B — Comment every line (25 points)

*On your own.*

Now explain your own code. In **both files** (`StaticKeyword.java` and `Friend.java`), put a
`//` comment **above every line of code**, saying **in your own words** what that line does.

**Which lines need a comment?**

- **Yes:** every line that does something. That includes `public class ...`, every field,
  the constructor's first line, `numberOfFriends++`, `static void displayFriends()`, and
  every line in `main`.
- **No:** lines that are only `}`, and empty lines.

**What makes a good comment?** Say what the line **does** and **why**. Do not just repeat
the code in English.

| ❌ Not enough | ✅ Good |
|---|---|
| `// static int` | `// one count shared by ALL friends, because it belongs to the class, not to one friend` |
| `// ++` | `// every time a new friend is made, the shared count goes up by one` |
| `// prints number of friends` | `// reaches the count through the class name Friend, no object needed, because it is static` |
| `// display friends` | `// a static method, so I call it on the class; it can use numberOfFriends because that is static too` |

Here is what a commented line looks like in your file:

```java
        // making Sandy runs the constructor, so the shared count goes from 3 to 4
        Friend friend4 = new Friend("Sandy");
```

**Rules:**

1. **Your own words.** Do not copy sentences from the guide or the video. I want to know
   what **you** think the line does.
2. **Not sure what a line does?** Write your best guess, and add `(not sure)` at the end.
   An honest guess gets credit. A skipped line does not.
3. **Run it again when you're done.** Comments must not change the output. If it changed, a
   comment is missing its `//`.

### ✅ Commit Section B

```bash
git add -A
git commit -m "part19 comments: explained every line of the follow-along code"
```

---

## Section C — Stretch (25 points)

*On your own.*

Do these in `Stretch.java`. There is no `main` in that file yet. **Type it yourself.**
B3 also adds to your `Friend` class.

### Stretch A — guess first

1. Type this code inside `main`. **Do not run it yet.**

```java
System.out.println(Friend.numberOfFriends);
Friend a = new Friend("Gary");
Friend b = new Friend("Plankton");
System.out.println(Friend.numberOfFriends);
Friend.displayFriends();
```

2. **Above that code**, write what you think it will print, inside a comment:

```java
/* MY GUESS:
   ...
*/
```

3. Now run it.
4. Were you wrong about any line? **Keep your wrong guess.** Under it, add a comment that
   says why you were wrong.

<details>
<summary>Click to see the answer. Only after you have run it!</summary>

```
0
2
You have 2 friends
```

- It starts at `0`, not `4`. SpongeBob and his friends were made in a **different program**
  (`StaticKeyword`). Every time you run a program, everything starts fresh.
- Gary and Plankton each add 1 to the **one shared** count, so it is `2`.

</details>

### Stretch B — Math, your own static method, and the newest friend

Put this code under your Stretch A code, in the same `main`.

**B1.** Use three **static methods** of the `Math` class. Notice that you never make a Math
object. You call each method on the class:

```java
long rounded = Math.round(3.7);
double root = Math.sqrt(81);
int bigger = Math.max(4, 9);
System.out.println(rounded + " " + root + " " + bigger);
```

Output:

```
4 9.0 9
```

Then change the numbers and check you can predict the new output. Keep it short: the next part's
warm-up is typing B1 again from memory.

**B2.** Write your **own** static method in `Stretch.java`. Put it **under** `main`, still
inside the class `{ }`:

```java
    static int square(int n) {
        return n * n;
    }
```

Then call it from `main` two ways:

```java
System.out.println(Stretch.square(5));
System.out.println(square(12));
```

Output:

```
25
144
```

Inside its own class, you can leave off the class name. Both lines call the same method.

**Try this:** take the word `static` off `square`. You get this error, because `main` is
static and can only call static methods directly:

```
error: non-static method square(int) cannot be referenced from a static context
```

Put `static` back.

**B3.** In **`Friend.java`**, add a second static variable that remembers the **newest**
friend's name:

```java
    static String newestFriend;
```

In the constructor, set it to the new friend's name. (You write that one line.) Then, in
`Stretch.java`:

```java
Friend c = new Friend("Karen");
System.out.println("Newest friend: " + Friend.newestFriend);
```

Output:

```
Newest friend: Karen
```

There is only one `newestFriend`, shared by everyone, so each new friend **replaces** the
last one's name.

### ✅ Commit Section C

Run `StaticKeyword.java` once more to make sure it still works. Then:

```bash
git add -A
git commit -m "part19 stretch: prediction, Math methods, square, newest friend"
```

---

## Section D — Challenge (25 points)

*On your own.*

Open `Challenge.java`. It has **two methods and one helper** for you to finish. A **test**
checks all three. Every method in it is `static`, which is why the test can call
`Challenge.round10(15)` without making a `Challenge` object.

| Method | What it gives back | Examples |
|---|---|---|
| `round10(int n)` | `n` rounded to the nearest 10. A last digit of **5 or more rounds up** | `15` → `20` · `14` → `10` · `20` → `20` |
| `roundedTotal(int a, int b, int c)` | Round each number with `round10`, then add them | `(16, 17, 18)` → `60` · `(12, 13, 14)` → `30` |
| `canBuildWall(int small, int big, int goal)` | Small bricks are **1** inch, big bricks are **5** inches. `true` if you can make a row **exactly** `goal` inches long | `(3, 1, 8)` → `true` · `(3, 1, 9)` → `false` · `(3, 2, 10)` → `true` |

**`roundedTotal` must call `round10`** for each number. Write the rounding rule once.

**How to work on it:**

1. In each method, change only the line marked `// YOUR CODE`.
2. Press `⌘ ⇧ T` (Mac) or `Ctrl ⇧ T` (Windows) to jump to `ChallengeTest.java`.
3. Click the **green ▶** next to `class ChallengeTest` → **Run**.
4. **Red ✗:** click it. Compare **expected** (the right answer) with **but was** (yours).
   **Green ✔:** that one is right.
5. Fix, run again, until **all** tests are green. Some may be green before you start. That
   does not mean you are done.

**Never change `ChallengeTest.java`.** Only change `Challenge.java`.

**Hints:**

- `round10`: `n % 10` gives you the last digit. If it is 5 or more, go **up** to the next
  10. If not, go **down**.
- `canBuildWall`: use as many big bricks as fit, but no more than you have. That is
  `Math.min(big, goal / 5)`, another static method. Then check whether the small bricks can
  fill what is left. **Do not use a loop.** One test uses a million bricks, and a loop is too
  slow for that.

### ✅ Commit Section D

When every test is green:

```bash
git add -A
git commit -m "part19 challenge: roundedTotal, round10 and canBuildWall"
```

---

## Hand it in: push before the next lecture

### 1. Fill in your log

At the bottom of this page, fill in the three lines under **My log**.

### 2. Check your commits

In the terminal, type:

```bash
git log --oneline
```

Near the top of the list, you should see **your commits for this part**, newest first:

```
a1b2c3d part19 challenge: roundedTotal, round10 and canBuildWall
e4f5a6b part19 stretch: prediction, Math methods, square, newest friend
c7d8e9f part19 comments: explained every line of the follow-along code
9d8c7b6 part19 in-class: counting players with static
0a1b2c3 part19 follow-along: static keyword
```

*(The letters and numbers at the start will be different for you. That is normal.)*
Press `q` to get out of the list.

**Missing one?** That section gets **0** right now. Go back, finish it, and make its
commit. You have until the next lecture starts.

**Typed a commit message wrong?** Make one more commit with the right message. Copy the
right message from the table, and add `--allow-empty` so Git lets you commit without
changing a file:

```bash
git commit --allow-empty -m "part19 comments: explained every line of the follow-along code"
```

### 3. Push

```bash
git add -A
git commit -m "part19 log"
git push
```

### 4. Check GitHub

Go to your fork on GitHub (`github.com/your-username/FollowAlong4-Objects`). Click the
**commits** link (clock icon) above the file list. **All of this part's commits must be
there.** If they are on your laptop but not on GitHub, you did not push, and I cannot see
them.

> **No commit, no credit.** A section with no commit gets 0. A commit that is not pushed
> before the next lecture starts does not count.

**Next part's warm-up:** type your Stretch B1 again, from memory. The next part is the last
one: a checkpoint with no video, done in class.

**Finished early?** Look over Part 20 so you know what is coming, but do its build in class.

---

## My log

Fill this in before you push. Type your answers after the colons.

```
Started:
Finished:
The line that took me the longest:
```

---

## Want more help?

- **Think Java** (free online book): [Chapter 11 — Designing Classes](https://books.trinket.io/thinkjava2/chapter11.html).
  Look for the parts that compare **static** methods with methods you call on an object.
- **Tutoring:** bring your laptop and this page.
- **Office hours:** bring the error message and tell me what you already tried.
- **Classmates:** talk it over as much as you want. But **type your own code.**
