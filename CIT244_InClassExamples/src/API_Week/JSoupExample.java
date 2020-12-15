
package API_Week;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Document;

public class JSoupExample {

    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Document doc = Jsoup.connect("https://ccac.edu/").get();
        //System.out.println(doc);
        
        //Get all divs containing a class named "title"
        Elements divs = doc.select("div[class = title]");
        //System.out.println(divs);
        //gets the text from the divs
        String text = divs.text();
        //System.out.println(text);
        
        System.out.println("Your CCAC News:");
        //loop through each div element and print text per
        for(Element e: divs){
            System.out.println(e.text());
        }
        
    }
    
}
