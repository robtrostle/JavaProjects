package Week2;

import java.util.Scanner;

/**
 *
 * @author Robert Trostle Lab Assignment 2
 */
public class FriendsAndFamily {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //declare local variables. 
        Object[] friendsAndFamily;
        Friend fri;
        Family fam;
        String name;
        String relation;
        int timeKnown;
        int type;
        //display warning message regarding inpute for friends or family.
        System.out.println("Warning: When prompted for choice of friends "
                + "or family, anything other than" + "\n" + "friend or family"
                + " will end the program.");
        //Determine the size of the friends and family object array by 
        //passing scanner to getSize method. 
        friendsAndFamily = getSize(scan);
        //Enter for loop which will keep promting after each object entry
        //until it reaches the length of the object array. 
        for (int i = 0; i < friendsAndFamily.length; i++) {
            //Determine if it's a friend or family user is entering. 
            type = friendOrFamily(scan);
            //if type = 0, it's a friend, if 1, family. Anything else exits. 
            if (type == 0)
            {   //assign name variable to friend object. 
                name = getName(scan,type);
                timeKnown = getTimeKnown(scan, name);//assign the time known
                fri = new Friend(name, timeKnown);//create friend object. 
                friendsAndFamily[i] = fri;//Assign the friend to the ith element.
            }else if (type == 1)
            {   //repeats steps above other than getting relation. 
                name = getName(scan,type);
                relation = getRelation(scan, name);
                fam = new Family(name, relation);
                friendsAndFamily[i] = fam;
            }else
            {   //exit program.
                System.err.println("Invalid input. Program ending.");
                System.exit(0);
            }
            //display the friend and family array after exiting the loop above. 
        }display(friendsAndFamily);
             
    }
    public static Object[] getSize(Scanner sc)
        {   
            int size = 0;
            do {//keep asking for quanity until users enters positive int. 
            System.out.print("How many friends and family do you wish"                    
                    + " to enter?--> ");
            size = sc.nextInt();
                 
            }while (size <= 0);
            //Create an object array based on the size given by user and return. 
            Object[] FamFriSize = new Object[size];
            
            return FamFriSize;
        }
    public static int friendOrFamily(Scanner sc)
            
    {   
        sc.nextLine();//clear buffer. 
        
        System.out.print("Are you entering a family or friend? ");
        
        String type = sc.next();
        //equalsIgnoreCase will accept lower and/or upper case entries. 
        if (type.equalsIgnoreCase("friend"))
        {
            return 0;
        }
        else if (type.equalsIgnoreCase("family"))
        {
            return 1;
        }
        else 
        {
            return 2;
        }
        
    }
    public static String getName(Scanner sc, int t)
    {   //determine the name of the friend and/or family member
        if (t == 0)
        {
            System.out.print("Enter the name of this friend--> ");
        }
        else if(t==1)
        {
            System.out.print("Enter the name of this family member--> ");
        }
        else
        {
            System.err.println("Invalid Entry. System Exiting.");
            System.exit(0);
        }
        //Assign name to person after exiting control structure and return it. 
        String name = sc.next();
       
        return name;       
    }
    public static String getRelation(Scanner sc, String n)
    {
        System.out.print("Enter your relation to " + n + "--> ");
        String relation = sc.next();
        System.out.println("");
        return relation;
    }
    public static int getTimeKnown(Scanner sc, String n)
    {
        System.out.print("How long have you known " + n + "? ");
        int TimeKnown = sc.nextInt();
        System.out.println("");
        return TimeKnown;
    }
    public static void display(Object[] faf)
    {   //print the object using that object's toString method. 
        for (Object object : faf) {
            System.out.println(object.toString());
        }
    }
    
}
