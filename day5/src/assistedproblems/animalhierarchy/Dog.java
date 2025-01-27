package assistedproblems.animalhierarchy;

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
