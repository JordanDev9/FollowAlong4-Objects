package part18;

public class Car {
    // this line creates string name outside of the construtor so that its global and not local
    String name;
    // this line creates a constuctor Car that allows a String name
    Car(String name) {
        // this line says that String name that we made outside of this is equal to name that is given through the constructor
        this.name = name;
    }
}
