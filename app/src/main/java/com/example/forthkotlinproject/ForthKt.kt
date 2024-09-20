package com.example.forthkotlinproject

// Defining the Student class using a secondary constructor
open class Student {
    var studentName: String
    var studentId: Int
    var studentCourse: String

    // Secondary constructor to initialize properties
    constructor(name: String, id: Int, course: String) {
        this.studentName = name
        this.studentId = id
        this.studentCourse = course
    }

    // Method to display student details
    open fun showDetails() {
        println("Student Name: $studentName")
        println("Student ID: $studentId")
        println("Major: $studentCourse")
    }

    // Method to simulate studying
    fun study() {
        println("$studentName is studying.")
        println() //empty line for spacing
    }
}

//StudentCouncil class that inherits from Student class
class StudentCouncil : Student {

    //Property to store the student's role
    var studentRole: String

    //Secondary constructor for StudentCouncil class, inheriting properties from the parent class
    constructor(name: String, id: Int, course: String, role: String) : super(name, id, course) {
        this.studentRole = role
    }

    //Overriding showDetails method to display the studentRole along with other details
    override fun showDetails() {
        super.showDetails() //Calling the parent class method
        println("Role: $studentRole")
        println() //empty
    }
}

//Abstract class representing a school member
abstract class SchoolMember(val name: String) {

    //Abstract function to be implemented by subclasses
    abstract fun showRole()

    //Non-abstract function that can be used by subclasses
    fun greet() {
        println("Hello, I am $name, and I am a part of this school.")
    }
}

// Concrete class that inherits from SchoolMember and implements the abstract method
class StudentCouncilMember(name: String, val role: String) : SchoolMember(name) {

    // Implementing the abstract method
    override fun showRole() {
        println("I am a $role.")
    }
}

//Main
fun main() {
    //Instantiating the Student class using the secondary constructor
    val s001 = Student("Alice", 101, "BBIT")

    //Calling the methods for Student class
    s001.showDetails()
    s001.study()

    //3 friends
    val f1 = Student("Paul", 105, "BCOM")
    val f2 = Student("Lizzie", 102, "CS")
    val f3 = Student("Samuel", 111, "BBIT")

    //Calling the methods for each friend
    f1.showDetails()
    f1.study()

    f2.showDetails()
    f2.study()

    f3.showDetails()
    f3.study()

    //Creating StudentCouncil instances
    val councilMember = StudentCouncil("Alice", 101, "BBIT", "President")
    councilMember.showDetails()
    councilMember.study()

    val councilMember2 = StudentCouncil("Bob", 102, "CS", "Vice President")
    councilMember2.showDetails()
    councilMember2.study()

    val councilMember3 = StudentCouncil("Charlie", 103, "Math", "Secretary")
    councilMember3.showDetails()
    councilMember3.study()

    //Bonus:Demonstrating abstraction using abstract class SchoolMember
    val councilMemberAbstract = StudentCouncilMember("Alice", "President")
    councilMemberAbstract.greet()
    councilMemberAbstract.showRole()
}