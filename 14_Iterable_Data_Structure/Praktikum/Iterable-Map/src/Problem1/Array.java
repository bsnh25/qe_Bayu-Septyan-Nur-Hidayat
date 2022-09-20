package Problem1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Array {
    public static void main(String[] args) {
        List<String> arr1 = new ArrayList<>();
        arr1.add("kazuya");
        arr1.add("jin");
        arr1.add("lee");
//        System.out.println("Array 1 = " + arr1.get(1));
//        System.out.println(arr1.toString());

//        List<String> arr2 = new ArrayList<>(Arrays.asList("kazuya, feng"));
        List<String> arr2 = new ArrayList<>();
        arr2.add("kazuya");
        arr2.add("kazuya");
////        System.out.println("Array 1 = " + arr2.get(1));

        Set<String> set = new LinkedHashSet<>(arr1);
        set.addAll(arr2);

        List<String> combine = new ArrayList<>(set);
        System.out.println(combine);

    }
}
