/*
    Program to demonstrate generics
 */
package LinkedLists;

import java.util.ArrayList;

public class GenericExample {

    public static void main(String[] args) {
        
        // Make some animals (Cats & Dogs)
        Cat c1 = new Cat("Cat 1");
        Cat c2 = new Cat("Cat 2");
        Cat c3 = new Cat("Cat 3");
        Dog d1 = new Dog("Dog 1");
        Dog d2 = new Dog("Dog 2");
        
        //1. 
        ArrayList cats = new ArrayList();
        cats.add(c1);
        cats.add(c2);
        cats.add(c3);
        // But ..
        cats.add(d1);
        
        System.out.println(cats);
        
        // 2.
        ArrayList<Cat> onlyCats = new ArrayList();
        onlyCats.add(c1);
        onlyCats.add(c2);
        onlyCats.add(c3);
        
        // We can't do it! Because, generics!
        //onlyCats.add(d1);
        
        System.out.println(onlyCats);
        
    }
    
}