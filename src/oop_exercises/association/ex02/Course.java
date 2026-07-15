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

    public String getInfoCourse() {
        String infoCourse = ("\n" + getName() + " " + getSchedule());

        if (teacher != null) {
            infoCourse += teacher.getTeacherInfo();
        } else {
            infoCourse += ("\nThere's not a teacher.");
        }

        if (students != null) {
            for (Student i : this.students) {
                if (i != null) {
                    infoCourse += i.getStudentInfo();
                }
            }
        } else {
            infoCourse += ("\nThere aren't students.");
        }

        infoCourse += ("\nClass average: " + getClassAverage());

        return infoCourse + "\n";
    }
}