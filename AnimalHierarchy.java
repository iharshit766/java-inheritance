class Animal {
    protected String name;
    protected int age;

    // Constructor to initialize name and age
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to be overridden by subclasses
    public String makeSound() {
        return "Some generic animal sound";
    }
}

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String makeSound() {
        return "Woof! Woof!";
    }
}

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public String makeSound() {
        return "Meow! Meow!";
    }
}

class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public String makeSound() {
        return "Chirp! Chirp!";
    }
}

// Example usage
public class AnimalHierarchy {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3);
        Cat cat = new Cat("Whiskers", 2);
        Bird bird = new Bird("Tweety", 1);

        System.out.println(dog.name + " says: " + dog.makeSound());
        System.out.println(cat.name + " says: " + cat.makeSound());
        System.out.println(bird.name + " says: " + bird.makeSound());
    }
}
