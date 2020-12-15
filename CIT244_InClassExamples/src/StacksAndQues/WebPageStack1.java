/*
* Demonstrates how to make use of Java's built-in Stack & Queue classes
* Stack Uses LIFO
*
* We can only add to the end and remove from the end
*
* Simulates a browsers "Back" or "Undo" functionality.
*
 */
package StacksAndQues;
import java.util.Stack;

public class WebPageStack1 {

    public static void main(String[] args) {
        
        Stack<String> webpages = new Stack();
        Stack<String> poppedPages = new Stack();
        
        System.out.println("Before opening our browser:");
        System.out.println(webpages);
        
        // Push elements onto the stack
        webpages.push("www.myworkemail.com");
        webpages.push("www.mypersonalemail.com");
        webpages.push("www.youtube.com");
        webpages.push("www.news.com");
        webpages.push("www.ccac.com");
        // Print stack
        System.out.println("\nToday's history so far:");
        System.out.println(webpages);
        
        System.out.println("\nPeeking at current page: " + webpages.peek());
        
        System.out.println("\nNot ready to work yet, let's go back a "
                + "couple of pages and watch some more youtube ..");
        // Keep track of what we are popping by ..
        forward(poppedPages, webpages);
        System.out.println("Popping â† " + poppedPages.push(webpages.pop()));
        System.out.println("\nPeeking at current page: " + webpages.peek());
        
        // Current stack (after popping)
        System.out.println("Current stack: " + webpages);
        
        // Show the pages we are storing away (the ones we have already popped)
        System.out.println("\nPopped Pages: " + poppedPages);
        
        // Go "forward" to load back ccac
        System.out.println("\nPopping (Pushing back onto webpages) â†’ " 
                + webpages.push(poppedPages.pop()));
        System.out.println("Popping (Pushing back onto webpages) â†’ " 
                + webpages.push(poppedPages.pop()));
        
        
        System.out.println("Current stack: " + webpages);
        
        System.out.println("\nCurrent page is " + webpages.peek());   
    }
    
    public static void forward(Stack s, Stack p)
    {
        System.out.println("Popping â† " + p.peek());
        s.push(p.pop());
    }
    
}