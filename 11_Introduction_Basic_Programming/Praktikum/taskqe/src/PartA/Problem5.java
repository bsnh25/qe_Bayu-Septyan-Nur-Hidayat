package PartA;

public class Problem5 {
    private static boolean primeNumber(int number) {
        //your code here
        int check = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                check++;
            }
        }
        if (check == 2) {
//            System.out.println("True");
            return true;
        } else {
//            System.out.println("False");
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(primeNumber(11)); //true
        System.out.println(primeNumber(13)); //true
        System.out.println(primeNumber(17)); //true
        System.out.println(primeNumber(20)); //false
        System.out.println(primeNumber(35)); //false
    }
}
