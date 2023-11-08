package org.example.model;

public class User {

    // usar enums para coisas que tem domínios fechados evita de se ter dados quer não fazem sentido
    // se você espera que o usuário tenha vários roles então esse atributo deveria ser uma lista ou um array
    // (nesse caso estamos falando de um relacionamento do tipo composição, lembra)
    // se o usuário só vai ter um role então o nome do atributo ficaria melhos no singular, certo?
    private Role userRoles;

    // seu usuário também vai precisar de um username e password

    public User(Role userRoles) {
        this.userRoles = userRoles;
    }

    public Role getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(Role userRoles) {
        this.userRoles = userRoles;
    }
}
