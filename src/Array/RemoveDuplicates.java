package Array;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] new_arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        new_arr[0] = arr[0];
        int x = 0; // x is the first index

        for (int i = 1; i < arr.length;i++) {
            if (new_arr[x] != arr[i]) {
                x = x+1;
                new_arr[x] = arr[i];
            }}
        System.out.println(Arrays.toString(new_arr));
    }
}
