package oop_exercises.inheritance.ex02;

public class Test {
    public static void main(String[] args) {

        IndividualPerson p1 = new IndividualPerson("Camilly", 4500);
        Company p2 = new Company("Cyber Solutions Ltda", 150000);
        
        IndividualPerson p3 = new IndividualPerson("Ana Sofia", 3200);
        Company p4 = new Company("Corner Bakery Inc", 45000);
        
        IndividualPerson p5 = new IndividualPerson("Alex Smith", 8900);
        Company p6 = new Company("Central Taste Restaurant", 85000);

        Contributor[] contributors = new Contributor[6];
        contributors[0] = p1;
        contributors[1] = p2;
        contributors[2] = p3;
        contributors[3] = p4;
        contributors[4] = p5;
        contributors[5] = p6;

        for (Contributor c : contributors) {
             System.out.println(c.toString());
        }
    }
}
