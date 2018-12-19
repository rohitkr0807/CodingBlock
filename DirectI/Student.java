package DirectI;

public class Student {
    private String name;
    public void serName(String name) throws Exception{
        if(name==null||name.length()<=0){
            throw new Exception("Invalid name");
        }
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public final int rollNo=10;
    private static int numStudents;

}
