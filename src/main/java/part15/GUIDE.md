# Part 15 Guide — final, and your first objects

**The video, written out step by step.**

This page teaches the same thing as the video in two parts:

- **Video 1 — the `final` keyword**, from about **2:57:15 to 2:59:12**. Type it in
  `FinalKeyword.java`.
- **Video 2 — objects**, from about **2:59:30 to 3:09:48**. Type it in `ObjectOriented.java`
  and a new file, `Car.java`.

You can:

- **read this page instead of watching**, or
- **read it while you watch**, or
- **come back to it** when you forget how something works.

Either way, **you still type every line yourself.** Do not copy and paste from this page.
Each step has a time, like **(video 2:57:53)**, if you want to see him do it.

---

# Video 1 — The final keyword

## Step A1 — A normal variable can change (video 2:57:53)

Open `part15/FinalKeyword.java`. Type `main`, and inside it, type:

```java
        double pi = 3.14159;
        pi = 4;
        System.out.println(pi);
```

**Run it.** Output:

```
4.0
```

The first line sets `pi` to 3.14159. The second line **changes** it to 4. So it prints
`4.0`. (It is a `double`, so it shows `.0`.)

## Step A2 — Add `final` (video 2:58:09)

Put the word `final` at the start of the first line:

```java
        final double pi = 3.14159;
```

Now the line `pi = 4;` is underlined in red. The error is:

```
error: cannot assign a value to final variable pi
```

**Anything marked `final` cannot be changed after you set it.** That is the whole rule.

Why would you want that? Some values should **never** change, like pi, or a tax rate. With
`final`, Java stops you, or anyone else, from changing them by accident.

## Step A3 — Name it in ALL CAPS (video 2:58:55)

1. **Delete** the line `pi = 4;`.
2. Rename the variable `PI`, in capital letters. Change it in **both** places it appears.

```java
        final double PI = 3.14159;
        System.out.println(PI);
```

**Run it.** Output:

```
3.14159
```

Java does not **make** you use capitals. It is a habit programmers share: when you see a
name in ALL CAPS, you know it is `final` and will never change. A `final` variable is also
called a **constant**.

<details>
<summary>Click to compare your finished FinalKeyword.java</summary>

```java
package part15;

// (the comments at the top of your file)

public class FinalKeyword {
    public static void main(String[] args) {
        final double PI = 3.14159;
        System.out.println(PI);
    }
}
```

Output:

```
3.14159
```

</details>

---

# Video 2 — Objects

## Step B1 — What is an object? (video 2:59:45)

Look around you. You are surrounded by **objects**: a phone, a desk, a coffee cup.
Programming can copy real-world objects.

An object has two kinds of things:

- **Attributes:** what the object **has**. Its characteristics.
- **Methods:** what the object can **do**. Its actions.

**His example, a coffee cup (video 3:00:10):**

| Attributes (what it has) | Methods (what it can do) |
|---|---|
| `String color = "white";` | `drink()`: prints "You drink from the cup" |
| `double temperature = 20.0;` | `spill()`: prints "You spilled your coffee everywhere" |
| `boolean empty = true;` | |

To make objects, you first write a **class**. A class is the **blueprint**. Each object you
build from it is called an **instance** of the class.

In this part you write a `Car` class, and build some cars from it.

## Step B2 — Make the Car file (video 3:02:11)

He makes a new file. In IntelliJ:

1. In the Project panel on the left, **right-click the `part15` folder**.
2. Choose **New → Java Class**.
3. Type `Car` and press **Enter**.

IntelliJ opens a new file that looks like this:

```java
package part15;

public class Car {
}
```

The file is `Car.java`, and the class is `Car`. They must match, just like in part 01.

## Step B3 — Give Car some attributes (video 3:03:29)

Inside `Car`'s `{ }`, type five attributes. These are variables that belong to every car:

```java
    String make = "Chevrolet";
    String model = "Corvette";
    int year = 2020;
    String color = "blue";
    double price = 50000.00;
```

You can use your own favorite car. The checks below use his.

## Step B4 — Give Car some methods (video 3:04:19)

Under the attributes, still inside `Car`'s `{ }`, type two methods:

```java
    void drive() {
        System.out.println("You drive the car");
    }

    void brake() {
        System.out.println("You step on the brakes");
    }
```

- `void` means the method does not give anything back. It just does something.
- **Spell it `brake` (b-r-a-k-e)**, like the brakes on a car. Do **not** spell it `break`
  (b-r-e-a-k). `break` is a special Java word, so it cannot be a method name. If you try,
  you get:

```
error: <identifier> expected
```

`Car` has **no `main`**. That is correct. You do not run `Car.java`. You run
`ObjectOriented.java`, which **uses** `Car`.

## Step B5 — Build a car (video 3:04:50)

Open `ObjectOriented.java`. Type `main`, and inside it, type:

```java
        Car myCar = new Car();
```

Read it from left to right:

| Piece | Means |
|---|---|
| `Car` | the type: this variable holds a `Car` |
| `myCar` | the name you picked for this car |
| `=` | store what is on the right |
| `new Car()` | build a **new** car from the `Car` blueprint |
| `;` | end of the line |

Now `myCar` is a 2020 blue Chevrolet Corvette that costs $50,000, and it can `drive()` and
`brake()`.

## Step B6 — Look inside the car (video 3:05:57)

To reach an attribute, type the object's name, a **dot**, and the attribute's name. Type:

```java
        System.out.println(myCar.model);
```

**Run it.** Output:

```
Corvette
```

Now print the make too, **above** the model line:

```java
        System.out.println(myCar.make);
        System.out.println(myCar.model);
```

**Run it.** Output:

```
Chevrolet
Corvette
```

## Step B7 — Make the car do something (video 3:06:40)

Calling a method works the same way: name, dot, method, and **parentheses**.

Turn your two print lines into comments with `//` (so they don't print). Then type:

```java
        myCar.drive();
        myCar.brake();
```

**Run it.** Output:

```
You drive the car
You step on the brakes
```

## Step B8 — A second car (video 3:07:35)

One class can build **many** objects. Let's build a second car.

1. Rename `myCar` to **`myCar1`**, everywhere it appears.
2. Under the first car, type:

```java
        Car myCar2 = new Car();
```

3. Remove the `//` from the two print lines, so they print again.
4. Under them, add an empty `println` (just to make a gap), then print `myCar2`'s make and
   model:

```java
        System.out.println();
        System.out.println(myCar2.make);
        System.out.println(myCar2.model);
```

**Before you run it:** what will `myCar2` be?

**Run it.** Output (the first lines):

```
Chevrolet
Corvette

Chevrolet
Corvette
```

## Step B9 — Why are they the same? (video 3:09:01)

**Both cars are Chevrolet Corvettes.** That is because the class is a **blueprint**, and
your blueprint says *every* car is a blue 2020 Chevrolet Corvette for $50,000.

That is not very useful. You want different cars. In **part 16**, you learn
**constructors**, which let each object start out with its own values.

<details>
<summary>Click to compare your finished Car.java and ObjectOriented.java</summary>

`Car.java`:

```java
package part15;

// (the comments at the top of your file)

public class Car {
    String make = "Chevrolet";
    String model = "Corvette";
    int year = 2020;
    String color = "blue";
    double price = 50000.00;

    void drive() {
        System.out.println("You drive the car");
    }

    void brake() {
        System.out.println("You step on the brakes");
    }
}
```

`ObjectOriented.java`:

```java
package part15;

// (the comments at the top of your file)

public class ObjectOriented {
    public static void main(String[] args) {
        Car myCar1 = new Car();
        Car myCar2 = new Car();

        System.out.println(myCar1.make);
        System.out.println(myCar1.model);
        System.out.println();
        System.out.println(myCar2.make);
        System.out.println(myCar2.model);

        myCar1.drive();
        myCar1.brake();
    }
}
```

Output:

```
Chevrolet
Corvette

Chevrolet
Corvette
You drive the car
You step on the brakes
```

</details>

---

**Now go back to [README.md](README.md).** Make your Section A commit. Then do Section B: put a
comment above every line in all three files, **in your own words**. Do not copy the
explanations from this guide.
