package oop_exercises.inheritance.ex02;

public class Company extends Contributor{
    
    public Company() {
        super();
    }

    public Company(String name, double income) {
        super(name, income);
    }   

    @Override
    public double calculateTax() {

        if (!canCalculateTax()) {
            return 0;
        }

        return getIncome() * 0.10;    
    }    

    @Override
    public String toString() {
        
        String s = "===Company===";
        s += super.toString();
        s += "\nTax: " + calculateTax();
        return s;
    }
}
