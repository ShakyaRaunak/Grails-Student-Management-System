import grails.util.Environment
import com.rkshakyaprojects.studentmgmt.Student
import com.rkshakyaprojects.studentmgmt.User

class BootStrap {

    def init = { servletContext ->
        switch (Environment.current) {
            case Environment.DEVELOPMENT:
                loadDevelopmentData()
        }
    }

    def loadDevelopmentData() {
        def admin = User.findByLogin("admin") ?: new User(login: "admin", password: "password", role: "admin").save()
        if (admin.hasErrors()) {
            println admin.errors
        }

        def member = User.findByLogin("raunak") ?: new User(login: "raunak", password: "password", role: "user").save()
        if (member.hasErrors()) {
            println member.errors
        }

        new Student(firstName: "Raunak", lastName: "Shakya", gender: "Male", age: 23, grade: "Twelve", dateOfBirth: (new Date() - 360), city: "Kathmandu", state: "Bagmati", telephone: 9813138620, email: "raunak@live.com", dateOfAdmission: (new Date())).save()
        new Student(firstName: "Rajesh", lastName: "Shakya", gender: "Male", age: 25, grade: "Twelve", dateOfBirth: (new Date() - 360), city: "Kathmandu", state: "Bagmati", telephone: 9813138677, email: "rajesh@live.com", dateOfAdmission: (new Date())).save()
        new Student(firstName: "Ronish", lastName: "Shakya", gender: "Male", age: 23, grade: "Eleven", dateOfBirth: new Date(), city: "Kathmandu", state: "Bagmati", telephone: 9813138644, email: "ronish@live.com", dateOfAdmission: (new Date())).save()
    }

}
