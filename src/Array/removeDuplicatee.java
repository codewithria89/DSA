package Array;
import java.util.Scanner;
import java.util.Arrays;
public class removeDuplicatee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[x]) {
                x++;
                arr[x] = arr[i];
            }
        }
        int[] result = Arrays.copyOfRange(arr, 0, x+1);
        System.out.println(Arrays.toString(result));
    }
}
