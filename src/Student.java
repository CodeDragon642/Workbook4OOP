public class Student {
    // list all attributes
    String fname = "";
    String lname = "";
    int grade;

    public Student(String fname, String lname, int grade) {
        this.fname = fname;
        this.lname = lname;
        this.grade = grade;
    }

    // main method starts here
    public static void main(String[] args) {
        // create object
        Student obj1 = new Student("Abdullah", "Mariah", 6);
        System.out.println("Student detail :" + obj1.fname + " " + obj1.lname + " "+ obj1.grade);

        Student obj2 = new Student("Johan", "Smith", 5 );
        System.out.println("Student detail :" + obj2.fname + " " + obj2.lname + " "+ obj2.grade);
    }
}