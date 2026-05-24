package oop_exercises.methods.ex03;
public class Student {
	String name;
	int registration;
	String course;
	String[] disciplines = new String[3];
	double[] grades = new double[3];
	
	boolean isApproved(int i) {
		return grades[i]>=7;
	}	
	
	void showInfo(int i) {
		System.out.println("\nDiscipline: " + disciplines[i]);
		System.out.printf("Grade: %.1f%n", grades[i]);
    }	
}
