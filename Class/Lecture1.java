package Class;

public class Lecture1 {
    public static void main(String[] args) {
        print(5);

    }
    public static void print(int n){
        int row=1;
        int numspaces= (n/2);
        int numstars=1;
        while (row<=n){
            int spaces=1;
            while (spaces<=numspaces){
                System.out.print(" ");
                spaces++;
            }
            int stars=1;
            while (stars<=numstars){
                System.out.print("*");
                stars++;
            }
            if(row>n/2){
                numspaces++;
                numstars=numstars-2;
            }else{
                numspaces--;
                numstars=numstars+2;
            }
            System.out.println();
            row++;
        }
    }
}
