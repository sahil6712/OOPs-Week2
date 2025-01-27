package assistedproblems.animalhierarchy;

public class Main {

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
