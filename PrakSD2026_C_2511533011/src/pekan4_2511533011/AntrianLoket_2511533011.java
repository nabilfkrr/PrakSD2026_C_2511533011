package pekan4_2511533011;

public class AntrianLoket_2511533011 {
int front_3011, rear_3011, max_3011 ;
String queue_3011[];

public AntrianLoket_2511533011(int max_3011) {
	this.max_3011 = max_3011;
	front_3011 = - 1;
	rear_3011 = - 1;
	queue_3011 = new String[this.max_3011];
}

boolean isFull_3011(AntrianLoket_2511533011 queue) {
	return (queue.rear_3011 == queue.max_3011 - 1);
}

boolean isEmpty_3011(AntrianLoket_2511533011 queue) {
	return (queue.front_3011 == - 1);
}

void enqueue_3011 (String people_3011) {
	if (isFull_3011(this))
		return;
	if (this.front_3011 == -1)
	    this.front_3011 = 0;
	this.rear_3011 = (this.rear_3011 + 1) % this.max_3011;
	this.queue_3011[this.rear_3011] = people_3011;
	System.out.println("Data berhasil ditambahkan ke antrian ");
}
	String dequeue_3011() {
	if(isEmpty_3011(this))
		return null;	
	String people_3011 = this.queue_3011[this.front_3011];
	 if (this.front_3011 == this.rear_3011) {
	        this.front_3011 = -1;
	        this.rear_3011 = -1;
	    } else {
	        this.front_3011 = (this.front_3011 + 1) % this.max_3011;
	    }
	return people_3011;
}

	String front_3011() {
	if (isEmpty_3011 (this))
		return null;
	return this.queue_3011[this.rear_3011];
}

	//Mencetak elemen antrian
void display_3011() {
	int number_3011 = 1;
	if (isEmpty_3011(this)) {
		System.out.println("Antrian Kosong");
		return;
	}
	
	//Kunjungi dari belakang dan cetak
	for (int i_3011 = front_3011; i_3011 <= rear_3011; i_3011++) {
		System.out.println(number_3011 + ". " + queue_3011[i_3011]);
	}
	System.out.println();
}

void reverse_3011() {
    String[] temp = new String[max_3011];
    int count = 0;

    while (!isEmpty_3011(this)) {
        temp[count++] = dequeue_3011();
    }

    for (int i = count - 1; i >= 0; i--) {
        enqueue_3011(temp[i]);
    }
}
}
