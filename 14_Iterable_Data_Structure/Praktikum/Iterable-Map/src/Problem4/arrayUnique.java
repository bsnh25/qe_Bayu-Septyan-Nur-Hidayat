package Problem4;

import java.util.*;

public class arrayUnique {
    public static void main(String[] args) {
        List<Integer> angka1 = new ArrayList<>(Arrays.asList(1,2,3,4));
        List<Integer> angka2 = new ArrayList<>(Arrays.asList(1,2,5,10,16));
        List<Integer> arr = new ArrayList<>();
        arr.addAll(angka1);
        arr.addAll(angka2);
        System.out.println(arr);
        for (int i = 0; i<arr.size();i++){
            angka1.get(i)== angka2.get(i);
            System.out.println(i);
        }
//        Set<Integer> set = new LinkedHashSet<>(angka1);
//        int a1 = angka1.get();
//        int a2 = angka2.get();
//        int a = 0;
//        for (int i = 0; i<angka2.size(); i++)
//        if (angka1.contains(angka2.)){
//            System.out.println("ada");
//        }
//        System.out.println(set);
        }
    }
