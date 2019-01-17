package dymamic.programming;

/**
 * @author Abhijeet Gulve
 */
public class CoinProblem {

    public static void main(String[] args) {
        int coin[] = {2, 5, 6, 8};
        System.out.println(coinDistribute(coin, 0, 10));
    }

    static int coinDistribute(int[] coin, int level, int ammount) {
        if (ammount < 0 || level >= coin.length) {
            return 0;
        }
        if (ammount == 0) {
            return 1;
        }
        int sum = 0;
        for (int i = level; i < coin.length; i++) {

            sum += coinDistribute(coin, i, ammount - coin[i]);
        }
        return sum;
    }

}
