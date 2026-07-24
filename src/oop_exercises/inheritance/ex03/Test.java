package oop_exercises.inheritance.ex03;

public class Test {
    public static void main(String[] args) {

        Animal animal = new Animal("Camel", 150, "Yellow", "Earth", 2.0);
        Fish fish = new Fish("Shark", 300, 1.5);
        Bear bear = new Bear("Canada Bear", 180, 0.5);

        System.out.println("Zoo:");
        System.out.println(animal.toString());
        System.out.println(fish.toString());
        System.out.println(bear.toString());
        System.out.println("------------------");
    }
}
