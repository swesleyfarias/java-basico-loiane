package oop_exercises.encapsulation.ex03;

import java.util.Scanner;

public class TestStudent {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String name, course, subject;
		int registration;
		double grades;

		System.out.println("Name: ");
		name = sc.nextLine();

		System.out.println("\nRegistration: ");
		registration = Integer.parseInt(sc.nextLine());

		System.out.println("\nCourse: ");
		course = sc.nextLine();

		Student student = new Student(name, registration, course);

		for (int i = 0; i < 3; i++) {
			System.out.printf("\n%d. Subject: %n", i);
			subject = sc.nextLine();
			student.setSubject(i, subject);

			System.out.println("Grade for this subject: ");
			grades = Double.parseDouble(sc.nextLine());
			student.setGrade(i, grades);
		}

		student.showInfo();

		for (int i = 0; i < 3; i++) {
			student.showResults(i);
			if (student.isApproved(i)) {
				System.out.println("Approved!");
			} else {
				System.out.println("Failed.");
			}
		}
		sc.close();
	}
}