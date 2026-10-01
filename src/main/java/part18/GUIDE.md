# Part 18 Guide — Arrays of objects, and passing objects to a method

**The video, written out step by step.**

This page teaches the same thing as the video from **3:38:40 to 3:49:20**. You can:

- **read this page instead of watching**, or
- **read it while you watch**, or
- **come back to it** when you forget how something works.

Either way, **you still type every line yourself.** Do not copy and paste from this page.
Each step has a time, like **(video 3:41:40)**, if you want to see him do it.

This part has two topics:

- **Steps 1–6:** an array of objects, in `ArrayOfObjects.java` and a new class `Food.java`
- **Steps 7–10:** passing an object to a method, in `ObjectPassing.java` and two new
  classes, `Garage.java` and `Car.java`

---

## Part A — An array of objects

## Step 1 — A quick review of arrays (video 3:39:05)

He starts by showing arrays you already know from part 10:

```java
int[] numbers = new int[3];
char[] letters = new char[3];
String[] words = new String[3];
```

Each one follows the same recipe:

1. the **type** of thing it holds, then `[]`
2. a **name**
3. `= new`, the type again, and the **size** in `[ ]`

You do not need to type these. This time, the type will be a class **you** made.

---

## Step 2 — Make the Food class (video 3:39:41)

He already has a `Food` class. Make yours:

1. In the Project panel, **right-click** the `part18` folder.
2. Choose **New → Java Class**.
3. Type `Food` and press Enter.

Leave it empty for now.

---

## Step 3 — An array that holds Food (video 3:39:41)

Open `ArrayOfObjects.java`. Type `main` inside the class. Inside `main`, type:

```java
        Food[] refrigerator = new Food[3];
```

Read it with the recipe:

| Piece | Meaning |
|---|---|
| `Food[]` | an array that holds `Food` objects |
| `refrigerator` | its name. He pretends the array is a fridge |
| `new Food[3]` | make room for **3** foods |

Right now the fridge has 3 empty spots. There is no food in it yet.

---

## Step 4 — Make three foods (video 3:40:44)

Each food needs a name. Open `Food.java` and give it a field and a constructor:

```java
    String name;

    Food(String name) {
        this.name = name;
    }
```

Back in `ArrayOfObjects.java`, under the array line, make three foods:

```java
        Food food1 = new Food("pizza");
        Food food2 = new Food("hamburger");
        Food food3 = new Food("hot dog");
```

---

## Step 5 — Put the food in the fridge (video 3:41:40)

Each spot in an array has a number, called an **index**. The first one is **0**, not 1.

```java
        refrigerator[0] = food1;
        refrigerator[1] = food2;
        refrigerator[2] = food3;
```

### Print what is in spot 0 (video 3:42:11)

```java
        System.out.println(refrigerator[0]);
```

**Run it** (green ▶ next to `main` in `ArrayOfObjects.java`). You see something like this.
The letters after `@` will be different on your computer:

```
part18.Food@15db9742
```

That is the **address** of the food object in memory, like on part 17, because `Food` has no
`toString`. You want its **name**, so add `.name` (video 3:42:48):

```java
        System.out.println(refrigerator[0].name);
        System.out.println(refrigerator[1].name);
        System.out.println(refrigerator[2].name);
```

`refrigerator[0].name` means "the food in spot 0, then its name."

**Run it.** Output:

```
pizza
hamburger
hot dog
```

*(If you kept the `println(refrigerator[0])` line, the address prints first. Delete that
line when you are done looking at it.)*

---

## Step 6 — A shorter way to fill the array (video 3:43:24)

You can make the array and fill it **in one line**, if the foods already exist. Move the
three `Food` lines to the **top** of `main`. Then replace the `new Food[3]` line and the
three `refrigerator[...] =` lines with this one line:

```java
        Food[] refrigerator = {food1, food2, food3};
```

The curly braces `{ }` list what goes in the array, in order. Java counts them, so you do
not write a size.

**Run it.** The output is the same:

```
pizza
hamburger
hot dog
```

### Common mistake: an empty spot

If a spot in the array was never filled, it holds `null`. Asking `null` for its `.name`
**crashes** the program while it runs:

```
Exception in thread "main" java.lang.NullPointerException: Cannot read field "name" because "refrigerator[1]" is null
```

Read the end of the message: it tells you **which spot** was empty.

---

## Part B — Passing an object to a method

## Step 7 — Make the Garage and Car classes (video 3:45:05)

He has a `Garage` class and a `Car` class. Make both, the same way as `Food`:
**right-click `part18` → New → Java Class**.

In `Car.java`, give every car a name:

```java
    String name;

    Car(String name) {
        this.name = name;
    }
```

Leave `Garage` empty for now.

**Note:** part 17 also had a `Car` class. That is fine. Part 17's `Car` lives in the `part17`
folder, and this one lives in `part18`. They do not bump into each other.

Open `ObjectPassing.java`. Type `main`. Inside it, make a garage and a car:

```java
        Garage garage = new Garage();
        Car car = new Car("BMW");
```

---

## Step 8 — A method that takes a Car (video 3:46:10)

Now the garage needs a way to **park** a car. Open `Garage.java` and add this method:

```java
    void park(Car car) {
        System.out.println("The " + car.name + " is parked in the garage");
    }
```

Look at the parameter: `Car car`. You have seen parameters like `String name` before. This
one works the same way, but its type is **a class you made**. It means: "to use `park`, you
must hand it a `Car`."

Inside the method, `car.name` is the name of whichever car was handed in.

Back in `ObjectPassing.java`, park the car:

```java
        garage.park(car);
```

**Run it.** Output:

```
The BMW is parked in the garage
```

His exact words may be a little different. What matters is that the car's name is in the
sentence.

### If you forget to hand it a car

```java
        garage.park();
```

```
error: method park in class Garage cannot be applied to given types;
  required: Car
```

**required: Car** means "you have to give me a car."

---

## Step 9 — A second car (video 3:48:05)

Rename `car` to `car1`, and make a second car:

```java
        Garage garage = new Garage();
        Car car1 = new Car("BMW");
        Car car2 = new Car("Tesla");

        garage.park(car1);
        garage.park(car2);
```

**Run it.** Output:

```
The BMW is parked in the garage
The Tesla is parked in the garage
```

The **same** `park` method worked for two different cars. Each time, `car` inside the
method was whichever car you sent.

---

## Step 10 — Only cars fit (video 3:49:00)

`park` only takes a `Car`. If you tried to park something else, like a `String` or a
bicycle, Java stops you before the program runs:

```java
        garage.park("BMW");
```

```
error: incompatible types: String cannot be converted to Car
```

The **type** in the parameter is a rule. Only that type is allowed in.

---

## Your finished files

Your files should look something like this now. **Compare them to yours. Do not copy
them.**

<details>
<summary>Click to compare <code>Food.java</code> and <code>ArrayOfObjects.java</code></summary>

```java
package part18;

public class Food {

    String name;

    Food(String name) {
        this.name = name;
    }
}
```

```java
package part18;

// (the comments at the top of your file)

public class ArrayOfObjects {
    public static void main(String[] args) {
        Food food1 = new Food("pizza");
        Food food2 = new Food("hamburger");
        Food food3 = new Food("hot dog");

        Food[] refrigerator = {food1, food2, food3};

        System.out.println(refrigerator[0].name);
        System.out.println(refrigerator[1].name);
        System.out.println(refrigerator[2].name);
    }
}
```

Output:

```
pizza
hamburger
hot dog
```

</details>

<details>
<summary>Click to compare <code>Car.java</code>, <code>Garage.java</code> and <code>ObjectPassing.java</code></summary>

```java
package part18;

public class Car {

    String name;

    Car(String name) {
        this.name = name;
    }
}
```

```java
package part18;

public class Garage {

    void park(Car car) {
        System.out.println("The " + car.name + " is parked in the garage");
    }
}
```

```java
package part18;

// (the comments at the top of your file)

public class ObjectPassing {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Car car1 = new Car("BMW");
        Car car2 = new Car("Tesla");

        garage.park(car1);
        garage.park(car2);
    }
}
```

Output:

```
The BMW is parked in the garage
The Tesla is parked in the garage
```

</details>

---

**Now go back to [README.md](README.md).** Make your Section A commit. Then do Section B: put a
comment above every line, **in your own words**. Do not copy the explanations from this
guide.
