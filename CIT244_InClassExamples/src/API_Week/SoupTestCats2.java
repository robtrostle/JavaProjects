
package API_Week;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Document;

public class SoupTestCats2 {

    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String url = "https://www.thinkingoutsidethecage.org/meet-animals/adopt/cats/";
        Document doc = Jsoup.connect(url).get();
        String name;
        //go to website>right click on name of cat>Click inspect>This jumps to the 
        //section of HTML code. Derived from an anchor tag wrapped in a h3 element (header3)bold
        //Click there, see class = "animal-item-content" div class. You can copy it. 
        //Get all divs containing a class named title
        Elements divs = doc.select("div[class=animal-item-content]");//as opposed to selecting all divs. 
        //print all cat names from the innter divs.
        for (Element div : divs) {
            name = div.getElementsByClass("plain").text();//changing string to text which is a string type
            System.out.println("Name: "+ name);
        }
        
        
    }
    
}
