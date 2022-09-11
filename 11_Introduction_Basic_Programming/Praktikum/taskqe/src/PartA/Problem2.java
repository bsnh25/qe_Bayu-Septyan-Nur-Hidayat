package PartA;

public class Problem2 {
    public static void main(String[] args) {
        //input
        int StudentScore = 80;

        // Process : Your Solution Code Here
        float hasil;
        if (0>=StudentScore&&StudentScore<=34){
            System.out.println("Nilai adalah D");
        } else if (35>=StudentScore&&StudentScore<=49) {
            System.out.println("Nilai adalah C");
        } else if (50>=StudentScore&&StudentScore<=64) {
            System.out.println("Nilai adalah B");
        } else if (65>=StudentScore&&StudentScore<=79) {
            System.out.println("Nilai adalah B+");
        } else if (80>=StudentScore&&StudentScore<=100) {
            System.out.println("Nilai adalah A");
        } else
            System.out.println("Nilai Invalid");

        // Output
        // Nilai A
    }
}
