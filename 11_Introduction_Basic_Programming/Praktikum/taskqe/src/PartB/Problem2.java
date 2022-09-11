package PartB;

public class Problem2 {
    private static void playWithAsterisk(int n){
        //your code here
        for (int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args){
        playWithAsterisk(5);
    }
}
