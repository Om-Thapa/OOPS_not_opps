import java.util.*;

public class Queue_Demo {
    public static void main(String[] args) {

        // Create Queue
        Queue<Integer> queue = new LinkedList<>();

        // add()
        queue.add(10);
        queue.add(20);

        System.out.println("Queue after add(): " + queue);

        // offer()
        queue.offer(30);
        queue.offer(40);

        System.out.println("Queue after offer(): " + queue);

        // remove()
        queue.remove();

        System.out.println("Queue after remove(): " + queue);
    }
}