package oop_exercises.inheritance.ex03;

public class Bear extends Mammal {
    
    public Bear() {
        super();
        this.setColor("Brown");
        this.setFood("Honey");
    }

    public Bear(String name, int length,  double speed) { 
        super(name, length, "Brown", speed, "Honey");  
    }
}
