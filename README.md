# Java Follow-Along 4 of 4: Objects (Parts 15–20)

**CSCI-121 · Fall 2026 · No AI**

This is **repo 4 of 4**. It holds Parts 15–20. Everything works the same as the
last repo: same rules, same sections, same commits.

**👉 Start here:** do **[Set up this repo](#set-up-this-repo-5-minutes)** below, then open
[Part 15](src/main/java/part15/README.md).

---

## Set up this repo (5 minutes)

You did this once already, in Part 00. This time is shorter: your IntelliJ settings carry
over, so there is nothing to turn off again.

### 1. Make your fork

1. Go to **github.com/DSU-CSCI-121-F26/FollowAlong4-Objects**.
2. Click **Fork** → **Create fork**.
3. On your fork, click the **Actions** tab → **I understand my workflows, go ahead and
   enable them.**

**✅ Check:** the top of the page says `your-username / FollowAlong4-Objects`.

### 2. Download it to your laptop

**Do not do this inside your last repo's folder.** If your terminal is still in your last
repo, type `cd ..` first to step out of it.

```bash
git clone https://github.com/YOUR-USERNAME/FollowAlong4-Objects.git
cd FollowAlong4-Objects
git remote add upstream https://github.com/DSU-CSCI-121-F26/FollowAlong4-Objects.git
git remote -v
```

Replace `YOUR-USERNAME` in the **first line only**.

**✅ Check:** four lines. The two `origin` lines show **your username**. The two `upstream`
lines show `DSU-CSCI-121-F26`.

### 3. Open it in IntelliJ

**File → Open** → choose the `FollowAlong4-Objects` folder → **Trust Project**. If IntelliJ asks, open it in
a **New Window**. If it asks about the JDK, pick version **21 or higher**, the same as
Part 00.

**✅ Check:** open `src/main/java/part15`. Click inside any `.java` file and type `Sys`. Wait two
seconds. **No list should pop up.** If one does, redo
[Part 00, step 4](https://github.com/DSU-CSCI-121-F26/FollowAlong1-Basics/blob/main/src/main/java/part00/README.md#step-4--turn-off-the-autocomplete-and-the-ai).
Delete what you typed.

Now go to **[Part 15](src/main/java/part15/README.md)**.

---

## The four repos

The 20 parts are split into **four repos**. You do them in order.

| Repo | Parts | What it covers |
|---|---|---|
| **1. [FollowAlong1-Basics](https://github.com/DSU-CSCI-121-F26/FollowAlong1-Basics)** | 00–05 | setup, printing, variables, user input, math, random numbers |
| **2. [FollowAlong2-ControlFlow](https://github.com/DSU-CSCI-121-F26/FollowAlong2-ControlFlow)** | 06–09 | `if`, `switch`, logical operators, loops, checkpoint: guessing game |
| **3. [FollowAlong3-DataAndMethods](https://github.com/DSU-CSCI-121-F26/FollowAlong3-DataAndMethods)** | 10–14 | arrays, String methods, ArrayList, methods, `printf` |
| **4. [FollowAlong4-Objects](https://github.com/DSU-CSCI-121-F26/FollowAlong4-Objects)** | 15–20 | objects, constructors, `toString`, `static`, checkpoint: Receiver and Quarterback |

---

## The parts in this repo

| Part | What you learn from the video | Challenge problems (from part 06) |
|---|---|---|
| 15 | `final`, objects | `partyRating`, `fizzBuzz` |
| 16 | constructors, variable scope | `doubleLetters`, `countWord` |
| 17 | overloaded constructors, `toString` | `sumSkip13`, `hasPair` |
| 18 | arrays of objects, passing objects to methods | `uniqueSum`, `sumWithoutTeens` |
| 19 | `static` | `roundedTotal`, `canBuildWall` |
| **20** | **Checkpoint. No video.** Build `Receiver` and `Quarterback` from an empty file | `ticketResult`, `sameCount` |

### What we do in class

This is the plan. It may change. I will tell you in class.

| Class | We start together | Due before the next lecture |
|---|---|---|
| **Lecture** Thu Oct 1 (on Webex) | Part 00, Part 01 | Parts 00–01 |
| **Recitation** Mon Oct 5 (R3) or Wed Oct 7 (R4) | Help finishing, plus in-class exercises | — |
| **Lecture** Tue Oct 6 | Parts 02, 03, 04 | Parts 02–04 |
| **Lecture** Thu Oct 8 | Parts 05, 06, 07 | Parts 05–07 |
| **Recitation** Mon Oct 12 (R3) or Wed Oct 14 (R4) | Help finishing, plus in-class exercises. R3 (Monday) is also test review | — |
| **Lecture** Tue Oct 13 | 🔴 **Exam 1** — only on what we covered: **Parts 01–07** | — |
| **Lecture** Thu Oct 15 | Parts 08, 09 (checkpoint, in class) | Parts 08–09 |
| **Lecture** Tue Oct 20 | Parts 10, 11, 12 | Parts 10–12 |
| After Oct 20 | Parts 13–20, announced in class | |

**Ahead of the plan? Keep going.** You can always start the next part early.

**Exam 1 on Tue Oct 13 covers Parts 01–07 only:** printing, variables, user input,
expressions, Math and random, `if` and `switch`, logical operators and `while` loops. Every
section of Parts 01–07 is practice for it. Parts 08 and later are **not** on Exam 1.

---

## The video

**[Java Full Course for free — Bro Code](https://www.youtube.com/watch?v=xk4_1vDrzzo)**

This is one long video. We go through it **in order**, one small piece per part. Each
part's instructions tell you:

- where to start the video
- where to stop
- what looks different on his screen

He uses a program called **Eclipse** to write Java. You use **IntelliJ**. The buttons are
different, but the Java code is exactly the same.

---

---

## How each part works

Every part has two halves: **in class** (we do it together) and **on your own** (you
finish it).

### In class, together

- **Follow along.** We watch the video together, or read the guide, and type it together.
- **In-class exercise.** A short exercise we do together, in `InClass.java`. Everyone types
  their own copy.

If we run out of time, or we stop to talk about something, that's fine. **You finish the
rest on your own.**

### On your own (about 50 minutes per part)

**Warm-up (5 minutes).** Type the last part's Stretch B1 again **from memory**, in
`Warmup.java`. No peeking.

**Section A — Follow along.** If we didn't finish it in class, finish it. Watch the video
or read the `GUIDE.md` (the same lesson, written out step by step), and type every line.

**Section B — Comments.** In your follow-along file, write a `//` comment above every line
of code, saying **in your own words** what it does.

**Section C — Stretch.** More practice with the topic, in `Stretch.java`.

**Section D — Challenge.** One harder problem, in `Challenge.java`. Starting with part 06,
the challenge is two small methods, and a **test** tells you if they are right.

**Then push.** Each part's instructions end with the exact commands.

---

---

## How each part is graded

Every part has **four graded sections**, worth **25 points each**:

| Section | What you do | File |
|---|---|---|
| **A · Follow along** | Type the code from the video or the guide | the follow-along file (for example `Main.java`) |
| **B · Comments** | Explain every line of the follow-along code in your own words | the same file |
| **C · Stretch** | Practice problems on the topic | `Stretch.java` |
| **D · Challenge** | One harder problem (from part 06: two problems with a test) | `Challenge.java` |

**Checkpoint parts (part 09 and part 20)** have no video. Instead of **Follow along**,
Section A is **Build**: you write a whole program from an empty file, using what you
learned. Its commit message starts with `part09 build:` or `part20 build:`. The other three
sections are the same.

### When is it due?

> **Everything for a part is due before the next lecture starts** (Tuesday or Thursday,
> 3:00 PM). Recitation is where you get help finishing it.

**When you finish a section, you commit it.** Each part's instructions give you the exact
commit message for each section.

**You do not hand anything in on Canvas.** A program I run reads the commit messages in
your fork. **Type each message exactly as shown**, or the program will not find it. For
example, in part 15:

```bash
git add -A
git commit -m "part15 comments: explained every line of the follow-along code"
```

> ### No commit, no credit.
> A section with no commit gets **0**, even if the code is on your laptop. Your commits
> must be **pushed** before the next lecture starts.

The warm-up and the in-class exercise are practice and are not graded here. Do them anyway.
They make everything after them easier.

---

---

## The rules

1. **Type it. Never copy and paste.** Not from the video, not from these instructions, not
   from a friend. Typing is how you learn where the semicolons go.
2. **Keep autocomplete and AI turned off.** Part 00 shows you how. Each part starts with a
   quick check that they are still off.
3. **Guess before you run.** When the instructions say *predict*, write down what you think
   the program will print **before** you run it. Wrong guesses are fine. Skipping the guess
   is not.
4. **A little every day beats a lot in one night.** Each warm-up needs the last part's
   program fresh in your head. One part a day, or more, works far better than five parts
   the night before they are due.
5. **Stuck on one line for more than 10 minutes?** Write down what you tried. Move on.
   Bring it to tutoring or office hours.

---

---

## How to run your code

**Always run your code inside IntelliJ.** You only use the terminal for `git` commands.

1. Open the file you are working on. For example, `Main.java`.
2. Find the **green ▶** on the left side of the code, next to the line
   `public static void main`.
3. Click it. Choose **Run**.
4. Your output appears in the **Run** window at the bottom of the screen.

**Shortcut:** click anywhere inside the file, then press `Ctrl Shift R` (Mac) or
`Ctrl Shift F10` (Windows). This runs **the file you are looking at**.

> ⚠️ **Do not use the ▶ button at the top of the IntelliJ window.**
> That button runs whatever you ran **last time**, not the file in front of you. So you
> fix `Stretch.java`, click the top ▶, and it runs `Main.java` again. Nothing changes, and
> you think your fix did not work.
> **Always use the ▶ next to `main`.** The Run window's tab tells you which file ran.

**No green ▶ next to `main`?**
- Check the spelling of `main`.
- Check that `main` is inside the class's `{ }`.
- If the ▶ is missing in **every** file: right-click `pom.xml` → **Maven** →
  **Reload project**.

### Nothing runs at all? Look for a mistake in another file

Before IntelliJ runs **any** file, it checks **every** file in the project, all the parts in this repo.
If **one** file anywhere has a mistake that Java cannot understand (a red error), **nothing
runs**. Not even the file you are working on. Even if the mistake is in an old part.

**How to find it:**

1. Look at the **Build** window at the bottom of the screen. It lists the broken file and
   the line number, like `part05/Stretch.java:12`.
2. Click the line. IntelliJ opens the file at that spot.

**How to fix it:**

- **Fix the mistake** if you can.
- **Can't fix it yet?** Put `/*` on the line before the broken code and `*/` on the line
  after it. That turns it into a comment, so Java skips it. Now everything else runs again.
  **Don't delete it.** Come back to it, or bring it to tutoring.

### How to run a test (part 06 and later)

From part 06 on, each part's challenge comes with a test. The test checks your answers.

1. Open `Challenge.java`.
2. Press `⌘ ⇧ T` (Mac) or `Ctrl ⇧ T` (Windows). This jumps to the test file,
   `ChallengeTest.java`.
3. Click the **green ▶** next to `class ChallengeTest`. Choose **Run**.
4. Look at the results:
   - **Green ✔** means that answer is right.
   - **Red ✗** means it is wrong. Click it. You will see a message like
     `expected: <10> but was: <0>`. **expected** is the right answer. **but was** is what
     your code gave.

**Never change a test file.** Only change `Challenge.java`. I can see if a test file was
changed.

---

---

## How to hand in your work

You do not send me anything. A program I run reads the commit messages in your fork.

For each part you make **four commits**, one for each graded section, using the messages in
that part's instructions. Then you **push**:

```bash
git push
```

You always work on **`main`**, the branch you started on. Never make a new branch.

**Before you push, check your commits.** Type `git log --oneline` and make sure all four of
the part's commits are there. (Press `q` to get out of the list.)

**Typed a commit message wrong?** Make one more commit with the right message. Copy the
right message from that part's instructions, and add `--allow-empty` so Git lets you commit
without changing a file:

```bash
git commit --allow-empty -m "part15 comments: explained every line of the follow-along code"
```


**What I check for each section:**

- **Is there a commit for it?** No commit, no credit.
- **Was it pushed before the lecture it was due?** GitHub shows me the time.
- **Does the code do what the instructions ask?** For the challenge from part 06 on, I run
  the test.
- **For comments:** is there one above every line, and is it in **your own words**?

**To see your commits on GitHub:** go to your fork and click the **commits** link (clock
icon) above the file list.

> A **green ✔** next to your commit on GitHub only means your code has no typing errors
> that stop it from running. It does **not** mean your output is right. You check that yourself,
> against each part's instructions.

---

---

## Getting updates

All 20 parts are already in the repo. If I fix a mistake or add something, I will tell you
in class. To get the update, type this in the terminal:

```bash
git pull --no-rebase --no-edit upstream main
```

Type it exactly as shown. The `--no-rebase` and `--no-edit` parts stop Git from asking you
questions. Your work stays safe.

**See `fatal: 'upstream' does not appear to be a git repository`?** You skipped one line in
[step 2 of Set up this repo](#2-download-it-to-your-laptop).
Type this, then try again:

```bash
git remote add upstream https://github.com/DSU-CSCI-121-F26/FollowAlong4-Objects.git
```

---

---

## Getting help

- **Tutoring.** You already have two hours a week. Bring your laptop and the part you are
  stuck on.
- **Office hours.** Bring the error message and tell me what you already tried.
- **Classmates.** Talk about it as much as you want. But **type your own code.**
- **Think Java.** A free online book: [books.trinket.io/thinkjava2](https://books.trinket.io/thinkjava2/).
  Each part's instructions tell you which chapter matches.
