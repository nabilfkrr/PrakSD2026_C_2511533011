package pekan1_2511533011;

public class JamDriver_2511533011 {
	public static void main(String[] args) {
		Jam_2511533011 a= new Jam_2511533011 (23, 59, 50);
		Jam_2511533011 b= new Jam_2511533011 (0, 0, 15);
		System.out.println("a              = " + a);
		System.out.println("b              = " + b);
		System.out.println("a+b            = " + a.plus(b));
		System.out.println("next 20s       = " + a.nextNSeconds (20));
		System.out.println("durasi(a,b)    = " + Jam_2511533011.durasiDetik(a,b));
		System.out.println("a.compareTo(b) = " + a.compareTo(b));
	}

}
