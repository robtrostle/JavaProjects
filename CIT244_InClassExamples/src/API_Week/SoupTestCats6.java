
package API_Week;

import java.io.IOException;
import java.util.Scanner;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Document;

public class SoupTestCats6 {

    public static void main(String[] args) throws IOException {
        // Before we start, lets get the type of cat user is looking for 
        String[] userCat = prefCat();
        String userCatType = userCat[0];
        String userCatAge = userCat[1];
        
        String url = "https://www.thinkingoutsidethecage.org/meet-animals/adopt/cats/";
        Document doc = Jsoup.connect(url).get();
        
        
        String[] names = new String[100];
        String[] breeds = new String[100];
        String[] ages = new String[100];
        
        String allInfo;
        
        String name;
        
        //go to website>right click on name of cat>Click inspect>This jumps to the 
        //section of HTML code. Derived from an anchor tag wrapped in a h3 element (header3)bold
        //Click there, see class = "animal-item-content" div class. You can copy it. 
        //Get all divs containing a class named title
        Elements divs = doc.select("div[class=animal-item-content]");//as opposed to selecting all divs. 
        //print all cat names from the innter divs.
        
        //keep track of each referenced element
        int i = 0;
        //Now: Loads each array (names, breeds, ages)
        
        for (Element div : divs) {
            
            names[i] = div.getElementsByClass("plain").text();//changing string to text which is a string type
            
            //Extract the breed and Age
            allInfo = name = div.getElementsByTag("p").text();
            
            //Extract the breed from all info. start at Jump 2 spaces ahead of the bar
            breeds[i] = allInfo.substring(allInfo.indexOf("|")+2);

            //extract the age. start at index 0. Stop at the index of the bar.
            ages[i] = allInfo.substring(0,allInfo.indexOf("|"));
            
            //increment i
            i++;
        }
        System.out.println("");
        //new variable to keep track of cats that we are looking for. 
        int counter = 1;
        //loop through and print each cat
        
        for(int c = 0; c < names.length; c++){
            //if name is blank, exit the loop
            if(names[c]==null)
                break;
            //only if the cat is what we are looking for, print it and increment
            else if(breeds[c].contains(userCatType) && ages[c].contains(userCatAge)){
            System.out.print("Cat " + (counter));
            System.out.print(" Name: " + names[c]+" | ");
            System.out.print("Breed: "+ breeds[c]+" | ");
            System.out.println("Age: "  + ages[c]);
            counter++;
        }
        }
        
    }
    
    //Method to get the users pref cat and return it as a String array
    // index 0 = type | index 1 = age
    public static String[] prefCat(){
        Scanner scan = new Scanner(System.in);
        String[] cat = new String[2];
        
        System.out.print("What Breed of cat or you looking for? \n"
        + " (Shorthair, Medium Hair, OR Longhair)--> "  );
        cat[0] = scan.nextLine();
        System.out.print("What Age of cat or you looking for? \n"
        + " (Young, Adult, Senior )--> "  );
        cat[1] = scan.nextLine();
        
        
        return cat;
    }
    
}
