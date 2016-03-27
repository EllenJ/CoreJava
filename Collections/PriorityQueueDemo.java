package Collections;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue q = new PriorityQueue();
		System.out.println(q.peek());//Null
		//System.out.println(q.element());//RE:NSEE
		for (int i = 0; i <= 10; i++) {
			q.offer(i);
		}
		System.out.println(q);//[0,1,2,...10]
		System.out.println(q.poll());
		System.out.println(q);
	}

}
