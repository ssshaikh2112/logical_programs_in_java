package arrays;

import java.util.Scanner;

public class TrailingZerosInFactorialQ77Arrays {
    public static int countTrailingZeros(int n) {
        int count = 0;
        for (int i = 5; i <= n; i *= 5) {
            count += n / i;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int result = countTrailingZeros(num);
        System.out.println(result);
    }
}