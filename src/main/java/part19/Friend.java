package part19;

public class Friend {
    // this line creates a String variable called name
    String name;
    // this line creates one friend counter shared by all Friend objects
    static int numberOfFriends;

    // this is the constructor for the Friend class
    Friend(String name) {
        // this line sets the friend's name
        this.name = name;
        // this line adds 1 to the shared friend counter
        numberOfFriends++;
    }

    // this method displays the total number of friends
    static void displayFriends() {
        // this line prints the number of friends
        System.out.println("You have " + numberOfFriends + " friends");
    }
}
