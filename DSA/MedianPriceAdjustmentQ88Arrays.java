package arrays;

import java.util.Arrays;

// Wrong
public class MedianPriceAdjustmentQ88Arrays {
    public static int getMinimumMoves(int[] prices, int k) {
        int n = prices.length;
        Arrays.sort(prices);

        int medianIndex = (n - 1) / 2;
        int median = prices[medianIndex];

        int moves = 0;
        for (int i = 0; i < n; i++) {
            moves += Math.abs(prices[i] - (i < medianIndex ? k - medianIndex + i : k + i - medianIndex));
        }

        return moves / 2; // Divide by 2 as each move affects two elements
    }

    public static void main(String[] args) {
        int[] prices = {1,2,3};
        int k = 5;

        int minMoves = getMinimumMoves(prices, k);
        System.out.println("Minimum moves: " + minMoves);
    }
}