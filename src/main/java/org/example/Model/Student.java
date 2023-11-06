package org.example.Model;

public class Student {
    private String studentName;
    private String studentId;
    private String studentCourse;

    public Student(String studentName, String studentId, String studentCourse) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.studentCourse = studentCourse;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentCourse() {
        return studentCourse;
    }

    public void setStudentCourse(String studentCourse) {
        this.studentCourse = studentCourse;
    }
}
