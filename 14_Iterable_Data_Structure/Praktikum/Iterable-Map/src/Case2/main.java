package Case2;


import java.util.*;

public class main {
    public static void main(String[] args) {
//        ArrayList<String> angka = new ArrayList<>();
        String angka = "11232";
        int count = 0;
//        angka.add("1122");
        char[] ch = angka.toCharArray();
        for (int i = 0; i < angka.length(); i++) {
            for (int j = i + 1; j < angka.length(); j++) {
                if (ch[i] == ch[j] && ch[i]!=' '){
                    count++;
                    ch[j]='0';
                }
                }
            if (count>0 && ch[i]!='0'){
                System.out.println(""+ch[i]);
            }
            }
        }
    }

//        System.out.println(str);
//        System.out.println(str.length());
//        System.out.println(str.toCharArray());
//        for (String i: angka){
//                if (!it.equals(angka))
//                    System.out.println(it);
//        Object[] ch = angka.toArray();
//        System.out.println(
//                angka.toArray()
//        );
//
