package DynamicProgramming;

public class MaximumSizeSubMatrix {
    public static void main(String[] args) {

    }

    public static void printMaxSubSquare(int M[][]) {

        int R = M.length;           //no. of rows
        int C = M[0].length;          // no. of col
        int S[][] = new int[R][C];
        int maxOfS, maxi, maxj;
        for (int k = 0; k < R; k++) {
            S[k][0] = M[k][0];
        }
        for (int i = 1; i < C; i++) {
            S[0][i] = M[0][i];
        }
        for (int i = 1; i < R; i++) {
            for (int j = 1; j < C; j++) {
                if (M[i][j] == 1) {
                    S[i][j] = Math.min(S[i][j - 1], Math.min(S[i - 1][j], S[i - 1][j - 1])) + 1;
                } else {
                    S[i][j] = 0;
                }
            }
        }
    }
}

