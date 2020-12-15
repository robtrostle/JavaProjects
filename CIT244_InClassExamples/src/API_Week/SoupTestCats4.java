
package API_Week;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Document;

public class SoupTestCats4 {

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String url = "https://www.thinkingoutsidethecage.org/meet-animals/adopt/cats/";
        Document doc = Jsoup.connect(url).get();
        String name;
        String age;
        String breed;
        
        String[] names = new String[100];
        String[] breeds = new String[100];
        String[] ages = new String[100];
        
        String allInfo;
        
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
        //loop through and print each cat
        for(int c = 0; c < names.length; c++){
            //if name is blank, exit the loop
            if(names[c]==null)
                break;
            System.out.print("Cat " + (c+1));
            System.out.print(" Name: " + names[c]+" | ");
            System.out.print("Breed: "+ breeds[c]+" | ");
            System.out.println("Age: "  + ages[c]);
        }
        
        
    }
    
}
