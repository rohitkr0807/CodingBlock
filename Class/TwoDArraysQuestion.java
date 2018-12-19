package Class;

public class TwoDArraysQuestion {
    public static void main(String args[]) {

    }

    public static void wavePrintColumn(int arr[][]) {
        for (int col = 0; col < arr[0].length; col++) {
            if (col % 2 == 1) {
                for (int row = arr.length - 1; row >= 0; row--) {
                    System.out.print(arr[row][col] + " ,");
                }
            } else {
                for (int row = 0; row < arr.length; row++) {
                    System.out.print(arr[row][col] + " ,");
                }
            }
        }
    }

    //Tut 4 Solution
    public static boolean isMirrorInverse(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[arr[i]] != i) {
                return false;
            }
        }
        return true;
    }

    public static void spiralPrint(int arr[][]) {
        int minRow = 0;
        int minCol = 0;
        int maxRow = arr.length - 1;
        int maxCol = arr[0].length - 1;
        int counter = 0;
        int totalElement = arr.length * arr[0].length;
        while (counter<totalElement){
            for (int i = minRow; counter < totalElement && i <= maxRow; i++) {
                System.out.print(arr[i][minCol] + " ");
                counter++;
            }

            minCol++;


            for (int i = minCol; counter < totalElement && i <= maxCol; i++) {
                System.out.print(arr[maxRow][i] + " ");
                counter++;
            }

            maxRow--;


            for (int i = maxRow; counter < totalElement && i >= minRow; i--) {
                System.out.print(arr[i][maxCol] + " ");
                counter++;
            }

            maxCol--;

            for (int i = maxCol; counter < totalElement && i >= minCol; i--) {
                System.out.print(arr[minRow][i] + " ");
                counter++;
            }

            minRow++;

        }

    }
}
