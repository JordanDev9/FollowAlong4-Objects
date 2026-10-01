# Part 15 — final, and your first objects

**We start this together in class · due before the next lecture · No AI**

This is a big part. You start **object-oriented programming**: making your **own types**,
like a `Car`, and creating as many cars as you want from them. First, a short warm-up topic:
the `final` keyword.

**What you learn:**

- **`final`**: a variable marked `final` can never be changed after you set it.
- **constant**: a `final` variable. By habit, its name is ALL CAPITALS, like `PI`.
- **object**: a thing in your program that has **attributes** (what it *has*) and
  **methods** (what it can *do*).
- **class**: the **blueprint** for an object. `Car` is a class. Each car you make from it is
  an object.
- **attribute**: a variable that belongs to an object, like a car's `color`.
- **`new`**: the word that makes a new object from a class: `new Car()`.
- **dot `.`**: how you reach inside an object: `myCar.color`, `myCar.drive()`.

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
| **A · Follow along** | `FinalKeyword.java`, `ObjectOriented.java`, `Car.java` | 25 | `part15 follow-along: final keyword and objects` |
| **B · Comments** | the same three files | 25 | `part15 comments: explained every line of the follow-along code` |
| **C · Stretch** | `Stretch.java` | 25 | `part15 stretch: phone class and final` |
| **D · Challenge** | `Challenge.java` | 25 | `part15 challenge: partyRating and fizzBuzz` |

When you finish a section, you **commit** it with the message in the table. That commit is
how I know you finished it. **You do not send me anything on Canvas.** A program I run reads
your commit messages, so **type each one exactly as shown.**

> **No commit, no credit.** If a section has no commit, it gets **0**, even if the code is
> on your laptop. Everything must be **pushed before the next lecture starts.**

The warm-up and the in-class exercise are practice. They are not graded, but do them. They
make the rest easier.

---

## Warm-up — 5 minutes (practice, not graded)

1. Open `part14/Stretch.java`. Look at your **Stretch B1** (the receipt line) for
   **30 seconds**.
   It is in your **last repo, FollowAlong3-DataAndMethods**. Easiest way to see it: on GitHub, open your
   fork of FollowAlong3-DataAndMethods → `src/main/java/part14/Stretch.java`.
2. Close it.
3. Open `part15/Warmup.java`. **Without looking back**, type your Stretch B1 again, including
   `main`. Make it print the same thing it printed before.
4. Run it with the **green ▶** next to `main`.
5. If it does not match, try to fix it yourself first. Look back at `part14/Stretch.java`
   only if you are really stuck.

---

## Section A — Follow along (25 points)

*We start this together in class. Finish it on your own if we run out of time.*

This part has **two videos**.

| Part | Topic | Video | Your files |
|---|---|---|---|
| A | The `final` keyword | **[about 2:57:15 to 2:59:12](https://www.youtube.com/watch?v=xk4_1vDrzzo&t=10635s)** | `FinalKeyword.java` |
| B | Objects | **[about 2:59:30 to 3:09:48](https://www.youtube.com/watch?v=xk4_1vDrzzo&t=10770s)** | `ObjectOriented.java` **and** a new file, `Car.java` |

That is about 12 minutes of video. It will take you about 25 minutes, because you keep
pausing to type. That is normal.

**📖 Rather read than watch? Open [GUIDE.md](GUIDE.md)** in this folder. It is the same
lesson, written out step by step, with the output you should see after each step. You can
use the video, the guide, or both. Either way, you type every line yourself.

> The times might be off by a minute. Listen for what he says:
>
> - **Video 1 starts** when he says *"in this video I'm going to teach you guys about the
>   final keyword."*
> - **Video 2 starts** when he says *"in this video I'm going to teach you guys all about
>   object-oriented programming."*
> - **Each part stops** when he says *"if you would like a copy of this code"* (or *"of all
>   this code"*).

### His screen looks different from yours

**His class with `main` is called `Main`.** Yours is called `FinalKeyword` (Video 1) and
`ObjectOriented` (Video 2). Leave the `package part15;` line and the `public class ...` line
alone. Type everything else inside the class.

**In Video 2 he makes a second file, called `Car`, using Eclipse's menu (about 3:02:11).**
In IntelliJ:

1. In the Project panel on the left, **right-click the `part15` folder**.
2. Choose **New → Java Class**.
3. Type `Car` and press **Enter**.

IntelliJ makes `Car.java` with `package part15;` and an empty `public class Car { }`. Type
his code **inside** that class.

**He says he could put `Car` in the same file, but he uses a separate file.** Do what he
does: a separate file.

**He says "brake", like stopping a car. Spell it `brake` (b-r-a-k-e).** Do not spell it
`break` (b-r-e-a-k). `break` is a special word in Java, so you cannot use it as a method
name. If you try, you get:

```
error: <identifier> expected
```

**In Video 1, his error message is worded differently** from yours, because Eclipse and
IntelliJ word errors differently. The meaning is the same. Yours is in the checks below.

### Check your output as you go

#### Video 1 — final (`FinalKeyword.java`)

**Check 1 (about 2:57:53): changing a normal variable.** He makes `double pi = 3.14159;`,
then changes it with `pi = 4;`, then prints it:

```
4.0
```

A normal variable can be changed.

**Check 2 (about 2:58:09): add `final`.** He puts `final` in front: `final double pi =
3.14159;`. Now the line `pi = 4;` is underlined in red:

```
error: cannot assign a value to final variable pi
```

A `final` variable can never be changed.

**Check 3 (about 2:58:55): ALL CAPS.** He deletes the line `pi = 4;` and renames the
variable to `PI`, in capitals. That is the habit for `final` variables. Output:

```
3.14159
```

#### Video 2 — objects (`ObjectOriented.java` and `Car.java`)

In `Car.java` he types five **attributes** (variables inside the class, but not inside a
method): `make` = `"Chevrolet"`, `model` = `"Corvette"`, `year` = `2020`, `color` =
`"blue"`, `price` = `50000.00`. Then two **methods**: `drive()` and `brake()`, each with one
print line.

**Check 4 (about 3:05:57): make a car and print its model.** In `ObjectOriented.java` he
types `Car myCar = new Car();` and then prints `myCar.model`:

```
Corvette
```

**Check 5 (about 3:06:00): print the make too.**

```
Chevrolet
Corvette
```

**Check 6 (about 3:06:40): call the methods.** He turns the print lines into comments, then
calls `myCar.drive();` and `myCar.brake();`:

```
You drive the car
You step on the brakes
```

**Check 7 (about 3:07:35): a second car.** He renames `myCar` to `myCar1`, makes
`Car myCar2 = new Car();`, and prints the make and model of **both**, with an empty
`println()` between them:

```
Chevrolet
Corvette

Chevrolet
Corvette
```

**Both cars are Chevrolet Corvettes.** Every car made from this class starts out exactly
the same, because the values are written into the blueprint. On part 16 you fix that, with
**constructors**.

### Stuck? Check these first

| What you see | What is usually wrong |
|---|---|
| `cannot assign a value to final variable` | You marked it `final`, then tried to change it. That is the point of `final`. Delete the line that changes it |
| `cannot find symbol` and `class Car` | `Car.java` does not exist, or it is not in the `part15` folder, or the class name is spelled differently (`car` is not `Car`) |
| `<identifier> expected` next to `void break()` | Spell it `brake`. `break` is a Java word |
| `cannot find symbol` and `variable myCar` | You renamed `myCar` to `myCar1` but missed one line. Rename them all |
| `cannot find symbol` and `method drive()` | The method in `Car.java` is spelled differently, or it is outside the class's `{ }` |
| `Car.java` is red in the Project panel | Check the top of `Car.java` says `package part15;` |
| No green ▶ in `Car.java` | That is correct. `Car` has no `main`. Run `ObjectOriented.java` |

### ✅ Commit Section A

When everything matches the checks, type this in the terminal:

```bash
git add -A
git commit -m "part15 follow-along: final keyword and objects"
```

---

## In-class exercise — a Speaker class (together, not graded)

We do this one together in class, in `InClass.java`. Everyone types their own copy.

At the bottom of `InClass.java` there is a **second class**, `Speaker`. Two classes in one
file is allowed, as long as only one of them is `public`. (In the video he puts `Car` in its
own file. Both ways work.)

### Step 1 — Build a speaker, then use it

**1a.** Inside `class Speaker { }`, type:

- an attribute `final int MAX_VOLUME = 10;`
- an attribute `String brand = "JBL";`
- an attribute `int volume = 5;`
- a method `void louder()` that adds 1 to `volume`
- a method `void mute()` that sets `volume` to `0`
- a method `void describe()` that prints the brand and the volume

**1b.** Under `STEP 1b`, inside `main`:

1. Make **two** speakers: `Speaker speaker1 = new Speaker();` and a `speaker2` the same way.
2. Call `louder()` **twice** on `speaker1`. Call `mute()` on `speaker2`.
3. Call `describe()` on both. Then print `speaker1.MAX_VOLUME`.

Output to match:

```
JBL speaker at volume 7
JBL speaker at volume 0
Max volume: 10
```

Things to figure out together: **both speakers came from the same class. Why are their
volumes different?**

### Step 2 — Fix the bugs

Under `STEP 2` there are three broken lines, inside a `/* ... */` comment so they don't
stop your program from running. One at a time:

1. Move **one** broken line up, above the `/*` line. Now Java can see it.
2. Read the **red error**. What is Java telling you?
3. Fix the line (or delete it, if it can never work). Run the program.
4. Do the next line.

| Broken line | The error Java gives you |
|---|---|
| `speaker1.MAX_VOLUME = 11;` | `cannot assign a value to final variable MAX_VOLUME` |
| `speaker1.lowder();` | `cannot find symbol` and `symbol: method lowder()` |
| `Speaker speaker3; speaker3.louder();` | `variable speaker3 might not have been initialized` |

The first one cannot be fixed by changing the number. `final` means **never changes**. The
fix is to delete the line.

### ✅ Commit the in-class exercise

```bash
git add -A
git commit -m "part15 in-class: speaker class"
```

---

## Section B — Comment every line (25 points)

*On your own.*

Now explain your own code. In **all three files**, `FinalKeyword.java`,
`ObjectOriented.java` **and** `Car.java`, put a `//` comment **above every line of code**,
saying **in your own words** what that line does.

**Which lines need a comment?**

- **Yes:** every line that does something. That includes `public class ...`,
  `public static void main(...)`, every attribute in `Car`, each `void ...()` method line,
  every `new Car()`, and every `System.out...` line.
- **No:** lines that are only `}`, empty lines, and the comments you already typed from the
  video.

**What makes a good comment?** Say what the line **does** and **why**. Do not just repeat
the code in English.

| ❌ Not enough | ✅ Good |
|---|---|
| `// final pi` | `// PI can never change after this line, so nobody can break it by accident` |
| `// String color` | `// every car made from this blueprint starts out blue` |
| `// new car` | `// builds a brand new Car object from the Car blueprint and names it myCar1` |
| `// drive` | `// runs the drive method that belongs to myCar1, which prints a message` |

Here is what a commented line looks like:

```java
        // the dot reaches inside myCar2 and gets its model
        System.out.println(myCar2.model);
```

**Rules:**

1. **Your own words.** Do not copy sentences from the guide or the video. I want to know
   what **you** think the line does.
2. **Not sure what a line does?** Write your best guess, and add `(not sure)` at the end.
   An honest guess gets credit. A skipped line does not.
3. **Run `FinalKeyword.java` and `ObjectOriented.java` again when you're done.** Comments
   must not change the output.

### ✅ Commit Section B

```bash
git add -A
git commit -m "part15 comments: explained every line of the follow-along code"
```

---

## Section C — Stretch (25 points)

*On your own.*

Do these in `Stretch.java`. There is no `main` in that file yet. **Type it yourself.**

### Stretch A — guess first

This uses **your** `Car` class from Section A.

1. Type this code inside `main`. **Do not run it yet.**

```java
        Car a = new Car();
        Car b = new Car();
        b.color = "red";
        System.out.println(a.color);
        System.out.println(b.color);
        a = b;
        System.out.println(a.color);
        final double TAX_RATE = 0.06;
        System.out.println(a.price * TAX_RATE);
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
blue
red
red
3000.0
```

- `a` and `b` are **two different cars**. Painting `b` red does not change `a`.
- `a = b;` does **not** copy the car. It makes `a` point at the **same** car as `b`. So now
  `a.color` is `red`.
- `TAX_RATE` is `final`, so it is in ALL CAPS. 50000.00 × 0.06 = 3000.0.

</details>

### Stretch B — a Phone class

You can put a second class in the **same file**, **below** the last `}` of `class Stretch`.
Leave off the word `public`: only one class per file can be `public`.

**B1.** Below `class Stretch`, type this class:

```java
class Phone {
    String brand = "Apple";
    int battery = 80;

    void charge() {
        battery = battery + 10;
        System.out.println("Charging... " + battery + "%");
    }
}
```

Then, in `main` (under your Stretch A code), make a phone and use it:

```java
        Phone phone = new Phone();
        phone.charge();
        phone.charge();
        System.out.println(phone.brand + " battery: " + phone.battery);
```

Output:

```
Charging... 90%
Charging... 100%
Apple battery: 100
```

**B2.** Make a **second** phone, `phone2`. Change its brand to `"Samsung"`. Do **not** charge
it. Then print both brands, and both batteries, so the output is:

```
Apple / Samsung
100 / 80
```

Charging `phone` did not change `phone2`. Each object has its **own** attributes.

**B3.** A battery should never go above 100. In `Phone`:

1. Add a constant: `final int MAX_BATTERY = 100;`
2. In `charge()`, after adding 10, use an `if` (from part 06): if `battery` is more than
   `MAX_BATTERY`, set `battery` back to `MAX_BATTERY`.

Then in `main`, make a third phone called `full`, set `full.battery = 95;`, and charge it
**twice**. Output:

```
Charging... 100%
Charging... 100%
```

Run the whole file. B1 and B2 should still print what they did before.

### ✅ Commit Section C

```bash
git add -A
git commit -m "part15 stretch: phone class and final"
```

---

## Section D — Challenge (25 points)

*On your own.*

Open `Challenge.java`. It has **two** methods for you to finish: `partyRating` and
`fizzBuzz`. You already know everything you need from parts 06 and 07: `if`, `else if`, `&&`,
`||` and `%`.

Each method has comments above it showing what it should return. **Change only the lines
marked `// YOUR CODE`.**

**Hint for `partyRating`:** check the **0** rule **first**. If either number is less than 5,
the answer is 0, no matter what else is true.

**Hint for `fizzBuzz`:** check **"divisible by 3 and 5"** first. If you check "divisible by
3" first, 15 gives `"Fizz"` and stops there.

### Run the test

1. Open `Challenge.java`.
2. Press `⌘ ⇧ T` (Mac) or `Ctrl ⇧ T` (Windows). This jumps to `ChallengeTest.java`.
3. Click the **green ▶** next to `class ChallengeTest`. Choose **Run**.
4. **Red ✗** means that answer is wrong. Click it and compare **expected** (the right
   answer) with **but was** (what your code gave).
5. Fix your code. Run the test again. Keep going until **all 13 tests are green ✔**.

**Never change `ChallengeTest.java`.** Only change `Challenge.java`.

### ✅ Commit Section D

```bash
git add -A
git commit -m "part15 challenge: partyRating and fizzBuzz"
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
a1b2c3d part15 challenge: partyRating and fizzBuzz
e4f5a6b part15 stretch: phone class and final
c7d8e9f part15 comments: explained every line of the follow-along code
9d8c7b6 part15 in-class: speaker class
0a1b2c3 part15 follow-along: final keyword and objects
```

*(The letters and numbers at the start will be different for you. That is normal.)*
Press `q` to get out of the list.

**Missing one?** That section gets **0** right now. Go back, finish it, and make its
commit. You have until the next lecture starts.

**Typed a commit message wrong?** Make one more commit with the right message. Copy the
right message from the table, and add `--allow-empty` so Git lets you commit without
changing a file:

```bash
git commit --allow-empty -m "part15 comments: explained every line of the follow-along code"
```

### 3. Push

```bash
git add -A
git commit -m "part15 log"
git push
```

### 4. Check GitHub

Go to your fork on GitHub (`github.com/your-username/FollowAlong4-Objects`). Click the
**commits** link (clock icon) above the file list. **All of this part's commits must be
there.** If they are on your laptop but not on GitHub, you did not push, and I cannot see
them.

> **No commit, no credit.** A section with no commit gets 0. A commit that is not pushed
> before the next lecture starts does not count.

**Next part's warm-up:** type your Stretch B1 (the `Phone` class and the four lines that use
it) again, from memory.

**Finished early? Start Part 16.** You don't have to wait for class.

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
  It shows how to write your own class, with attributes and methods.
- **Tutoring:** bring your laptop and this page.
- **Office hours:** bring the error message and tell me what you already tried.
- **Classmates:** talk it over as much as you want. But **type your own code.**
