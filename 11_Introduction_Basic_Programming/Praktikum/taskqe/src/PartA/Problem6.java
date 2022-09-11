package PartA;

public class Problem6 {
    private static boolean palindrome(String value) {

        String temp = "";
        for(int i=value.length()-1; i>=0; i--){
            char c =value.charAt(i);
            temp += String.valueOf(c);
        }

        if (value.toLowerCase().equals(temp.toLowerCase())){
            return true;
        } else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(palindrome("civic"));        //true
        System.out.println(palindrome("katak"));        //true
        System.out.println(palindrome("kasur rusak"));  //true
        System.out.println(palindrome("kupu-kupu"));    //false
        System.out.println(palindrome("lion"));         //false
    }
}
