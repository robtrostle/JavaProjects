package LinkedLists;
/*
            Java program to implement a Singly Linked List 

Demonstrates how the Linked List Data Structure is implemented from scratch

Boilerplate code from: https://www.geeksforgeeks.org/implementing-a-linked-list-in-java-using-class/
Adapated for instruction by: James Winyard

NOTE: This implementation only works with int values
*/
  
public class MyLinkedList {
    
    Node head; // head of the list

    // Linked List Node (Inner Class)
    public static class Node {
        
        int data;
        Node next;
        
        // Constructor
        Node(int d)
        {
            data = d;
            next = null;
        }
        
        // Ensure we print the head element 
        public String toString() {
            return ("" + data);
        }
    }
        
        // *** INSERTION ***
        // Method to insert a new node (The type is our class name)
        public static MyLinkedList insert(MyLinkedList list, int data)
        {
            // Create a new node with the given data
            Node new_node = new Node(data);
            new_node.next = null;
            
            // If the linked list is empty, we make the new node the head
            if(list.head == null) {
                list.head = new_node;
            }
            else {
                // Else we traverse till the last node and insert the new_node there
                Node last = list.head;
                while(last.next != null)
                {
                    last = last.next;
                    // Keep looking until we find a null spot
                }
                // If we escape the loop we found a null spot (The last element!)
                
                // Insert the new_node as the last node
                last.next = new_node;
                
            }
            // Return the list by head
            return list;
        }
        
        // *** TRAVERSE / Print Linked List ***
        public static void printList(MyLinkedList list)
        {
            // Start at the head (The first element)
            Node currNode = list.head;
            
            System.out.print("Linked List: ");
            
            // Traverse through the linked list 
            // While curr index is not empty keep printing
            while(currNode != null)
            {
               // Print the data at current node
                System.out.print(currNode.data + " ");
                
                // Go to next node
                currNode = currNode.next;
            }
            System.out.println("");   
        }
        
        // *** DELETION BY KEY (3 CASES) ***
        public static MyLinkedList deleteKey(MyLinkedList list, int key)
        {
            // Store the head node
            Node currNode = list.head, prev = null;
            
            // CASE 1: The head itself holds the key to be deleted
            if(currNode != null && currNode.data == key)
            {
                list.head = currNode.next;
                
                // Display output
                System.out.println(key + " found and deleted AT HEAD.");
                return list;
            }
            
            // CASE 2: If the key is somewhere other than the head we must 
            // traverse the list until we find and remove (hopefully)
            while(currNode != null && currNode.data != key)
            {
                // If currNode does not hold the key, continue to the next node
                prev = currNode;
                currNode = currNode.next;
            }
            // Escape the loop when we reach a null element (tail)
            // OR we find the key
            
            // If the key was present, it will be at currNode therefore currNode shall
            // NOT be null (Because we broke the while)
            if(currNode != null)
            {
                // Since the key is at currNode unlink currNode from the list
                //this is like deleting that node and relinking the list. 
                prev.next = currNode.next;
                System.out.println(key + " found and deleted (It was not the head).");
            }
            
            // CASE 3: The key is not present
            if(currNode == null)
            {
                System.out.println(key + " not found ...");
            }
            
            // return the updated list
            return list;
        }
        
        // *** DELETION AT POSITION (3 CASES) ***
        public static MyLinkedList deleteAtPosition(MyLinkedList list, int index)
        {
            // Store the head and prev node
            Node currNode = list.head, prev = null;
            
            // CASE 1: If index is 0, then we remove the head (unless its null)
            if(index == 0 && currNode != null)
            {
                list.head = currNode.next;
                
                System.out.println(index + " index deleted. (HEAD)");
                // Returns updated list (after removing the head)
                return list;
            }
            
            // CASE 2: If the index is > 0 but < size of the list
            // Counter var to keep track of our curr index
            int counter = 0;
            
            // Keep track of the prev node as it is need to make the necessary shifts
            while(currNode != null)
            {
                if(counter == index)
                {
                   // Since the currNode is the required POS unlink currNode from the list
                    prev.next = currNode.next;
                    
                    System.out.println(index + " index deleted.");
                    break;
                }
                else 
                {
                  // If curr pos is not the index, continue to next node
                    prev = currNode;
                    currNode = currNode.next;
                    counter++;
                }
            }
            
            // CASE 3: The index is > size of the Linked List (currNode == null)
            if(currNode == null)
            {
                System.out.println(index + " index not found.");
            }
            
            return list;
        }
        
        
 
}