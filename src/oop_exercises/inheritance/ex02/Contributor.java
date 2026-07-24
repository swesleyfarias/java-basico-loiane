package oop_exercises.inheritance.ex02;

public abstract class Contributor {

    private String name;   
    private double income;
    
    public Contributor() {
        
    }

    public Contributor(String name, double income) {
        this.name = name;
        this.income = income;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }
    
    public boolean canCalculateTax() {
        return income>=0;
    } 

    public abstract double calculateTax();
    
    public String toString() {
        String s = "\nName: " + name;
        s += "\nIncome: " + income;
        return s;
    }
}
