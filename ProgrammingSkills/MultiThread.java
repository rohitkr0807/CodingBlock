package ProgrammingSkills;

public class MultiThread extends Thread {
    public void run(){
        try{
            for (int i = 1; i <=10; i++) {
                System.out.println("Value of I= "+ i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }


    public static void main(String[] args) {
        MultiThread m1= new MultiThread();
        System.out.println(m1.isAlive());
        m1.start();
        System.out.println(m1.isAlive());
    }
}
