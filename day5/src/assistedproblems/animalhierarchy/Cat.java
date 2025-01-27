package assistedproblems.animalhierarchy;

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
