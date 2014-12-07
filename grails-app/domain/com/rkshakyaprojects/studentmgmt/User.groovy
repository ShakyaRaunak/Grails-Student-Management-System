package com.rkshakyaprojects.studentmgmt

class User {
    String login
    String password
    String role

    static constraints = {
        login(blank: false, nullable: false, unique: true)
        password(blank: false, password: true)
        role(inList: ["admin", "user"])
    }

    static transients = ['admin']

    boolean isAdmin() {
        return role == "admin"
    }

    def beforeInsert = {
        password = password.encodeAsSHA()
    }

    String toString() {
        login
    }
}