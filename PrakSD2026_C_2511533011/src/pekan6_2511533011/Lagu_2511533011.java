package pekan6_2511533011;

public class Lagu_2511533011 {
    String judul_3011;
    String penyanyi_3011;
    Lagu_2511533011 next_3011;
    Lagu_2511533011 prev_3011;

    // Constructor
    public Lagu_2511533011(String judul_3011, String penyanyi_3011) {
        this.judul_3011 = judul_3011;
        this.penyanyi_3011 = penyanyi_3011;
        this.next_3011 = null;
        this.prev_3011 = null;
    }

    // Getter 
    public String getJudul_3011() { 
    	return judul_3011; 
    	}
    public String getPenyanyi_3011() { 
    	return penyanyi_3011; 
    	}
    
    // Setter
    public void setJudul_3011 (String judul_3011) {
    	this.judul_3011 = judul_3011;
    }
    public void setPenyanyi_3011 (String penyanyi_3011) {
    	this.penyanyi_3011 = penyanyi_3011;
    }
}