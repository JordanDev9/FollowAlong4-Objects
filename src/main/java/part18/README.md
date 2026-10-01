# Part 18 — Arrays of objects, and passing objects to a method

**We start this together in class · due before the next lecture · No AI**

In part 10 you made arrays of numbers and words. Now you make an array of **your own
objects**. Then you write a method that takes **an object** as its input, so one object can
work with another.

**What you learn:**

- **an array of objects**: like `String[]`, but the type is a class you made, like `Food[]`
- **index**: the number of a spot in an array. The first spot is **0**
- **`null` in an array**: an empty spot. Asking it for `.name` crashes the program
- **passing an object to a method**: a parameter whose type is a class, like `park(Car car)`

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
| **A · Follow along** | `ArrayOfObjects.java`, `Food.java`, `ObjectPassing.java`, `Garage.java`, `Car.java` | 25 | `part18 follow-along: array of objects, passing objects` |
| **B · Comments** | the same five files | 25 | `part18 comments: explained every line of the follow-along code` |
| **C · Stretch** | `Stretch.java` (and `Garage.java`) | 25 | `part18 stretch: prediction, fridge loop, leave method, parking lot` |
| **D · Challenge** | `Challenge.java` | 25 | `part18 challenge: uniqueSum, sumWithoutTeens and fixTeen` |

When you finish a section, you **commit** it with the message in the table. That commit is
how I know you finished it. **You do not send me anything on Canvas.** A program I run reads
your commit messages, so **type each one exactly as shown.**

> **No commit, no credit.** If a section has no commit, it gets **0**, even if the code is
> on your laptop. Everything must be **pushed before the next lecture starts.**

The warm-up and the in-class exercise are practice. They are not graded, but do them. They
make the rest easier.

---

## Warm-up — 5 minutes (practice, not graded)

1. Open `part17/Stretch.java`. Look at your **Stretch B1** (the car description) for
   **30 seconds**.
2. Close it.
3. Open `part18/Warmup.java`. **Without looking back**, type it again and make it print the
   same thing.

You have to type `public static void main(String[] args)` yourself. You will probably make
a mistake. **That is fine. That is what the warm-up is for.**

4. Run it with the **green ▶** next to `main`.
5. If it does not match, try to fix it yourself first. Look back only if you are really
   stuck.

---

## Section A — Follow along (25 points)

*We start this together in class. Finish it on your own if we run out of time.*

**▶ [Open the video at 3:38:40](https://www.youtube.com/watch?v=xk4_1vDrzzo&t=13121s)**

**📖 Rather read than watch? Open [GUIDE.md](GUIDE.md)** in this folder. It is the same
lesson, written out step by step, with the output you should see after each step. You can
use the video, the guide, or both. Either way, you type every line yourself.

**Watch from about 3:38:40 to about 3:49:20.** That is about 11 minutes of video. It will
take you about 20 minutes, because you keep pausing to type. That is normal.

> The times might be off by a minute. Listen for what he says:
>
> - **Start** when he says *"I'm going to be explaining how we can create an array of
>   objects."*
> - **Topic 2 starts** at about 3:44:40, when he says *"how we can pass objects as
>   arguments to a method."*
> - **Stop** when he says *"that's the basics of sending objects as arguments."*

### His screen looks different from yours

**Skip the opening "like and subscribe" part** of each topic.

**Each topic has its own file.** He types `main` in a class called `Main`. You don't:

- For **topic 1**, type `main` in **`ArrayOfObjects.java`**.
- For **topic 2**, type `main` in **`ObjectPassing.java`**.

**Leave the `package part18;` line and the `public class ...` line alone.** Type everything
else.

**He already has `Food`, `Garage` and `Car` classes. You have to make them.** When he
starts using one, make it like this:

1. In the Project panel, **right-click** the `part18` folder.
2. Choose **New → Java Class**.
3. Type the class name (`Food`, `Garage` or `Car`) and press Enter.

**There is a `Car` class in part 17 too.** That is fine. Each part's folder is separate, so
the two `Car`s never meet.

**At the start he shows `int`, `char` and `String` arrays.** You do not need to type those.
They are a review.

**When he prints `refrigerator[0]` by itself, his says `Food@` and some letters.** Yours
says `part18.Food@` and different letters. That is normal.

**He prints a sentence when a car is parked.** His exact words may be a little different
from the guide. What matters is that the car's name shows up in the sentence.

### Check your output as you go

**Check 1 (about 3:42:15): print spot 0 by itself.** Run `ArrayOfObjects.java`. You see an
address. Your letters after `@` will be different:

```
part18.Food@15db9742
```

**Check 2 (about 3:43:10): add `.name` and print all three spots.**

```
pizza
hamburger
hot dog
```

**Check 3 (about 3:44:00): the shorter way, with `{food1, food2, food3}`.** Same output as
Check 2.

**Check 4 (about 3:47:30): park the BMW.** Run `ObjectPassing.java`:

```
The BMW is parked in the garage
```

**Check 5 (about 3:48:40): park the Tesla too.**

```
The BMW is parked in the garage
The Tesla is parked in the garage
```

### Stuck? Check these first

| What you see | What is usually wrong |
|---|---|
| `cannot find symbol` and `class Food` (or `Garage`, `Car`) | You have not made the class yet, or its name is spelled differently. Right-click `part18` → **New → Java Class** |
| `constructor Food in class Food cannot be applied to given types;` | Your `Food` has no constructor that takes a name yet. Add `Food(String name)` |
| `NullPointerException: Cannot read field "name" because "refrigerator[1]" is null` | That spot in the array is empty. You never put a food there. Check your `refrigerator[1] = ...` line |
| `ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3` | A fridge of size 3 has spots **0, 1, 2**. There is no spot 3 |
| `method park in class Garage cannot be applied to given types;` and `required: Car` | You called `park()` without putting a car inside the `( )` |
| `incompatible types: String cannot be converted to Car` | You sent `"BMW"` (a String) to `park`. Send the **car**: `garage.park(car1)` |
| You fixed your code, but the output did not change | You ran a **different file**. Use the ▶ **next to `main`** in the file you are working on |

### ✅ Commit Section A

When your output matches Check 5, type this in the terminal:

```bash
git add -A
git commit -m "part18 follow-along: array of objects, passing objects"
```

---

## In-class exercise — books on a shelf (together, not graded)

We do this one together in class, in `InClass.java`. Everyone types their own copy.

### Step 1 — An array of books, passed to a shelf

At the bottom of `InClass.java`, build two classes together:

- **`Book`** has one field, `String title`, and a constructor `Book(String title)`.
- **`Shelf`** has one field, `int count`, and one method, `void place(Book b)`. It adds 1
  to `count` and prints `Placed <title> on the shelf`.

Then, in `main` under `STEP 1`:

1. Make an array that holds **3 books**: `Book[] books = new Book[3];`
2. Put a new book in each slot: `Dune`, `Holes`, `Wonder`.
3. Use a `for` loop to print each book's title.
4. Make one `Shelf`. Use a for-each loop to `place` every book on it.
5. Print how many books are on the shelf.

Your output:

```
Dune
Holes
Wonder
Placed Dune on the shelf
Placed Holes on the shelf
Placed Wonder on the shelf
Books on the shelf: 3
```

Things to figure out together:

- Right after `new Book[3]`, what is inside each slot? (Nothing yet: `null`.)
- When we call `shelf.place(b)`, are we sending the **book**, or a **copy** of it?

### Step 2 — Fix the bugs

Under `STEP 2` there are three broken lines, inside a `/* ... */` comment so they don't
stop your program from running. One at a time:

1. Move **one** broken line up, above the `/*` line. Now Java can see it.
2. Run it. Read the **red error**, or the **crash** in the Run window.
3. Fix the line. Run the program.
4. Do the next line.

| Broken line | What Java tells you |
|---|---|
| `Book[] empty = new Book[2]; System.out.println(empty[0].title);` | It runs, then **crashes**: `NullPointerException: Cannot read field "title" because "empty[0]" is null` |
| `shelf.place("Dune");` | `incompatible types: String cannot be converted to Book` |
| `System.out.println(books[3].title);` | It runs, then **crashes**: `ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3` |

**Two of these are not red errors.** Java is happy with the code, but the program crashes
when it runs. Reading the crash message carefully tells you exactly what went wrong.

### ✅ Commit the in-class exercise

```bash
git add -A
git commit -m "part18 in-class: books on a shelf"
```

---

## Section B — Comment every line (25 points)

*On your own.*

Now explain your own code. In **all five files** (`ArrayOfObjects.java`, `Food.java`,
`ObjectPassing.java`, `Garage.java`, `Car.java`), put a `//` comment **above every line of
code**, saying **in your own words** what that line does.

**Which lines need a comment?**

- **Yes:** every line that does something. That includes `public class ...`, every field,
  every constructor and method's first line, every `this.` line, and every line in `main`.
- **No:** lines that are only `}`, and empty lines.

**What makes a good comment?** Say what the line **does** and **why**. Do not just repeat
the code in English.

| ❌ Not enough | ✅ Good |
|---|---|
| `// array` | `// makes a fridge with 3 empty spots that can only hold Food objects` |
| `// refrigerator 0` | `// puts the pizza in the first spot, which is number 0, not 1` |
| `// prints name` | `// goes to spot 2 in the fridge, then gets that food's name, so it prints hot dog` |
| `// park method` | `// park needs a Car handed to it; whatever car I send in is called car inside here` |

Here is what a commented line looks like in your file:

```java
        // hands car2 (the Tesla) to the garage's park method
        garage.park(car2);
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
git commit -m "part18 comments: explained every line of the follow-along code"
```

---

## Section C — Stretch (25 points)

*On your own.*

Do these in `Stretch.java`. There is no `main` in that file yet. **Type it yourself.**
B2 also adds a method to your `Garage` class.

### Stretch A — guess first

1. Type this code inside `main`. **Do not run it yet.**

```java
Food[] lunch = new Food[2];
lunch[0] = new Food("taco");
System.out.println(lunch[0].name);
System.out.println(lunch[1]);
System.out.println(lunch.length);
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
taco
null
2
```

- Spot 0 has the taco, so its name prints.
- Spot 1 was never filled, so it is `null`. Printing `null` is fine. But
  `lunch[1].name` would **crash**, because an empty spot has no name.
- `lunch.length` is the **size** of the array, 2, even though only one spot is filled.

</details>

### Stretch B — a fridge, a garage, and a parking lot

Put this code under your Stretch A code, in the same `main`.

**B1.** A `String` is an object too. Make an array of them and loop through it with a
for-each loop (from part 12):

```java
String[] fridge = {"milk", "eggs", "cheese"};
for (String item : fridge) {
    System.out.println("In the fridge: " + item);
}
```

Output:

```
In the fridge: milk
In the fridge: eggs
In the fridge: cheese
```

Then change the items to what is in **your** fridge. Keep it short: the next part's warm-up
is typing B1 again from memory.

**B2.** In **`Garage.java`**, add a second method called `leave`. It takes a `Car`, just
like `park`, and prints that the car left. Then, in `Stretch.java`:

```java
Garage garage = new Garage();
Car bmw = new Car("BMW");
garage.park(bmw);
garage.leave(bmw);
```

Output:

```
The BMW is parked in the garage
The BMW left the garage
```

**B3.** Put both topics together: make an **array of cars**, and park every car in it with a
for-each loop.

```java
Car[] lot = {new Car("Honda"), new Car("Ford"), new Car("Kia")};
```

Under that line, write the loop yourself. It should call `garage.park(...)` once for each
car. Output:

```
The Honda is parked in the garage
The Ford is parked in the garage
The Kia is parked in the garage
```

**Hint:** it looks like B1's loop, but the type is `Car`, not `String`.

### ✅ Commit Section C

```bash
git add -A
git commit -m "part18 stretch: prediction, fridge loop, leave method, parking lot"
```

---

## Section D — Challenge (25 points)

*On your own.*

Open `Challenge.java`. It has **two methods and one helper** for you to finish. A **test**
checks all three.

| Method | What it gives back | Examples |
|---|---|---|
| `uniqueSum(int a, int b, int c)` | The sum, but a number only counts if **the other two are different** from it | `(1, 2, 3)` → `6` · `(3, 2, 3)` → `2` · `(3, 3, 3)` → `0` |
| `fixTeen(int n)` | **0** for 13, 14, 17, 18 and 19. **n** for everything else (so 15 and 16 stay) | `13` → `0` · `15` → `15` · `20` → `20` |
| `sumWithoutTeens(int a, int b, int c)` | The sum, after each number goes through `fixTeen` | `(2, 13, 1)` → `3` · `(15, 16, 17)` → `31` |

**`sumWithoutTeens` must call `fixTeen`.** Do not write the teen rule three times. Write it
**once**, in `fixTeen`, and **pass** each number to it: `fixTeen(a)`. That is this part's idea
again: you hand a value to a method, and the method does the work.

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

- Do `fixTeen` **first**. Then `sumWithoutTeens` is one line.
- `uniqueSum`: start a variable `sum` at 0. Use three `if`s, one for each number. For `a`:
  if `a` is different from `b` **and** different from `c`, add it.

### ✅ Commit Section D

When every test is green:

```bash
git add -A
git commit -m "part18 challenge: uniqueSum, sumWithoutTeens and fixTeen"
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
a1b2c3d part18 challenge: uniqueSum, sumWithoutTeens and fixTeen
e4f5a6b part18 stretch: prediction, fridge loop, leave method, parking lot
c7d8e9f part18 comments: explained every line of the follow-along code
9d8c7b6 part18 in-class: books on a shelf
0a1b2c3 part18 follow-along: array of objects, passing objects
```

*(The letters and numbers at the start will be different for you. That is normal.)*
Press `q` to get out of the list.

**Missing one?** That section gets **0** right now. Go back, finish it, and make its
commit. You have until the next lecture starts.

**Typed a commit message wrong?** Make one more commit with the right message. Copy the
right message from the table, and add `--allow-empty` so Git lets you commit without
changing a file:

```bash
git commit --allow-empty -m "part18 comments: explained every line of the follow-along code"
```

### 3. Push

```bash
git add -A
git commit -m "part18 log"
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

**Finished early? Start Part 19.** You don't have to wait for class.

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

- **Think Java** (free online book): [Chapter 12 — Arrays of Objects](https://books.trinket.io/thinkjava2/chapter12.html).
  For passing objects to methods, see [Chapter 10 — Mutable Objects](https://books.trinket.io/thinkjava2/chapter10.html).
- **Tutoring:** bring your laptop and this page.
- **Office hours:** bring the error message and tell me what you already tried.
- **Classmates:** talk it over as much as you want. But **type your own code.**
