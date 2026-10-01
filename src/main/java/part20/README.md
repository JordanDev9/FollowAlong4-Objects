# Part 20 — Checkpoint: Receiver and Quarterback from an empty file

**Checkpoint · we do this in class · due before the next lecture · No AI**

**There is no video in this part, and no guide.** This part is where you show what you can
do on your own.

Remember the Football recitation? You built a `Receiver` and a `Quarterback` by typing
along with the README. Now you build them **again, from an empty file**, using only a
list of what each class needs. Everything you need, you have done in the last 19 parts.

**What you use:**

- **fields** and a **constructor** (part 16)
- **getters**: small methods that give back a field (part 13 and part 16)
- **`toString()`** (part 17)
- **passing an object to a method**: `throwTo(Receiver target, int yards)` (part 18)
- **overloading**: two `throwTo` methods with the same name (part 14 and part 17)
- **integer division**: why `2 / 3` is `0` (part 02)

> **Before you start:** open any `.java` file. Click inside it. Type `Sys` and wait two
> seconds. If a list pops up, **stop.** Autocomplete is back on. Do
> [Part 00, step 4](https://github.com/DSU-CSCI-121-F26/FollowAlong1-Basics/blob/main/src/main/java/part00/README.md#step-4--turn-off-the-autocomplete-and-the-ai) again
> before you type anything else.

---

## How this part works

This part is a **checkpoint**. We do it **in class**.

**Together:** first we do the **in-class exercise** (a design warm-up and some bug fixing).

**On your own, in class:** you build Section A. It is a checkpoint, so you work alone, with
no help from classmates.

**On your own, after class:** you finish whatever you did not get to, then do Sections B, C
and D.

## How this part is graded

This part has **four graded sections**. Each one is worth **25 points**.

| Section | File | Points | Your commit message |
|---|---|---|---|
| **A · Build** | `Receiver.java`, `Quarterback.java` | 25 | `part20 build: Receiver and Quarterback from an empty file` |
| **B · Comments** | the same two files | 25 | `part20 comments: explained every line of Receiver and Quarterback` |
| **C · Stretch** | `Stretch.java` (and `Receiver.java`) | 25 | `part20 stretch: two names, integer division, yardsPerCatch, 1 catch` |
| **D · Challenge** | `Challenge.java` | 25 | `part20 challenge: ticketResult and sameCount` |

When you finish a section, you **commit** it with the message in the table. That commit is
how I know you finished it. **You do not send me anything on Canvas.** A program I run reads
your commit messages, so **type each one exactly as shown.**

> **No commit, no credit.** If a section has no commit, it gets **0**, even if the code is
> on your laptop. Everything must be **pushed before the next lecture starts.**

The warm-up and the in-class exercise are practice. They are not graded, but do them. They
make the rest easier.

---

## Warm-up — 5 minutes (practice, not graded)

1. Open `part19/Stretch.java`. Look at your **Stretch B1** (the Math methods) for
   **30 seconds**.
2. Close it.
3. Open `part20/Warmup.java`. **Without looking back**, type it again and make it print the
   same thing.
4. Run it with the **green ▶** next to `main`.

---

## In-class exercise — design first, then fix (together, not graded)

We do this one together in class, **before** the build, in `InClass.java`. Everyone types
their own copy.

### Step 1 — Design two classes, with no code

In this part you build two classes that work together. Before we write any code, we
practise the
**design** on two different classes: a **basketball hoop** and a **shooter**.

Under `STEP 1`, there is an empty design. Fill it in **together, as comments only**:

- **What does each object need to remember?** Those are its **fields**.
- **What can each object do?** Those are its **methods**.
- **Which object calls a method on the other one?**

The rules of the game: a shooter has a **range**, the longest shot they can make. If the
shot is within their range, it goes in, and the hoop adds the points.

<details>
<summary>One good design — open this only after we have made ours</summary>

```
// Hoop
//   fields:   name (String), points (int)
//   methods:  Hoop(String name)                     a constructor
//             score(int shotPoints)                 adds to points
//             toString()                            "gym hoop: 12 points"
//
// Shooter
//   fields:   name (String), range (int), attempts (int), makes (int)
//   methods:  Shooter(String name, int range)       a constructor
//             shootAt(Hoop target, int distance)    true if it went in. It calls
//                                                   target.score(...) when it does
//             accuracy()                            makes out of attempts, as a percent
//             toString()
```

Notice the arrow: the **shooter** calls a method **on the hoop**. That is the same idea
you will use in the build.

</details>

### Step 2 — Fix the object bugs

`InClass.java` already has two small classes, `Lamp` and `Fan`, and a method `sayHi`.
Under `STEP 2` there are three broken lines, inside a `/* ... */` comment so they don't
stop your program from running. One at a time:

1. Move **one** broken line up, above the `/*` line. Now Java can see it.
2. Run it. Read the **red error**, or look at the **output**.
3. Fix it. Run the program.
4. Do the next line.

| Broken line | What happens |
|---|---|
| `Lamp lamp = Lamp("desk lamp"); lamp.turnOn(); System.out.println(lamp);` | `cannot find symbol` … `symbol: method Lamp(String)` |
| `Fan fan = new Fan("ceiling fan"); System.out.println(fan.name);` | **No red error.** But it prints `null`, not `ceiling fan` |
| `sayHi();` | `non-static method sayHi() cannot be referenced from a static context` |

**Hints, if you need them:**

- **Lamp:** every new object needs one word in front of the class name.
- **Fan:** this line is fine. The bug is **inside the `Fan` class**, in its constructor.
  `name = name;` copies the parameter onto itself. The field never changes. Which word
  tells Java you mean the **field**?
- **sayHi:** `main` is `static`. Call it on an object: `new InClass().sayHi();`

When all three are fixed, your output is:

```
desk lamp is on: true
ceiling fan
Hi from InClass
```

### ✅ Commit the in-class exercise

```bash
git add -A
git commit -m "part20 in-class: design and object bugs"
```

---

## Section A — Build (25 points)

*In class, on your own. It is a checkpoint: no help from classmates. If you run out of
time, finish it before the next lecture.*

### The rules for the build

- **Start from the empty files.** `Receiver.java` and `Quarterback.java` have only a
  `package part20;` line and some comments. **You type the whole class.**
- **Do not open the Football recitation repo**, or `part16`–`part19`, to copy from. If you are
  truly stuck on **how to say something in Java**, you may look at **one** old file for
  **30 seconds**, close it, and then type it yourself. That is the same rule as the warm-up.
- **No AI.** Same as every part.

### How you check your work: `Main.java`

You do **not** write `Main.java`. It is already there, and it uses your two classes.
Every step in it is **switched off** with comments, so it runs even before you start.

**When you finish a step, switch that step on:**

1. In `main()`, delete the `//` in front of that step's line. For step 1:
   `// step1();` becomes `step1();`
2. Further down in `Main.java`, find that step's method. Delete the `/*` **above** it and
   the `*/` **below** it.
3. Run `Main.java` with the **green ▶** next to `main`. Compare with the output below.

Do the steps **in order**. Each one needs the ones before it.

---

### Step 1 — Receiver: fields, a constructor, and getters

In `Receiver.java`, under the comments, type `public class Receiver { }`. Inside it:

| What | Details |
|---|---|
| **4 fields**, all `private` | `name` (a `String`) · `number` (an `int`, his jersey number) · `catches` (an `int`) · `yards` (an `int`) |
| **1 constructor** | `Receiver(String name, int number)`. It sets `name` and `number`. It does **not** set `catches` or `yards`. They start at `0` by themselves |
| **4 getters**, all `public` | `getName()` gives back `name` · `getNumber()` gives back `number` · `getCatches()` gives back `catches` · `getYards()` gives back `yards` |

A **getter** is a tiny method that gives back one field. The fields are `private`, so
`Main` cannot read them directly. It has to ask the getter.

Switch on **step 1** in `Main.java` and run it:

```
=== Part 20 checkpoint ===

=== Step 1 ===
Davis wears #11
catches: 0
yards: 0
```

---

### Step 2 — Receiver: catching the ball, and toString

Add to `Receiver`:

| What | Details |
|---|---|
| `public void catchBall(int gain)` | Adds **1** to `catches`, and adds `gain` to `yards` |
| `public String toString()` | Gives back a String like `#11 Davis: 2 catches, 20 yards` |

Look closely at the `toString` format: a `#`, the number, a space, the name, a colon, a
space, the catches, the word `catches,`, a space, the yards, and the word `yards`.

Switch on **step 2** and run it. The new part:

```
=== Step 2 ===
#11 Davis: 2 catches, 20 yards
```

Davis caught a 12-yard pass and an 8-yard pass: 2 catches, 20 yards.

---

### Step 3 — Quarterback: fields, a constructor, and getters

In `Quarterback.java`, type `public class Quarterback { }`. Inside it:

| What | Details |
|---|---|
| **5 fields**, all `private` | `name` (a `String`) · `armStrength` (an `int`: the longest pass he can throw, in yards) · `attempts` · `completions` · `passingYards` (all `int`s) |
| **1 constructor** | `Quarterback(String name, int armStrength)`. It sets `name` and `armStrength` only |
| **4 getters**, all `public` | `getName()` · `getAttempts()` · `getCompletions()` · `getPassingYards()` |

Switch on **step 3** and run it. The new part:

```
=== Step 3 ===
Carter has thrown 0 passes
0 completions, 0 yards
```

---

### Step 4 — Quarterback: throwing to a receiver

This is the important one: **one object calls a method on another object.**

Add to `Quarterback`:

`public boolean throwTo(Receiver target, int yards)`

It does these things, **in this order**:

1. Add 1 to `attempts`. Every throw counts, caught or not.
2. **If** `yards` is **more than** `armStrength`, the pass falls short:
   - print `Carter -> Davis, 50 yards: INCOMPLETE` (with the real names and yards)
   - give back `false`, and stop
3. **Otherwise** the pass is caught:
   - add 1 to `completions`
   - add `yards` to `passingYards`
   - tell the receiver he caught it: **call `catchBall(yards)` on `target`**
   - print `Carter -> Davis, 15 yards: CAUGHT`
   - give back `true`

**Hint:** to get the receiver's name inside `throwTo`, ask the receiver:
`target.getName()`. The quarterback cannot see the receiver's private `name` field.

Switch on **step 4** and run it. The new part:

```
=== Step 4 ===
Carter -> Davis, 15 yards: CAUGHT
Carter -> Brooks, 25 yards: CAUGHT
Carter -> Davis, 50 yards: INCOMPLETE
#11 Davis: 1 catches, 15 yards
#84 Brooks: 1 catches, 25 yards
```

`Main` never called `catchBall`. But Davis and Brooks each have a catch. **The
quarterback** called it, through `target`. (Yes, `1 catches` is bad English. You fix that in
Stretch B3.)

---

### Step 5 — Quarterback: completion percentage, and toString

Add to `Quarterback`:

| What | Details |
|---|---|
| `public int completionPercentage()` | If `attempts` is `0`, give back `0`. Otherwise give back the percent of passes that were caught, as a whole number |
| `public String toString()` | Gives back a String like `Carter: 2/3, 40 yards, 66%` (name, completions/attempts, passing yards, percentage) |

Switch on **step 5** and run it. The new part:

```
=== Step 5 ===
Carter -> Davis, 15 yards: CAUGHT
Carter -> Davis, 25 yards: CAUGHT
Carter -> Davis, 50 yards: INCOMPLETE
Carter: 2/3, 40 yards, 66%
```

**Getting `0%` instead of `66%`?** That is **integer division**. `2 / 3` in Java is `0`,
because both are `int`s, and `0 * 100` is still `0`. Change the **order**: multiply by 100
**first**, then divide. `200 / 3` is `66`.

---

### Step 6 — Quarterback: a shorter throwTo (overloading)

Most passes are short. Add a **second** `throwTo` with the **same name** and **fewer
parameters**:

`public boolean throwTo(Receiver target)`

It throws a **10-yard** pass. **Do not copy** the code from the first `throwTo`. Make this
one **call** the first one with `10`, and give back whatever it gives back. That way the
arm-strength check is only written once.

Switch on **step 6** and run it. The new part:

```
=== Step 6 ===
Carter -> Brooks, 10 yards: CAUGHT
Carter -> Brooks, 30 yards: CAUGHT
#84 Brooks: 2 catches, 40 yards
```

### Your whole output

With all six steps switched on, `Main.java` prints exactly this:

<details>
<summary>Click to see the whole output</summary>

```
=== Part 20 checkpoint ===

=== Step 1 ===
Davis wears #11
catches: 0
yards: 0

=== Step 2 ===
#11 Davis: 2 catches, 20 yards

=== Step 3 ===
Carter has thrown 0 passes
0 completions, 0 yards

=== Step 4 ===
Carter -> Davis, 15 yards: CAUGHT
Carter -> Brooks, 25 yards: CAUGHT
Carter -> Davis, 50 yards: INCOMPLETE
#11 Davis: 1 catches, 15 yards
#84 Brooks: 1 catches, 25 yards

=== Step 5 ===
Carter -> Davis, 15 yards: CAUGHT
Carter -> Davis, 25 yards: CAUGHT
Carter -> Davis, 50 yards: INCOMPLETE
Carter: 2/3, 40 yards, 66%

=== Step 6 ===
Carter -> Brooks, 10 yards: CAUGHT
Carter -> Brooks, 30 yards: CAUGHT
#84 Brooks: 2 catches, 40 yards
```

</details>

### Stuck? Check these first

| What you see | What is usually wrong |
|---|---|
| `cannot find symbol` and `class Receiver` | You have not typed `public class Receiver {` yet, or it is spelled differently |
| `cannot find symbol` and `method getName()` | That getter is missing, or spelled differently. Check capital letters: `getName`, not `getname` |
| `constructor Receiver in class Receiver cannot be applied to given types;` and `required: no arguments` | You wrote `public void Receiver(...)`. A constructor has **no** return type. Take out `void` |
| `name has private access in Receiver` | `Quarterback` tried to read `target.name`. Use the getter: `target.getName()` |
| `method catchBall in class Receiver cannot be applied to given types;` and `required: int` | You called `catchBall()` with nothing inside. It needs the yards: `catchBall(yards)` |
| `missing return statement` | `throwTo` has a path that never says `return`. Both the INCOMPLETE path and the CAUGHT path need one |
| `Carter: 2/3, 40 yards, 0%` | Integer division. Multiply by 100 **before** you divide |
| The receiver's catches stay at `0` after a CAUGHT pass | `throwTo` never called `target.catchBall(yards)` |
| An error inside `Main.java` that points at `/*` or `*/` | You deleted only one of the two. Delete **both** the `/*` and the `*/` for that step |
| You fixed your code, but the output did not change | You ran a **different file**. Use the ▶ **next to `main`** in `Main.java` |

### ✅ Commit Section A

When all six steps match, type this in the terminal:

```bash
git add -A
git commit -m "part20 build: Receiver and Quarterback from an empty file"
```

---

## Section B — Comment every line (25 points)

*On your own.*

Now explain your own code. In **both files** (`Receiver.java` and `Quarterback.java`), put a
`//` comment **above every line of code**, saying **in your own words** what that line does.
You do **not** comment `Main.java`. You did not write it.

**Which lines need a comment?**

- **Yes:** every line that does something. That includes `public class ...`, every field,
  the constructor's first line, every `this.` line, every method's first line, every `if`,
  every line that changes a number, every `System.out...` line, and every `return`.
- **No:** lines that are only `}`, and empty lines.

**What makes a good comment?** Say what the line **does** and **why**. Do not just repeat
the code in English.

| ❌ Not enough | ✅ Good |
|---|---|
| `// private int catches` | `// how many passes he has caught; private so only Receiver can change it` |
| `// getter` | `// lets other classes read the name without being able to change it` |
| `// call catchBall` | `// tells the receiver object he caught it, so HIS catches and yards go up, not the quarterback's` |
| `// return false` | `// the pass was too far for his arm, so throwTo reports that it was not caught` |

**Rules:**

1. **Your own words.** I want to know what **you** think the line does.
2. **Not sure what a line does?** Write your best guess, and add `(not sure)` at the end.
   An honest guess gets credit. A skipped line does not.
3. **Run `Main.java` again when you're done.** Comments must not change the output.

### ✅ Commit Section B

```bash
git add -A
git commit -m "part20 comments: explained every line of Receiver and Quarterback"
```

---

## Section C — Stretch (25 points)

*On your own.*

Do these in `Stretch.java`. There is no `main` in that file yet. **Type it yourself.**
B2 and B3 also change your `Receiver` class.

### Stretch A — guess first

1. Type this code inside `main`. **Do not run it yet.** Notice that `slot` has no `new`.

```java
Quarterback carter = new Quarterback("Carter", 40);
Receiver davis = new Receiver("Davis", 11);
Receiver slot = davis;
carter.throwTo(davis, 15);
carter.throwTo(slot, 10);
System.out.println(davis);
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
Carter -> Davis, 15 yards: CAUGHT
Carter -> Davis, 10 yards: CAUGHT
#11 Davis: 2 catches, 25 yards
```

`slot = davis` does **not** make a second receiver. There was only one `new Receiver`. So
`slot` and `davis` are **two names for the same object**. A pass to `slot` is a pass to
Davis.

</details>

### Stretch B — numbers, an average, and good English

Put this code under your Stretch A code, in the same `main`.

**B1.** Integer division, three ways:

```java
int completions = 2;
int attempts = 3;
System.out.println(completions / attempts * 100);
System.out.println(completions * 100 / attempts);
System.out.println(completions * 100.0 / attempts);
```

Output:

```
0
66
66.66666666666667
```

Before you run it, write one comment for each `println` that says **why** it gives that
number. (Hint for the last one: `100.0` is a `double`.)

**B2.** In **`Receiver.java`**, add a method `public double yardsPerCatch()`. It gives back
the **average** yards per catch: yards divided by catches. If he has **0** catches, give back
`0.0` (you cannot divide by zero). Then, in `Stretch.java`:

```java
System.out.println(davis.yardsPerCatch());
Receiver rookie = new Receiver("Lee", 3);
System.out.println(rookie.yardsPerCatch());
```

Output:

```
12.5
0.0
```

Davis has 25 yards on 2 catches, so 12.5. **Getting `12.0`?** That is integer division
again. Turn one of the numbers into a `double` before you divide: `(double) yards`.

**B3.** Fix the bad English. In `Receiver`'s `toString`, use an `if`: when `catches` is
exactly **1**, say `1 catch`, not `1 catches`. Then, in `Stretch.java`:

```java
Receiver brooks = new Receiver("Brooks", 84);
brooks.catchBall(25);
System.out.println(brooks);
brooks.catchBall(5);
System.out.println(brooks);
```

Output:

```
#84 Brooks: 1 catch, 25 yards
#84 Brooks: 2 catches, 30 yards
```

After B3, **step 4** in `Main.java` says `1 catch` too. That is correct now.

### ✅ Commit Section C

```bash
git add -A
git commit -m "part20 stretch: two names, integer division, yardsPerCatch, 1 catch"
```

---

## Section D — Challenge (25 points)

*On your own.*

Open `Challenge.java`. It has **two methods** for you to finish. A **test** checks them.

| Method | What it gives back | Examples |
|---|---|---|
| `ticketResult(int a, int b, int c)` | **10** if all three are the same. **5** if `b` and `c` are **both** different from `a`. **0** for anything else | `(2, 2, 2)` → `10` · `(1, 2, 3)` → `5` · `(2, 2, 1)` → `0` |
| `sameCount(String s, String x, String y)` | `true` if `x` and `y` show up **the same number of times** inside `s` | `("catdog", "cat", "dog")` → `true` · `("catcat", "cat", "dog")` → `false` · `("", "cat", "dog")` → `true` |

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

- `ticketResult`: three cases, so three `return`s. Check "all the same" with `a == b && b == c`.
  Check the 5-point rule with `b != a && c != a`. Anything left over gives back `0`.
- `sameCount`: write a **helper** method, `count(String s, String word)`, that counts how
  many times `word` is in `s`. Then `sameCount` is one line that compares two counts. To
  count, use `s.indexOf(word, start)` (part 11) in a `while` loop. It gives back where `word`
  is found, starting from `start`, or `-1` when there are no more.

### ✅ Commit Section D

When every test is green:

```bash
git add -A
git commit -m "part20 challenge: ticketResult and sameCount"
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
a1b2c3d part20 challenge: ticketResult and sameCount
e4f5a6b part20 stretch: two names, integer division, yardsPerCatch, 1 catch
c7d8e9f part20 comments: explained every line of Receiver and Quarterback
0a1b2c3 part20 build: Receiver and Quarterback from an empty file
1f2e3d4 part20 in-class: design and object bugs
```

*(The letters and numbers at the start will be different for you. That is normal.)*
Press `q` to get out of the list.

**Missing one?** That section gets **0** right now. Go back, finish it, and make its
commit. You have until the next lecture starts.

**Typed a commit message wrong?** Make one more commit with the right message. Copy the
right message from the table, and add `--allow-empty` so Git lets you commit without
changing a file:

```bash
git commit --allow-empty -m "part20 comments: explained every line of Receiver and Quarterback"
```

### 3. Push

```bash
git add -A
git commit -m "part20 log"
git push
```

### 4. Check GitHub

Go to your fork on GitHub (`github.com/your-username/FollowAlong4-Objects`). Click the
**commits** link (clock icon) above the file list. **All of this part's commits must be
there.** If they are on your laptop but not on GitHub, you did not push, and I cannot see
them.

> **No commit, no credit.** A section with no commit gets 0. A commit that is not pushed
> before the next lecture starts does not count.

---

## You finished

That was part 20, the last one. You started from `System.out.println`. Now you have written
two classes that work together, from empty files.

Keep this repo. Everything you typed is in it, with your own comments, and you can come
back to any part when you need it.

**What comes next will be announced in class.**

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
- **Tutoring:** bring your laptop and this page.
- **Office hours:** bring the error message and tell me what you already tried.
- **Classmates:** talk it over as much as you want. But **type your own code.**
