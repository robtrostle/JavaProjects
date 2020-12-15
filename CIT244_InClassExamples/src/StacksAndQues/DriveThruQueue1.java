/*
Queues are FIFO

Queue is an interface so cannot be instaniated, BUT
we can assign to it to be something else, like a LinkedList (becuase it is)
notice some familair methods?

Simulates a drive-thru experience. We will use Strings in the format of
# "Car | Price"

We can only add to the end and remove from the front

THINK: When you go to a drive Thru who is served first? The first person who got there
Unlike a stack.

// Offer = enqueue | poll = dequeue

 *** Activity: Keep track of all cars you have served and then add the first car
     of the day to the end of the queue as there was a mistake with their order

 */
package StacksAndQues;

import java.util.LinkedList;
import java.util.Queue;

public class DriveThruQueue1 {

    public static void main(String[] args) {
        
        Queue<String> carOrders = new LinkedList();
        Queue<String> served = new LinkedList();
        
        System.out.println("Before Drive-Thru Opens: " + carOrders);
        
        carOrders.offer("Red Chevy | $3.99");
        carOrders.offer("Black Nissian | $1.99");
        carOrders.add("Silver Ram | $3.49");
        
        System.out.println("\n8:01 AM Some customers are already waiting:");
        System.out.println(carOrders);
        
        // Check who is our first customer of the day
        System.out.println("\nFirst customer is: " + carOrders.peek());
        
        // Serve the first customer (FIFO) (Remove from queue once served)
        served.offer(carOrders.poll());
        System.out.println("\nCurrent State of our queue: ");
        System.out.println(carOrders);
        
        // Show who we have currently served (Who is in that queue)
        System.out.println("\n**Today's served customers so far: " + served);
        
        // More cars come in (Put them at the END of the queue)
        carOrders.offer("Blue Honda | $4.99");
        carOrders.offer("Green Chevy | $4.99");
        
        System.out.println("\nMore Cars ... \nCurrent state of our queue:");
        System.out.println(carOrders);
        
        // Serve a few customers and then check our queue status
        served.offer(carOrders.poll());
        served.offer(carOrders.poll());
        served.offer(carOrders.poll());
        
        System.out.println("\n**Today's served customers so far: " + served);
        
        System.out.println("\nCurrent state of our queue:");
        System.out.println(carOrders);
        
        // Serve the last person and then see our queue once more
        served.offer(carOrders.poll());
        System.out.println("\nCurrent state of our queue:");
        System.out.println(carOrders);
        
        System.out.println("\n**Today's served customers so far: " + served);
        
        // Add one last car before close
        System.out.println("\nOne last car coming in!: ");
        carOrders.offer("Beige Buick | $2.99");
        System.out.println(carOrders);
        
        // First car of the day had mistake in order, so bring them back through the drive-thru for a fix
        carOrders.offer(served.poll());
        
        System.out.println(carOrders);
        
        
        
    }
    
}