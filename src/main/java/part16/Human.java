package part16;

public class Human {
    // this variable stores the person's name
    String name;

    // this variable stores the person's age
    int age;

    // this variable stores the person's weight
    double weight;

    // this constructor sets up a Human object with a name, age, and weight
    Human(String name, int age, double weight) {

// this.name refers to the object's name attribute
        this.name = name;

// this.age refers to the object's age attribute
        this.age = age;

// this.weight refers to the object's weight attribute
        this.weight = weight;
    }

    // this method prints that the person is eating
    void eat() {

// this prints the person's name followed by "is eating"
        System.out.println(this.name + " is eating");
    }

    // this method prints that the person is drinking
    void drink() {

// this prints the person's name followed by "is drinking *burp*"
        System.out.println(this.name + " is drinking *burp*");
    }
}
