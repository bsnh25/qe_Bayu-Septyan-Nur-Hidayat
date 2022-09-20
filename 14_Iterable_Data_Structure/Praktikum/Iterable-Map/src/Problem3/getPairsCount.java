package Problem3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class getPairsCount {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,6));
        int target = 6;
        int n = arr.size();
        int pairs = 0;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(target - arr.get(i))) {
                pairs += map.get(target - arr.get(i));
                for (int j = 1; j <= map.get(target - arr.get(i)); j++)
//                    System.out.print("(" + (target - arr.get(i)) + "," + arr.get(i) + ") ");
                    System.out.println("(" + j + "," + i + ") ");
                break;
            }
            map.put(arr.get(i), map.getOrDefault(arr.get(i), 0) + 1);
        }
    }
}
//        System.out.print("(" + (target - arr[i]) + "," + arr[i] + ") ");

