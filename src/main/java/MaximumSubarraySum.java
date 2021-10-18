import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        System.out.println(sequence(null));
    }

    public static int sequence(int[] arr) {
        if (arr == null) return 0;
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                res = res > sum ? res : sum;
            }
        }
        return res;
    }
}
