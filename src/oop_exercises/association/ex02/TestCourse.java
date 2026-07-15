package oop_exercises.association.ex02;

import java.util.Scanner;

public class TestCourse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, schedule, department, email, registrationNumber;
        double grade;

        System.out.println("Enter the course name: ");
        name = sc.nextLine();

        System.out.println("Enter the course schedule: ");
        schedule = sc.nextLine();

        Course course = new Course(name, schedule);

        System.out.println("Enter the teacher's name: ");
        name = sc.nextLine();

        System.out.println("Enter the department name: ");
        department = sc.nextLine();

        System.out.println("Enter the teacher's email");
        email = sc.nextLine();

        Teacher teacher = new Teacher(name, department, email);
        course.setTeacher(teacher);

        Student[] students = new Student[5];

        for (int i = 0; i < students.length; i++) {
            System.out.printf("%nStudent %d: %n", i + 1);

            System.out.println("Enter the student's name: ");
            name = sc.nextLine();

            System.out.println("Enter the student registration number: ");
            registrationNumber = sc.nextLine();

            Student student = new Student(name, registrationNumber);
            students[i] = student;

            for (int l = 0; l < student.getNumberOfGrades(); l++) {

                System.out.printf("Enter the student's %d° grade: ", l + 1);
                grade = sc.nextDouble();
                student.setGrades(l, grade);

            }
            sc.nextLine();
        }

        course.setStudents(students);

        if (course != null) {
            System.out.println(course.getInfoCourse());
        }
        sc.close();
    }
}