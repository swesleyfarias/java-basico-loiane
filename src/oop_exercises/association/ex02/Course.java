package oop_exercises.association.ex02;

public class Course {

    private String name;
    private String schedule;
    private Teacher teacher;
    private Student[] students;

    Course(String name, String schedule) {
        this.name = name;
        this.schedule = schedule;
    }

    public String getName() {
        return name;
    }

    public String getSchedule() {
        return schedule;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public double getClassAverage() {
        double sum = 0;

        for (Student i : this.students) {
            sum += i.getAverage();
        }

        return sum / students.length;
    }

    public String getCourseInfo() {
        String courseInfo = ("\n" + getName() + " " + getSchedule());

        if (teacher != null) {
            courseInfo += teacher.getTeacherInfo();
        } else {
            courseInfo += ("\nThere's not a teacher.");
        }

        if (students != null) {
            for (Student i : this.students) {
                if (i != null) {
                    courseInfo += i.getStudentInfo();
                }
            }
            
            courseInfo += ("\nClass average: " + getClassAverage());
        } else {
            courseInfo += ("\nThere aren't students.");
        }
      
        return courseInfo + "\n";
    }
}
