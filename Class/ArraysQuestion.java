package Class;

public class ArraysQuestion {
    public static void main(String[] args) {
        int arr[] = {33, 11, 44, 0, 22};
//        bubbleSort(arr);
//        display(arr);
//        System.out.println();
//        selectionSort(arr);
        insertionSort(arr);
        display(arr);


    }

    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }
    public static void selectionSort(int arr[]){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]>arr[j]){
                    int temp= arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void insertionSort(int arr[]){
        for (int i = 1; i <arr.length ; i++) {
            for(int j=i;j>0 && arr[j-1]>arr[j];j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
}
