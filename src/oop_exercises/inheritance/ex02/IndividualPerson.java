package oop_exercises.inheritance.ex02;

public class IndividualPerson extends Contributor {
    
    public IndividualPerson() {
        super();
    }

    public IndividualPerson(String name, double income) {
        super(name, income);
    }

    @Override
    public double calculateTax() {
        
        if (!canCalculateTax()) {

            return 0;
        }

        double income = getIncome();

        if (income <= 1400) {
            return (income * 0.00) - 0;

        } else if (income <= 2100) {
            return (income * 0.10) - 100;
            
        } else if (income <= 2800) {
            return (income * 0.15) - 270;

        } else if (income <= 3600) {
            return (income * 0.25) - 500;

        } else { 
            return (income * 0.30) - 700;
        }          
    }

    @Override 
    public String toString() {
        
        String s = "===Individual Person===";
        s += super.toString();
        s += "\nTax: " + calculateTax();
        return s;
    }
}
