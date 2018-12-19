package Array;

public class TwoDArrays {
    public static void main(String [] args){
        System.out.println("Gaya");
        int arr[][] = new int [4][9];
        System.out.println(arr[0]);
        arr[0]= new int [3];
        arr[2][0]=5;
        System.out.println(arr[2][0]);
        System.out.println(arr[3].length);

        arr[0] = new int[2];
        arr[1] = new int[3];
        arr[2] = new int[1];
        arr[3] = new int[5];
        arr[0][1]=5;
        System.out.println(arr[0][1]);
    }
}
