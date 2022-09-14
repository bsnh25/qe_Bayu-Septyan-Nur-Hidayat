package Case2;

public class Runner {
    public static void main(String[] args) {

        Kubus Kubus = new Kubus();
        double sisiK = Kubus.sisiK;
        Kubus.sisiK = 10;
        double volumeK = Kubus.volumeK();
//        System.out.println(volumeK);

        Balok Balok = new Balok();
        double panjangB = Balok.panjangB;
        Balok.panjangB=3;
        double lebarB = Balok.lebarB;
        Balok.lebarB=6;
        double tinggiB = Balok.tinggiB;
        Balok.tinggiB=10;
        double volumeB = Balok.volumeB();
//        System.out.println(volumeB);

        Tabung Tabung = new Tabung();
        int jariT = Tabung.jariT;
        Tabung.jariT=7;
        int tinggiT = Tabung.tinggiT;
        Tabung.tinggiT=10;
        int volumeT = Tabung.volumeT();
//        System.out.println(volumeT);

        System.out.println("Volume : "+"\n" + "Kubus = " + volumeK + "\n" + "Balok = " + volumeB + "\n" + "Tabung = " + volumeT);
    }
}
//CATATAN

//        // Persegi
//        Runner persegi = new Runner();
//        float sisiP = persegi.sisi;
//        float luasP = persegi.luaspersegi();;
//        float kelilingP = persegi.kelilingpersegi();
//
//        // Segitiga
//        Runner segitiga = new Runner();
//        float alasS = segitiga.alas;
//        float tinggiS = segitiga.tinggi;
//        float luasS = segitiga.luassegitiga();
//        float kelilingS = segitiga.kelilingsegitiga();
//
//        // Persegi Panjang
//        Runner persegipanjang = new Runner();
//        float PanjangPp = persegipanjang.panjang;
//        float lebarPp = persegipanjang.lebar;
//        float luasPp = persegipanjang.luaspersegipanjang();
//        float kelilingPp = persegipanjang.kelilingpersegipanjang();
//
