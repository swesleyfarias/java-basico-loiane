package oop_exercises.inheritance.ex03;

public class Fish extends Animal {
    
    private String characteristic;

    public Fish() {
        super();
        this.setPaws(0);
        this.setEnvironment("Sea");
        this.setColor("Gray");
        this.characteristic = "Fins and tail";
    }

    public Fish(String name, int length, double speed) {
        super(name, length, "Gray", "Sea", speed);
        this.setPaws(0);
        this.characteristic = "Fins and tail";
    }

    public String getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(String characteristic) {
        this.characteristic = characteristic;
    } 

    @Override
    public String toString() {
        return super.toString() + "\nCharacteristic: " + characteristic;
    }
}
