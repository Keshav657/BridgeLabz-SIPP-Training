package Inheritance;

// Superclass
class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println(name + " makes a sound.");
    }
}

// Dog subclass
class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " barks: Woof!");
    }
}

// Cat subclass
class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " meows: Meow!");
    }
}

// Bird subclass
class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " chirps: Tweet!");
    }
}

// Demo
public class AnimalHierarchy {
    public static void main(String[] args) {
        Animal a1 = new Dog("Rex", 5);
        Animal a2 = new Cat("Whiskers", 3);
        Animal a3 = new Bird("Tweety", 2);

        a1.makeSound();
        a2.makeSound();
        a3.makeSound();
    }
}
