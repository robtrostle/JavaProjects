package API_Week;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 * @author James Winyard
 * Please remember that this uses the Twilio API using the instructors AUTH Token & Account
 * You are welcome to have fun and use this program but just as before, be responsible with your use
 * if you'd like to set up your own account and use this program you may do so.
 * 
 * - This program is designed to be used with the TInfo.java file
 * - This program assumes you have the Twilo jar linked to your project
 * - To send messages to people outside of the US you must change the +1 country code in the sendButton Lambda
 */

public class GUI_SMS extends Application {
    
     public static  String ACCOUNT_SID = TInfo2.SID;
     public static  String AUTH_TOKEN =  TInfo2.AUTH;
    
    @Override
    public void start(Stage primaryStage) {
        
        
        GridPane pane = new GridPane();
        pane.setVgap(10);
        
        // Sets the background of our app
        // https://colordesigner.io/gradient-generator
        pane.setStyle("-fx-background-color: #04a5d7");
        
        // The title at the top of the pane
        Label title = new Label("Send a Text Message!");
        title.setPadding(new Insets(10, 10, 10, 75));
        title.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 20));
        
        // Text phone phone number text field
        Label numberLabel = new Label("Phone Number:");
        numberLabel.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 14));
        
        // Text phone message field
        Label textLabel = new Label("Message:");
        textLabel.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 14));
        
        // Textfield where user will enter their phone number, using Password to mask #
        //TextField numberTF = new TextField();
        PasswordField numberTF = new PasswordField();
        numberTF.setPrefWidth(200);
       
        // Where the message will be entered
        TextArea messageBox = new TextArea();
        messageBox.setPrefWidth(350);
        messageBox.setPrefHeight(250);
        
        Button sendButton = new Button();
        sendButton.setText("Send Message'");
        sendButton.setPrefWidth(360);
        sendButton.setStyle("-fx-background-color: #b19b3f");
        
        // Buttons functionality: 
        // Adds +1 for US Area code | gets the text field data, clears fields
        sendButton.setOnAction((ActionEvent e) -> {
            System.out.println("Button Pressed!");
            String sendto_number = "+1" + numberTF.getText();
            String sendto_message = messageBox.getText();
            sendMessage(sendto_number, sendto_message);
            messageBox.setText("");
            numberTF.setText("");
        });
        
        // Adding nodes to pane
        pane.add(title, 0, 0);
        pane.add(numberLabel, 0, 1);
        pane.add(numberTF, 0, 2);
        pane.add(textLabel, 0, 3);
        pane.add(messageBox, 0, 4);
        pane.add(sendButton, 0, 5);
        Scene scene = new Scene(pane, 350, 350);
        
        primaryStage.setTitle("Text Message GUI");
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    // Method that will actually send the text message
    public void sendMessage(String phonenumber, String msg) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        
        Message message = Message
                .creator(new PhoneNumber(TInfo2.myNumber), // to
                        new PhoneNumber(TInfo2.tNumber), // from
                        msg)
                .create();

        System.out.println("Message sent!\n" + message.getSid());
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
