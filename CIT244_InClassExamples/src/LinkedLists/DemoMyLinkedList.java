package LinkedLists;
public class DemoMyLinkedList {

    /**
     * to test our data structure
     */
    public static void main(String[] args) {
        // create a linked list called numbers
        MyLinkedList numbers = new MyLinkedList();
        //prove head starts at nuoll
        System.out.println(numbers.head);

        MyLinkedList.insert(numbers, 10);
        MyLinkedList.insert(numbers, 20);
        MyLinkedList.insert(numbers, 50);
        MyLinkedList.insert(numbers, 70);
        
        MyLinkedList.printList(numbers);
        
        MyLinkedList.deleteAtPosition(numbers, 0);
        
        MyLinkedList.printList(numbers);
        //deletes by value
        MyLinkedList.deleteKey(numbers, 20);
        
        MyLinkedList.printList(numbers);
    }
    
}
