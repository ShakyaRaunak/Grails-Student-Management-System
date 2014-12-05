package grailsproject

class Student {

    String firstName
    String lastName
    String gender
    Date dateOfBirth
    Integer age
    String grade
    String city
    String state
    String telephone
    String email
    Date dateOfAdmission

    static constraints = {
        firstName(blank: false, maxSize: 50)
        lastName(blank: false, maxSize: 50)
        gender(inList: ["Male", "Female"])
        age(min: 15, max: 25)
        grade(inList: ["Eleven", "Twelve"])
        dateOfBirth(validator: { return (it < new Date()) })
        city(nullable: true)
        state(nullable: true)
        telephone(blank: false, unique: true)
        email(blank: true, nullable: true, email: true)
        dateOfAdmission()
    }

    static searchable = true
}

