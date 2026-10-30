package part18;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=13121s
//        rewatch the array of objects and passing objects parts if you get stuck
//
// In-class exercise — we do this together in class. Not graded, but commit it.
// The README (In-class exercise) has the steps and the output to match.

public class InClass {
    public static void main(String[] args) {

        // STEP 1 — we fill an array of books and put them on a shelf, together, here.
        Book[] books = new Book[3];

        books[0] = new Book("Dune");
        books[1] = new Book("Holes");
        books[2] = new Book("Wonder");

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].title);
        }

        Shelf shelf = new Shelf();

        for (Book b : books) {
            shelf.place(b);
        }

        System.out.println("Books on the shelf: " + shelf.count);


        // STEP 2 — fix the bugs. Each line below has ONE mistake.
        // Move ONE line at a time above the /* line, so Java sees it.
        // Read the red error (or the crash). Fix it. Run it. Then do the next line.

        // empty[0] doesn't have a Book in it yet, so it doesn't have a title
        Book[] empty = new Book[2];
        // System.out.println(empty[0].title);
        // place() needs a Book, but "Dune" is a String
        shelf.place(new Book("Dune"));
        // books[3] doesn't exist because the array only has indexes 0, 1, and 2
        // System.out.println(books[3].title);

    }
}


// STEP 1 — we build these two classes together.
class Book {
    String title;

    Book(String title) {
        this.title = title;
    }
}

class Shelf {
    int count;

    void place(Book b) {
        count++;
        System.out.println("Placed " + b.title + " on the shelf");
    }
}