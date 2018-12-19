package Geek4geek;

public class RootsQuadratic {
    public static void main(String[] args) {
//        rootQuadratic(1,-7,12);
        System.out.println(isPower(10,1010));
    }
    public static void rootQuadratic(int a, int b, int c){
        double x1;
        double x2;
        x1= (double) ((-b+Math.sqrt(b*b-4*a*c))/(2*a));
        x2=(double) ((-b-Math.sqrt(b*b-4*a*c))/(2*a));
        System.out.println((int)x1);
        System.out.println(x2);
    }
    public static boolean isPower(int a, int b){
        if(b==1){
            return true;
        }
        int c=1;
        while (b>c){

            c=c*a;
        }
        return c==b;
    }
}
