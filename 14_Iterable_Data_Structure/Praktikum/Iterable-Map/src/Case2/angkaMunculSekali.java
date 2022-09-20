package Case2;

import java.util.*;

public class angkaMunculSekali {
    public static void main(String[] args) {
        String str="42311";
        int length = str.length();
        char[] a = str.toCharArray();
//        Iterator<String> iter = str.charAt(a);
        for (int i =0; i<length; i++){
            for (int j = i+1; j<length;j++){
                if (a[i]==a[j]){
                    System.out.println(a[j]);
                }

            }
        }

//        System.out.println(a);

//        ArrayList<String> arr = (ArrayList<String>) Arrays.asList(str.split(str,""));
//        System.out.println(arr);
    }
}
