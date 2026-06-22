package oop_exercises.encapsulation.ex03;

public class Student {

	private String name;
	private String course;
	private int registration;
	private String[] subjects = new String[3];
	private double[] grades = new double[3];

	public Student(String name, int registration, String course) {
		this.name = name;
		this.registration = registration;
		this.course = course;
	}

	public String getName() {
		return name;
	}

	public String getCourse() {
		return course;
	}

	public int getRegistration() {
		return registration;
	}

	public void setSubject(int index, String subject) {
		this.subjects[index] = subject;
	}

	public void setGrade(int index, double grade) {
		this.grades[index] = grade;
	}

	public boolean isApproved(int i) {
		return grades[i] >= 7;
	}

	public void showInfo() {
		System.out.println("\nName: " + name);
		System.out.println("Registration: " + registration);
		System.out.println("Course: " + course);
	}

	public void showResults(int i) {
		System.out.println("\nSubject: " + subjects[i]);
		System.out.printf("Grade: %.1f%n", grades[i]);
	}
}