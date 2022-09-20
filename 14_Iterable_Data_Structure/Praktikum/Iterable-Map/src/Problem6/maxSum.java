package Problem6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class maxSum {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> arr = new ArrayList<>(Arrays.asList(2,3,4,1,5));
        int k = 2;
        int n = arr.size();
        if (n < k) {
            System.out.println("Salah");
            return;
        }

        // Compute sum of first window of size k
        int jum = 0;
        for (int i = 0; i < k; i++)
            jum += arr.get(i);

        // Compute sums of remaining windows by
        // removing first element of previous
        // window and adding last element of
        // current window.
        int jumSekarang = jum;
        for (int i = k; i < n; i++) {
            jumSekarang += arr.get(i) - arr.get(i - k);
            jum = Math.max(jum, jumSekarang);
        }
        System.out.println("Output = " + jum);
    }
}
