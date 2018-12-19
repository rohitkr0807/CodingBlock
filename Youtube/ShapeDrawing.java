package Youtube;

import java.util.Scanner;

public class ShapeDrawing{
    public static void main(String[] args) {
        Scanner scrn= new Scanner(System.in);
        int n= scrn.nextInt();
//        for (int i = 1; i <=n ; i++) {
//            for (int j = 1; j <=i ; j++) {
//                System.out.print(j);
//            }
//            for (int j = n; j >i ; j--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        printEven(6);
    }
    public static void print(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(j);
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("&");
            }
            System.out.println();

        }

    }
    public static void print(){
       for(int a=1,b=10,c=11,d=20,e=21,f=30; a<=10;a++,b--,c++,d--,e++,f--){
           System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f);
       }
//        System.out.println();
    }
   public static void printEven(int n){
        for(int i=n; i>=1;i--){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int k=n;k>=i;k--){
                System.out.print("$");
            }
            for(int k=n;k>=i;k--){
                System.out.print("$");
            }
            System.out.println();
        }
   }
}
