package StacksAndQues;

public class StackDemo {

    public static void main(String[] args) {
        
        StackClient myStack = new StackClient(5);
        
        // Print the current contents (none) of the stack
        System.out.println(myStack);
        
        // Check empty works
        System.out.println(myStack.empty());
        
        // Push an element to the stack and then re-print stack
        myStack.push("1");
        myStack.push("2");
        myStack.push("3");
        myStack.push("4");
        myStack.push("5");
        myStack.push("6");
        System.out.println(myStack);
        
        // Check empty works
        System.out.println(myStack.empty());
        
        // Pop some elements from our stack
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        System.out.println(myStack);
        
        // Prove stack is now empty again
        System.out.println(myStack.empty());
        
        myStack.push("1");
        myStack.push("2");
        System.out.println(myStack);
        
        myStack.clear();
        System.out.println(myStack);
        
    }
    
}