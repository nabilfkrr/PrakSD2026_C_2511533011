package pekan1_2511533011;

public class Mobil_2511533011 {
	    String nama;
	    int tahun;
	    int cc;
	    double harga;
	    String merk;

	    // Constructor
	    public Mobil_2511533011(String nama, int tahun, int cc, double harga, String merk) {
	        this.nama = nama;
	        this.tahun = tahun;
	        this.cc = cc;
	        this.harga = harga;
	        this.merk = merk;
	    }

	    // Getter (Selektor)
	    public String getNama() { return nama; }
	    public int getTahun() { return tahun; }
	    public int getCc() { return cc; }
	    public double getHarga() { return harga; }
	    public String getMerk() { return merk; }

	    // Setter (Mutator)
	    public void setNama(String nama) { this.nama = nama; }
	    public void setTahun(int tahun) { this.tahun = tahun; }
	    public void setCc(int cc) { this.cc = cc; }
	    public void setHarga(double harga) { this.harga = harga; }
	    public void setMerk(String merk) { this.merk = merk; }

	    // Tampilkan data
	    public void tampilkan() {
	        System.out.println("Nama  : " + nama);
	        System.out.println("Tahun : " + tahun);
	        System.out.println("CC    : " + cc);
	        System.out.println("Harga : " + harga);
	        System.out.println("Merk  : " + merk);
	        System.out.println("----------------------");
	    }
	
}
