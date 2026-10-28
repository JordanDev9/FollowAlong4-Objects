package part17;

public class Car {
    // this line assigns the varibale make to ford a string
    String make = "Ford";
    // this line makes the variable model mustang a string
    String model = "Mustang";
    // this line put the variable color to red a string
    String color = "red";
    // this line puts the variable year to 2021 a int
    int year = 2021;
    // this line creates a public method called toString which
    public String toString() {
        // allows the who object car to be printed in a single line
        String myString = make + " " + model + " " + color + " " + year;
        // this line returns the variable my String which is created in the line above
        return myString;
    }
    Car(String make,String model, String color,int year){
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
    }
    Car(){
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
    }
}
