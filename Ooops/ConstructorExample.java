package Ooops;

public class ConstructorExample {
    int age;
    String name;
    ConstructorExample(){
        this.age=16;
        this.name="Rohit";
    }

    ConstructorExample(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public static void main(String[] args) {
        ConstructorExample obj1= new ConstructorExample();
        ConstructorExample obj2= new ConstructorExample(14,"Rahul");
        System.out.println(obj1.name+ " "+ obj1.age);
        System.out.println(obj2.name+ " "+ obj2.age);
    }
}
