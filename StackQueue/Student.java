package StackQueue;

public class Student {
    private String name;

    public void setName(String name) throws Exception {
        if (name == null || name.length() == 0) {
            throw new Exception("Invalid name");
        }
        this.name = name;

    }

    public String getName() {
        return this.name;
    }

    public  final int rollno;
    public static int numStudents;
    public static final int Max_limit = 100;

    public void changeRoolno() {
//        rollno=12;
    }

    public void printName() {
        System.out.println(this.name);
    }
    public Student(String name) throws Exception {
        if(Student.numStudents==Student.Max_limit){
            throw new Exception("Max limit reached");
        }
        System.out.println("Hello");
        this.setName(name);
        Student.numStudents++;
        this.rollno=Student.numStudents;
    }
    public static int getNumStudents(){
        return Student.numStudents;
    }


}
