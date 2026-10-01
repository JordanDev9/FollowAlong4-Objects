# Part 17 — Overloaded constructors and toString

**We start this together in class · due before the next lecture · No AI**

In part 16 you wrote one constructor for a class. Now a class gets **several**
constructors, so you can build an object in more than one way. Then you teach an object
how to **describe itself** when you print it.

**What you learn:**

- **overloaded constructors**: two or more constructors in one class, each with a
  different list of parameters
- **signature**: a constructor's name plus its parameters. No two can be the same
- **`null`**: what a `String` field holds when nobody gave it a value
- **`toString()`**: the method Java calls when you print an object. You can write your own

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
| **A · Follow along** | `OverloadedConstructors.java`, `Pizza.java`, `ToStringMethod.java`, `Car.java` | 25 | `part17 follow-along: overloaded constructors, toString` |
| **B · Comments** | the same four files | 25 | `part17 comments: explained every line of the follow-along code` |
| **C · Stretch** | `Stretch.java` (and `Pizza.java`, `Car.java`) | 25 | `part17 stretch: prediction, description, Pizza toString, Car constructor` |
| **D · Challenge** | `Challenge.java` | 25 | `part17 challenge: sumSkip13 and hasPair` |

When you finish a section, you **commit** it with the message in the table. That commit is
how I know you finished it. **You do not send me anything on Canvas.** A program I run reads
your commit messages, so **type each one exactly as shown.**

> **No commit, no credit.** If a section has no commit, it gets **0**, even if the code is
> on your laptop. Everything must be **pushed before the next lecture starts.**

The warm-up and the in-class exercise are practice. They are not graded, but do them. They
make the rest easier.

---

## Warm-up — 5 minutes (practice, not graded)

1. Open `part16/Stretch.java`. Look at your **Stretch B1** for **30 seconds**.
2. Close it.
3. Open `part17/Warmup.java`. **Without looking back**, type Stretch B1 again and make it
   print the same thing.

You have to type `public static void main(String[] args)` yourself. You will probably make
a mistake. **That is fine. That is what the warm-up is for.**

4. Run it with the **green ▶** next to `main`.
5. If it does not match, try to fix it yourself first. Look back only if you are really
   stuck.

---

## Section A — Follow along (25 points)

*We start this together in class. Finish it on your own if we run out of time.*

**▶ [Open the video at 3:25:40](https://www.youtube.com/watch?v=xk4_1vDrzzo&t=12340s)**

**📖 Rather read than watch? Open [GUIDE.md](GUIDE.md)** in this folder. It is the same
lesson, written out step by step, with the output you should see after each step. You can
use the video, the guide, or both. Either way, you type every line yourself.

**Watch from about 3:25:40 to about 3:38:30.** That is about 13 minutes of video. It will
take you about 25 minutes, because you keep pausing to type. That is normal.

> The times might be off by a minute. Listen for what he says:
>
> - **Start** when he says *"we're going to be discussing overloaded constructors."*
> - **Topic 2 starts** at about 3:32:20, when he says *"we're going to be discussing the
>   toString method."*
> - **Stop** when he says *"that's how the toString method works in Java."*

### His screen looks different from yours

**Skip the opening "like and subscribe" part.** Start when he starts talking about
overloaded constructors.

**Each topic has its own file.** He types `main` in a class called `Main`. You don't:

- For **topic 1**, type `main` in **`OverloadedConstructors.java`**.
- For **topic 2**, type `main` in **`ToStringMethod.java`**.

**Leave the `package part17;` line and the `public class ...` line alone.** Type everything
else.

**He already has a `Pizza` class and a `Car` class. You have to make them.** When he starts
using one, make it like this:

1. In the Project panel, **right-click** the `part17` folder.
2. Choose **New → Java Class**.
3. Type `Pizza` (or `Car`) and press Enter.

IntelliJ makes the file with the `package` line and an empty class. Type his code inside
the class.

**His `Car` class is already filled in.** Type the four fields yourself: `make` is
`"Ford"`, `model` is `"Mustang"`, `color` is `"red"`, `year` is `2021`.

**He copies and pastes constructors.** **You type them.** Every time.

**When he prints the car's memory address, his says `Car@` and some letters.** Yours says
`part17.Car@` and different letters. That is normal. The letters change on every computer.

**When you write `toString`, a small round icon appears on the left of that line.** It
means "this replaces a method that already existed." That is what you want. His screen
shows a different icon.

### Check your output as you go

**Check 1 (about 3:28:50): the first pizza.** Run `OverloadedConstructors.java`:

```
Here are the ingredients of your pizza: 
thick crust
tomato
mozzarella
pepperoni
```

**Check 2 (about 3:29:25): take out the topping.** With only three ingredients and only
one constructor, it does **not** compile:

```
error: constructor Pizza in class Pizza cannot be applied to given types;
  required: String,String,String,String
```

That is supposed to happen. Keep watching.

**Check 3 (about 3:30:30): a second constructor with three parameters.** Now it runs. The
topping is `null`, because nobody gave it a value:

```
Here are the ingredients of your pizza: 
thick crust
tomato
mozzarella
null
```

**Check 4 (about 3:30:40 to 3:32:00): two, one, and zero ingredients.** Each new
constructor gives one more `null`. With `new Pizza()`, all four are `null`:

```
Here are the ingredients of your pizza: 
null
null
null
null
```

**Check 5 (about 3:34:00): print the car itself.** Run `ToStringMethod.java`. The last
line looks something like this. Your letters after `@` will be different:

```
part17.Car@6d06d69c
```

**Check 6 (about 3:37:40): after you write `toString`.** Now printing the car shows its
description, not an address. `car.toString()` and `car` print the same thing:

```
Ford
Mustang
red
2021
```

### Stuck? Check these first

| What you see | What is usually wrong |
|---|---|
| `cannot find symbol` and `class Pizza` (or `class Car`) | You have not made the class yet, or its name is spelled differently. Right-click `part17` → **New → Java Class** |
| `constructor Pizza in class Pizza cannot be applied to given types;` | You sent a number of ingredients that no constructor takes. Read **required:** to see what it wants |
| `constructor Pizza(String,String,String,String) is already defined in class Pizza` | Two constructors have the same parameters. You copied one and forgot to change it |
| `toString() in Car cannot override toString() in Object` | You wrote `void toString()`. It must be `String toString()` |
| `missing return statement` | Your `toString` builds the text but never says `return` |
| Printing the car still shows `part17.Car@...` after you wrote `toString` | Check the spelling: `toString` with a **capital S**. Also check that it is **inside** `Car`'s `{ }` |
| You fixed your code, but the output did not change | You ran a **different file**. Use the ▶ **next to `main`** in the file you are working on |

### ✅ Commit Section A

When your output matches Check 6, type this in the terminal:

```bash
git add -A
git commit -m "part17 follow-along: overloaded constructors, toString"
```

---

## In-class exercise — smoothies (together, not graded)

We do this one together in class, in `InClass.java`. Everyone types their own copy.

### Step 1 — A class with three constructors, and a toString

Under the `class Smoothie {` line at the bottom of `InClass.java`, build the class together:

- **Two fields:** `String fruit;` and `String size;`
- **Three constructors**, each with a different list of parameters:
  - `Smoothie()` with nothing in the parentheses. It makes a **small banana** smoothie.
  - `Smoothie(String fruit)`. It makes a **small** smoothie of that fruit.
  - `Smoothie(String fruit, String size)`. It uses both.
- **A `toString()` method** that returns text like `a small banana smoothie`.

Then, in `main` under `STEP 1`, make one smoothie with each constructor and print all
three. Your output:

```
a small banana smoothie
a small mango smoothie
a large strawberry smoothie
```

Things to figure out together:

- How does Java know **which** constructor to use? (It looks at what you put in the
  parentheses: how many things, and what types.)
- Why can we write `System.out.println(s1)` and get words, not a strange address?
- Inside a constructor, why do we need `this.fruit = fruit;` and not `fruit = fruit;`?

### Step 2 — Fix the bugs

Under `STEP 2` there are three broken lines, inside a `/* ... */` comment so they don't
stop your program from running. One at a time:

1. Move **one** broken line up, above the `/*` line. Now Java can see it.
2. Read the **red error**. What is Java telling you?
3. Fix the line. Run the program.
4. Do the next line.

| Broken line | The error Java gives you |
|---|---|
| `Smoothie s4 = new Smoothie("kiwi", "large", "extra ice");` | `no suitable constructor found for Smoothie(String,String,String)` |
| `Smoothie s5 = Smoothie("mango");` | `cannot find symbol` … `symbol: method Smoothie(String)` |
| `System.out.println(s1.toString);` | `cannot find symbol` … `symbol: variable toString` |

**Hints, if you need them:** the first one asks for a constructor that does not exist.
Either take out an argument, or write a fourth constructor. The second one forgot a word
that every new object needs. The third one is a method, so it needs `( )`.

### ✅ Commit the in-class exercise

```bash
git add -A
git commit -m "part17 in-class: smoothie constructors and toString"
```

---

## Section B — Comment every line (25 points)

*On your own.*

Now explain your own code. In **all four files** (`OverloadedConstructors.java`,
`Pizza.java`, `ToStringMethod.java`, `Car.java`), put a `//` comment **above every line of
code**, saying **in your own words** what that line does.

**Which lines need a comment?**

- **Yes:** every line that does something. That includes `public class ...`, every field,
  every constructor's first line, every `this.` line, `public String toString()`, and every
  `System.out...` line.
- **No:** lines that are only `}`, and empty lines.

**What makes a good comment?** Say what the line **does** and **why**. Do not just repeat
the code in English.

| ❌ Not enough | ✅ Good |
|---|---|
| `// pizza constructor` | `// this constructor is used when I only send 2 things, so cheese and topping stay null` |
| `// this.sauce = sauce` | `// copies the sauce that was sent in into this pizza's own sauce field` |
| `// prints car` | `// println calls my toString behind the scenes, so it prints the 4 lines instead of an address` |
| `// toString` | `// replaces the built-in toString so the car describes itself; it has to give back a String` |

Here is what a commented line looks like in your file:

```java
    // a 3-ingredient pizza: topping is never set, so it stays null
    Pizza(String bread, String sauce, String cheese) {
```

**Rules:**

1. **Your own words.** Do not copy sentences from the guide or the video. I want to know
   what **you** think the line does.
2. **Not sure what a line does?** Write your best guess, and add `(not sure)` at the end.
   An honest guess gets credit. A skipped line does not.
3. **Run both programs again when you're done.** Comments must not change the output. If it
   changed, a comment is missing its `//`.

### ✅ Commit Section B

```bash
git add -A
git commit -m "part17 comments: explained every line of the follow-along code"
```

---

## Section C — Stretch (25 points)

*On your own.*

Do these in `Stretch.java`. There is no `main` in that file yet. **Type it yourself.**
B2 and B3 also add to your `Pizza` and `Car` classes.

### Stretch A — guess first

1. Type this code inside `main`. **Do not run it yet.**

```java
Pizza a = new Pizza("flatbread", "pesto");
Pizza b = new Pizza("thin crust", "tomato", "cheddar", "olives");
Pizza c = new Pizza();
System.out.println(a.cheese);
System.out.println(b.topping);
System.out.println(c.bread);
Car car = new Car();
System.out.println(car);
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
null
olives
null
Ford
Mustang
red
2021
```

- `a` used the 2-ingredient constructor, so its `cheese` was never set: `null`.
- `b` used the 4-ingredient constructor, so it has a topping: `olives`.
- `c` used the empty constructor, so even `bread` is `null`.
- Printing `car` calls your `toString`, so you get 4 lines, not an address.

</details>

### Stretch B — a description, a pizza, and a new car

Put this code under your Stretch A code, in the same `main`.

**B1.** Build a **description** in one `String`, the way `toString` does, and print it:

```java
String make = "Honda";
String model = "Civic";
int year = 2019;
String description = year + " " + make + " " + model;
System.out.println(description);
```

Output:

```
2019 Honda Civic
```

Then change the values to **your** car, or a car you would like. Keep it short: the next part's
warm-up is typing B1 again from memory.

**B2.** Give your **`Pizza`** class its own `toString()`. It should give back **one line**,
like this. Then, in `Stretch.java`, make this pizza and print it with `println`:

```java
Pizza mine = new Pizza("thin crust", "tomato", "cheddar", "olives");
System.out.println(mine);
```

Output:

```
thin crust pizza with tomato, cheddar and olives
```

**Hint:** copy the shape of the `Car`'s `toString`, but put `" pizza with "`, `", "` and
`" and "` between the fields instead of `"\n"`.

**B3.** Give your **`Car`** class a **second constructor** that takes all four values:

```java
Car other = new Car("Toyota", "Corolla", "blue", 2018);
System.out.println(other);
```

Output:

```
Toyota
Corolla
blue
2018
```

**Watch out:** as soon as you add this constructor, `ToStringMethod.java` stops compiling,
with this error on `new Car()`:

```
error: constructor Car in class Car cannot be applied to given types;
```

Why? When a class has **no** constructor, Java gives it an empty one for free. Once you
write **any** constructor, the free one goes away. Fix it the way he did for pizza: add an
empty `Car() { }` constructor too. Now `Car` is overloaded.

### ✅ Commit Section C

Run `ToStringMethod.java` once more to make sure it still works. Then:

```bash
git add -A
git commit -m "part17 stretch: prediction, description, Pizza toString, Car constructor"
```

---

## Section D — Challenge (25 points)

*On your own.*

Open `Challenge.java`. It has **two methods** for you to finish. A **test** checks them.
This uses **arrays** from part 10.

| Method | What it gives back | Examples |
|---|---|---|
| `sumSkip13(int[] nums)` | The sum of the numbers, but **13 does not count**, and **neither does the number right after a 13** | `{1, 2, 3}` → `6` · `{1, 13, 5, 2}` → `3` · `{}` → `0` |
| `hasPair(int[] nums, int value)` | `true` if two numbers **next to each other** are both equal to `value` | `{1, 2, 2}`, `2` → `true` · `{2, 1, 2}`, `2` → `false` |

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

- `sumSkip13`: loop with an index `i`, not a for-each, because you need to look at the
  number **before** this one: `nums[i - 1]`. Only do that when `i > 0`.
- `hasPair`: compare `nums[i]` with `nums[i + 1]`. Stop the loop one early, at
  `nums.length - 1`, or you will go past the end of the array.

### ✅ Commit Section D

When every test is green:

```bash
git add -A
git commit -m "part17 challenge: sumSkip13 and hasPair"
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
a1b2c3d part17 challenge: sumSkip13 and hasPair
e4f5a6b part17 stretch: prediction, description, Pizza toString, Car constructor
c7d8e9f part17 comments: explained every line of the follow-along code
9d8c7b6 part17 in-class: smoothie constructors and toString
0a1b2c3 part17 follow-along: overloaded constructors, toString
```

*(The letters and numbers at the start will be different for you. That is normal.)*
Press `q` to get out of the list.

**Missing one?** That section gets **0** right now. Go back, finish it, and make its
commit. You have until the next lecture starts.

**Typed a commit message wrong?** Make one more commit with the right message. Copy the
right message from the table, and add `--allow-empty` so Git lets you commit without
changing a file:

```bash
git commit --allow-empty -m "part17 comments: explained every line of the follow-along code"
```

### 3. Push

```bash
git add -A
git commit -m "part17 log"
git push
```

### 4. Check GitHub

Go to your fork on GitHub (`github.com/your-username/FollowAlong4-Objects`). Click the
**commits** link (clock icon) above the file list. **All of this part's commits must be
there.** If they are on your laptop but not on GitHub, you did not push, and I cannot see
them.

> **No commit, no credit.** A section with no commit gets 0. A commit that is not pushed
> before the next lecture starts does not count.

**Next part's warm-up:** type your Stretch B1 again, from memory.

**Finished early? Start Part 18.** You don't have to wait for class.

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
  Read the parts about constructors and the `toString` method.
- **Tutoring:** bring your laptop and this page.
- **Office hours:** bring the error message and tell me what you already tried.
- **Classmates:** talk it over as much as you want. But **type your own code.**
