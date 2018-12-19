package DynamicProgramming;

public class NumberOfWaysSum {
    public static void main(String[] args) {

//        Count number of ways to reach a given score in a game
//
//        Consider a game where a player can score 3 or 5 or 10 points in a move. Given a total score n, find number of ways to reach the given score.
        System.out.println(numberofways(22));
    }

    public static int numberofways(int n) {

        int table[]= new int[n+1];
        table[0]=1;
        for (int i = 3; i <=n ; i++) {
            table[i]+=table[i-3];
        }
        for (int i = 5; i <=n ; i++) {
            table[i]+=table[i-5];
        }
        for (int i = 10; i <=n ; i++) {
            table[i]+=table[i-10];
        }
        return table[n];
    }
}
