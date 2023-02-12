public class ShallowCopy {
    public static void main(String[] args) {
        Student s1 = new Student("Tharun");
        Student s3 = new Student(s1);
        for(int i=0;i<3;i++){
            System.out.print(s3.marks[i] + " ");
        }
    }
}

class Student {
    String name;
    int marks[];

    Student(String name){
        this.name = name;
        this.marks = new int[3];
        for(int i=0;i<3;i++){
            this.marks[i] = i+20;
        }
    }

    // Shallow Copy Constructor
    Student(Student s) {
        marks = new int[3];
        System.out.println("Constructor called");
        this.name = s.name;
        this.marks = s.marks;
    }
}
