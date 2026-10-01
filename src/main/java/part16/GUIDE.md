# Part 16 Guide — Constructors and variable scope

**The video, written out step by step.**

This page teaches the same thing as the video in two parts:

- **Video 1 — Constructors**, from about **3:10:07 to 3:19:32**. Type it in
  `Constructors.java` and a new file, `Human.java`.
- **Video 2 — Local and global variables**, from about **3:19:50 to 3:25:04**. Type it in
  `VariableScope.java` and a new file, `DiceRoller.java`.

You can:

- **read this page instead of watching**, or
- **read it while you watch**, or
- **come back to it** when you forget how something works.

Either way, **you still type every line yourself.** Do not copy and paste from this page.
Each step has a time, like **(video 3:12:20)**, if you want to see him do it.

---

# Video 1 — Constructors

## Step A1 — What is a constructor? (video 3:10:30)

A **constructor** is a special method that runs when an object is **instantiated**.
("Instantiate" is just a fancy word for "make an object.")

Every time you write `new Something()`, Java runs `Something`'s constructor. It is the
object's setup code.

## Step A2 — Make the Human class, and one human (video 3:10:45)

He starts with two classes: `Main` and `Human`. Make `Human` now:

1. In the Project panel, **right-click the `part16` folder**.
2. Choose **New → Java Class**.
3. Type `Human` and press **Enter**.

Leave `Human` empty for now. Open `Constructors.java`, type `main`, and inside it:

```java
        Human human = new Human();
```

This works, even though `Human` is empty. If a class has no constructor, Java quietly gives
it an empty one.

## Step A3 — Write a constructor (video 3:11:43)

A constructor looks like a method, with two differences:

- Its name is **exactly the class name**: `Human`, with a capital H.
- It has **no return type**: no `void`, no `int`.

Open `Human.java`. Inside the class's `{ }`, type:

```java
    Human() {

    }
```

That is a constructor. It does nothing yet.

## Step A4 — Give it parameters (video 3:12:20)

Constructors can take **parameters**, like methods. What does a human have? A name, an age
and a weight. Change the constructor to:

```java
    Human(String name, int age, double weight) {

    }
```

Now go back to `Constructors.java`. The line `new Human()` is **red**:

```
error: constructor Human in class Human cannot be applied to given types;
  required: String,int,double
  found:    no arguments
```

The constructor sets the **rules**: to make a `Human`, you **must** give it a String, an int
and a double, **in that order**.

## Step A5 — Pass in the values (video 3:13:28)

Change the line in `main` to:

```java
        Human human = new Human("Rick", 65, 70);
```

`"Rick"` is the name, `65` the age, `70` the weight (in kilograms). The red goes away. It
runs, but prints nothing yet.

## Step A6 — Save the values in the object (video 3:14:16)

Right now the constructor **receives** the values, but does not **keep** them. You need
attributes to store them in.

In `Human.java`, **above** the constructor, add three attributes. Don't give them values:

```java
    String name;
    int age;
    double weight;
```

Inside the constructor, try this:

```java
        name = name;
        age = age;
        weight = weight;
```

In `main`, under the `new Human` line, print the name:

```java
        System.out.println(human.name);
```

**Run it.** Output:

```
null
```

**Why `null`?** `null` means "nothing here." Inside the constructor, there are **two**
things called `name`: the **parameter** (which holds `"Rick"`) and the **attribute**. When
you write `name = name;`, Java uses the closer one, the parameter, on **both sides**. So the
parameter gets copied into itself, and the attribute stays empty.

(IntelliJ may underline `name = name` in yellow to warn you about this.)

## Step A7 — The `this` keyword (video 3:15:23)

To mean **the attribute**, put `this.` in front. `this` means "the object being built right
now." Change the three lines to:

```java
        this.name = name;
        this.age = age;
        this.weight = weight;
```

Read the first one as: "**this human's** name = the name that was passed in."

**Run it.** Output:

```
Rick
```

He says: when you see `this`, pretend it is replaced by the object's name. For `human`,
`this.name` is like `human.name`.

## Step A8 — A second human (video 3:16:16)

1. Rename `human` to **`human1`**, everywhere.
2. Under it, make a second human with **different** values:

```java
        Human human2 = new Human("Morty", 16, 50);
```

3. Print `human2`'s name too:

```java
        System.out.println(human1.name);
        System.out.println(human2.name);
```

**Run it.** Output:

```
Rick
Morty
```

**This is why constructors are useful.** In part 15, every `Car` was a blue Corvette. Now
each `Human` starts out with its **own** name, age and weight.

## Step A9 — Methods that use `this` (video 3:17:25)

Inside a class, `this.name` also lets a **method** use the object's attributes. In
`Human.java`, below the constructor, add two methods:

```java
    void eat() {
        System.out.println(this.name + " is eating");
    }

    void drink() {
        System.out.println(this.name + " is drinking *burp*");
    }
```

In `main`, at the bottom:

```java
        human1.eat();
        human2.drink();
```

**Run it.** Output:

```
Rick
Morty
Rick is eating
Morty is drinking *burp*
```

`human1.eat()` uses **Rick's** name. `human2.drink()` uses **Morty's**. Same methods,
different objects.

Try swapping them: `human1.drink();` and `human2.eat();`. Now Rick drinks and Morty eats.

<details>
<summary>Click to compare your finished Human.java and Constructors.java</summary>

`Human.java`:

```java
package part16;

// (the comments at the top of your file)

public class Human {
    String name;
    int age;
    double weight;

    Human(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void eat() {
        System.out.println(this.name + " is eating");
    }

    void drink() {
        System.out.println(this.name + " is drinking *burp*");
    }
}
```

`Constructors.java`:

```java
package part16;

// (the comments at the top of your file)

public class Constructors {
    public static void main(String[] args) {
        Human human1 = new Human("Rick", 65, 70);
        Human human2 = new Human("Morty", 16, 50);

        System.out.println(human1.name);
        System.out.println(human2.name);

        human1.eat();
        human2.drink();
    }
}
```

Output:

```
Rick
Morty
Rick is eating
Morty is drinking *burp*
```

</details>

---

# Video 2 — Local and global variables

## Step B1 — The two kinds (video 3:20:11)

- A **local** variable is made **inside a method**. Only that method can see it.
- A **global** variable is made **outside every method, but inside the class**. **Every**
  method in the class can see it.

(Other books call a global variable a **field** or an **instance variable**.)

He shows this with a program that rolls a dice.

## Step B2 — Make DiceRoller (video 3:20:35)

1. **Right-click the `part16` folder** → **New → Java Class** → type `DiceRoller` →
   **Enter**.
2. Open `VariableScope.java`. Type `main`, and inside it:

```java
        DiceRoller diceRoller = new DiceRoller();
```

## Step B3 — Everything local (video 3:21:03)

In `DiceRoller.java`, inside the class, type a constructor and a `roll` method:

```java
    DiceRoller() {
        Random random = new Random();
        int number = 0;
        roll();
    }

    void roll() {
        number = random.nextInt(6) + 1;
        System.out.println(number);
    }
```

**`Random` is red.** Click on it and press `⌥ Enter` (Mac) or `Alt Enter` (Windows). Choose
**Import class**. IntelliJ adds this line near the top of the file:

```java
import java.util.Random;
```

- `random.nextInt(6)` gives a number from **0 to 5**. Adding `+ 1` makes it **1 to 6**,
  like a real dice.
- The constructor calls `roll()`, so making a `DiceRoller` rolls the dice once.

## Step B4 — The problem (video 3:22:12)

`roll()` is still red. The error is:

```
error: cannot find symbol
  symbol:   variable number
  location: class DiceRoller
```

`random` and `number` are **local to the constructor**. A constructor counts as a method,
so only the constructor can see them. `roll()` cannot.

There are two ways to fix this.

## Step B5 — Fix 1: pass them in (video 3:22:49)

Send them to `roll` as **arguments**. Change the call in the constructor:

```java
        roll(random, number);
```

and give `roll` two **parameters** to receive them:

```java
    void roll(Random random, int number) {
        number = random.nextInt(6) + 1;
        System.out.println(number);
    }
```

**Run `VariableScope.java`.** Output: **one number from 1 to 6**, for example:

```
4
```

Run it a few more times. The number changes. Any number from 1 to 6 is correct.

## Step B6 — Fix 2: make them global (video 3:23:32)

Now undo fix 1, and try the other way.

1. Change `roll(random, number);` back to `roll();`.
2. Change `void roll(Random random, int number)` back to `void roll()`.
3. **Move** the two variables **out of the constructor**, to the top of the class. Make them
   there, but give `random` its value inside the constructor:

```java
    Random random;
    int number;

    DiceRoller() {
        random = new Random();
        roll();
    }
```

Notice: inside the constructor it now says `random = new Random();`, **not**
`Random random = new Random();`. Writing the type again would make a **new local** variable,
and the global one would stay empty.

**Run it.** Output: **one number from 1 to 6** again.

Now `random` and `number` are **global**: made outside every method, but inside the class.
The constructor **and** `roll()` can both see them.

He points out (video 3:24:25) that you don't even need `= 0` on `number` anymore. A global
`int` starts at 0 by itself.

## Summary of Video 2 (video 3:24:43)

| | Where it is made | Who can see it |
|---|---|---|
| **local** | inside a method | only that method |
| **global** | inside the class, outside every method | every method in the class |

<details>
<summary>Click to compare your finished DiceRoller.java and VariableScope.java</summary>

`DiceRoller.java`:

```java
package part16;

// (the comments at the top of your file)

import java.util.Random;

public class DiceRoller {
    Random random;
    int number;

    DiceRoller() {
        random = new Random();
        roll();
    }

    void roll() {
        number = random.nextInt(6) + 1;
        System.out.println(number);
    }
}
```

`VariableScope.java`:

```java
package part16;

// (the comments at the top of your file)

public class VariableScope {
    public static void main(String[] args) {
        DiceRoller diceRoller = new DiceRoller();
    }
}
```

Output: one number from 1 to 6, for example:

```
5
```

</details>

---

**Now go back to [README.md](README.md).** Make your Section A commit. Then do Section B: put a
comment above every line in all four files, **in your own words**. Do not copy the
explanations from this guide.
