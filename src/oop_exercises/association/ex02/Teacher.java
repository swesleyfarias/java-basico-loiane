package oop_exercises.association.ex02;

public class Teacher {

    private String name;
    private String department;
    private String email;

    Teacher(String name, String department, String email) {
        this.name = name;
        this.department = department;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getEmail() {
        return email;
    }

    public String getTeacherInfo() {
        String teacherInfo = ("\nTeacher: " + getName());
        teacherInfo += ("\nTeacher's department: " + getDepartment());
        teacherInfo += ("\nTeacher's email: " + getEmail());

        return teacherInfo + "\n";
    }
}