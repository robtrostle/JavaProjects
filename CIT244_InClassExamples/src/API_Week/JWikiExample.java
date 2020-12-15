
package API_Week;

import Jwiki.Jwiki;

public class JWikiExample {

    public static void main(String[] args) {
        // TODO code application logic here
        Jwiki jwiki = new Jwiki("Kennywood");
        System.out.println("Title: "+jwiki.getDisplayTitle());
        System.out.println("Text: "+jwiki.getExtractText());
        System.out.println("Image :"+jwiki.getImageURL());
        
    }
    
}
