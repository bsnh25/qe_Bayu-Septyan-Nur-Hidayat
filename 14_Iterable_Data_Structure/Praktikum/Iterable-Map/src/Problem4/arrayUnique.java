package Problem4;

import java.util.*;

public class arrayUnique {
    public static void main(String[] args) {
        List<Integer> angka1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> angka2 = new ArrayList<>(Arrays.asList(1, 2, 5, 10, 16));
        List<Integer> arr = new ArrayList<>();
        arr.addAll(angka1);
        arr.addAll(angka2);
        System.out.println(arr);
//        Set<Integer> set = new LinkedHashSet<>(angka1);
//        int a1 = angka1.get();
//        int a2 = angka2.get();
        int a = 0;
        for (int i = 0; i < arr.size(); i++) {
            a = arr.get(i);
            for (int j = 0; j < arr.size(); j++) {
                if (a == arr.get(j)) {
                    if (i != j) {
                        System.out.println("single Number = " + a);
//                        System.out.println("Match found for "+a);
                    }
                }
            }

//        for (int i = 0; i<angka2.size(); i++)
//        if (arr.contains(angka2)){
//            arr.remove(i)
//            System.out.println("ada");
//        }
//        System.out.println(set);
        }
    }
}
