class Animal {
    // Attributes of animal
    String name;
    int age;

    // Constructor of animal class
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Methods of Animal 
    public void makeSound() {
        System.out.println("Makes sound... ");
    }
}

class Dog extends Animal {

    // Constructor chaining set dog name and age
    Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name+" Barks loud as he turned "+age);
    }

}

class Cat extends Animal {

    // Constructor chaining set cat name and age
    Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name+" Meows loud as she turned "+age);
    }

}

class Bird extends Animal {
    
    // Constructor chaining set bird name and age
    Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name+" Chirp loud as she turned "+age);
    }
}

public class AnimalHierarchy {
    public static void main(String args[]) {

        // Instance of Dog class
        Dog cherry = new Dog("cherry",5);
        cherry.makeSound();

        //Instance of Cat class
        Cat kio = new Cat("kio", 3);
        kio.makeSound();

        //Instance of Bird
        Bird shinny = new Bird("shinny", 1);
        shinny.makeSound();
        
        // Instance of animal class
        Animal animal = new Animal("asskicker",2);
        animal.makeSound();
    }
}