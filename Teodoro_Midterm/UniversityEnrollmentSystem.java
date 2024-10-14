// Base Class
class Person {
    String Name;
    int age;
//Constructor and it initialize name and age.
Person (String Name, int age) {
    this.Name = Name;
    this.age = age;
}
//methods it prints out the name an age of the person.
void displayInfo(){
    System.out.println("Name: " + Name + "Age: " + age);
    }
}
//this is the student subclass of the person.
class Student extends Person {
    String studentID;
    String course;
    int units;
    final int feePerUnit = 1000;

//Constructor and its initialize name, age, studentID, course and units.
Student(String name, int age, String studentID, String course, int units) {
    super(name, age);
    this.studentID = studentID;
    this.course = course;
    this.units = units;
}

//Calculates the total fee for the student based on the number of units
double calculateFees() {
    return units * feePerUnit;
}

//prints out student's name, age, studentID, course, units and total fee.
@Override
void displayInfo() {
    System.out.println("=========================================================================");
    System.out.println("Student Name: " + Name + " ||" + " Age: " + age + " ||" +
                       " Student ID: " + studentID + " ||" + " Course: " + course + 
                       " ||" + " Units: " + units + " ||" + " Total Fee: " + calculateFees());

    }
}
// instructor subclass of person
class Instructor extends Person {
    String employeeID;
    String department;
    double salary;

// Constructor: Initializes name, age, employeeID, department, and salary.
    Instructor(String name, int age, String employeeID, String department, double salary) {
        super(name, age);
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }
    @Override
    void displayInfo() {
    System.out.println("=========================================================================");
        System.out.println("Instructor Name: " + Name + " ||" + " Age: " + age + " ||" +
                           " Employee ID: " + employeeID + " ||" + " Department: " + department + " ||" +
                           " Salary: " + salary);
    }
}

public class UniversityEnrollmentSystem {
    static void printDetails(Person p) {
        p.displayInfo();
    }
    public static void main(String[] args) {
        Student student1 = new Student("Alex Cosca", 20, "231000325", "DSA", 3);
        Student student2 = new Student("Cezar Ceneta", 19, "231000322", "Mathematics", 4);

        Instructor instructor1 = new Instructor("Engr. Tanya", 22, "E001", "Computer Engineering", 20000);
        Instructor instructor2 = new Instructor("Prof. Justine", 50, "E002", "Calculus", 20000);

        printDetails(student1);
        printDetails(student2);
        printDetails(instructor1);
        printDetails(instructor2);
    }
}
    

