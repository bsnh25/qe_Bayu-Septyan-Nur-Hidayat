package Case4;

public class Running {
    public static void main(String[] args) {
        Dimensibarang Dimensibarang = new Dimensibarang();
        int p = Dimensibarang.panjang;
        Dimensibarang.panjang = 5;
        int l = Dimensibarang.lebar;
        Dimensibarang.lebar= 2;
        int t = Dimensibarang.tinggi;
        Dimensibarang.tinggi= 4;
        int vdb = Dimensibarang.vdb();

        Beratbarang beratbarang = new Beratbarang();
        double Berat = beratbarang.Berat;
        beratbarang.Berat = 1;
        double harga = beratbarang.harga();


        System.out.println("Dimensi Barang = " + vdb +"\n" + "Jadi Harga Pengiriman adalah = " + harga);

    }
}
