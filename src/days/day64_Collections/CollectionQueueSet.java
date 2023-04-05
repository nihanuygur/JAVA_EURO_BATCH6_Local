package days.day64_Collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class CollectionQueueSet {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
//        Queue<String> queue = new PriorityQueue<>(); sorts the object

        queue.add("Test51");
        queue.add("Test2");
        queue.add("Test3");
        queue.add("Test4");

        System.out.println("queue = " + queue);

        System.out.println("queue.poll() = " + queue.poll());
        //Retrieves and removes the head of this queue, or returns null if this queue is empty.
        System.out.println("queue = " + queue);

        System.out.println("queue.offer(\"Test5\") = " + queue.offer("Test5"));
        //Inserts the specified element into this queue if it is possible to do so immediately without violating
        // capacity restrictions. When using a capacity-restricted queue, this method is generally preferable to add,
        // which can fail to insert an element only by throwing an exception.
        System.out.println("queue = " + queue);

        System.out.println(queue.peek());
        //Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
        System.out.println("queue = " + queue);

    }
}
