
package StacksAndQues;

import java.util.Stack;

public class WebPageStack {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Stack<String> webpages = new Stack();
        System.out.println("Before opening our browser: ");
        System.out.println(webpages);
        //push elements onto the stack
        webpages.push("www.myworkemail.com");
        webpages.push("www.mypersonalemail.com");
        webpages.push("www.youtube.com");
        webpages.push("www.news.com");
        webpages.push("www.ccac.com");
        //print stack
        System.out.println("Today's history so far:");
        System.out.println(webpages);
        
        System.out.println("\nPeeking at current page: "+ webpages.peek());
        
        System.out.println("\nNot ready to work yet, let's go back a couple"
                + "of pages to watch youtube..");
        System.out.println("Popping " + webpages.pop());
        System.out.println("Popping " + webpages.pop());
        
        System.out.println(webpages);
        
        
    }
    
}
