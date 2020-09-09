
package Chapter10;

import java.util.Scanner;

public class MusicianDemoUser {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String name, bestHit;
        int members;
        MusicianClient artist;
        
        System.out.print("Enter a name for your band --> ");
        name = scan.nextLine();
        
        System.out.print("How many members does " + name + " have? -->");
        members = scan.nextInt();
        
        // Clear the buffer
        scan.nextLine();
        System.out.print("Enter " + name + " best hit --> ");
        bestHit = scan.nextLine();
        
        artist = new MusicianClient(name, members, bestHit);
        System.out.println(artist);
        
        
    }

}
