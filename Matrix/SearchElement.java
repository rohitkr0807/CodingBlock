package Matrix;

public class SearchElement {
    public static void main(String[] args) {
        int mat[][] = {{10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}};
        int n = mat.length;
        elementFound(mat, n, 29);
        elementSortedMatrix(mat,n,29);

    }

    public static void elementFound(int arr[][], int n, int item) {
        boolean found = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == item) {
                    found = true;
                    System.out.println("item found at" + (i + 1) + " " + (j + 1));
                }
            }
        }
        if (found == false) {
            System.out.println("Not found");
        }
    }

    public static void elementSortedMatrix(int arr[][], int n, int element) {
        int i = 0;
        int j = n - 1;
        while (i < n && j >= 0) {
            if (arr[i][j] == element) {
                System.out.println("Element found at" + (i + 1) + " " + (j + 1));
            }
            if (arr[i][j] > element) {
                j--;
            } else {
                i++;
            }
        }
    }
}
