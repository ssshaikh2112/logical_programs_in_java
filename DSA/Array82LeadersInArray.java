package arrays;

import java.util.Arrays;

public class Array82LeadersInArray {
	//Incomplete
	// Highest next element is leader for next sub Array
	
	public static void findLeaders(int[] arr) {
        int n = arr.length;
        int max_so_far = arr[n - 1];
        System.out.print(max_so_far + " ");

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= max_so_far) {
                System.out.print(arr[i] + " ");
                max_so_far = arr[i];
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        findLeaders(arr);
    }

}
