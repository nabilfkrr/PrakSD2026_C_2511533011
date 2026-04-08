package pekan3_2511533011;

public class stackArray_2511533011 {
	static final int MAX = 1000;
	int top_3011;
	int a[] = new int[MAX];
	boolean isEmpty()
	{
			return (top_3011 < 0);
		
	}
	stackArray_2511533011()
	{
		top_3011 = -1;
	}
	boolean push_3011(int x)
	{
		if (top_3011 >= (MAX -1) ) {
			System.out.println("StackOverflow");
			return false;
		}
		else {
			a[++top_3011] = x;
			System.out.println(x + " dimasukkan dalam stack");
			return true;
		}
		
	}
	int pop_3011()
	{
		if (top_3011 <= 0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			int x = a[top_3011--];
			return x;
		}
		
	}
	int peek_3011()
	{
		if (top_3011 < 0) {
			System.out.println("Stuck Underflow");
			return 0;
			
		}
		else {
			int x = a[top_3011];
			return x;
		}
		
	}
	void print() {
		for (int i = top_3011; i>-1; i--) {
			System.out.print(" " + a[i]);
		}
	}
}
