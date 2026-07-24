package oop_exercises.inheritance.ex03;

public class Mammal extends Animal {
    
    private String food;

    public Mammal() {
        super();
        this.setEnvironment("Earth");
    }

    public Mammal(String name, int length, String color, double speed, String food) {
        super(name, length, color,  "Earth", speed);
        this.food = food;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return super.toString() + "\nFood: " + food;
    }
}
