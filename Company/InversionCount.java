package Company;

public class InversionCount {
    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 3, 5};
        System.out.println(countInt(arr));
    }

    public static int countInt(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i +1; j <= arr.length - 1; j++) {
                if (arr[i] > arr[j]) {
                    count++;

                }
            }
        }

        return count;
    }

}
