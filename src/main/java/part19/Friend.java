package part19;

public class Friend {
    // this line creates a String variable called name
    String name;
    // this line creates a shared variable that counts all Friend objects
    static int numberOfFriends;
    // this line stores the name of the newest friend created
    static String newestFriend;

    // this is the constructor for the Friend class
    Friend(String name) {
        // this line sets the friend's name
        this.name = name;
        // this line adds 1 to the shared friend count
        numberOfFriends++;
        // this line updates the newest friend's name
        newestFriend = name;
    }

    // this method displays the total number of friends
    static void displayFriends() {
        // this line prints the number of friends
        System.out.println("You have " + numberOfFriends + " friends");
    }
}
