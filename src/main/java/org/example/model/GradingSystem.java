package org.example.model;

public class GradingSystem {

    // se essa classe (pelo que eu entendi) será responsável pelo relacionamento n:m entre Student e Course então ela
    // vai precisar de dois atributos: um que aponta para o Student e outro que aponta para o Course.
    // E não se esqueça da nota, que faz parte do relacionamento.
    // Um exemplo de atributo do tipo seria:

    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
