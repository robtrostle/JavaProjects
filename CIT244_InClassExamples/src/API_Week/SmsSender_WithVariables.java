
package API_Week;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class SmsSender_WithVariables {

   public static final String ACCOUNT_SID = TInfo.SID2;
   public static final String AUTH_TOKEN = TInfo.AUTH2;
   
    public static void main(String[] args) {
        // TODO code application logic here
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        
        Message message = Message.creator(new PhoneNumber(TInfo.mom),
                new PhoneNumber(TInfo.tNumber2),
                "Your brother, Duff is crazy! He won't stop obsessing"
                        + "over Trump!!!!").create();
        
        System.out.println("Message sent!\n" + message.getSid());
           
    }
    
}
