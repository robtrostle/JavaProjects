
package GUIS;

import Jwiki.Jwiki;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *https://docs.oracle.com/javase/8/javafx/api/javafx/scene/control/ComboBox.html
 * https://www.geeksforgeeks.org/javafx-combobox-with-examples/#:~:text=JavaFX%20ComboBox%20is%20an%20implementation,a%20default%20empty%20combo%20box
 */
public class ComboBoxPeoplePicture extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        BorderPane bp = new BorderPane();
        
        ComboBox cb = peopleCB(bp);
        
        Button btn = new Button();
        bp.setBottom(cb);//put the combobox on the bottom of the borderpane
        
        BorderPane.setAlignment(cb, Pos.CENTER);//position combobox on the center

        Scene scene = new Scene(bp, 400, 350);
        
        primaryStage.setTitle("Drop Down Images");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
    //create a combox through a method
    public static ComboBox peopleCB(BorderPane bp){
        
        String[] names = {"Tony Hawk", "Spongebob", "Ben Roethlisberger", "Alex Morgan"};
        ComboBox cb = new ComboBox(FXCollections 
                                 .observableArrayList(names));//add the strings into the combobox
        
        cb.setOnAction((event) -> {
            System.out.println(cb.getValue() + " selected!");//gets us the name of the value in the list
            
            String strNameValue = cb.getValue().toString();
            
            bp.setCenter(setImage(strNameValue));
            
        });

        return cb;
    }
    //This method will place the image in the center of the screen
    public static ImageView setImage(String name){
        DropShadow ds = new DropShadow(700, Color.BLACK);
        
        String[] links = {
            "https://cms.qz.com/wp-content/uploads/2016/11/rtr2gm1j-e1480189349744.jpg?quality=75&strip=all&w=1600&h=900&crop=1",
            "https://entscoop.com/wp-content/uploads/2020/06/SpongeBob-Pride_Ramzy-Masri.jpg",
            "https://sportshub.cbsistatic.com/i/r/2020/11/08/6d508483-c8df-47c2-b08a-a221b6baa839/thumbnail/1200x675/181b53d579e3033867330693882b30ba/ben-roethlisberger-steelers.jpg",
            "https://i.insider.com/5db0ab9d4af9096e9d46cae4?width=1100&format=jpeg&auto=webp"
        };
        String n = "";
        if(name.equalsIgnoreCase("Tony Hawk")){
            n = links[0];
            getInfo("Tony Hawk");
        }
        else if(name.equalsIgnoreCase("Spongebob")){
            n = links[1];
            getInfo("Spongebob");
        }
        else if(name.equalsIgnoreCase("Ben Roethlisberger")){
            n = links[2];
            getInfo("Ben Roethlisberger");
        }
        else if(name.equalsIgnoreCase("Alex Morgan")){
            n = links[3];
            getInfo("Alex Morgan");
        }
        Image img = new Image(n, 300, 300, false, false);//force the size to be a box
        ImageView imgv = new ImageView(img);
        imgv.setEffect(ds);//set the drop shadow effect
        return imgv;
    }
    //This method will generate/find information about our celeb
    public static void getInfo(String p){//p will be the person we pass
        String str = "";
        
        //second stage and scene
        Stage infoStage = new Stage();
        infoStage.setTitle("Information");
        infoStage.setResizable(true);//user may need to rescale
        
        //create a text area
        TextArea info = new TextArea();//to hold the text
        Jwiki jwiki = new Jwiki(p);
        Scene infoScene = new Scene(info,550,124);//wide and short
        
        //Load info onto the scene 
        infoStage.setScene(infoScene);  
        String fullInfo = jwiki.getExtractText();//extract the text into a string from wiki
        info.appendText(fullInfo);
        info.setWrapText(true);//wraps the text nicely like a word doc
        info.setEditable(false);//Makes it so you can't type in the text area. 
        infoStage.show();

    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
}
