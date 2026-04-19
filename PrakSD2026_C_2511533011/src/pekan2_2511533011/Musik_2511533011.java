package pekan2_2511533011;

public class Musik_2511533011 {
String JudulLagu_3011;
String Penyanyi_3011;
int Durasi_3011;

Musik_2511533011 (String JudulLagu, String Penyanyi, int Durasi) {
	this.JudulLagu_3011 = JudulLagu;
	this.Penyanyi_3011 = Penyanyi;
	this.Durasi_3011 = Durasi;
}
@Override
public String toString() {
	return "Judul : " + JudulLagu_3011 +"\n"+ "Nama Penyanyi : " + Penyanyi_3011 +"\n"+ "Durasi : " + Durasi_3011;
}

}
