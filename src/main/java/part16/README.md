# Part 16 — Constructors and variable scope

**We start this together in class · due before the next lecture · No AI**

In part 15, every `Car` came out exactly the same: a blue Corvette. In this part you fix that. A
**constructor** lets each object start out with **its own** values. Then you learn **where**
a variable can be used, and where it can't.

**What you learn:**

- **constructor**: a special method that runs when you write `new`. It has the **same name
  as the class**, and it sets up the new object.
- **instantiate**: a fancy word for "make an object." `new Human(...)` instantiates a
  `Human`.
- **`this`**: inside a class, `this` means "the object I am right now." `this.name` is
  **this object's** name.
- **local variable**: made **inside** a method. Only that method can see it.
- **global variable**: made **outside** any method, but inside the class. Every method in
  the class can see it. (Many books call this a *field* or an *instance variable*.)
- **scope**: the part of the code where a variable can be seen.

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
| **A · Follow along** | `Constructors.java`, `Human.java`, `VariableScope.java`, `DiceRoller.java` | 25 | `part16 follow-along: constructors and variable scope` |
| **B · Comments** | the same four files | 25 | `part16 comments: explained every line of the follow-along code` |
| **C · Stretch** | `Stretch.java` | 25 | `part16 stretch: scope puzzle, pet class, and the this bug` |
| **D · Challenge** | `Challenge.java` | 25 | `part16 challenge: doubleLetters and countWord` |

When you finish a section, you **commit** it with the message in the table. That commit is
how I know you finished it. **You do not send me anything on Canvas.** A program I run reads
your commit messages, so **type each one exactly as shown.**

> **No commit, no credit.** If a section has no commit, it gets **0**, even if the code is
> on your laptop. Everything must be **pushed before the next lecture starts.**

The warm-up and the in-class exercise are practice. They are not graded, but do them. They
make the rest easier.

---

## Warm-up — 5 minutes (practice, not graded)

1. Open `part15/Stretch.java`. Look at your **Stretch B1** for **30 seconds**: the `Phone`
   class **and** the four lines in `main` that use it.
2. Close it.
3. Open `part16/Warmup.java`. **Without looking back**, type it again. `main` goes inside
   `class Warmup`. The `Phone` class goes **below** the last `}` of `class Warmup`, without
   the word `public`.
4. Run it with the **green ▶** next to `main`. It should print:

```
Charging... 90%
Charging... 100%
Apple battery: 100
```

5. If it does not match, try to fix it yourself first. Look back at `part15/Stretch.java`
   only if you are really stuck.

---

## Section A — Follow along (25 points)

*We start this together in class. Finish it on your own if we run out of time.*

This part has **two videos**. Each part has **two files**: one with `main`, and one class
that you make yourself.

| Part | Topic | Video | Your files |
|---|---|---|---|
| A | Constructors | **[about 3:10:07 to 3:19:32](https://www.youtube.com/watch?v=xk4_1vDrzzo&t=11407s)** | `Constructors.java` **and** a new file, `Human.java` |
| B | Local and global variables | **[about 3:19:50 to 3:25:04](https://www.youtube.com/watch?v=xk4_1vDrzzo&t=11990s)** | `VariableScope.java` **and** a new file, `DiceRoller.java` |

That is about 15 minutes of video. It will take you about 30 minutes, because you keep
pausing to type. That is normal.

**📖 Rather read than watch? Open [GUIDE.md](GUIDE.md)** in this folder. It is the same
lesson, written out step by step, with the output you should see after each step. You can
use the video, the guide, or both. Either way, you type every line yourself.

> The times might be off by a minute. Listen for what he says:
>
> - **Video 1 starts** when he says *"in this video I'm going to teach you guys all about
>   Constructors."*
> - **Video 2 starts** when he says *"in this video I'm going to teach you guys the
>   difference between local and global variables."*
> - **Each part stops** when he says *"if you would like a copy of all this code."*

### His screen looks different from yours

**His class with `main` is called `Main`.** Yours is called `Constructors` (Video 1) and
`VariableScope` (Video 2). Leave the `package part16;` line and the `public class ...` line
alone. Type everything else inside the class.

**In Video 1, he already has a `Human` class when the video starts.** You don't. Make it
first:

1. In the Project panel on the left, **right-click the `part16` folder**.
2. Choose **New → Java Class**.
3. Type `Human` and press **Enter**.

**In Video 2, he makes `DiceRoller` with Eclipse's menu (about 3:20:35).** Make it the same
way: right-click `part16` → **New → Java Class** → type `DiceRoller` → **Enter**.

**In Video 2, `Random` turns red until you import it.** Click on the red word `Random` and
press `⌥ Enter` (Mac) or `Alt Enter` (Windows). Choose **Import class**. IntelliJ adds
`import java.util.Random;` near the top of the file. That is the same line he types.

**He talks about "global" variables.** That is his word for a variable made inside the
class but outside every method. Other books and your teacher may call it a **field** or an
**instance variable**. Same thing.

**His dice numbers are random, and so are yours.** Any number from 1 to 6 is correct.

### Check your output as you go

#### Video 1 — Constructors (`Constructors.java` and `Human.java`)

**Check 1 (about 3:12:20): a constructor that needs inputs.** In `Human`, he writes a
constructor with three parameters: `Human(String name, int age, double weight)`. Now the
line `Human human = new Human();` in `main` is red:

```
error: constructor Human in class Human cannot be applied to given types;
  required: String,int,double
  found:    no arguments
```

The constructor **requires** a String, an int and a double. You gave it nothing.

**Check 2 (about 3:13:28): give it what it needs.** He changes it to
`new Human("Rick", 65, 70)`. The red goes away. It runs, and prints nothing yet.

**Check 3 (about 3:15:12): the `null` surprise.** He adds three attributes to `Human`
(`name`, `age`, `weight`) and, in the constructor, writes `name = name;` (and the same for
the others). Then he prints `human.name`:

```
null
```

`null` means "nothing here." The name never got saved. (Step A6 in the guide explains why.)

**Check 4 (about 3:15:23): use `this`.** He changes the three lines to `this.name = name;`,
`this.age = age;` and `this.weight = weight;`. Now:

```
Rick
```

**Check 5 (about 3:16:16): a second human.** He renames `human` to `human1`, makes
`human2` as `new Human("Morty", 16, 50)`, and prints both names:

```
Rick
Morty
```

Same class, **different** values. That is what constructors are for.

**Check 6 (about 3:17:25 to 3:19:00): methods that use `this`.** He adds `eat()` and
`drink()` to `Human`. Each prints the person's name using `this.name`. Calling
`human1.eat();` and `human2.drink();` gives:

```
Rick
Morty
Rick is eating
Morty is drinking *burp*
```

#### Video 2 — Local and global variables (`VariableScope.java` and `DiceRoller.java`)

**Check 7 (about 3:22:12): the problem.** In `DiceRoller`, he makes `random` and `number`
**inside the constructor**. Then the `roll()` method tries to use them, and gets red
errors:

```
error: cannot find symbol
  symbol:   variable number
  location: class DiceRoller
```

`number` is **local** to the constructor. `roll()` cannot see it.

**Check 8 (about 3:22:49): fix 1, pass them in.** He gives `roll` two parameters,
`roll(Random random, int number)`, and calls `roll(random, number);` from the constructor.
It runs. Output: **one number from 1 to 6**, like:

```
4
```

**Check 9 (about 3:23:32 to 3:24:25): fix 2, make them global.** He undoes fix 1. Then he
moves `Random random;` and `int number;` **outside** the constructor, at the top of the
class. Now every method in the class can see them. Output: **one number from 1 to 6**
again. Run it a few times. The number changes.

### Stuck? Check these first

| What you see | What is usually wrong |
|---|---|
| `constructor Human in class Human cannot be applied to given types` | The `new Human(...)` line does not match the constructor. It needs a String, an int and a double, **in that order** |
| It prints `null` (or `0`) | The constructor says `name = name;`. Change it to `this.name = name;` |
| `cannot find symbol` and `class Human` (or `DiceRoller`) | You have not made that file yet, or it is not in the `part16` folder |
| `cannot find symbol` and `class Random` | Missing import. Click `Random` and press `⌥ Enter` / `Alt Enter` → **Import class** |
| `cannot find symbol` and `variable number` (or `random`) | The variable is **local** to another method. Pass it in, or make it global (Check 8 and 9) |
| `invalid method declaration; return type required` | Your constructor's name is not **exactly** the class name. `human` is not `Human` |
| The dice prints nothing | `main` must say `new DiceRoller()`, and the constructor must call `roll()` |
| No green ▶ in `Human.java` or `DiceRoller.java` | That is correct. They have no `main`. Run `Constructors.java` or `VariableScope.java` |

### ✅ Commit Section A

When everything matches the checks, type this in the terminal:

```bash
git add -A
git commit -m "part16 follow-along: constructors and variable scope"
```

---

## In-class exercise — a Jersey class with a constructor (together, not graded)

We do this one together in class, in `InClass.java`. Everyone types their own copy.

At the bottom of `InClass.java` there is a **second class**, `Jersey`. Two classes in one
file is allowed, as long as only one of them is `public`.

### Step 1 — A constructor, then a scope check

**1a.** Inside `class Jersey { }`, type:

- two attributes: `String name;` and `int number;`
- a **constructor** `Jersey(String name, int number)` that uses `this.name = name;` and
  `this.number = number;`
- a method `void describe()` that makes a **local** variable
  `String label = name + " #" + number;` and prints it

**1b.** Under `STEP 1b`, inside `main`:

1. Make two jerseys: `new Jersey("Davis", 11)` and `new Jersey("Brooks", 84)`.
2. Call `describe()` on both.
3. Make a **local** variable in `main`: `int number = 99;`. Print it, then print
   `jersey1.number`.

Output to match:

```
Davis #11
Brooks #84
number in main: 99
number in jersey1: 11
```

Things to figure out together: **there are two variables called `number`. Why don't they
get mixed up?**

### Step 2 — Fix the bugs

Under `STEP 2` there are three broken lines, inside a `/* ... */` comment so they don't
stop your program from running. One at a time:

1. Move **one** broken line up, above the `/*` line. Now Java can see it.
2. Read the **red error**. What is Java telling you?
3. Fix the line. Run the program.
4. Do the next line.

| Broken line | The error Java gives you |
|---|---|
| `Jersey jersey3 = new Jersey("Lee");` | `constructor Jersey in class Jersey cannot be applied to given types;` and `required: String,int` |
| `Jersey jersey4 = new Jersey(12, "Kim");` | `incompatible types: int cannot be converted to String` |
| `System.out.println(label);` | `cannot find symbol` and `symbol: variable label` |

The last one is **variable scope**: `label` lives inside `describe()`. `main` can't see it.

### ✅ Commit the in-class exercise

```bash
git add -A
git commit -m "part16 in-class: jersey constructor"
```

---

## Section B — Comment every line (25 points)

*On your own.*

Now explain your own code. In **all four files**, `Constructors.java`, `Human.java`,
`VariableScope.java` **and** `DiceRoller.java`, put a `//` comment **above every line of
code**, saying **in your own words** what that line does.

**Which lines need a comment?**

- **Yes:** every line that does something. That includes `public class ...`,
  `public static void main(...)`, every attribute, the constructor line, every `this.`
  line, every method line, every `new`, every `import`, and every `System.out...` line.
- **No:** lines that are only `}`, empty lines, and the comments you already typed from the
  video.

**What makes a good comment?** Say what the line **does** and **why**. Do not just repeat
the code in English.

| ❌ Not enough | ✅ Good |
|---|---|
| `// constructor` | `// runs when someone writes new Human(...), and takes the three values to set up this human` |
| `// this.name = name` | `// saves the name that was passed in into THIS human's own name, so it isn't lost` |
| `// int number` | `// global: made outside every method, so both the constructor and roll() can use it` |
| `// roll` | `// picks a random number from 1 to 6 and prints it` |

**Rules:**

1. **Your own words.** Do not copy sentences from the guide or the video. I want to know
   what **you** think the line does.
2. **Not sure what a line does?** Write your best guess, and add `(not sure)` at the end.
   An honest guess gets credit. A skipped line does not.
3. **Run `Constructors.java` and `VariableScope.java` again when you're done.** Comments
   must not change the output.

### ✅ Commit Section B

```bash
git add -A
git commit -m "part16 comments: explained every line of the follow-along code"
```

---

## Section C — Stretch (25 points)

*On your own.*

Do these in `Stretch.java`. There is no `main` in that file yet. **Type it yourself.** Your
extra classes go in the **same file**, **below** the last `}` of `class Stretch`, without
the word `public`.

### Stretch A — guess first

1. Below `class Stretch`, type this class:

```java
class Counter {
    int count = 10;

    void show() {
        int count = 3;
        System.out.println(count);
        System.out.println(this.count);
    }
}
```

2. Inside `main`, type this. **Do not run it yet.**

```java
        Counter c = new Counter();
        c.show();
        c.count = 20;
        c.show();
```

3. **Above that code**, write what you think it will print, inside a comment:

```java
        /* MY GUESS:
           ...
        */
```

4. Now run it.
5. Were you wrong about any line? **Keep your wrong guess.** Under it, add a comment that
   says why you were wrong.

<details>
<summary>Click to see the answer. Only after you have run it!</summary>

```
3
10
3
20
```

- There are **two** variables called `count`. One is **global** (in the class, starts at
  10). One is **local** (inside `show()`, always 3).
- Inside `show()`, plain `count` means the **local** one. It wins, because it is closer.
- `this.count` means **this object's** global `count`. That is 10, and after `c.count = 20;`
  it is 20.

</details>

### Stretch B — a Pet class with a constructor

**B1.** Below `class Stretch`, type this class:

```java
class Pet {
    String name;
    int age;

    Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void speak() {
        System.out.println(name + " is " + age + " years old");
    }
}
```

Then in `main`, under your Stretch A code:

```java
        Pet pet1 = new Pet("Max", 3);
        Pet pet2 = new Pet("Luna", 5);
        pet1.speak();
        pet2.speak();
```

Output:

```
Max is 3 years old
Luna is 5 years old
```

**B2.** Add a method called `birthday()` to `Pet`. It adds 1 to `age` and prints
`Happy birthday, ` and the name and `!`. In `main`, call `pet1.birthday();` and then
`pet1.speak();` again:

```
Happy birthday, Max!
Max is 4 years old
```

**B3.** See the `this` bug for yourself. Below `class Stretch`, type this **broken** class.
It is like `Pet`, but the constructor forgot `this`:

```java
class Broken {
    String name;
    int age;

    Broken(String name, int age) {
        name = name;
        age = age;
    }
}
```

In `main`, add:

```java
        Broken broken = new Broken("Max", 3);
        System.out.println(broken.name + " " + broken.age);
```

1. **Run it.** Write the output in a comment. It should be:

```
null 0
```

2. Under it, write a comment in your own words: **why** are they `null` and `0`?
3. **Fix** the constructor by adding `this.` in the right places. Run it again:

```
Max 3
```

### ✅ Commit Section C

```bash
git add -A
git commit -m "part16 stretch: scope puzzle, pet class, and the this bug"
```

---

## Section D — Challenge (25 points)

*On your own.*

Open `Challenge.java`. It has **two** methods for you to finish: `doubleLetters` and
`countWord`.

Each method has comments above it showing what it should return. **Change only the lines
marked `// YOUR CODE`.**

**Hint for `doubleLetters`:** start with an empty String, `String result = "";`. Use a
`for` loop over every position. Each time, add the character at that position **twice**.

**Hint for `countWord`:** `s.indexOf(word)` gives the position where `word` first appears,
or `-1` if it is not there. `s.indexOf(word, start)` starts looking at position `start`.
Each time you find it, count it, then look again **after** it: at its position plus
`word.length()`.

### Run the test

1. Open `Challenge.java`.
2. Press `⌘ ⇧ T` (Mac) or `Ctrl ⇧ T` (Windows). This jumps to `ChallengeTest.java`.
3. Click the **green ▶** next to `class ChallengeTest`. Choose **Run**.
4. **Red ✗** means that answer is wrong. Click it and compare **expected** (the right
   answer) with **but was** (what your code gave).
5. Fix your code. Run the test again. Keep going until **all 11 tests are green ✔**.

One test, `doubleEmpty`, is already green before you start: an empty String doubled is
still empty. That is fine. The other 10 start red.

**Never change `ChallengeTest.java`.** Only change `Challenge.java`.

### ✅ Commit Section D

```bash
git add -A
git commit -m "part16 challenge: doubleLetters and countWord"
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
a1b2c3d part16 challenge: doubleLetters and countWord
e4f5a6b part16 stretch: scope puzzle, pet class, and the this bug
c7d8e9f part16 comments: explained every line of the follow-along code
9d8c7b6 part16 in-class: jersey constructor
0a1b2c3 part16 follow-along: constructors and variable scope
```

*(The letters and numbers at the start will be different for you. That is normal.)*
Press `q` to get out of the list.

**Missing one?** That section gets **0** right now. Go back, finish it, and make its
commit. You have until the next lecture starts.

**Typed a commit message wrong?** Make one more commit with the right message. Copy the
right message from the table, and add `--allow-empty` so Git lets you commit without
changing a file:

```bash
git commit --allow-empty -m "part16 comments: explained every line of the follow-along code"
```

### 3. Push

```bash
git add -A
git commit -m "part16 log"
git push
```

### 4. Check GitHub

Go to your fork on GitHub (`github.com/your-username/FollowAlong4-Objects`). Click the
**commits** link (clock icon) above the file list. **All of this part's commits must be
there.** If they are on your laptop but not on GitHub, you did not push, and I cannot see
them.

> **No commit, no credit.** A section with no commit gets 0. A commit that is not pushed
> before the next lecture starts does not count.

**Next part's warm-up:** type your Stretch B1 (the `Pet` class and the four lines that use
it) again, from memory.

**Finished early? Start Part 17.** You don't have to wait for class.

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
  It covers constructors, `this`, and the variables that belong to an object.
- **Tutoring:** bring your laptop and this page.
- **Office hours:** bring the error message and tell me what you already tried.
- **Classmates:** talk it over as much as you want. But **type your own code.**
