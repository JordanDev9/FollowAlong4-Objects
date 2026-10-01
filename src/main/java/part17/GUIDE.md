# Part 17 Guide — Overloaded constructors and toString

**The video, written out step by step.**

This page teaches the same thing as the video from **3:25:40 to 3:38:30**. You can:

- **read this page instead of watching**, or
- **read it while you watch**, or
- **come back to it** when you forget how something works.

Either way, **you still type every line yourself.** Do not copy and paste from this page.
Each step has a time, like **(video 3:28:48)**, if you want to see him do it.

This part has two topics:

- **Steps 1–7:** overloaded constructors, in `OverloadedConstructors.java` and a new class
  `Pizza.java`
- **Steps 8–12:** the `toString` method, in `ToStringMethod.java` and a new class `Car.java`

---

## Part A — Overloaded constructors

## Step 1 — Make the Pizza class (video 3:25:40)

**Overloaded constructors** are two or more constructors in the same class. They all have
the class's name, but each one has **different parameters**.

To show this, he bakes pizzas. He already has a `Pizza` class in his project. You need to
make one:

1. In the Project panel, **right-click** the `part17` folder.
2. Choose **New → Java Class**.
3. Type `Pizza` and press Enter.

IntelliJ makes `Pizza.java` with this inside:

```java
package part17;

public class Pizza {
}
```

Click between the `{` and the `}`. That is where the next steps go.

---

## Step 2 — Four ingredients (video 3:26:20)

Every pizza needs a bread, a sauce, a cheese and a topping. Inside `Pizza`, type four
variables. They are all `String`s:

```java
    String bread;
    String sauce;
    String cheese;
    String topping;
```

These are the pizza's **fields**: the information each `Pizza` object remembers.

---

## Step 3 — The first constructor

Under the fields, type a constructor that takes all four ingredients:

```java
    Pizza(String bread, String sauce, String cheese, String topping) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }
```

Remember from part 16:

- A **constructor** has the **same name as the class**, and no return type.
- `this.bread` is the pizza's field. `bread` alone is the value that was sent in.
  `this.bread = bread;` copies the value into the field.

---

## Step 4 — Make a pizza and print it (video 3:28:48)

Open `OverloadedConstructors.java`. Type `main` inside the class. Then, inside `main`, make
a pizza and print its ingredients:

```java
        Pizza pizza = new Pizza("thick crust", "tomato", "mozzarella", "pepperoni");

        System.out.println("Here are the ingredients of your pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);
```

`pizza.bread` means "the `bread` field of this pizza."

**Run it** (green ▶ next to `main` in `OverloadedConstructors.java`). Output:

```
Here are the ingredients of your pizza: 
thick crust
tomato
mozzarella
pepperoni
```

---

## Step 5 — A pizza with no topping breaks it (video 3:29:23)

What if you want a plain cheese pizza, with no topping? Delete `"pepperoni"` (and the comma
in front of it):

```java
        Pizza pizza = new Pizza("thick crust", "tomato", "mozzarella");
```

It **does not work.** The constructor needs **four** Strings, and you only sent three. You
get a red underline, and this error:

```
error: constructor Pizza in class Pizza cannot be applied to given types;
  required: String,String,String,String
```

**required** tells you what the constructor wants: four Strings.

---

## Step 6 — A second constructor with three parameters (video 3:29:54)

The fix: write **another** constructor in `Pizza`, with only three parameters. Put it under
the first one:

```java
    Pizza(String bread, String sauce, String cheese) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
    }
```

Now `Pizza` has **two constructors with the same name.** That is what **overloaded** means.
Java looks at what you send in and picks the constructor that matches.

**The rule:** each constructor needs a **different list of parameters**. The name plus the
parameters is called the **signature**. Two constructors with the same signature are not
allowed. He shows this by copying the first constructor without changing it. Then you get:

```
error: constructor Pizza(String,String,String,String) is already defined in class Pizza
```

**Run it** with the three-ingredient pizza. Output:

```
Here are the ingredients of your pizza: 
thick crust
tomato
mozzarella
null
```

**Why `null`? (video 3:30:32)** The three-parameter constructor never sets `topping`. A
`String` field that was never given a value is `null`, which means "nothing here."

---

## Step 7 — Two, one and zero ingredients (video 3:30:43)

He keeps going. Add three more constructors to `Pizza`:

**A vegan pizza, just bread and sauce:**

```java
    Pizza(String bread, String sauce) {
        this.bread = bread;
        this.sauce = sauce;
    }
```

**Just bread (video 3:31:04):**

```java
    Pizza(String bread) {
        this.bread = bread;
    }
```

**No ingredients at all (video 3:31:34):**

```java
    Pizza() {

    }
```

Now try each one in `main`. Change the `new Pizza(...)` line, then run it.

| `new Pizza(...)` | What prints after the first line |
|---|---|
| `new Pizza("thick crust", "tomato")` | `thick crust`, `tomato`, `null`, `null` |
| `new Pizza("thick crust")` | `thick crust`, `null`, `null`, `null` |
| `new Pizza()` | `null`, `null`, `null`, `null` |

`Pizza` now has **five** constructors. Each one has a different number of parameters, so
Java always knows which one you mean.

---

## Part B — The toString method

## Step 8 — Make the Car class (video 3:32:53)

`toString` is a method that **every object already has.** It gives back a `String` that
describes the object.

He uses a `Car` class that is already filled in. Make it:

1. **Right-click** the `part17` folder → **New → Java Class** → type `Car` → Enter.
2. Inside the class, type these four fields. This time the values are set right away:

```java
    String make = "Ford";
    String model = "Mustang";
    String color = "red";
    int year = 2021;
```

---

## Step 9 — Make a car and print its fields (video 3:33:18)

Open `ToStringMethod.java`. Type `main`. Inside it:

```java
        Car car = new Car();

        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.color);
        System.out.println(car.year);
```

**Run it.** Output:

```
Ford
Mustang
red
2021
```

That works, but it takes four lines every time you want to show a car.

---

## Step 10 — Print the whole car (video 3:33:59)

What if you print the car itself? Add this line:

```java
        System.out.println(car);
```

**Run it.** The last line looks something like this:

```
part17.Car@6d06d69c
```

**What is that? (video 3:34:14)** It is the car's **address in memory**, like a street
address for where the object lives in your computer. The part after `@` is different on
every computer, so yours will not match exactly. His says `Car@…`. Yours says
`part17.Car@…`, because your car is in the `part17` package.

This happens because `println` secretly calls the car's `toString()` method. Every object
comes with a `toString()` already. The built-in one just gives back the address.

You can call it yourself, too. This prints the same address:

```java
        System.out.println(car.toString());
```

---

## Step 11 — Write your own toString (video 3:35:20)

You can **replace** the built-in `toString` with your own. This is called **overriding** it.

Open `Car.java`. Under the fields, type:

```java
    public String toString() {
        String myString = make + "\n" + model + "\n" + color + "\n" + year;
        return myString;
    }
```

Check each piece:

| Piece | What it means |
|---|---|
| `public` | Anyone can call it |
| `String` | It gives back a `String` |
| `toString()` | The name has to be **exactly** this: small `t`, capital `S`, then `tring` |
| `"\n"` | A new line, from part 01 |
| `return myString;` | Gives the String back to whoever called `toString()` |

**His screen looks different here.** In IntelliJ, a small round icon with an arrow appears
on the left of the `toString` line. That means "this method overrides one that already
existed." That is what you want.

**A shorter way (video 3:36:39):** you don't need the `myString` variable. You can return
the whole thing in one line:

```java
    public String toString() {
        return make + "\n" + model + "\n" + color + "\n" + year;
    }
```

Both do the same thing. Use either one.

---

## Step 12 — Two ways to call it (video 3:37:36)

Go back to `ToStringMethod.java` and run it again. Now these two lines:

```java
        System.out.println(car.toString());
        System.out.println(car);
```

both print the car's description instead of an address:

```
Ford
Mustang
red
2021
Ford
Mustang
red
2021
```

- `car.toString()` calls it **on purpose**. That is called **explicit**.
- `println(car)` calls it **for you, behind the scenes**. That is called **implicit**.

Either way, you get the description you wrote.

### Common mistakes

**`void` instead of `String`:**

```java
    public void toString() {
```

```
error: toString() in Car cannot override toString() in Object
  return type void is not compatible with String
```

`toString` must give back a `String`, so it must say `String`, not `void`.

**Forgetting `return`:**

```
error: missing return statement
```

You built the String but never gave it back. Add `return`.

**Spelling it `tostring` (small s):** there is **no error**, but `println(car)` still prints
the address. Java thinks it is a brand-new method, not a replacement. Check the capital `S`.

---

## Your finished files

Your files should look something like this now. **Compare them to yours. Do not copy
them.**

<details>
<summary>Click to compare <code>Pizza.java</code> and <code>OverloadedConstructors.java</code></summary>

```java
package part17;

public class Pizza {

    String bread;
    String sauce;
    String cheese;
    String topping;

    Pizza(String bread, String sauce, String cheese, String topping) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }

    Pizza(String bread, String sauce, String cheese) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
    }

    Pizza(String bread, String sauce) {
        this.bread = bread;
        this.sauce = sauce;
    }

    Pizza(String bread) {
        this.bread = bread;
    }

    Pizza() {

    }
}
```

```java
package part17;

// (the comments at the top of your file)

public class OverloadedConstructors {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("thick crust", "tomato", "mozzarella", "pepperoni");

        System.out.println("Here are the ingredients of your pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);
    }
}
```

</details>

<details>
<summary>Click to compare <code>Car.java</code> and <code>ToStringMethod.java</code></summary>

```java
package part17;

public class Car {

    String make = "Ford";
    String model = "Mustang";
    String color = "red";
    int year = 2021;

    public String toString() {
        return make + "\n" + model + "\n" + color + "\n" + year;
    }
}
```

```java
package part17;

// (the comments at the top of your file)

public class ToStringMethod {
    public static void main(String[] args) {
        Car car = new Car();

        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.color);
        System.out.println(car.year);

        System.out.println(car.toString());
        System.out.println(car);
    }
}
```

Output:

```
Ford
Mustang
red
2021
Ford
Mustang
red
2021
Ford
Mustang
red
2021
```

</details>

---

**Now go back to [README.md](README.md).** Make your Section A commit. Then do Section B: put a
comment above every line, **in your own words**. Do not copy the explanations from this
guide.
