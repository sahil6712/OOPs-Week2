package hierarchicalinheritance.schoolsystemwithroles;

class Person {
    // attributes
    String name;
    int age;

    // constructors
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    void display() {
        System.out.println("Name is : "+ name + " age is : "+ age);
    }

}

