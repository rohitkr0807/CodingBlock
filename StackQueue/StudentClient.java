package StackQueue;

public class StudentClient {
    public static void main(String[] args) {
        Student[] Students= new Student[100];
        try {
            for (int i = 0; i < Students.length; i++) {
                System.out.println("Creating " + i + "th student");
                Students[i] = new Student(i + "th student");
                System.out.println("Created " + i + "th student");
            }

            System.out.println(Students[50].rollno);
//           System.out.println(Students[50].getNumStudents());
            System.out.println(Student.getNumStudents());



        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }



    }

    public static void createAnotherStudent() throws Exception {
        System.out.println("Inside function");
        Student s = new Student("Xyz");


    }
}
