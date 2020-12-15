package StacksAndQues;

public class QueueDemo {
    
    public static void main(String[] args) {
        
        QueueClient q = new QueueClient(5);
        
        q.peek();
        q.enqueue("1");
        q.peek();
        q.enqueue("2");
        q.enqueue("3");
        q.peek();
        q.enqueue("4");
        q.enqueue("5");
        System.out.println(q.toString());
        System.out.println(q.isFull());
        
        q.dequeue();
        System.out.println(q.toString());
        
        q.peek();
        
        q.dequeue();
        q.peek();
        
        q.dequeue();
        q.dequeue();
        q.peek();
        
        q.dequeue();
        q.peek();
        
        System.out.println(q.toString());
        q.enqueue("1");
        q.enqueue("2");
        q.enqueue("3");
        System.out.println(q.toString());
        q.clear();
        System.out.println(q.toString());
        
        
    }
    
}