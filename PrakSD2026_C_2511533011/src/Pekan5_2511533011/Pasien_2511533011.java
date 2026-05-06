package Pekan5_2511533011;

public class Pasien_2511533011 {

    // Atribut
    private String namaPasien_3011;       // Nama pasien
    private String keluhan_3011;          // Keluhan / penyakit
    private int nomorAntrian_3011;        // Nomor antrian 
    Pasien_2511533011 next_3011;          // Pointer ke node pasien berikutnya

    // Constructor
    public Pasien_2511533011(String namaPasien_3011, String keluhan_3011, int nomorAntrian_3011) {
        this.namaPasien_3011   = namaPasien_3011;
        this.keluhan_3011      = keluhan_3011;
        this.nomorAntrian_3011 = nomorAntrian_3011;
        this.next_3011         = null; // pointer awal selalu null
    }

    // Getter
    public String getNamaPasien_3011()  { return namaPasien_3011; }
    public String getKeluhan_3011()     { return keluhan_3011; }
    public int getNomorAntrian_3011()   { return nomorAntrian_3011; }
    public Pasien_2511533011 getNext_3011() { return next_3011; }

    // Setter
    public void setNamaPasien_3011(String namaPasien_3011)  { this.namaPasien_3011 = namaPasien_3011; }
    public void setKeluhan_3011(String keluhan_3011)        { this.keluhan_3011 = keluhan_3011; }
    public void setNomorAntrian_3011(int nomorAntrian_3011) { this.nomorAntrian_3011 = nomorAntrian_3011; }
    public void setNext_3011(Pasien_2511533011 next_3011)   { this.next_3011 = next_3011; }
}
