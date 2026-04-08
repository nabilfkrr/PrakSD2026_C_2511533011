package pekan3_2511533011;

public class stackArrayDriver_3011533011 {
	public static void main(String[] args) {
		stackArray_2511533011 s = new stackArray_2511533011();
		s.push_3011(10);
		s.push_3011(20);
		s.push_3011(30);
		System.out.println(s.pop_3011() + " dikeluarkan dari stack");
		System.out.println("Elemen teratas adalah : " + s.peek_3011());
		System.out.print("Elemen pada stack : ");
		s.print();
		
	}
}
