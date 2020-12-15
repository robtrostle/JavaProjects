package API_Week;
// Install the Java helper library from twilio.com/docs/libraries/java
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class SmsSender_WithVariables2 {
    // Find your Account Sid and Auth Token at twilio.com/console
    public static final String ACCOUNT_SID =
            TInfo2.SID;
    public static final String AUTH_TOKEN =
            TInfo2.AUTH;

    public static void main(String[] args) {
        
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message
                .creator(new PhoneNumber(TInfo2.myNumber), // to
                        new PhoneNumber(TInfo2.tNumber), // from
                        "ATTENTION").create();

        System.out.println("Message sent!\n" + message.getSid());
    }
}