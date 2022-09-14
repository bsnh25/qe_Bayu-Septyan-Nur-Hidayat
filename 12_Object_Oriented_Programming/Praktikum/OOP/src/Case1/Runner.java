package Case1;

public class Runner {
    public static void main(String[] args) {

        // Persegi
        Persegi Persegi = new Persegi();
        double sisiP = Persegi.sisiP;
        Persegi.sisiP = 4;
        double LuasP = Persegi.LuasP();
        double KelP = Persegi.KelP();

        // Segitiga
        Segitiga Segitiga = new Segitiga();
        double alasS = Segitiga.alasS;
        Segitiga.alasS=3;
        double tinggiT = Segitiga.tinggiS;
        Segitiga.tinggiS=4;
        double LuasS = Segitiga.LuasS();
        double KelS = Segitiga.KelS();

        // Persegi Panjang
        Persegipanjang Ppanjang = new Persegipanjang();
        double panjangPp = Ppanjang.panjangPp;
        Ppanjang.panjangPp=7;
        double lebarPp = Ppanjang.lebarPp;
        Ppanjang.lebarPp=8;
        double LuasPp = Ppanjang.LuasPp();
        double KelPp = Ppanjang.kelPp();

        System.out.println("Luas : "+"\n" + "Persegi = " + LuasP + "\n" + "Segitiga = " + LuasS + "\n" + "Persegi Panjang = " + LuasPp);
        System.out.println("===========================================================");
        System.out.println("Keliling : "+"\n" + "Persegi = " + KelP + "\n" + "Segitiga = " + KelS + "\n" + "Persegi Panjang = " + KelPp);


    }
}

// CATATAN

//        Runner persegi = new Runner();
//        float sisiP = persegi.sisi;
//        float luasP = persegi.luaspersegi();;
//        float kelilingP = persegi.kelilingpersegi();

//        Runner segitiga = new Runner();
//        float alasS = segitiga.alas;
//        float tinggiS = segitiga.tinggi;
//        float luasS = segitiga.luassegitiga();
//        float kelilingS = segitiga.kelilingsegitiga();

//        Runner persegipanjang = new Runner();
//        float PanjangPp = persegipanjang.panjang;
//        float lebarPp = persegipanjang.lebar;
//        float luasPp = persegipanjang.luaspersegipanjang();
//        float kelilingPp = persegipanjang.kelilingpersegipanjang();