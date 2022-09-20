package Case2;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromArrayList {
    public static void main(String[] args) {
        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("1122");
        Spliterator<String> split = arr1.spliterator();
        System.out.println(split);
//        TreeSet<String> treeSet = new TreeSet<String>();
//        System.out.println("Duplicate Entries= ");
//        for (String a:arr1){
//            if (!treeSet.add(a)){
//                System.out.println(a);
//            }
//        }
    }
}