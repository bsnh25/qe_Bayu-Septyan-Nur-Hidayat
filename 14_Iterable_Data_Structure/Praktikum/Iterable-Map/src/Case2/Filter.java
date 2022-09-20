package Case2;

import java.util.*;

public class Filter {
//    public static int hashMapApproach(int[] inputArray)
//    {
//        HashMap<Integer,Integer> map = new HashMap<>(inputArray.length);
//
//        for(int num : inputArray)
//        {
//            Integer occurrence = map.get(num);
//
//            // if occurrence is null, set it to 1,
//            // else increment the occurrence
//            map.put(num, occurrence==null ? 1 : occurrence+1);
//        }
//
//        // traversing entryset to find the key with occurrence == 1
//        for(Map.Entry<Integer, Integer> e : map.entrySet())
//        {
//            if(e.getValue() == 1)
//            {
//                return e.getKey();
//            }
//        }
//
//        return -1;
//    }
//}

    public static int Angka(int[] inputArray) {
        Arrays.sort(inputArray);

        int i = 0;
        while (i < inputArray.length) {
            if (inputArray[i] != inputArray[i + 1]) {
                return inputArray[i];
            }
            i = i + 2;
        }

        return -1;
    }
}
//        Collection<String> numbers = new ArrayList<>();
//        numbers.add("12");
//        numbers.add("1");
//        numbers.add("2");
//        numbers.add("2");
//        numbers.add("3");
//        numbers.add("5");
////        System.out.println(numbers.());
////        Iterator<String> it = numbers.iterator();
//        int i=0;
//        while (i< numbers.size()){
//            if (numbers.toArray()!=numbers.toArray()){
//            }
//            i=i+2;
//        }
////            String i = it.next();
////            System.out.println(i);
//
////        boolean i = numbers.containsAll();
////        while(!i : numbers)
////        System.out.println(numbers);
////        for (String num: numbers){
////            num.contains(numbers.toString());
////            num.getBytes();
////            System.out.println(num);
////        }
//
////        System.out.println(numbers.contains("1"));
////        numbers.containsAll(numbers);
////        System.out.println();
//////        for (String arg : args) {
//
////        }

