// For DEQUEUE: // NOTE: maxSize here but maxSize in Enqueue
// For ENQUEUE: // NOTE: -1 here but maxSize in DEQUEUE
package StacksAndQues;

import java.util.Arrays;

public class QueueClient {
    
    int maxSize;
    int front;
    int end;
    String arr[];
    int currentSize;
    
    public QueueClient(int n)
    {
        maxSize = n;
        front = 0;
        end = -1;
        arr = new String[maxSize];
    }
    
    // Check the queue is EMPTY
    public boolean empty() {
        if(currentSize == 0) 
            return true;
        else
            return false;
    }
    
    // Check is the queue is FULL
    public boolean isFull() {
        if(currentSize == maxSize)
            return true;
        else
            return false;
    }
    
    // Peek method (View the head without removing)
    public void peek() {
        //if(front == end && (end != 0 || end == -1))
        if(empty())
            System.out.println("No front. Queue is empty .. ");
        else
            System.out.println("Front = " + arr[front]);
    }
    
    
    // Add element to the end of the queue
    public void enqueue(String str) {
        if(isFull()) 
            System.out.println("Queue is full! You cannot add more elements!");
        else {
            end++; // Move end up FIRST otherwise we remove the wrong element
            arr[end] = str;
            currentSize++;
            System.out.println(str + " added to the queue.");
            
            // IF we reach the end then reset end to 0 so we can fill agian when empty
            if(end == maxSize - 1) 
                end = -1;
  
        }
    }
    
    // Remove an element at the FRONT of the queue
    public void dequeue() {
        if(empty())
            System.out.println("Queue is empty! Cannot dequeue 'nothing'.");
        else {
            System.out.println(arr[front] + " removed from queue.");
            arr[front] = null;
            front++;
            currentSize--;
            
            if(front == maxSize)
                front = 0;
        }
    }
    
    // Clear all elements in teh queue 
    public void clear() {
        for (int i = front; i < maxSize - 1; i++) {
            if(arr[i] != null)
                dequeue();
        }
    }
    
    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
    
}