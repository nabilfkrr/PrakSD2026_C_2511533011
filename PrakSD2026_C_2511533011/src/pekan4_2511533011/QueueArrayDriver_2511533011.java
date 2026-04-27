package pekan4_2511533011;

public class QueueArrayDriver_2511533011 {
	public static void main(String[] args) {
		QueueArray_2511533011 queue_3011 = new QueueArray_2511533011(1000);
		queue_3011.enqueue_2511533011(10);
		queue_3011.enqueue_2511533011(20);
		queue_3011.enqueue_2511533011(30);
		queue_3011.enqueue_2511533011(40);
		System.out.println("item di depan" + queue_3011.front_3011());
		System.out.println("item paling belakang " + queue_3011.rear_3011);
		System.out.println("tampilan queue");
		queue_3011.display_3011();
		System.out.println();
		System.out.println(queue_3011.dequeue_3011() + " dihapus dari queue ");
		System.out.println("item di depan: " + queue_3011.front_3011());
		System.out.println("item di belakang: " + queue_3011.rear_3011());
		System.out.println("tampilan queue setelah satu data dihapus");
		queue_3011.display_3011();
	}
}
