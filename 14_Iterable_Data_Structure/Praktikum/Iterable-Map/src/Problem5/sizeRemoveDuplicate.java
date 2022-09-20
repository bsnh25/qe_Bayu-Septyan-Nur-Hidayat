package Problem5;

import java.util.*;

public class sizeRemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> arr1 = new ArrayList<>(Arrays.asList(2,2,2,11));
        Set<Integer> set = new LinkedHashSet<>(arr1);
        set.addAll(arr1);
        System.out.println(set.size());
    }
}
