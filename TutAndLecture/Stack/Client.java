package TutAndLecture.Stack;

public class Client {
    public static void main(String[] args) throws Exception {
        Stack s= new Stack(3);
        s.push(34);
        s.push(32);
        s.push(24);
        s.pop();
        System.out.println(s.top());
        s.display();
    }
}
