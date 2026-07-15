package oop_exercises.association.ex02;

public class Student {

    private String name;
    private String registrationNumber;
    private double[] grades = new double[4];

    Student(String name, String registrationNumber) {
        this.name = name;
        this.registrationNumber = registrationNumber;
    }

    public String getName() {
        return name;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getNumberOfGrades() {
        return this.grades.length;
    }

    public void setGrades(int i, double grade) {
        this.grades[i] = grade;
    }

    public double getAverage() {
        double sum = 0;

        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }

        return sum / grades.length;
    }

    public boolean isApproved() {
        if (getAverage() >= 7) {
            return true;
        } else {
            return false;
        }
    }

    public String getStudentInfo() {
        String studentInfo = ("\nStudent's name: " + getName());
        studentInfo += ("\nStudent's registration number: " + getRegistrationNumber());
        studentInfo += ("\nStudent's grade: " + getAverage());
        if (isApproved()) {
            studentInfo += ("\n" + getName() + " passed!");
        } else {
            studentInfo += ("\n" + getName() + " failed!");
        }

        return studentInfo + "\n";
    }
}