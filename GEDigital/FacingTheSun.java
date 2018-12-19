package GEDigital;


public class FacingTheSun {
    public static void main(String[] args) {
        int arr[]={2,3,4,5};
        int n=4;
        System.out.println(NumberofBuilding(arr,n));

    }
    public static int NumberofBuilding(int arr[], int n){
        int max=arr[0];
        int count=1;
        for (int i = 0; i <n ; i++) {
            if(arr[i]>max){
                max=arr[i];
                count++;
            }
        }



        return count;

    }
}
