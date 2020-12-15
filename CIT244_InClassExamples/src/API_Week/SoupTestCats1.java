
package API_Week;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Document;

public class SoupTestCats1 {

    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String url = "https://www.thinkingoutsidethecage.org/meet-animals/adopt/cats/";
        Document doc = Jsoup.connect(url).get();
        System.out.println(doc);
    }
    
}
