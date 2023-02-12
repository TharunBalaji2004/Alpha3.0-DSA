public class Constructors {
    public static void main(String[] args) {
        Student s1 = new Student(); // Calling Constructor at Object Creation
        Student s2 = new Student("Tharun",123);
        Student s3 = new Student(s2);
    }
}

class Student {
    String name;
    int rollno;

    // Default Constructor - no arguments
    Student (){
        System.out.println("Object Initialized");
    }
    // Parameterized Constrcutor - arguemnts 
    Student (String name,int rollno) {
        this.name = name;
        this.rollno = rollno;
        System.out.println("Student Name: "+this.name);
        System.out.println("Student Rollno: "+this.rollno);
    }
    // Copy Constructor - copies properties of object to another
    Student (Student s){
        this.name = s.name;
        this.rollno = s.rollno;
        System.out.println("Copied Student Name: "+this.name);
        System.out.println("Copied Student Rollno: "+this.rollno);
    }
}

/*
OUTPUT:
Object Initialized
Student Name: Tharun
Student Rollno: 123
Copied Student Name: Tharun
Copied Student Rollno: 123
 */