package pekan1_2511533011;

public class Driver_2511533011 {
    public static void main(String[] args) {

        String nim = "2511533011";
        System.out.println("NIM: " + nim);

        // Array untuk menyimpan mobil
        Mobil_2511533011[] daftarMobil = new Mobil_2511533011[3];

        // Tambah mobil
        daftarMobil[0] = new Mobil_2511533011("CRV", 2014, 2000, 100000000, "Honda");
        daftarMobil[1] = new Mobil_2511533011("X-TRAIL", 2016, 2000, 180000000, "Nissan");
        daftarMobil[2] = new Mobil_2511533011("BYD Seal", 2023, 1500, 200000000, "BYD");

        System.out.println("\nData Mobil:");
        for (int i = 0; i < daftarMobil.length; i++) {
            if (daftarMobil[i] != null) {
                daftarMobil[i].tampilkan();
            }
        }

        // Hapus mobil 
        System.out.println("\nMenghapus mobil index 0 :");
        daftarMobil[0] = null;

        System.out.println("Setelah dihapus:");
        for (int i = 0; i < daftarMobil.length; i++) {
            if (daftarMobil[i] != null) {
                daftarMobil[i].tampilkan();
            } else {
                System.out.println("Data kosong di index " + i);
            }
        }

        //  Mutator 
        System.out.println("\nUpdate harga mobil index 1 :");
        if (daftarMobil[1] != null) {
            daftarMobil[1].setHarga(200000000);
        }

        // Tampilkan
        System.out.println("Setelah update:");
        for (int i = 0; i < daftarMobil.length; i++) {
            if (daftarMobil[i] != null) {
                daftarMobil[i].tampilkan();
            }
        }

        // Selektor
        if (daftarMobil[1] != null) {
            System.out.println("Merk mobil index 1: " + daftarMobil[1].getMerk());
        }
    }
}