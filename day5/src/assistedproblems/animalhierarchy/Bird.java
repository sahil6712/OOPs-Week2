package assistedproblems.animalhierarchy;

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
