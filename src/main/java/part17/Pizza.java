package part17;

public class Pizza {
    // this line created a string with the variable of bread
    String bread;
    // this line created a string with the variable of sauce
    String sauce;
    // this line created a string with the variable of cheese
    String cheese;
    // this line created a string with the variable of topping
    String topping;
    // this line is a constructor that allow 4 parameters
    Pizza(String bread,String sauce,String cheese, String topping) {
        // this line says that the variable bread created before is equal to the bread in the parameter
        this.bread = bread;
        // this line says that the variable sauce created before is equal to the sauce in the parameter
        this.sauce = sauce;
        // this line says that the variable cheese created before is equal to the cheese in the parameter
        this.cheese = cheese;
        // this line says that the variable topping created before is equal to the topping in the parameter
        this.topping = topping;

    }
    // this constructor lets you pick the bread sauce and cheese
    Pizza(String bread, String sauce, String cheese) {
// this sets the bread field to the bread that was passed in
        this.bread = bread;
// this sets the sauce field to the sauce that was passed in
        this.sauce = sauce;
// this sets the cheese field to the cheese that was passed in
        this.cheese = cheese;
    }

    // this constructor lets you pick the bread and sauce
    Pizza(String bread, String sauce) {
// this sets the bread field to the bread that was passed in
        this.bread = bread;
// this sets the sauce field to the sauce that was passed in
        this.sauce = sauce;
    }

    // this constructor lets you pick only the bread
    Pizza(String bread) {
// this sets the bread field to the bread that was passed in
        this.bread = bread;
    }

}
