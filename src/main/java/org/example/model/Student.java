package org.example.model;

public class Student {
    private String studentName;
    private String studentId;

    // o relacionamento entre Student e Course é do tipo n:m portanto essa variável aqui não faz sentido.
    // mesmo que um Student só pudesse fazer um curso nesse caso a variável seria do tipo Course e não do tipo String
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
