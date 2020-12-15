/*
 NOTES:
 STACK = LIFO 
 Examples :Books, Dishes, Trays, Webpages
 CTRL Z (Pop) and CTRL Y (Push) !!!!!!!!!!!!!!!!!
 Browser (Back and Forward buttons) - Demonstrate back and forward buttons create their own stack
 ***********
 This example uses an ARRAY of STRINGS spefically (not list) we will later discuss the actual Stack interface <Any Type>
 */
package StacksAndQues;

import java.util.Arrays;

public class StackClient {
    
    int maxSize;
    int top;
    String arr[];
    
    public StackClient(int n)
    {
        maxSize = n;
        arr = new String[maxSize];
        top = 0;
    }
    
    // Check if the stack is empty
    public boolean empty()
    {
        if(top == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    
    // Make a new first (LIFO) Element (PUSH)
    public void push(String str)
    {
        // If we reach maxsize (Stack overflow) so .. 
        if(top < maxSize) {
            arr[top] = str;
            top++;
        }
        else {
            System.out.println("Stack Overflow! (Attempted to add too many elements)!");
        }
    }
    
    // Get the LAST element out of the stack (LIFO)
    public String pop()
    {
        // We can only access the element if there is an element to access
        if(!this.empty()) {
            String temp = this.peek();
            arr[top - 1] = null;
            top--;
            return temp;
        }
        else {
            return null;
        }
    }
    
    // Return the last element of the stack (if there is one)
    public String peek()
    {
        if(top > 0)
        {
            return arr[top - 1];
        }
        else {
            // the stack is empty so return nothing
            return null;
        }
    }
    
    // Clear all elements in the stack
    public void clear() {
        for (int i = top - 1; i >= 0; i--) {
            if(arr[i] != null) {
                pop();
            }
        }
    }
    
    
    // Print the contents of the stack using toString
    @Override
    public String toString()
    {
        return Arrays.toString(arr);
    }
    
}