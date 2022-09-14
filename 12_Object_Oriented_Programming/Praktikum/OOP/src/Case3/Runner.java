package Case3;

public class Runner {
    public static void main(String[] args) {
        Penjumlahan Penjumlahan = new Penjumlahan();
        int a = Penjumlahan.a;
        Penjumlahan.a = 3;
        int b = Penjumlahan.b;
        Penjumlahan.b= 4;
        int jumlah = Penjumlahan.jumlah();

        Pengurangan Pengurangan = new Pengurangan();
        int c = Pengurangan.c;
        Pengurangan.c = 15;
        int d = Pengurangan.d;
        Pengurangan.d= 4;
        int kurang = Pengurangan.kurang();

        Perkalian Perkalian = new Perkalian();
        int e = Perkalian.e;
        Perkalian.e = 10;
        int f = Perkalian.f;
        Perkalian.f= 10;
        int kali = Perkalian.kali();

        Pembagian Pembagian = new Pembagian();
        int g = Pembagian.g;
        Pembagian.g = 12;
        int h = Pembagian.h;
        Pembagian.h= 3;
        int bagi = Pembagian.bagi();

        System.out.println("Penjumlahan = " +jumlah + "\n" + "Pengurangan = " +kurang + "\n" + "Perkalian = " + kali + "\n" + "Pembagian = " + bagi);



    }
}
