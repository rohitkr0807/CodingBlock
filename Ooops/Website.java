package Ooops;

public class Website {
    String webName;
    int webAge;

    public Website(String webName, int webAge) {
        this.webName = webName;
        this.webAge = webAge;
    }

    public static void main(String[] args) {
        Website obj1= new Website("BeginnerBook",5);
        Website obj2= new Website("Experienced", 10);
        System.out.println(obj1.webAge+ obj1.webName);
    }
}
