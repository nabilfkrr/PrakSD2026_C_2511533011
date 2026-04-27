package pekan4_2511533011;

public class QueueArray_2511533011 {
int front_3011, rear_3011, size_3011;
int capasity_3011;
int array_3011[];

public QueueArray_2511533011(int capasity) {
	this.capasity_3011 = capasity;
	front_3011 = this.size_3011 = 0;
	rear_3011 = capasity -1;
	array_3011 = new int[this.capasity_3011];
}

boolean isFull_2511533011(QueueArray_2511533011 queue) {
	return (queue.size_3011 == queue.capasity_3011);
}

boolean isEmpty_2511533011(QueueArray_2511533011 queue) {
	return (queue.size_3011 == 0);
}

void enqueue_2511533011 (int item) {
	if (isFull_2511533011(this))
		return;
	this.rear_3011 = (this.rear_3011 + 1) % this.capasity_3011;
	this.array_3011[this.rear_3011] = item;
	this.size_3011 = this.size_3011 + 1;
	System.out.println(item + " enqueued to queue ");
}
 int dequeue_3011() {
	 if(isEmpty_2511533011(this)) 
		 return Integer.MIN_VALUE;
	 int item = this.array_3011[this.front_3011];
	 this.front_3011 = (this.front_3011 + 1) % this.capasity_3011;
	 this.size_3011 = this.size_3011 -1;
	 return item;				 
 }
 
 int front_3011() {
	 if (isEmpty_2511533011 (this)) 
		 return Integer.MIN_VALUE;
	 return this.array_3011[this.rear_3011];
 }
 
 int rear_3011 () {
		if (isEmpty_2511533011(this))
			return Integer.MIN_VALUE;
		return this.array_3011[this.rear_3011];
 }
 
 	//mencetak elemen antrian 
 void display_3011() {
	 int i;
	 if (front_3011 == rear_3011) {
		 System.out.println("\nAntrian Kosong\n");
		 return;
	 }
	 
	 //kunjungi dari belakang dan cetak
	 for (i = front_3011; i < rear_3011; i++) {
		 System.out.printf(" %d <-- ", array_3011[i]);
	 }
	 return;
 }
}
