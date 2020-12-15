package API_Week;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Document;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class JSoupExample_SMS {

    public static final String ACCOUNT_SID = TInfo.SID2;
    public static final String AUTH_TOKEN = TInfo.AUTH2;
   
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        
        Message message = Message.creator(new PhoneNumber(TInfo.krystsina),
                new PhoneNumber(TInfo.tNumber2),
                getNews()).create();
        
        System.out.println("Message sent!\n" + message.getSid());
        
        
        
    }
    //return the 
    public static String getNews() throws IOException{
        //String to be returned
        String s = "";
        Document doc = Jsoup.connect("https://ccac.edu/").get();
        //System.out.println(doc);
        
        //Get all divs containing a class named "title"
        Elements divs = doc.select("div[class = title]");
        //System.out.println(divs);
        //gets the text from the divs
        String text = divs.text();
        //System.out.println(text);
        
        
        //loop through each div element and print text per
        s += "Your CCAC News:\n";
        for(Element e: divs){
            System.out.println(e.text());
            s+= "Headline: " + e.text();
            s+="\n\n";
        }
        return s;
    }
    
}
