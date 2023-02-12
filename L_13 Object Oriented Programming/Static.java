public class Static {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "VVPS";
        System.out.println(s1.schoolName);

        Student s2 = new Student();
        System.out.println(s2.schoolName);
        s2.schoolName = "PSV";
    }
}

class Student {
    String name;
    int roll;
    static String schoolName;

    void setName (String name){
        this.name = name;
    }
    String getName() {
        return this.name;
    } 
}

/*
OUTPUT:
PSV
PSV
 */