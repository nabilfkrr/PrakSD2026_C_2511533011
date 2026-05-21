package pekan7_2511533011;

public class Mahasiswa_2511533011 {
    private String nama_3011;
    private String nim_3011;
    private String prodi_3011;

    // Constructor
    public Mahasiswa_2511533011(String nama_3011, String nim_3011, String prodi_3011) {
        this.nama_3011 = nama_3011;
        this.nim_3011 = nim_3011;
        this.prodi_3011 = prodi_3011;
    }

    // Getter dan Setter
    public String getNama_3011() {
        return nama_3011;
    }

    public void setNama_3011(String nama_3011) {
        this.nama_3011 = nama_3011;
    }

    public String getNim_3011() {
        return nim_3011;
    }

    public void setNim_3011(String nim_3011) {
        this.nim_3011 = nim_3011;
    }

    public String getProdi_3011() {
        return prodi_3011;
    }

    public void setProdi_3011(String prodi_3011) {
        this.prodi_3011 = prodi_3011;
    }

    @Override
    public String toString() {
        return nama_3011 + " | " + nim_3011 + " | " + prodi_3011;
    }
}