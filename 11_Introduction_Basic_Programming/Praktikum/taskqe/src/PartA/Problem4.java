package PartA;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args){
        int bilangan;

        //Process Your Solution Code Here
        System.out.println("Masukkan nilai yang ingin di faktorkan: ");
        Scanner a=new Scanner(System.in);       //untuk memasukkan input oleh user
        bilangan=a.nextInt();                   //deklarasi kalo apa yang dimasukkan user itu adalah "bilangan"

        for(int i=1; i<=bilangan; i++)          //jika input =6, maka i=1 dan bilangan =6
        {                                       // 1<=6 (true) jadi lanjut ke if
            if(bilangan%i==0){                  // 6 mod 1 adalah 0, maka 0 == 0 (true)
                System.out.println(i);          // maka akan di print 'i' yang terakhir
            }                                   // looping sampai i=6
        }
    }

}
