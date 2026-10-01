# Part 19 Guide — The static keyword

**The video, written out step by step.**

This page teaches the same thing as the video from **3:50:00 to 3:57:15**. You can:

- **read this page instead of watching**, or
- **read it while you watch**, or
- **come back to it** when you forget how something works.

Either way, **you still type every line yourself.** Do not copy and paste from this page.
Each step has a time, like **(video 3:51:52)**, if you want to see him do it.

You type in two files in this part: `StaticKeyword.java` (it has `main`) and a new class,
`Friend.java`.

---

## Step 1 — What does static mean? (video 3:50:00)

You have typed `static` in every `main` since part 01. Now you find out what it means.

Normally, **each object gets its own copy** of every field. Two `Pizza` objects each have
their own `bread`.

A **static** field is different. It belongs to **the class itself**, not to any one object.
There is **only one copy**, and **every object shares it**.

Think of a classroom. Each student has their own backpack. That is a normal field. But
there is only one clock on the wall, and everyone shares it. That is a static field.

---

## Step 2 — Make the Friend class (video 3:50:44)

He already has a `Friend` class. Make yours:

1. In the Project panel, **right-click** the `part19` folder.
2. Choose **New → Java Class**.
3. Type `Friend` and press Enter.

Inside the class, give every friend a name:

```java
    String name;

    Friend(String name) {
        this.name = name;
    }
```

---

## Step 3 — A static variable (video 3:50:57)

He wants to count how many friends there are. That count is not about one friend. It is
about **all** of them. So it should be static.

In `Friend.java`, under `String name;`, add:

```java
    static int numberOfFriends;
```

**His screen looks different here.** He uses Eclipse, which puts a small red **S** next to
static things. In IntelliJ, static fields show up in *italic* letters instead.

Now open `StaticKeyword.java`. Type `main`. Inside it, print the count:

```java
        System.out.println(Friend.numberOfFriends);
```

Look closely: it says **`Friend.`**, the **class** name, with a capital F. You do not need a
friend object to get to a static variable. The class owns it.

**Run it** (green ▶ next to `main` in `StaticKeyword.java`). Output:

```
0
```

No friends yet. A number field that was never given a value starts at `0`.

---

## Step 4 — Count each new friend (video 3:51:52)

In the `Friend` constructor, **after** `this.name = name;`, add one to the count:

```java
        numberOfFriends++;
```

`++` means "add 1." Now **every time a friend is made**, the shared count goes up by 1.

In `main`, under the first print, make a friend and print again:

```java
        Friend friend1 = new Friend("SpongeBob");
        System.out.println(Friend.numberOfFriends);
```

**Run it.** Output:

```
0
1
```

Make two more, printing after each one:

```java
        Friend friend2 = new Friend("Patrick");
        System.out.println(Friend.numberOfFriends);

        Friend friend3 = new Friend("Squidward");
        System.out.println(Friend.numberOfFriends);
```

**Run it.** Output:

```
0
1
2
3
```

Three different friends all added to **the same** `numberOfFriends`, because there is only
one copy.

IntelliJ may show the names `friend1`, `friend2` and `friend3` in grey. That only means you
made them but never used them again. It is fine.

---

## Step 5 — Getting it through an object works, but don't (video 3:52:57)

You **can** get a static variable through an object instead of the class:

```java
        System.out.println(friend1.numberOfFriends);
```

It prints `3`, the shared count. But IntelliJ **highlights it** and warns you, because it
looks like each friend has their own count, and they don't. **Always use the class name:**
`Friend.numberOfFriends`. Delete this line when you're done trying it.

---

## Step 6 — What if it is NOT static? (video 3:53:48)

To see the difference, he takes the word `static` **off** the variable in `Friend.java`:

```java
    int numberOfFriends;
```

Now `Friend.numberOfFriends` in `main` turns red:

```
error: non-static variable numberOfFriends cannot be referenced from a static context
```

That means: "this variable belongs to each object now, not to the class, so you have to say
**which** friend's." If you change the prints to `friend1.numberOfFriends`,
`friend2.numberOfFriends` and so on, **every friend says `1`**. Each one has its own copy,
and each copy was only added to once.

**Put `static` back** before you go on:

```java
    static int numberOfFriends;
```

---

## Step 7 — A static method (video 3:54:50)

`static` works on **methods** too. In `Friend.java`, under the constructor, add a method that
shows the count in a sentence:

```java
    static void displayFriends() {
        System.out.println("You have " + numberOfFriends + " friends");
    }
```

In `main`, you no longer need the last print line. Call the method instead. Use the
**class** name again:

```java
        Friend.displayFriends();
```

**Run it.** The last line of the output is:

```
You have 3 friends
```

---

## Step 8 — One more friend (video 3:55:56)

Under `Friend.displayFriends();`, make a fourth friend and show the count again:

```java
        Friend friend4 = new Friend("Sandy");
        Friend.displayFriends();
```

**Run it.** The last two lines are:

```
You have 3 friends
You have 4 friends
```

---

## Step 9 — You already use static methods (video 3:56:06)

You have used static methods before: on part 05, with the Math class.

```java
        System.out.println(Math.round(3.14));
```

Look: **`Math.round`**, the class name, then the method. You never wrote
`Math math = new Math();`. You don't need a Math object to round a number, so `round` is
static, and you call it on the class.

That is the whole idea of static: **one copy, owned by the class, shared by everyone, and
reached with the class name.**

### Common mistake: calling a non-static method from main

`main` is static. If you write your own method **without** `static` and call it from
`main`, you get:

```
error: non-static method square(int) cannot be referenced from a static context
```

Fix: put `static` in front of your method, like `displayFriends`.

---

## Your finished files

Your files should look something like this now. **Compare them to yours. Do not copy
them.**

<details>
<summary>Click to compare <code>Friend.java</code> and <code>StaticKeyword.java</code></summary>

```java
package part19;

public class Friend {

    String name;
    static int numberOfFriends;

    Friend(String name) {
        this.name = name;
        numberOfFriends++;
    }

    static void displayFriends() {
        System.out.println("You have " + numberOfFriends + " friends");
    }
}
```

```java
package part19;

// (the comments at the top of your file)

public class StaticKeyword {
    public static void main(String[] args) {
        System.out.println(Friend.numberOfFriends);

        Friend friend1 = new Friend("SpongeBob");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("Squidward");

        Friend.displayFriends();

        Friend friend4 = new Friend("Sandy");

        Friend.displayFriends();

        System.out.println(Math.round(3.14));
    }
}
```

Output:

```
0
You have 3 friends
You have 4 friends
3
```

</details>

---

**Now go back to [README.md](README.md).** Make your Section A commit. Then do Section B: put a
comment above every line, **in your own words**. Do not copy the explanations from this
guide.
