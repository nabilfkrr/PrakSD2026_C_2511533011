package pekan3_2511533011;

public class Website_2511533011 {
    private String judul_3011;
    private String url_3011;

    public Website_2511533011(String judul, String url) {
        this.judul_3011 = judul;
        this.url_3011 = url;
    }

    public String getJudul_3011() {
        return judul_3011;
    }

    public String getUrl_3011() {
        return url_3011;
    }

    public void setJudul_3011(String judul) {
        this.judul_3011 = judul;
    }

    public void setUrl_3011(String url) {
        this.url_3011 = url;
    }

    @Override
    public String toString() {
        return "Judul Website : " + judul_3011 +
               "\nURL Website   : " + url_3011;
    }
}