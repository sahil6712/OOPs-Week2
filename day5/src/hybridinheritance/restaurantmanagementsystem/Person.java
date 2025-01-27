package hybridinheritance.restaurantmanagementsystem;

// Define a superclass Person with attributes like name and id.
class Person {
    // attributes
    String name;
    int id;

    // constructor
    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
    // default constructor
    Person(){};

    // display function
    void display() {
        System.out.println("Name of the person is : "+ name + " id is : "+ id);
    }

}

