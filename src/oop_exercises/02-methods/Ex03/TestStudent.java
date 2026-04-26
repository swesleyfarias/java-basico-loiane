import java.util.Scanner;
public class TestStudent {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		System.out.println("Name: ");
		student.name = sc.nextLine();
		System.out.println("\nRegistration: ");
		student.registration = Integer.parseInt(sc.nextLine());
		System.out.println("\nCourse: ");
		student.course = sc.nextLine();
		
		for (int i = 0; i<3; i++) {
			System.out.printf("\n%d. Discipline: %n", i);
			student.disciplines[i] = sc.nextLine();
			System.out.println("Grade for this discipline: ");
			student.grades[i] = Double.parseDouble(sc.nextLine());				
		}	 
		
		for (int i = 0; i<3; i++) {
			student.showInfo(i);
			if (student.isApproved(i)) {
				System.out.println("Approved!");	
			} else {
				System.out.println("Failed.");	
			}	
		}	
		sc.close();
	}	
}
