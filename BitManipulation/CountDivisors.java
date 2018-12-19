package BitManipulation;

public class CountDivisors {
    public static void main(String[] args) {
        System.out.println(countdivisors(4));

    }

    public static int countdivisors(int n) {
        int count = 0;
        for (int i = 1; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    count++;
                } else {
                    count = count + 2;
                }
            }
        }
        return count;
    }
}
